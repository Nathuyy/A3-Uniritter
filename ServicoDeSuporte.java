/**
 * Classe que representa um serviço de suporte.
 */
public class ServicoDeSuporte extends Servico {
    private String departamentoResponsavel;

    public ServicoDeSuporte(String nomeServico, String descricaoServico, String departamentoResponsavel) {
        super(nomeServico, descricaoServico);
        this.departamentoResponsavel = departamentoResponsavel;
    }

    public String getDepartamentoResponsavel() {
        return departamentoResponsavel;
    }

    @Override
    public String getNomeServico() {
        return super.getNomeServico();
    }

    @Override
    public String getDescricaoServico() {
        return super.getDescricaoServico();
    }

    @Override
    public boolean isStatusServico() {
        return super.isStatusServico();
    }

    @Override
    public void setStatusServico(boolean statusServico) {
        super.setStatusServico(statusServico);
    }
}
