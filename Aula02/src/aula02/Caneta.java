
package aula02;

public class Caneta {
    
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("uma caneta: "+ this.cor);
        System.out.println("está tampada?: "+ this.tampada);
        System.out.println("ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
    }                                                
                                                    
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("caneta tampada");
        } else {
            System.out.println("escrevendo!");
        }
        
    }
    
    void tampar() {
        this.tampada = true;
        
    }
    
    void destampar() {
        this.tampada = false;
        
    }
    
}
