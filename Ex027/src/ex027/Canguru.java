package ex027;

/**
 *
 * @author kakah
 */
public class Canguru extends Mamifero{
    // sobreponto o locomover dizendo que ele vai "saltar"
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
}