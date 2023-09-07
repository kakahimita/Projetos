package ex039;

import java.util.Arrays;

/**
 *
 * @author kakah
 */
public class Ex039_Faculdade {


    public static void main(String[] args) {
        // Excercico para ser Feliz :)
        // UNIFG
        
        /* 8) Escreva um programa em java para copiar um array,
         * iterando o array:
        */
        
        // Declara um array de inteiros
        int[] array = {1, 2, 3, 4, 5};
        
        // Declara um novo array para armazenar a cópia
        int[] copyArray = new int[array.length];
        
        // Itera pelo array original e copia os valores
        // para o novo array
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }
        
        // Exibe o array original
        System.out.println("Array original: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        
        // Exibe o array copiado
        System.out.println("\nArray copiado: ");
        for (int i = 0; i < copyArray.length; i++) {
            System.out.println(copyArray[i] + " ");
        }
        
    }

}
