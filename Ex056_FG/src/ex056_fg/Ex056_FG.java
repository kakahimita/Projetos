package ex056_fg;

import java.util.Scanner;

/**
 *
 * @author kakah
 */
public class Ex056_FG {


    public static void main(String[] args) {

        //UNIFG
        
        //questao 2
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
                    int indiceExistente = lista.encontraIndicePorNome(nomeItem);

                    if (indiceExistente != -1) {
                        // Item já existe na lista, pergunte apenas pela quantidade
                        System.out.print("Digite a quantidade a ser adicionada: ");
                        int quantidadeItem = scanner.nextInt();
                        lista.adiciona(nomeItem, 0, quantidadeItem); // Preço não importa neste caso
                    } else {
                        // Item não existe, peça pelo preço e quantidade como de costume
                        System.out.print("Digite o preço do item: ");
                        double precoItem = scanner.nextDouble();
                        System.out.print("Digite a quantidade do item: ");
                        int quantidadeItem = scanner.nextInt();
                        lista.adiciona(nomeItem, precoItem, quantidadeItem);
                    }
                    break;
                case 2:
                    System.out.print("Digite o nome do item a ser removido: ");
                    String nomeRemover = scanner.next();
                    System.out.print("Digite a quantidade a ser removida: ");
                    int quantidadeRemover = scanner.nextInt();
                    lista.remove(nomeRemover, quantidadeRemover);
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
