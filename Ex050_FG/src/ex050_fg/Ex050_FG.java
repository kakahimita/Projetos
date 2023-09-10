package ex050_fg;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author kakah
 */
public class Ex050_FG {


    public static void main(String[] args) {
        // Excercico para ser Feliz :)
        // UNIFG
        
        /* 1) Faça a implementação da logica apresentada criando um modelo
         * de dados de uma Lista de itens de um supermercado.
        */
        ListaItens lista = new ListaItens();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("O que você deseja fazer?");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Visualizar lista");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do item:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o código do item:");
                    int codigo = scanner.nextInt();
                    System.out.println("Digite o preço do item:");
                    double preco = scanner.nextDouble();
                    System.out.println("Digite a quantidade do item:");
                    int quantidade = scanner.nextInt();

                    Item item = new Item(nome, codigo, preco, quantidade);
                    lista.add(item);
                    break;
                case 2:
                    System.out.println("Digite a posição do item que deseja remover:");
                    int posicao = scanner.nextInt();

                    lista.remove(posicao);
                    break;
                case 3:
                    Item[] itens = lista.toArray();
                    Arrays.stream(itens).forEach(item -> System.out.println(item));
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }        
    }
}
