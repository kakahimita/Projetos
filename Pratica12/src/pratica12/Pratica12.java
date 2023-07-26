
package pratica12;

import java.util.Scanner;


public class Pratica12 {


    public static void main(String[] args) {
        
        ContaBanco c1 = new ContaBanco();
        
        c1.abrirConta("cc");
        c1.pagarMensal();
        c1.consultar();
        c1.sacar(20);
        c1.depositar(150);
        c1.consultar();
        
    }
}
