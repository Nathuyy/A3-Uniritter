public class Rua {
    private String nome;
    private String cep;
    private double area;

    public Rua(String nome, String cep, double area) {
        this.nome = nome;
        this.cep = cep;
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
