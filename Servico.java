public class Servico {

    private String nomeServico;
    private String descricaoServico;
    private double precoServico;
    private boolean statusServico;

    public Servico(String nomeServico, String descricaoServico, double precoServico) {
        this.nomeServico = nomeServico;
        this.descricaoServico = descricaoServico;
        this.precoServico = precoServico;
        this.statusServico = true; 
    }
    
    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public double getPrecoServico() {
        return precoServico;
    }

    public void setPrecoServico(double precoServico) {
        this.precoServico = precoServico;
    }

    public boolean getStatusServico() {
        return statusServico;
    }

    public void setStatusServico(boolean statusServico) {
        this.statusServico = statusServico;
    }

    public void mostrarStatusServico() {
        if (statusServico) {
            System.out.println("O serviço " + nomeServico + " está ATIVO (pendente)");
        } else {
            System.out.println("O serviço " + nomeServico + " está INATIVO (finalizado)");
        }
    }

    public void ativarServico() {
        if (!statusServico) {
            statusServico = true;
            System.out.println("O serviço " + nomeServico + " foi ativado com sucesso.");
        } else {
            System.out.println("O serviço " + nomeServico + " já está ativo.");
        }
    }

    public void finalizarServico() {
        if (statusServico) {
            statusServico = false;
            System.out.println("O serviço " + nomeServico + " foi finalizado com sucesso.");
        } else {
            System.out.println("O serviço " + nomeServico + " já está finalizado.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome do Serviço: " + nomeServico);
        System.out.println("Descrição: " + descricaoServico);
        System.out.println("Preço: " + precoServico);
        mostrarStatusServico();
    }

    @Override
    public String toString() {
        String status = statusServico ? "ATIVO (pendente)" : "INATIVO (finalizado)";
        return "Nome do Serviço: " + nomeServico + "\nDescrição: " + descricaoServico + "\nPreço: " + precoServico
                + "\nStatus: " + status;
    }
}
