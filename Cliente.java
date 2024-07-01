import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe que representa um cliente no sistema.
 */
public class Cliente extends Usuario {

    private List<Servico> historicoDeSolicitacoes;

    public Cliente(int id, String nome, String cpf, String email) {
        super(id, nome, cpf, email);
        historicoDeSolicitacoes = new ArrayList<>();
    }

    /**
     * Permite ao cliente solicitar um novo serviço.
     */
    public void solicitarServico() {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite o tipo de serviço que deseja solicitar (1- Manutenção, 2- Suporte):");
            int tipoServico = leitor.nextInt();
            leitor.nextLine();  // Consome a nova linha

            System.out.println("Digite o nome do serviço que deseja solicitar:");
            String nomeServico = leitor.nextLine();

            System.out.println("Digite a descrição do serviço:");
            String descricaoServico = leitor.nextLine();

            Servico novoServico = null;
            switch (tipoServico) {
                case 1:
                    System.out.println("Digite o nível de urgência (1-5):");
                    int nivelUrgencia = leitor.nextInt();
                    novoServico = new ServicoDeManutencao(nomeServico, descricaoServico, nivelUrgencia);
                    break;
                case 2:
                    System.out.println("Digite o departamento responsável:");
                    leitor.nextLine(); // Consome a nova linha antes de ler o departamento
                    String departamento = leitor.nextLine();
                    novoServico = new ServicoDeSuporte(nomeServico, descricaoServico, departamento);
                    break;
                default:
                    System.out.println("Tipo de serviço inválido.");
                    return;
            }

            System.out.println("Solicitando Serviço: " + novoServico.getNomeServico());

            historicoDeSolicitacoes.add(novoServico);
            System.out.println("Serviço solicitado: " + novoServico.getNomeServico());
        } catch (Exception e) {
            System.out.println("Erro ao solicitar serviço: " + e.getMessage());
        }
    }

    /**
     * Retorna o histórico de solicitações de serviços do cliente.
     *
     * @return histórico de solicitações
     */
    public List<Servico> getHistoricoDeSolicitacoes() {
        return historicoDeSolicitacoes;
    }

    /**
     * Exibe o histórico de solicitações de serviços do cliente.
     */
    public void exibirHistoricoDeSolicitacoes() {
        System.out.println("Histórico de Solicitações:");
        for (Servico servico : historicoDeSolicitacoes) {
            System.out.println(servico.getNomeServico() + " - " + servico.getDescricaoServico());
        }
    }
}