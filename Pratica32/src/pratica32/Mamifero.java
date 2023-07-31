package pratica32;

/**
 *
 * @author kakah
 */
public class Mamifero extends Animal{
    public String corPelo;

    @Override
    public void locomover() {
        System.out.println("movendo-se");
    }

    @Override
    public void alimentar() {
        System.out.println("alimentando-se");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de mamifero");
    }

}