package ex038_fg_array_duplicada;

/**
 *
 * @author kakah
 */
public class Ex038_FG_Array_duplicada {


    public static void main(String[] args) {
        
        // Resolvendo questões da FG || Arrays duplicadas ||
        
        /* 1) Escreva um programa em java para remover os elementos
         * duplicados de um determinado array e retornar o novo
         * comprimento do array com seus valores na tela.
        */
        
        int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7};
        
        int newLength = removeDuplicates(array);
        
        System.out.println("Novo comprimento do array: " + newLength);
        System.out.println("Valores únicos no array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.println(array[i] + " ");
        }
    }
    
    // para resolver a questão foi necessario a criação de um metodo
    public static int removeDuplicates(int[] arr) {
        if(arr.length == 0) {
            return 0;
        }
        
        int uniqueIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        
        return uniqueIndex + 1;
    }
}
