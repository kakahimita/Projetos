
package pratica06;


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
    }
    
    public String getModelo() {
        return modelo;
    } 
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public float getPonta() {
        return ponta;
    }
    
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    
    public int getCarga() {
        return carga;
    }
    
    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public boolean isTampa() {
        return tampa;
    }
    
    public void setTampa(boolean tampa) {
        this.tampa = tampa;
    }
    
    public void tampar(){
        this.tampa = true;
    }
    
    public void destampar() {
        this.tampa = false;
    }
    
    public void rabiscar() {
        if (this.tampa == true) {
            System.out.println("caneta tampada");
        } else {
            System.out.println("rabiscando!");
        }
    }
    
    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Carga: " + this.getCarga());
        System.out.println("Tampa: " + this.isTampa());
    }
     
    
}
