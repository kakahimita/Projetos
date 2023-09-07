package pratica35;

/**
 *
 * @author kakah
 */
public class Pratica35 {


    public static void main(String[] args) {
        
        int[] matriz = {1, 2, 3, 4, 5};
        
        int soma = 0;
        
        for(int i = 0; i < matriz.length; i++) {
            soma += matriz[i];
        }
        
        double media = soma / matriz.length;
        System.out.println(media);

    }

}
