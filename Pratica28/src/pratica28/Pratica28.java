package pratica28;

public class Pratica28 {

    public static void main(String[] args) {
        
        ContaBanco c1 = new ContaBanco();
        
        c1.abrirConta("cc");
        System.out.println("==============");
        c1.depositar(300);
        System.out.println("-----------");
        c1.sacar(500);
        System.out.println("-----");
        c1.consultarConta();
        System.out.println("======");
        c1.fecharConta();
        c1.pagarMensal();
        
    }
    
}
