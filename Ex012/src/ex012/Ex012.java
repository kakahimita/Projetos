
package ex012;

import java.util.Scanner;


public class Ex012 {


    public static void main(String[] args) {
        
        // switch
        // exercicio 
        
        // 1)
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quantas pernas?: ");
        int perna = teclado.nextInt();
        
        String tipo;
        System.out.println("Isso é um(a)");
        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);

    }
    
}
