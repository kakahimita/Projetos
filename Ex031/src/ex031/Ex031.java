package ex031;

import java.util.Arrays;

/**
 *
 * @author kakah
 */
public class Ex031 {


    public static void main(String[] args) {
        
        // Resolvendo atividades da faculdade
        
        /* 1) Escreva um programa em java para classificar uma matriz
         * numérica e uma matriz de string
        */

        // Matriz numérica
        int[] numeros = {5, 2, 9, 1, 5,6};
        
        // Matriz de strings
        String[] palavras = {"maçã", "banana", "uva", "laranja", "abacaxi"};
        
        // Classificar a matriz numérica em ordem crescente
        Arrays.sort(numeros);
        // classificar a matriz de strings em ordem alfabética
        Arrays.sort(palavras);
        
        // Imprimir matriz numérica classificada
        System.out.println("Matriz numérica classificada:");
        for(int num : numeros) {
            System.out.println(num + " ");
        }
        
        System.out.println();
        
        // Imprimir matriz de strings classificada
        System.out.println("Matriz de strings classificada:");
        for (String palavra : palavras) {
            System.out.println(palavra + " ");
        }
        
        /* Obs: 
         * 
         * 1- Arrays.sort(numero);' ordena a matriz numérica 'numeros
         * em ordem crescente.
         * 2- Arrays.sort(palavras);' ordena a matriz de strings 'palavras'
         * em ordem alfabética.
         *
         * for(int num : numereos)' - Esta é a declaração do loop. Aqui,
         * 'int num' é a declaração da variável que irá armazenar cada
         * elemento da matriz 'numeros' à medida que percorremos a matriz.
         * A palavra-chave 'num' é apenas um nome que escolhemos para essa
         * variável temporária. 
         *
         * O ':' indica que estamos percorrendo a matriz 'numeros'.
        */
        
        
    }

}
