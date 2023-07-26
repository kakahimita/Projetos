
package ex010;

import java.util.Scanner;


public class Ex010 {


    public static void main(String[] args) {
        
        // Estrutura de controle condicional
                
        // utilizando IF e ELSE
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Nota1: ");
        int nota = teclado.nextInt();
        
        System.out.print("Nota2: ");
        int nota2 = teclado.nextInt();
        
        int r = (nota + nota2)/2;
        System.out.println("A media das notas é "+ r);
        
        if (r>9){
            System.out.println("Parabens");
        } else {
            System.out.println("melhorar");
        }
        

    }
    
}
