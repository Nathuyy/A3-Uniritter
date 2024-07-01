/**
 * Classe abstrata que representa um serviço genérico.
 */
public abstract class Servico implements ServicoInterface {
    private String nomeServico;
    private String descricaoServico;
    private boolean statusServico;

    public Servico(String nomeServico, String descricaoServico) {
        this.nomeServico = nomeServico;
        this.descricaoServico = descricaoServico;
        this.statusServico = true; 
    }

    @Override
    public String getNomeServico() {
        return nomeServico;
    }

    @Override
    public String getDescricaoServico() {
        return descricaoServico;
    }

    @Override
    public boolean isStatusServico() {
        return statusServico;
    }

    @Override
    public void setStatusServico(boolean statusServico) {
        this.statusServico = statusServico;
    }
}
