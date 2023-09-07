package ex038_faculdade;

import java.util.Arrays;

/**
 *
 * @author kakah
 */
public class Ex038_Faculdade {


    public static void main(String[] args) {
        // Excercico para ser Feliz :)
        // UNIFG
        
        /* 7) Escreva um programa em Java para remover um elemento especifico
         * de uma matriz.
        */
        
        // Declara um array de inteiros
        int[] array = {1, 2, 3, 4, 5};
        
        // Declara o valor a ser removido do array
        int valor = 3;
        
        // Encontra o índice do valor a ser removido
        int indice = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                indice = i;
                break;
            }
        }
        
        // se o valor foi encontrado, remova- o do array
        if (indice != -1) {
            // Remove o valor do array
            for(int i = indice; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }

            // Cria um novo array com um tamanho menor
            int[] newArray = Arrays.copyOf(array, array.length - 1);
            
            // Atribua o novo array ao array original
            array = newArray;
        }
        
        // Exibe o array após a remoção do valor
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
    }

}
