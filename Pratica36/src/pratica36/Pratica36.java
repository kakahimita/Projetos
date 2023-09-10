package pratica36;

import java.util.Arrays;

/**
 *
 * @author kakah
 */
public class Pratica36 {


    public static void main(String[] args) {

        int[] m1 = {1, 5, 6, 8};
        int[] m2 = {4, 7, 9, 2};
        
        int[] mergedArray = new int[m1.length + m1.length];
        
        Arrays.sort(m1);
        Arrays.sort(m2);
        
        int j = 0;
        int i = 0;
        
        while(i < m1.length && j < m2.length) {
            if(m1[i] < m2[j]) {
                mergedArray[i + j] = m1[i];
                i++;
            } else {
                mergedArray[i + j] = m2[j];
                j++;
            }
        }
        
        while (i < m1.length) {
            mergedArray[i + j] = m1[i];
            i++;
        }
        
        while(j < m2.length) {
            mergedArray[i + j] = m2[j];
            j++;
        }
        
        for (int k = 0; k < mergedArray.length; k++) {
            System.out.println(mergedArray[k] + " ");
        }
        
    }

}
