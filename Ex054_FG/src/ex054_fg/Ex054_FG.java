package ex054_fg;

import java.util.Scanner;

/**
 *
 * @author kakah
 */
public class Ex054_FG {


    public static void main(String[] args) {
        
        //1)
        /* Faça a implementação da logica apresentada criando um modelo
         * de dados de uma Lista de itens de um supermerceado.
        */
        
        ListaItems lista = new ListaItems();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Adicionar um item");
            System.out.println("2. Remover um item");
            System.out.println("3. Verificar o tamanho da lista");
            System.out.println("4. Verificar se um item está na lista");
            System.out.println("5. Exibir a lista");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do item a ser adicionado: ");
                    String nomeItem = scanner.next();
                    if (!lista.contem(nomeItem)) {
                        System.out.print("Digite o preço do item: ");
                        double precoItem = scanner.nextDouble();
                        lista.adiciona(nomeItem, precoItem);
                    } else {
                        System.out.println("O item já está na lista.");
                    }
                    break;
                case 2:
                    System.out.print("Digite a posição do item a ser removido: ");
                    int posicao = scanner.nextInt();
                    if (lista.posicaoValida(posicao) && lista.posicaoOcupada(posicao)) {
                        lista.remove(posicao);
                    } else {
                        System.out.println("Posição inválida ou não ocupada.");
                    }
                    break;
                case 3:
                    System.out.println("Tamanho da lista: " + lista.tamanho());
                    break;
                case 4:
                    System.out.print("Digite o nome do item a ser verificado: ");
                    String nomeVerificar = scanner.next();
                    boolean contem = lista.contem(nomeVerificar);
                    if (contem) {
                        System.out.println("O item está na lista.");
                    } else {
                        System.out.println("O item não está na lista.");
                    }
                    break;
                case 5:
                    System.out.println("Itens na lista:\n" + lista.exibirLista());
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

