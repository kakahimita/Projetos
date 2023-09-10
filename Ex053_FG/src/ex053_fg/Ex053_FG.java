package ex053_fg;

import java.util.Scanner;

/**
 *
 * @author kakah
 */
public class Ex053_FG {


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
                    Item item = new Item();
                    item.setNome(nomeItem);
                    lista.adiciona(item);
                    break;
                case 2:
                    System.out.print("Digite a posição do item a ser removido: ");
                    int posicao = scanner.nextInt();
                    lista.remove(posicao);
                    break;
                case 3:
                    System.out.println("Tamanho da lista: " + lista.tamanho());
                    break;
                case 4:
                    System.out.print("Digite o nome do item a ser verificado: ");
                    String nomeVerificar = scanner.next();
                    Item itemVerificar = new Item();
                    itemVerificar.setNome(nomeVerificar);
                    boolean contem = lista.contem(itemVerificar);
                    if (contem) {
                        System.out.println("O item está na lista.");
                    } else {
                        System.out.println("O item não está na lista.");
                    }
                    break;
                case 5:
                    System.out.println("Itens na lista: " + lista.toString());
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
