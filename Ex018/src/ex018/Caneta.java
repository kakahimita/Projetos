
package ex018;


public class Caneta {
    
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampa;
    
    
    public Caneta(String m, String c, float p) {   // Este é o método Construtor
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();        
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    
    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public void tampar() {
        this.tampa = true;
    }
    
    public void destampar() {
        this.tampa = false;
    }
    
    public void status() {
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampa);
    }
    
}
