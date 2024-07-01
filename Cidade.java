import java.util.ArrayList;
import java.util.List;

public class Cidade {
    private String nome;
    private int populacaoTotal;
    private double areaTotal;
    private List<Bairro> bairros;
    private List<Rua> ruas;

    public Cidade(String nome) {
        this.nome = nome;
        this.populacaoTotal = 0;
        this.areaTotal = 0;
        this.bairros = new ArrayList<>();
        this.ruas = new ArrayList<>();
    }

    public void cadastrarBairro(String nome, int populacao, double area) {
        Bairro novoBairro = new Bairro(nome, populacao, area);
        bairros.add(novoBairro);
        populacaoTotal += populacao;
        areaTotal += area;
    }

    public void removerBairro(String nome) {
        Bairro bairroARemover = bairros.stream().filter(b -> b.getNome().equals(nome)).findFirst().orElse(null);
        if (bairroARemover != null) {
            bairros.remove(bairroARemover);
            populacaoTotal -= bairroARemover.getPopulacaoTotal();
            areaTotal -= bairroARemover.getAreaTotal();
        }
    }

    public void cadastrarRua(String nome, String cep, double area) {
        Rua novaRua = new Rua(nome, cep, area);
        ruas.add(novaRua);
    }

    public void removerRua(String nome) {
        ruas.removeIf(r -> r.getNome().equals(nome));
    }

    public double calcularDensidadePopulacional() {
        return populacaoTotal / areaTotal;
    }

    public double calcularAreaMediaPorHabitante() {
        return areaTotal / populacaoTotal;
    }
}
