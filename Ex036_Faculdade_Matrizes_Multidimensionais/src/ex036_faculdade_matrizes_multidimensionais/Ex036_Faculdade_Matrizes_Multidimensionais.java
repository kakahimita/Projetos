package ex036_faculdade_matrizes_multidimensionais;

/**
 *
 * @author kakah
 */
public class Ex036_Faculdade_Matrizes_Multidimensionais {


    public static void main(String[] args) {

        // Matrizes Multidimensionais
        
        /* Arrays multidimensionais, são uma extensão dos arrays
         * unidimensionais, permitindo que você armazene elementos
         * em múltiplas dimensões, como linhas e colunas, formando
         * uma estrutura de tabela ou grande. Em java, a matriz multi-
         * dimensional mais comum é a matriz bidimensional, que é uma
         * matriz de matrizes
        */
        
        // Aqui está um exemplo de uma matriz bidimensional em Java:
        int[][] matriz = new int[3][4];
        
        /* Neste exemplo, criamos uma matriz com 3 linhas e 4 colunas.
         * Você pode pensar nisso como uma grade com 3 linhas e 4 colunas,
         * ou como um conjunto de 3 arrays de inteiros, onde cada array
         * 4 elementos.
        */
       
        // Acesso aos elementos de uma matriz bidimensional:
        int valor = matriz[1][2];
        
        // Inicialização de uma matriz bidimensional:
        int[][] matrizB = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        // Percorrendo uma matriz bidimensional com loops aninhados:
        for(int i = 0; i < matrizB.length; i++) {
            for(int j = 0; j < matrizB[i].length; j++) {
                System.out.println(matrizB[i][j] + " ");
            }
        }
        
        // Este exemplo imprimirá a matriz como uma grade de números.
        
        /* Além de matrizes bidimensionais, você pode criar matrizes
         * com mais dimensões(tridimensionais, tetradimensionais, etc.), mas
         * a complexidade aumenta rapidamente à medida que você adicona mais
         * dimensões. Geralmente, matrizes bidimensionais são usadas para
         * representar dados tabulares, como planilhas, imagens pixeladas
         * e assim por diante.
        */
        
        
        
        
        
    }

}
