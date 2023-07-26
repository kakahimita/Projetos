
package ex002;

import java.util.Scanner;


public class Ex002 {


    public static void main(String[] args) {
        
        //exercicio para leitura de informaçoes com "Scanner"
        // 1)
        //leitura de nome é nota
        //obs:
        //leitura de Strings - nextLine();
        //leitura para Float - nextFloat();.
        //leitura para inteiro - nextInt();
        
        Scanner teclado = new Scanner(System.in);
        
        String nome;
        float nota;
        
        System.out.print("Nome: ");
        nome = teclado.nextLine();
        
        System.out.print("Nota: ");
        nota = teclado.nextFloat();
        
        System.out.format("A nota de " + nome + " foi %.2f \n", nota);
        
        // 2)
        // imcompatibilidade entre tipos
        // Números <-> String
        //classes involucro
        
        // a maneira de colocar um numero inteiro
        // dentro de uma string é utilizando classes involucro
        // como por ex: String valor = Integer.toString(idade);
        
        // converter numero inteiro para String
        
        
        int idade = 30;
        String valor;
        
        valor = Integer.toString(idade);
        
        System.out.println(idade);
        
        
        // 3)
        // outro exemplo seria fazer o inverço 
        // converter uma String em Inteiro
        //utilizando -> Integer.parseInt
        
        
        String valor2 = "21";
        int idade2 = Integer.parseInt(valor2);
        System.out.println(idade2);
        
        // 4)
        // tambem é possivel utilizando o Float
        // conversao com float
        // utilizando Float.parseFloat
        
        String valor3 = "44.5";
        float idade3 = Float.parseFloat(valor3);
        System.out.println(idade3);
        
        // 5)
        // imprimindo o mesmo resultado mas, formatado.
        
        String valor4 = "25.2";
        float idade4 = Float.parseFloat(valor4);
        System.out.printf("idade %.3f \n", idade4);
        
        // 6)
        // conversao de int para float
        
        int n34 = 21;
        int n45 = 44;
        float media43;
        
        media43 = Float.valueOf(n34+n45)/2;
        
        System.out.printf("%.4f \n", media43);
        
        
        /*  7) outra forma de converter
        
        int n1 = 33;
        int n2 = 42;
        
        float media;
        
        media = (float)(n1+n2)/2;
        
        System.out.println(media);
        
        
        
        */
        
        
        
        
        
        
        
        
        
    }
    
}
