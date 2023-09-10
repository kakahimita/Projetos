package ex051_fg;

import java.util.Scanner;

/**
 *
 * @author kakah
 */
public class Ex051_FG {


    public static void main(String[] args) {
        

        ListaItens lista = new ListaItens();

        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Remover item");
            System.out.println("3 - Pesquisar item");
            System.out.println("4 - Imprimir lista");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do item:");
                    String nome = sc.nextLine();
                    Item item = new Item();
                    lista.adiciona(item);
                    break;
                case 2:
                    System.out.println("Digite a posição do item a ser removido:");
                    int posicao = sc.nextInt();
                    lista.remove(posicao);
                    break;
                case 3:
                    System.out.println("Digite o nome do item a ser pesquisado:");
                    String nomePesquisa = sc.nextLine();
                    Item itemPesquisa = new Item(nomePesquisa, 0);
                    if (lista.contem(itemPesquisa)) {
                        System.out.println("Item encontrado: " + itemPesquisa);
                    } else {
                        System.out.println("Item não encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Lista de itens:");
                    System.out.println(lista.toString());
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

}
