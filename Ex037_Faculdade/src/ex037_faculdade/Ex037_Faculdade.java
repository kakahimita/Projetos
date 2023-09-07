package ex037_faculdade;

/**
 *
 * @author kakah
 */
public class Ex037_Faculdade {


    public static void main(String[] args) {
        // Excercico para ser Feliz :)
        // UNIFG
        
        /* 6) Escreva um programa em Java para encontrar o índice
         * de um elemento do array:
        */
        
        // Declara um array de inteiros
        int[] array = {1, 2, 3, 4, 5};
        
        // Declara o valor a ser procurado no array
        int valor = 3;
        
        // Itera pelo array e verifica se o valor está presente
        int indice = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                indice = i;
                break;
            }
        }
        
        // Exibe o índice do valor
        if (indice != -1) {
            System.out.println("O valor " + valor + " foi encontrado no "
                    + "array na posição " + indice);
        } else {
            System.out.println("O valor " + valor + " não foi encontra "
                    + "no array");
        }
        
        /* Obs: A utilização do indice -1.
         *
         * É importante notar que o uso do valor 0 pode ser confuso, pois o
         * valor 0 é também um índice válido no array. Se o valor 0 for encont-
         * trado no array, o programa exibirá uma mensagem informando que o 
         * valor foi encontrado, mesmo que o valor não seja o valor que vc está
         * procurando.
         *
         * Portanto, é recomendável usar o valor -1 para indicar que o valor
         * não foi encontrado no array.
        */
        
        /* Outra maneira de encontrar o índice de um elemento do array é usar
         * o método indexOf() da classe Arrays . Este método retorna o índice
         * do primeiro elemento que corresponde ao valor especifico, ou -1 se o
         * valor não for encontrado no array.
         *
         * Aqui está um exemplo de como usar o método indexOf() :
        */
    }

}
