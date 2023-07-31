package pratica32;

/**
 *
 * @author kakah
 */
public class Reptil extends Animal{
    public String corEscama;

    @Override
    public void locomover() {
        System.out.println("rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo comida de reptil");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de reptil");
    }
}