package ex058_udemy;

import entidades.Produto;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author kakah
 */
public class Ex058_Udemy {


    public static void main(String[] args) {
        
        // Exercicio vetor com objetos
        
        /* Fazer um programa para ler um número inteiro N e os dados
         * (nome e preço) de N Produtos. Armazene os N produtos em um 
         * vetor. Em seguida, mostrar o preço médio dos produtos
         *
        */
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Produto[] vector = new Produto[n];
        
        for(int i=0; i<vector.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vector[i] = new Produto(nome, preco);
        }
        
        double soma = 0.0;
        for(int i=0; i<vector.length; i++) {
            soma += vector[i].getPreco();
        }
        
        double media = soma / n;
        
        System.out.printf("O preço medio dos produtos é %.2f%n", media);
        
        sc.close();
    }

}
