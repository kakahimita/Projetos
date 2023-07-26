
package ex016;

import java.util.Scanner;


public class Ex016 {


    public static void main(String[] args) {
        
        // Exercicio estrutura de repetiçao com teste no final
        // com String
        
        // 1)
        
        int n, s = 0;
        String resp;
        
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um numero: ");
            n = teclado.nextInt();
            s += n;
            System.out.println("Quer continuar? [S/N]");
            resp = teclado.next();
        } while (resp.equals("S"));
        System.out.println("A soma de todos os valores é " + s);

    }
    
}
