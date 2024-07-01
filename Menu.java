import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private List<Cliente> clientes;
    private Administracao administracao;

    public Menu() {
        clientes = new ArrayList<>();
        administracao = new Administracao(1, "Admin", "000.000.000-00", "admin@example.com");
    }

    public void exibirMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Solicitar Serviço");
            System.out.println("3. Exibir Histórico de Solicitações");
            System.out.println("4. Alterar Status de Serviço");
            System.out.println("5. Excluir Serviço");
            System.out.println("6. Listar Solicitações");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarCliente(scanner);
                    break;
                case 2:
                    solicitarServico(scanner);
                    break;
                case 3:
                    exibirHistoricoDeSolicitacoes(scanner);
                    break;
                case 4:
                    alterarStatusServico(scanner);
                    break;
                case 5:
                    excluirServico(scanner);
                    break;
                case 6:
                    listarSolicitacoes();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private void cadastrarCliente(Scanner scanner) {
        System.out.println("Digite o ID do cliente:");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consome a nova linha

        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();

        System.out.println("Digite o CPF do cliente:");
        String cpf = scanner.nextLine();

        System.out.println("Digite o email do cliente:");
        String email = scanner.nextLine();

        Cliente novoCliente = new Cliente(id, nome, cpf, email);
        clientes.add(novoCliente);
        System.out.println("Cliente cadastrado com sucesso.");
    }

    private void solicitarServico(Scanner scanner) {
        System.out.println("Digite o ID do cliente:");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consome a nova linha

        Cliente cliente = encontrarClientePorId(id);
        if (cliente != null) {
            cliente.solicitarServico();
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private void exibirHistoricoDeSolicitacoes(Scanner scanner) {
        System.out.println("Digite o ID do cliente:");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consome a nova linha

        Cliente cliente = encontrarClientePorId(id);
        if (cliente != null) {
            cliente.exibirHistoricoDeSolicitacoes();
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private void alterarStatusServico(Scanner scanner) {
        System.out.println("Digite o ID do cliente:");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consome a nova linha

        Cliente cliente = encontrarClientePorId(id);
        if (cliente != null) {
            System.out.println("Digite o índice do serviço:");
            int indiceServico = scanner.nextInt();

            System.out.println("Digite o novo status (true para ATIVO, false para INATIVO):");
            boolean novoStatus = scanner.nextBoolean();

            administracao.alterarStatusServico(cliente, indiceServico, novoStatus);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private void excluirServico(Scanner scanner) {
        System.out.println("Digite o ID do cliente:");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consome a nova linha

        Cliente cliente = encontrarClientePorId(id);
        if (cliente != null) {
            System.out.println("Digite o índice do serviço:");
            int indiceServico = scanner.nextInt();

            administracao.excluirServico(cliente, indiceServico);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private void listarSolicitacoes() {
        administracao.listarSolicitacoes(clientes);
    }

    private Cliente encontrarClientePorId(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.exibirMenuPrincipal();
    }
}
