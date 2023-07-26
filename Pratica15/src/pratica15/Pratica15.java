
package pratica15;

import java.util.Scanner;


public class Pratica15 {


    public static void main(String[] args) {
        
        ContaBanco c1 = new ContaBanco();
        
        c1.abrirConta("cc");
        System.out.println("---");
        c1.consultarConta();
        System.out.println("----");
        c1.pagarMensal();
        c1.pagarMensal();
        c1.pagarMensal();
        System.out.println("---");
        c1.depositar(50);
        c1.fecharConta();
        c1.sacar(50);
        c1.fecharConta();
        c1.consultarConta();
        c1.depositar(300);
    }    
}
