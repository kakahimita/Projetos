package ex047_fg_01;

import java.util.Arrays;

/**
 *
 * @author kakah
 */
public class Ex047_FG_01 {


    public static void main(String[] args) {
        // Excercico para ser Feliz :)
        // UNIFG
        
        /* 1) Dado duas matrizes M1 e M2 de tamanho x e y, escreva um programa
         * em Java para juntar elementos de M1 com M2 mantendo a ordem classi-
         * ficada, ou seja, preencha M1 com os primeiros x elementos menores
         * e preencha M2 com os elementos restantes.
        */
        
        /* você também pode usar o método Arrays.sort() da classe arrays
         * para ordenar as duas matrizes antes de juntá-las. Este método
         * retornará duas matrizes ordenadas. Você  pode usar o metodo
         * System.arraycopy() para copiar os elementos das duas matrizes
         * ordenadas para o array combinado. 
         *
         * Aqui está um exemplo de como usar o método Arrays.sort():
        */
        
        int[] m1 = {1, 3, 5, 7, 9};
        int[] m2 = {2, 4, 6, 7, 10};
        
        // Ordena as duas Matrizes
        Arrays.sort(m1);
        Arrays.sort(m2);
        
        // Cria um array para armazenar os elementos combinados
        int[] mergedArray = new int[m1.length + m2.length];
        
        // Copia os elementos das duas matrizes ordenadas para o array combinado
        System.arraycopy(m1, 0, mergedArray, 0, m1.length);
        System.arraycopy(m2, 0, mergedArray, m1.length, m2.length);
        
        // Exibe o array combinado
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.println(mergedArray[i] + " ");
        }
    }

}
