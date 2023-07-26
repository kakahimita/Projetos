
package pratica16;


public class Pratica16 {


    public static void main(String[] args) {
        
        contaBanco c1 = new contaBanco();
        
        c1.abrirConta("cc");
        System.out.println("--");
        c1.consultarConta();
        System.out.println("---");
        c1.sacar(30);
        System.out.println("---");
        c1.consultarConta();
        System.out.println("---");
        c1.depositar(50);
        System.out.println("---");
        c1.fecharConta();
        System.out.println("---");
        c1.pagarMensal();
        c1.pagarMensal();
        c1.pagarMensal();
        c1.pagarMensal();
        System.out.println("--");
        c1.consultarConta();
        c1.fecharConta();
        c1.sacar(5);
        c1.fecharConta();
        c1.pagarMensal();
    }
    
}
