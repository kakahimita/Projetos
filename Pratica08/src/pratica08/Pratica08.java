
package pratica08;


public class Pratica08 {


    public static void main(String[] args) {
        
        ContaBanco c1 = new ContaBanco();
        
        c1.abrirConta("CC");
        
        c1.consultarConta();
        
        
        c1.sacar(60);
        
        c1.fecharConta();
        
        c1.pagarMensal();
        c1.pagarMensal();
        c1.pagarMensal();
        c1.pagarMensal();
        c1.pagarMensal();
        
        c1.sacar(15);
        c1.consultarConta();
        

    }
    
}
