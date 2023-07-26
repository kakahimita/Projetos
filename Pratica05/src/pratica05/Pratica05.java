
package pratica05;

import java.util.Scanner;


public class Pratica05 {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        lapis a1 = new lapis();
        
        int opcao;
        String resposta;
        
        int cc = 0;
        
        do {
        
        System.out.println("----Menu----");
        System.out.println("1 - Cadastrar lapis");
        System.out.println("2 - Status lapis");
        System.out.println("3 - escrever");
        System.out.println("4 - tampar");
        System.out.println("5 - destampar");
        System.out.println("6 - sair");
        System.out.println(" ");
        System.out.print("opçao: ");
        opcao = teclado.nextInt();
        
        switch(opcao){
            case 1:
                System.out.println(" ");
                System.out.print("Modelo: ");
                a1.marca = teclado.next();
                System.out.print("Cor: ");
                a1.cor = teclado.next();
                System.out.println(" ");
                break;
            case 2:
                System.out.println(" ");
                a1.status();
                System.out.println(" ");
                break;
            case 3:
                System.out.println(" ");
                a1.rabiscar();
                System.out.println(" ");
                break;
            case 4:
                System.out.println(" ");
                a1.tampar();
                System.out.println(" ");
                break;
            case 5:
                System.out.println(" ");
                a1.destampar();
                System.out.println(" ");
                break;
            case 6:
                System.out.println(" ");
                System.out.println("Obrigado por utilizar o programa!");
                System.out.println(" ");
                break;
            default:
                System.out.println(" ");
                System.out.println("alternativa não encontrada!");
                System.out.println(" ");
                break;
                
        }
        
        } while(opcao != 6);
                
    }
    
}
