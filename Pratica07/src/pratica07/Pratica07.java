
package pratica07;

import java.util.Scanner;


public class Pratica07 {


    public static void main(String[] args) {
        
        ContaBanco c1 = new ContaBanco();
        
        c1.abrirConta("CC");
        System.out.println("-------------");
        c1.estadoAtual();
        
        System.out.println("-----------");
        
        c1.pagarMensal();
        
        c1.estadoAtual();
        
        c1.sacar(10);
        
        c1.estadoAtual();
        
        
        
    }
    
}
