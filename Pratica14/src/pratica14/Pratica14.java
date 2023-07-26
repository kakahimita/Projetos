
package pratica14;


public class Pratica14 {


    public static void main(String[] args) {
        
        ContaBanco c1 = new ContaBanco();
        
        c1.abrirConta("cp");
        c1.consultarConta();
        System.out.println("---");
        c1.sacar(15);
        System.out.println("---");
        c1.consultarConta();
        System.out.println("---");
        c1.sacar(3);
        System.out.println("---");
        c1.fecharConta();
        System.out.println("--");
        c1.depositar(313);
        System.out.println("---");
        c1.consultarConta();
        System.out.println("---");
        c1.pagarMensal();

    }
    
}
