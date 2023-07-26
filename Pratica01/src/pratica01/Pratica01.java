
package pratica01;

import java.util.Scanner;


public class Pratica01 {


    public static void main(String[] args){
        
        Caneta c1 = new Caneta();
        
        c1.modelo = "Luis";
        c1.cor = "verde";
        c1.ponta = (float) 0.5;
        c1.carga = 100;
        
        c1.destampar();
        c1.status();
        c1.rabiscar();
        c1.status();
        
        Caneta c2 = new Caneta();
        
        c2.modelo = "kakeli";
        
        System.out.println("---------------------------");
        c2.status();
        c2.rabiscar();
        c2.status();
        
    }
        
}
