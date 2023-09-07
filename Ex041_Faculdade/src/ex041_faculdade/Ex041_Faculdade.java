package ex041_faculdade;

/**
 *
 * @author kakah
 */
public class Ex041_Faculdade {


    public static void main(String[] args) {
        // Excercico para ser Feliz :)
        // UNIFG
        
        /* 10) Escreva um programa em java para encontrar os valores
         * Máximo e mínimo de uma matriz
        */
        
        // Declara um array de inteiros
        int[] array = {9, 7, 3, 4, 5};
        
        // Declara as variáveis para armazenar os valores máximo e mínimo
        int max = array[0];
        int min = array[0];
        
        // Intera pelo array e atualiza os valores máximo e mínimo
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        
        System.out.println("O valor máximo é: " + max);
        System.out.println("O valor mínimo é: " + min);
    }

}
