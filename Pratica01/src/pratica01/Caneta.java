
package pratica01;


public class Caneta {
    
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampa;
    
    void tampar() {
        this.tampa = true;
    }
    
    void destampar() {
        this.tampa = false;
    }
    
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("está tampada?: " + this.tampa);
    }
    
    void rabiscar() {
        if (this.tampa == false) {
            System.out.println("escrevendo!");
            this.carga -= 10;
        } else {
            System.out.println("está tampada!");
        }
    }
    
}
