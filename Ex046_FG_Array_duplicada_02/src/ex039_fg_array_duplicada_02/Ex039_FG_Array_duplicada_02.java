package ex039_fg_array_duplicada_02;

import java.util.Arrays;

/**
 *
 * @author kakah
 */
public class Ex039_FG_Array_duplicada_02 {


    public static void main(String[] args) {
        
       // Resolvendo questão da FG || Arrays duplicadas (2) ||
        
       /* 1) Escreva um programa em java para remover os elementos
         * duplicados de um determinado array e retornar o novo
         * comprimento do array com seus valores na tela.
        */
        
        /* Nessa nova resposta para questão 1 vamos remover os elementos
         * duplicados e redimensionar o array para que ele contenha apenas
         * os elementos únicos, você pode criar um novo array com tamanho
         * correto e copiar os elementos únicos para ele. 
         * Aqui está como você pode fazer isso:
        */
        
        int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7};
        
        int[] newArray = removeDuplicates(array);
        
        System.out.println("Novo tamanho array: " + newArray.length);
        System.out.println("nova Array: " + Arrays.toString(newArray));
        
    }
    
    public static int[] removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return new int[0];
        }
        
        Arrays.sort(nums); // Ordena o array para colocar duplicados em sequência
        
        int newSize = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                newSize++;
            }
        }
        
        int[] newArray = new int[newSize];
        newArray[0] = nums[0];
        
        int newIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                newArray[newIndex] = nums[i];
                newIndex++;
            }
        }
        
        return newArray;
        
    }

}
