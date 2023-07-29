package ex027;

/**
 *
 * @author kakah
 */
public class Peixe extends Animal{
    private String corEscama;

    // metodo adicional
    public void soltarBolha() {
        System.out.println("Soltando Bolha");
    }
    
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo susbstâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    
    //getters e setters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    

}