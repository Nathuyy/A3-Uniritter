/**
 * Classe que representa um serviço de manutenção.
 */
public class ServicoDeManutencao extends Servico {
    private int nivelUrgencia;

    public ServicoDeManutencao(String nomeServico, String descricaoServico, int nivelUrgencia) {
        super(nomeServico, descricaoServico);
        this.nivelUrgencia = nivelUrgencia;
    }

    public int getNivelUrgencia() {
        return nivelUrgencia;
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
