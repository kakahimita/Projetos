
package ex011;

import java.util.Scanner;

public class Ex011 {


    public static void main(String[] args) {
        
        // estrutara condicional composta
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("nascimento: ");
        int nasc = teclado.nextInt();
        
        System.out.print("ano Atual: ");
        int ano = teclado.nextInt();
        
        int r = ano - nasc;
        
        System.out.println("Idade: "+ r);
        
        if(r<16){
            System.out.println("não vota");
        } else if ((r>16 && r<18) || (r>70)) {
            System.out.println("voto opicional");        
        } else {
            System.out.println("Voto Obrigatorio");
        }

    }
    
}
