package application;

import domain.Contato;
import repository.ContatoRepository;
import service.ContatoService;
import controller.ContatoController;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Inicialização das dependências do sistema
        ContatoRepository repository = new ContatoRepository();
        ContatoService service = new ContatoService();
        ContatoController controller = new ContatoController();

        Scanner scanner = new Scanner(System.in);

        // Menu funcional da aplicação
        private int opcao;

        do {
            System.out.println("\n===== AGENDA =====");
            System.out.println("1 - Cadastrar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Buscar por ID");
            System.out.println("4 - Buscar por nome");
            System.out.println("5 - Atualizar contato");
            System.out.println("6 - Remover contato");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            // Aplica as instruções da operação selecionada
            switch (opcao) {

                // Cadastrar contato
                case 1:

                    System.out.println("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.println("Telefone: ");
                    String telefone = scanner.nextLine();

                    System.out.println("Email: ");
                    String email = scanner.nextLine();

                    Contato contato = new Contato(id, nome, telefone, email);
                    controller.cadastrar(contato);

                    break;

                // Listar contatos
                case 2:

                    System.out.prinln("Lista de contatos da agenda: ")
                    controller.listarTodos();

                    break;

                // Buscar por ID
                case 3:

                    System.out.print("Digite o ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Contato encontrado:")
                    controller.buscarPorId(id);

                    break;

                // Buscar por nome
                case 4:

                    System.out.print("Digite o nome: ");
                    nome = scanner.nextLine();
                    System.out.println("Contato encontrado:")
                    controller.buscarPorNome(nome);

                    break;

                // Atualizar contato
                case 5:

                    System.out.print("ID do contato: ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Novo nome: ");
                    nome = scanner.nextLine();

                    System.out.print("Novo telefone: ");
                    telefone = scanner.nextLine();

                    System.out.print("Novo email: ");
                    email = scanner.nextLine();

                    Contato contato = new Contato(id, nome, telefone, email);
                    controller.atualizar(contato);

                    break;

                // Remover contato
                case 6:

                    System.out.print("ID do contato: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    controller.remover(id);

                    break;

                // Sair
                case 0:
                    System.out.println("Aplicação encerrada.");
                    break;

                // Código que executa ao selecionar uma opção inválida
                default:
                    System.out.println("Opção inválida. Tente novamente.")
            }

        } while (opcao != 0);

        // Encerramento da classe scanner
        scanner.close();
    }
}