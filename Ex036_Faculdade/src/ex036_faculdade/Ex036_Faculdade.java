package ex036_faculdade;

/**
 *
 * @author kakah
 */
public class Ex036_Faculdade {


    public static void main(String[] args) {
        // Excercico para ser Feliz :)
        // UNIFG        

        /* 5) Escreva um programa em Java para testar se uma matriz
         * contém um valor específico.
        */
        
        // Declara um array de inteiros
        int[] array = {1, 2, 3, 4, 5};
        
        // Declara o valro a ser procurado no array
        int valor = 3;
        
        // Itera pelo array e verifica se o valor está presente
        for(int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                // O valor foi encontrado
                System.out.println("O valor " + valor + " foi encontrado no array :D");
                return;
            }
        }
        
        // O valor não foi encontrado
        System.out.println("O valor " + valor + " não foi encontrado no array :(");
        
    }

}
