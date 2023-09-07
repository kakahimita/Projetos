package ex035_faculdade;

/**
 *
 * @author kakah
 */
public class Ex035_Faculdade {


    public static void main(String[] args) {
        // Excercico para ser Feliz :)
        // UNIFG
        
        /* 4)Escreva um programa em Java para calcular o valor médio
         * dos elementos do array.
        */
        
        // Declara um array de inteiros
        int[] myArray = {1,2,3,4,5};
        
        // Declara uma variável para armazenar o somatório dos elementos
        int soma = 0;
        
        
        for(int i = 0; i < myArray.length; i++) {
            soma += myArray[i];
        }
        
        // Calcula a média e exibe o resultado
        double media = soma / myArray.length;
        System.out.println("A média dos elementos do array é " + media);
        
        
        //Obs:
        
        /* A fórmula para calcular a média dos valores de um array
         *
         * média = (soma dos valores) / (número dos valores)
         *
         * No programa java, a soma dos valores é armazenada na variável
         * 'soma' e o número de valores é armazenado na variável array.length
         * portanto, a fórmula para calcular a média é:
         * 
         * media = soma / array.length
         *
         * A média é calculada dividindo a soma dos valores pelo número
         * de valores. Isso signifíca que a média é o valor que,
         * se multiplicado pelo número de valores, resulta na soma dos valores.
         *
         * Por exemplo, se o array tiver os valores 1, 2, 3, 4 e 5, 
         * a média será:
         * 
         * media = (1, 2, 3, 4, 5) / 5 = 3
         *
         * Portanto, a média dos valores do array é 3.
        */
        
    }
    
}
