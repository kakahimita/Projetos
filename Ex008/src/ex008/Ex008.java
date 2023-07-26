
package ex008;

import java.util.Scanner;


public class Ex008 {

    public static void main(String[] args) {
        
        // Atividade verificar Idade
        
        // 1)
        
        Scanner teclado = new Scanner(System.in);
        
        int ano;
        int idade;
        int resultado;
        
        System.out.print("Ano Nascimento: ");
        idade = teclado.nextInt();
        
        System.out.print("Ano Atual: ");
        ano = teclado.nextInt();
        
        resultado = ano - idade;
        
        System.out.println("sua Idade é: "+ resultado);
        
        
        
        

    }
    
}
