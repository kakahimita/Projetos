
package amelia2;

import java.util.Scanner;


public class Amelia2 {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();
        
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("----- Console ------ ");
            System.out.println("1. Cadastrar");
            System.out.println("2. Logar");
            System.out.println("3 Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome: ");
                    String nomeCadastro = scanner.next();
                    System.out.println("Digite a senha: ");
                    String senhaCadastro = scanner.next();
                    usuario.setNome(nomeCadastro);
                    usuario.setSenha(senhaCadastro);
                    System.out.println("Cadastro realizado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o nome: ");
                    String nomeLogin = scanner.next();
                    System.out.print("Digite a senha: ");
                    String senhaLogin = scanner.next();
                    
                    if (nomeLogin.equals(usuario.getNome()) && senhaLogin.equals(usuario.getSenha())) {
                        System.out.println("Login realizado com sucesso!");
                        
                        int opcaoLogado = 0;
                        while (opcaoLogado != 3) {
                            System.out.println("------ Menu -------");
                            System.out.println("1. Cadastrar contatos de emermgência");
                            System.out.println("2. SOS");
                            System.out.println("3. Sair");
                            System.out.print("Escolha uma opção: ");
                            opcaoLogado = scanner.nextInt();
                            
                            switch (opcaoLogado) {
                                case 1: 
                                    System.out.print("Digite o nome do contato de emergência: ");
                                    String nomeContato = scanner.next();
                                    System.out.print("Digite o telefone do contato de mergência: ");
                                    String telefoneContato = scanner.next();
                                    ContatoEmergencia contato = new ContatoEmergencia(nomeContato, telefoneContato);
                                    System.out.println("Contato de emergência cadastrado com sucesso");
                                    break;
                                case 2:
                                    usuario.ligarAutoridades();
                                    System.out.println("Ligação para as autoridades e contatos de emergências");
                                    break;
                                case 3:
                                    System.out.println("Saindo do Menu...");
                                    break;
                                default:
                                    System.out.println("Opção inválida. Tente novamente.");
                                    break;
                            }
                            
                        }
                    } else {
                        System.out.println("Nome de usuário ou senha inválidos!");
                    }
                    break;
                case 3:
                    System.out.println("Saindo do console...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

    }
    
}
