
package pratica03;


public class Caneta {
    
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampa;
    
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("tampa: " + this.tampa);
    }
    
    public void rabiscar() {
        if(this.tampa == true) {
            System.out.println("caneta tampada!");
        } else {
            System.out.println("escrevendo!");
        }
    }
    
    public void tampar() {
        this.tampa = true;
    }
    
    public void destampar() {
        this.tampa = false;
    }
    
}
