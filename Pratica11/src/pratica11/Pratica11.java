
package pratica11;


public class Pratica11 {


    public static void main(String[] args) {
        
        ContaBanco c1 = new ContaBanco();
        

        c1.abrirConta("cp");
        c1.consultarConta();
        c1.sacar(50);
        c1.depositar(50);
        c1.fecharConta();
        c1.consultarConta();
        System.out.println("---------");
        c1.pagarMensal();
        c1.consultarConta();

    }
    
}
