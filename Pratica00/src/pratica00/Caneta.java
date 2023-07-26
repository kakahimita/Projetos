
package pratica00;


public class Caneta {
    
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampa;
    
    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = 100;
        this.tampar();
    }
    
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    
    public int getCarga() {
        return this.carga;
    }
    
    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public boolean isTampa() {
        return this.tampa;
    }
    
    public void setTampa(boolean tampa) {
        this.tampa = tampa;
    }
    
    public void tampar() {
        this.tampa = true;
    }
    
    public void destampar() {
        this.tampa = false;
    }
    
    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("carga: " + this.getCarga());
        System.out.println("Tampa: " + this.isTampa());
    }
    
    public void rabiscar(){
        if (tampa == true) {
            System.out.println("caneta tampada!");
        } else {
            System.out.println("rabiscando!!");
        }
    }
    
}
