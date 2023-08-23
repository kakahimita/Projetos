package ex034_faculdade;

/**
 *
 * @author kakah
 */
public class Ex034_Faculdade {


    public static void main(String[] args) {
        
        // Resolvendo questoes da faculdade
        
        // uma outra forma de imprimir a resposta da questão 3
        // tambem seria utilizando Strings com " . "
        
        
        String[][] matriz = {{".", ".", "."},{".", ".", "."},{".", ".", "."}};

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
