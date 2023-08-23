package ex030;

/**
 *
 * @author kakah
 */
public class Ex030 {


    public static void main(String[] args) {
        
        // Comprimentos de um Array:
        
        /* O atributo length é usado para obter o comprimento
         * de um array (ou seja, o número de elementos):
        */
        
        int[] numeros = new int[10];
        
        int tamanho = numeros.length;
        
        System.out.println(tamanho);
        
        // ================ // ================ //
        
        // Arrays Multidimensionais:
        
        /* Em java você também pode criar arrays multidimensionais,
         * como matrizes(arrays de arrys) por exemplo:
        */

        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        
        /* Esta matriz é uma matriz 3x3, onde há 3 linhas e 3 colunas.
         * Os índices são baseados em zero, ou seja a primeira linha
         * e a primeira coluna têm índice 0.
         *
         * Para acessar elementos em uma matriz, você fornece os índices
         * da linha e da coluna. Por exemplo, para acessar o valor 6,
         * você precisa ir à segunda linha(índice 1) e à terceira coluna
         * (índice2):
        */
        
        int valor = matriz[1][2];
        
        System.out.println(valor);
        
        // Explicação de Acesso ao Valor 6:
        
        // Na matriz que declaramos:
        
        /* {1, 2, 3}
         * {4, 5, 6}
         * {7, 8, 9}
        */
        
        /* A primeira linha ('matriz[0]) é {1, 2, 3}.
         * A segunda  linha  ('matriz[1]  é {4, 5, 6}.
         * A terceira linha ('matriz[2]  é {7, 8, 9}.
         *
         * Ao acessar 'matriz[1][2]', estamos acessando a segunda linha
         * ('matriz[1]')e, em seguida, o terceiro elemento nessa linha
         * ('[2]'). O terceiro elemento na segunda linha é o valor 6.
         *
         * Isso ocorre porque os índices do arrays começam em 0. Então
         * quando você diz 'matriz[1][2]', está indo para a segunda linha
         * (índice 1) e depois para a terceira coluna (índice 2), o que
         * resulta no valor 6.
         *
        */
        
        
        
        
    }

}
