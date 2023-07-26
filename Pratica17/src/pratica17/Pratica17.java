
package pratica17;


public class Pratica17 {


    public static void main(String[] args) {
        
        ControleRemoto cr = new ControleRemoto();
        
        cr.ligar();
        cr.abrirMenu();
        cr.ligarMudo();
        System.out.println("---");
        cr.abrirMenu();
        System.out.println("---");
        cr.desligarMudo();
        System.out.println("---");
        cr.abrirMenu();
    }
    
}
