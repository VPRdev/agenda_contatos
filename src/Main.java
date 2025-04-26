import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while (true){
            System.out.println("### MENU ###");
            System.out.println("1. Adicionar contato: ");
            System.out.println("2. Listar contato: ");
            System.out.println("3. Buscar Contato");
            System.out.println("4. Remover Contato");
            System.out.println("5. Sair.");
            System.out.println("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){

                case 1:
                System.out.println("Digite o nome do contato: ");
                String nome = scanner.nextLine();
                System.out.println("Digite o telefone do contato: ");
                String telefone = scanner.nextLine();
                System.out.println("Digite o email do contato: ");
                String email = scanner.nextLine();

                Contato novoContato = new Contato(nome, telefone, email);
                agenda.adicionarContato(novoContato);
                System.out.println("Adicionado com sucesso !");
                break;

                case 2:
                agenda.listarContatos();
                break;

                case 3:
                System.out.println("Digite o nome do contato que deseja buscar: ");
                nome = scanner.nextLine();
                Contato contatoBuscado = agenda.buscarContato(nome);
                if (contatoBuscado != null){
                    contatoBuscado.exibirContato();
                } else {
                    System.out.println("Contato não encontrado.");
                }
                break;

                case 4:
                System.out.println("Digite o nome do contato que deseja remover: ");
                nome = scanner.nextLine();
                if (agenda.removerContato(nome)) {
                    System.out.println("Contato removido com sucesso !");
                } else {
                    System.out.println("Contato não encontrado");
                }
                break;

                case 5:
                System.out.println("Saindo...");
                scanner.close();
                return;

                default:
                    System.out.println("Opção inválida, tente novamente");
            }
        }

    }
}
