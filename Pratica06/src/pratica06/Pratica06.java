
package pratica06;

import java.util.Scanner;


public class Pratica06 {


    public static void main(String[] args) {
        
        Caneta c1 = new Caneta("ferrari", "azul", 3.4f);
        
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        System.out.println(" == = == = = = = ==");
        
        Caneta c2 = new Caneta("luis", "verde", (float) 0.5);
        
        
        c2.status();
        c2.rabiscar();
    }
    
}
