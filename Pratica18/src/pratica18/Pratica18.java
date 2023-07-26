
package pratica18;


public class Pratica18 {


    public static void main(String[] args) {

        ContaBanco c1 = new ContaBanco();
        
        c1.abrirConta("cc");
        System.out.println("------");
        c1.consultarConta();
        System.out.println("---");
        c1.pagarMensal();
        System.out.println("----");
        c1.consultarConta();
        System.out.println("---");
        c1.depositar(30);
        System.out.println("----");
        c1.sacar(15);
        c1.pagarMensal();
        c1.pagarMensal();
        c1.sacar(5);
        c1.fecharConta();
        c1.pagarMensal();
    }
    
}
