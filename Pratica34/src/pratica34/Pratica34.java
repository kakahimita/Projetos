package pratica34;

import java.util.Arrays;

/**
 *
 * @author kakah
 */
public class Pratica34 {


    public static void main(String[] args) {
        
        int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7};
        
        int newLength = removeDuplicates(array);
        
        System.out.println("novo comprimento do array: " + newLength);
        System.out.println("valores únicos no array: ");
        for(int i = 0; i < newLength; i++) {
            System.out.println(array[i] + " ");
        }
        
    }
    
    private static int removeDuplicates(int[] arr) {
        if(arr.length == 0) {
            return 0;
        }
        
        int uniqueIndex = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        
        return uniqueIndex + 1;
    }
}
