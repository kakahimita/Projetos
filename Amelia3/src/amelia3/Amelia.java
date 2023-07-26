
package amelia3;

import java.util.Scanner;


public class Amelia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[3];
        ContatoEmergencia[] contatosEmergencia = new ContatoEmergencia[3];
        int contadorUsuarios = 0;
        int contadorContatos = 0;

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (contadorUsuarios < 3) {              
                        Usuario novoUsuario = fazerCadastro(scanner);      // um novo usuário
                        usuarios[contadorUsuarios] = novoUsuario;          // o objeto novoUsuario recebe o usuario
                        contadorUsuarios++;                                // retornado pelo metodo fazerCadastro
                        System.out.println("Cadastro realizado com sucesso.");
                        System.out.println(" ");
                    } else {
                        System.out.println("Número máximo de usuários alcançado.");
                    }
                    break;
                case 2:
                    Usuario usuarioLogado = fazerLogin(scanner, usuarios, contadorUsuarios);
                    if (usuarioLogado != null) {
                        int subOpcao;
                        do {
                            exibirSubMenu();
                            subOpcao = scanner.nextInt();

                            switch (subOpcao) {
                                case 1:
                                    realizarSOS(contatosEmergencia, contadorContatos);
                                    break;
                                case 2:
                                    if (contadorContatos < 3) {
                                        cadastrarContatoEmergencia(scanner, contatosEmergencia, contadorContatos); // permitir que o usuario cadastre um novo contato
                                        contadorContatos++;
                                        System.out.println("Contato de emergência cadastrado com sucesso.");
                                        System.out.println(" ");
                                    } else {
                                        System.out.println("Número máximo de contatos de emergência alcançado.");
                                    }
                                    break;
                                case 3:
                                    if (contadorContatos > 0) {
                                        alterarContatosEmergencia(scanner, contatosEmergencia, contadorContatos);
                                    } else {
                                        System.out.println("Nenhum contato de emergência cadastrado.");
                                    }
                                    break;
                                case 4:
                                    exibirContatosEmergencia(contatosEmergencia, contadorContatos);
                                    break;
                                case 5:
                                    System.out.println("Logout realizado com sucesso.");
                                    break;
                                default:
                                    System.out.println("Opção inválida.");
                            }
                        } while (subOpcao != 5);
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
    }

    private static void exibirMenu() {
        System.out.println("=== Menu ===");
        System.out.println("1. Cadastrar");
        System.out.println("2. Login");
        System.out.println("3. Sair");
        System.out.print("Digite a opção desejada: ");
    }

    private static Usuario fazerCadastro(Scanner scanner) {
        System.out.println("\n=== Cadastro de Usuário ===");
        System.out.print("Nome completo: ");
        String nomeCompleto = scanner.next();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("Email: ");
        String email = scanner.next();

        System.out.print("Senha: ");
        String senha = scanner.next();

        return new Usuario(nomeCompleto, idade, email, senha);
    }

    private static Usuario fazerLogin(Scanner scanner, Usuario[] usuarios, int contadorUsuarios) {
        System.out.println("\n=== Login ===");
        System.out.print("Email: ");
        String email = scanner.next();

        System.out.print("Senha: ");
        String senha = scanner.next();

        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i].getEmail().equals(email) && usuarios[i].getSenha().equals(senha)) {
                System.out.println("Login bem-sucedido. Bem-vindo, " + usuarios[i].getNomeCompleto() + "!");
                return usuarios[i];
            }
        }

        System.out.println("Email ou senha incorretos. Login falhou.");
        return null;
    }

    private static void exibirSubMenu() {
        System.out.println("\n=== Submenu ===");
        System.out.println("1. SOS");
        System.out.println("2. Cadastrar contato de emergência");
        System.out.println("3. Alterar contatos de emergência");
        System.out.println("4. Visualizar contatos de emergência");
        System.out.println("5. Logout");
        System.out.print("Digite a opção desejada: ");
    }

    private static void cadastrarContatoEmergencia(Scanner scanner, ContatoEmergencia[] contatosEmergencia, int contadorContatos) {
        System.out.println("\n=== Cadastro de Contato de Emergência ===");
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Telefone: ");
        String telefone = scanner.next();

        contatosEmergencia[contadorContatos] = new ContatoEmergencia(nome, telefone);
    }

    private static void alterarContatosEmergencia(Scanner scanner, ContatoEmergencia[] contatosEmergencia, int contadorContatos) {
        System.out.println("\n=== Alteração de Contatos de Emergência ===");
        exibirContatosEmergencia(contatosEmergencia, contadorContatos);

        System.out.print("Digite o número do contato que deseja alterar: ");
        int numeroContato = scanner.nextInt();

        if (numeroContato >= 1 && numeroContato <= contadorContatos) {
            System.out.print("Novo nome: ");
            String novoNome = scanner.next();

            System.out.print("Novo telefone: ");
            String novoTelefone = scanner.next();

            contatosEmergencia[numeroContato - 1].setNome(novoNome);
            contatosEmergencia[numeroContato - 1].setTelefone(novoTelefone);

            System.out.println("Contato alterado com sucesso.");
        } else {
            System.out.println("Número de contato inválido.");
        }
    }

    private static void exibirContatosEmergencia(ContatoEmergencia[] contatosEmergencia, int contadorContatos) {
        System.out.println("\n=== Contatos de Emergência ===");
        if (contadorContatos > 0) {
            for (int i = 0; i < contadorContatos; i++) {
                System.out.println("Contato " + (i + 1));
                System.out.println("Nome: " + contatosEmergencia[i].getNome());
                System.out.println("Telefone: " + contatosEmergencia[i].getTelefone());
            }
        } else {
            System.out.println("Nenhum contato de emergência cadastrado.");
        }
    }

    private static void realizarSOS(ContatoEmergencia[] contatosEmergencia, int contadorContatos) {
        System.out.println("\n=== SOS ===");
        System.out.println("Estamos entrando em contato com as autoridades e seus contatos de emergência:");

        exibirContatosEmergencia(contatosEmergencia, contadorContatos);

        System.out.println("SOS enviado!");
    }
}









