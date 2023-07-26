
package pratica09;

import java.util.Scanner;


public class Pratica09 {


    public static void main(String[] args) {
        
        ContaBanco c1 = new ContaBanco();
        
        c1.abrirConta("CP");
        System.out.println("======");
        c1.consultarConta();
        System.out.println("=======");
        c1.fecharConta();
        System.out.println("========");
        c1.sacar(30);
        System.out.println("========");
        System.out.println("=======");
        c1.consultarConta();
        c1.consultarConta();
        System.out.println("=======");
        c1.pagarMensal();
        c1.pagarMensal();
        c1.pagarMensal();
        c1.consultarConta();
        c1.sacar(30);
    }
    
}
