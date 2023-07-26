
package pratica05;


public class lapis {
    
    public String marca;
    public String cor;
    protected float ponta = (float) 1.0;
    protected int carga = 100;
    private boolean tampa;
    
    
    public void status() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? : " + this.tampa);
    }
    
    public void tampar() {
        this.tampa = true;
    }
    
    public void destampar() {
        this.tampa = false;
    }
    
    public void rabiscar() {
        if (this.tampa == true) {
            System.out.println("Não da pra escrever!");
        } else {
            System.out.println("Rabiscando!");
            this.carga -= 5;
        }
    }
    
    
        
    
}
