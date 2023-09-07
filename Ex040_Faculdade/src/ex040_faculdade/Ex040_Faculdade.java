package ex040_faculdade;

/**
 *
 * @author kakah
 */
public class Ex040_Faculdade {


    public static void main(String[] args) {
        // Excercico para ser Feliz :)
        // UNIFG
        
        /* 9) Escreva um programa em java para inserir um elemento (posição
         * específica) em uma matriz
        */
        
        // Declara um array de inteiros
        int[] array = {1, 2, 3, 4, 5};
        
        // Declara o valor a ser inserido no array
        int valor = 6;
        
        // Declara o índice do array onde o valor será inserido
        int indice = 5;
        
        // Cria um novo array com um tamanho maior
        int[] newArray = new int[array.length + 1];
        
        // Copia os elementos do array original para o novo array
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        
        // Insere o valor no novo array na posição especificada
        newArray[indice] = valor;
        
        // Exibe o array original
        System.out.println("Array original: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
        // Exibe o array com o elemento inserido
        System.out.println("\nArray com o elemento inserido: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i] + " ");
        }
        
    }

}
