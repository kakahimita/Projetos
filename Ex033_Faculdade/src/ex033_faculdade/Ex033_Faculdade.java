package ex033_faculdade;

/**
 *
 * @author kakah
 */
public class Ex033_Faculdade {


    public static void main(String[] args) {
        
        // Resolvendo atividades da Faculdade
        
        /* 3) Escreva um programa em java para imprimir a seguinte matriz:
         *  . . . .
         *  . . . .
         *  . . . .
         *
        */

        int[][] matriz = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        // Loop para percorrer as linhas da matriz
        for (int i = 0; i < matriz.length; i++) {
            // Loop para percorrer as colunas da matriz
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " "); // Imprime o elemento atual
            }
            System.out.println(); // Pula para a próxima linha após imprimir a linha da matriz
        }
    }
}

