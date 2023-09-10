package ex055_fg;

import java.util.Scanner;

/**
 *
 * @author kakah
 */
public class Ex055_FG {


    public static void main(String[] args) {
        // 2)
        /* Faça a mesma implementação para uma lista de contatos
         * de uma agenda telefônica.
        */
        
        AgendaTelefonica agenda = new AgendaTelefonica();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Adicionar um contato");
            System.out.println("2. Remover um contato");
            System.out.println("3. Verificar o tamanho da agenda");
            System.out.println("4. Verificar se um contato está na agenda");
            System.out.println("5. Exibir a lista de contatos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer de entrada

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato a ser adicionado: ");
                    String nomeContato = scanner.nextLine();
                    if (!agenda.contem(nomeContato)) {
                        System.out.print("Digite o número de telefone do contato: ");
                        String numeroContato = scanner.nextLine();
                        agenda.adiciona(nomeContato, numeroContato);
                    } else {
                        System.out.println("O contato já está na agenda.");
                    }
                    break;
                case 2:
                    System.out.print("Digite o índice do contato a ser removido: ");
                    int indice = scanner.nextInt();
                    if (agenda.posicaoValida(indice) && agenda.posicaoOcupada(indice)) {
                        agenda.remove(indice);
                    } else {
                        System.out.println("Índice inválido ou não ocupado.");
                    }
                    break;
                case 3:
                    System.out.println("Tamanho da agenda: " + agenda.tamanho());
                    break;
                case 4:
                    System.out.print("Digite o nome do contato a ser verificado: ");
                    String nomeVerificar = scanner.nextLine();
                    boolean contem = agenda.contem(nomeVerificar);
                    if (contem) {
                        System.out.println("O contato está na agenda.");
                    } else {
                        System.out.println("O contato não está na agenda.");
                    }
                    break;
                case 5:
                    System.out.println("Contatos na agenda:\n" + agenda.exibirLista());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
