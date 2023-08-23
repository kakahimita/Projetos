package ex032_faculdade;

/**
 *
 * @author kakah
 */
public class Ex032_Faculdade {


    public static void main(String[] args) {
        
        // Resolvendo atividades da faculdade
        
        /* 2) Escreva um programa em java para somar os valores de uma matriz,
         * dica utlize laço de repetição.
        */

        int[][] matriz = {{1, 2,3}, {4, 5, 6}, {7, 8, 9}};
        
        // Variável para armazenar a soma dos valores
        int soma = 0;
        
        // Percorrer a matriz e somar os valores
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                soma += matriz[linha][coluna];
            }
        }
        
        // Imprimir a soma dos valores da matriz
        System.out.println("A soma dos valores da matriz é " + soma);
        
        /* Neste exemplo, estamos usando um loop aninhado para percorrer
         * todos os elementos da matriz. O loop externo percorre as linhas
         * da matriz e o loop interno percorre as colunas de cada linha.
         * A variável 'soma' é atualizada a cada interação do loop interno,
         * adicionando o valor atual da célula da matriz.
         *
         * No final do programa, imprimimos a soma total dos valores da matriz.
         * Ao executar esse código, ele calculará e imrpimirá a soma
         * dos valores da matriz especificada.
        */
        
        // Existem outras formas de somar uma matriz até que de forma mais
        // simples. segue o exemplo utilizando apenas 2 numeros.
        
        int[][] matriz2 = {{5, 8}};
        
        int soma2 = matriz2[0][0] + matriz2[0][1];
        
        System.out.println("A soma dos dois números é: " + soma2);
        
    }

}
