
package pratica04;


public class Caneta {
    
    public String modelo;
    public String cor;
    protected float ponta;
    protected int carga;
    private boolean tampa;
    
    public void status() {
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("ponta: "+this.ponta);
        System.out.println("carga: "+this.carga);
        System.out.println("tampa: "+this.tampa);
    }
    
    public void rabiscar() {
        if(this.tampa == false) {
            System.out.println("escrevendo!");
        } else {
            System.out.println("erro");
        }
    }
    
    public void tampar() {
        this.tampa = true;
    }
    
    public void destampar() {
        this.tampa = false;
    }
    
    
    
}
