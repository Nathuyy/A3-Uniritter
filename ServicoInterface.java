/**
 * Interface que define os métodos para os serviços.
 */
public interface ServicoInterface {
    String getNomeServico();
    String getDescricaoServico();
    boolean isStatusServico();
    void setStatusServico(boolean statusServico);
}
