
package pratica20;

import java.util.Scanner;


public class Pratica20 {


    public static void main(String[] args) {
        
        contaBanco c1 = new contaBanco();
        
        c1.abrirConta("cc");
        System.out.println("----");
        c1.consultarConta();
        System.out.println("----");
        c1.pagarMensal();
        System.out.println("---");
        c1.pagarMensal();
        System.out.println("--");
        c1.depositar(30);
        System.out.println("--");
        c1.pagarMensal();
        System.out.println("--");
        c1.fecharConta();
        System.out.println("--");
        c1.sacar(15);
        System.out.println("--");
        c1.fecharConta();
        
    }
    
}
