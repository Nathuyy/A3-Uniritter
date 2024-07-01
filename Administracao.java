import java.util.List;

/**
 * Classe que representa a administração do sistema.
 */
public class Administracao extends Usuario {

    public Administracao(int id, String nome, String cpf, String email) {
        super(id, nome, cpf, email);
    }

    /**
     * Lista as solicitações de serviços de uma lista de clientes.
     *
     * @param clientes lista de clientes
     */
    public void listarSolicitacoes(List<Cliente> clientes) {
        System.out.println("Lista de Solicitações de Serviços:");
        for (Cliente cliente : clientes) {
            System.out.println("Cliente: " + cliente.getNome());
            cliente.exibirHistoricoDeSolicitacoes();
            System.out.println("---------------------");
        }
    }

    /**
     * Altera o status de um serviço no histórico de um cliente.
     *
     * @param cliente      cliente cujo serviço será alterado
     * @param indiceServico índice do serviço no histórico
     * @param novoStatus    novo status do serviço
     */
    public void alterarStatusServico(Cliente cliente, int indiceServico, boolean novoStatus) {
        List<Servico> historico = cliente.getHistoricoDeSolicitacoes();
        if (indiceServico >= 0 && indiceServico < historico.size()) {
            Servico servico = historico.get(indiceServico);
            servico.setStatusServico(novoStatus);
            System.out.println("Status do serviço " + servico.getNomeServico() + " alterado para " + (novoStatus ? "ATIVO" : "INATIVO"));
        } else {
            System.out.println("Índice de serviço inválido.");
        }
    }

    /**
     * Exclui um serviço do histórico de um cliente.
     *
     * @param cliente      cliente cujo serviço será excluído
     * @param indiceServico índice do serviço no histórico
     */
    public void excluirServico(Cliente cliente, int indiceServico) {
        List<Servico> historico = cliente.getHistoricoDeSolicitacoes();
        if (indiceServico >= 0 && indiceServico < historico.size()) {
            Servico servicoRemovido = historico.remove(indiceServico);
            System.out.println("Serviço " + servicoRemovido.getNomeServico() + " removido do histórico.");
        } else {
            System.out.println("Índice de serviço inválido.");
        }
    }
}