
package pratica19;


public class Pratica19 {


    public static void main(String[] args) {
        
        contaBanco c1 = new contaBanco();
        
        c1.abrirConta("cc");
        System.out.println("----");
        c1.consultarConta();
        System.out.println("----");
        c1.pagarMensal();
        System.out.println("---");
        c1.consultarConta();
        System.out.println("---");
        c1.sacar(5);
        c1.depositar(300);
        System.out.println("---");
        c1.consultarConta();
        System.out.println("---");
        c1.fecharConta();
        System.out.println("---");
        c1.sacar(300);
        System.out.println("---");
        c1.fecharConta();
        System.out.println("---");
        c1.consultarConta();
    }
    
}
