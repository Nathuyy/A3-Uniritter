
import java.util.HashMap;
import java.util.Map;

public class Rua {
    private String nome;
    private String cep;
    private double areaTotal;
    private int populacaoTotal;
    private Map<String, String[]> infraestruturas;

    public Rua(String nome, String cep, double areaTotal) {
        this.nome = nome;
        this.cep = cep;
        this.areaTotal = areaTotal;
        this.populacaoTotal = 0; // População inicial
        this.infraestruturas = new HashMap<>();
    }

    public void cadastrarInfraestrutura(String tipo, String capacidade, String logistica) {
        infraestruturas.put(tipo, new String[]{capacidade, logistica});
    }

    public void removerInfraestrutura(String tipo) {
        infraestruturas.remove(tipo);
    }

    public double calcularDensidadePopulacional() {
        return populacaoTotal / areaTotal;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCep() {
        return cep;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public int getPopulacaoTotal() {
        return populacaoTotal;
    }
}