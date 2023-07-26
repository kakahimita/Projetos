
package pratica04;


public class Pratica04 {


    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        
        c1.modelo = "bik";
        c1.cor = "rosa";
        c1.ponta = (float) 0.2;
        c1.carga = 100;
        
        c1.tampar();
        c1.rabiscar();
        c1.status();
        c1.destampar();
        c1.rabiscar();

    }
    
}
