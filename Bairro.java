import java.util.ArrayList;
import java.util.List;

public class Bairro {
    private String nome;
    private int populacaoTotal;
    private double areaTotal;
    private List<String> ruas;

    public Bairro(String nome, int populacaoTotal, double areaTotal) {
        this.nome = nome;
        this.populacaoTotal = populacaoTotal;
        this.areaTotal = areaTotal;
        this.ruas = new ArrayList<>();
    }

    public void adicionarRua(String nomeRua) {
        if (!ruas.contains(nomeRua)) {
            ruas.add(nomeRua);
        }
    }

    public void removerRua(String nomeRua) {
        ruas.remove(nomeRua);
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getPopulacaoTotal() {
        return populacaoTotal;
    }

    public double getAreaTotal() {
        return areaTotal;
    }
}