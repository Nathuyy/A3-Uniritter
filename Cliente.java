import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente extends Usuario {

    private List<Servico> historicoDeSolicitacoes;

    public Cliente(int id, String nome, String cpf, String email) {
        super(id, nome, cpf, email);
        historicoDeSolicitacoes = new ArrayList<>();
    }

    public void solicitarServico() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do serviço que deseja solicitar:");
        String nomeServico = leitor.nextLine();

        System.out.println("Digite a descrição do serviço:");
        String descricaoServico = leitor.nextLine();

        System.out.println("Digite o preço do serviço:");
        double precoServico = leitor.nextDouble();
        leitor.nextLine(); 

        Servico novoServico = new Servico(nomeServico, descricaoServico, precoServico);

        System.out.println("Solicitando Serviço: " + novoServico.getNomeServico());

        historicoDeSolicitacoes.add(novoServico);
        System.out.println("Serviço solicitado: " + novoServico.getNomeServico());
    }

    public List<Servico> getHistoricoDeSolicitacoes() {
        return historicoDeSolicitacoes;
    }

    public void exibirHistoricoDeSolicitacoes() {
        System.out.println("Histórico de Solicitações:");
        for (Servico servico : historicoDeSolicitacoes) {
            System.out.println(servico.getNomeServico() + " - " + servico.getDescricaoServico() + " - Preço: " + servico.getPrecoServico());
        }
    }
}
