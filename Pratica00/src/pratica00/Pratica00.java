
package pratica00;

import java.util.Scanner;


public class Pratica00 {


    public static void main(String[] args) {        

        Caneta c1 = new Caneta("bik", "amarelo", (float) 2.3);
        
        c1.status();
        System.out.println("==========");
        c1.destampar();
        c1.rabiscar();
    }
}
