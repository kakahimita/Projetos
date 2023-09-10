package ex047_fg;

/**
 *
 * @author kakah
 */
public class Ex047_FG {


    public static void main(String[] args) {
        // Excercico para ser Feliz :)
        // UNIFG
        
        /* 1) Dado duas matrizes M1 e M2 de tamanho x e y, escreva um programa
         * em Java para juntar elementos de M1 com M2 mantendo a ordem classi-
         * ficada, ou seja, preencha M1 com os primeiros x elementos menores
         * e preencha M2 com os elementos restantes.
        */
        
        // vcê tb pode usar um 'Arrays.sort();' para classificar em ordem
        
        // Declara duas matrizes de inteiros
        int[] m1 = {1, 3, 5, 7, 9};
        int[] m2 = {2, 4, 6, 8, 10};
        
        // Declara um array para armazenar os elementos combinados
        int[] mergedArray = new int[m1.length + m2.length];
        
        // Itera pelas duas matrizes e adicona os elementos ao array combinado
        int i = 0;
        int j = 0;
        
        while(i < m1.length && j < m2.length) {
            if(m1[i] < m2[j]) {
                mergedArray[i + j] = m1[i];
                i++;
            } else {
                mergedArray[i + j] = m2[j];
                j++;
            }
        }
        
        // Adicona os elementos restantes da matriz m1 ao array combinado
        while (i < m1.length) {
            mergedArray[i + j] = m1[i];
            i++;
        }
        
        // adiciona os elementos restantes da matriz m2 ao array combinado
        while (j < m2.length) {
            mergedArray[i + j] = m2[j];
            j++;
        }
        
        // Exibe o array combinado
        for (int k = 0; k < mergedArray.length; k++) {
            System.out.println(mergedArray[k] + " ");
        }
    }
}
