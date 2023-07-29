package ex027;

/**
 *
 * @author kakah
 */
public class Mamifero extends Animal {

    //atributos
    private String corPelo;
    
    @Override
    public void locomover() {
        System.out.println("correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
    
    //getters e setters
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    

}