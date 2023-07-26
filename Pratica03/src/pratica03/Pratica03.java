
package pratica03;

import java.util.Scanner;


public class Pratica03 {


    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        
        c1.modelo = "luis";
        c1.cor = "amarelo";
        c1.carga = 50;
        
        c1.destampar();
        c1.rabiscar();
        
        c1.status();
        
        Caneta c2 = new Caneta();
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Modelo: ");
        c2.modelo = teclado.next();
        
        c2.status();

    }
    
}
