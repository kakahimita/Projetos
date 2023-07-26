
package ex009;

import java.util.Scanner;


public class Ex009 {


    public static void main(String[] args) {
        
        // calculando idade
        // operador ternario + operacao logica
        
        // 1)
        
        Scanner teclado = new Scanner(System.in);
        
        int ano,idade;
        
        System.out.print("Ano nascimento: ");
        idade = teclado.nextInt();
        
        System.out.print("Ano atual: ");
        ano = teclado.nextInt();
        
        int r = ano - idade;
        
        String b = ((r>=16 && r<18) || (r>70))?"Opcional":"Obrigatorio";
        
        System.out.println(r+" "+b);
        
        
        
    }
    
}
