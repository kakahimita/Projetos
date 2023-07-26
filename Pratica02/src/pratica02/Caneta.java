
package pratica02;


public class Caneta {
    
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampa;
    
    void status() {
        System.out.println("modelo: " + this.modelo);
        System.out.println("cor: " + this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("carga: " + this.carga);
        System.out.println("tampa: " + this.tampa);
    }
    
    void destampar() {
        this.tampa = false;
    }
    
    void tampar() {
        this.tampa = true;
    }
    
    void rabiscar() {
        if (this.tampa == false) {
            System.out.println("escrever!");
            this.carga -= 10;
        } else {
            System.out.println("caneta tampada!");
        }
    }
    
}
