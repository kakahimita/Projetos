
package aula02;

public class Caneta {
    
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status() {
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("uma caneta: "+ this.cor);
        System.out.println("ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("está tampada?: "+ this.tampada);
    }                                                
                                                    
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("caneta tampada");
        } else {
            System.out.println("escrevendo!");
        }
        
    }
    
    public void tampar() {
        this.tampada = true;
        
    }
    
    public void destampar() {
        this.tampada = false;
        
    }
    
}
