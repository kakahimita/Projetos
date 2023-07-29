package ex027;

/**
 *
 * @author kakah
 */
public class Cachorro extends Mamifero{

    @Override
    public void locomover() {
        System.out.println("andando");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Au! Au!");
    }
    
    public void enterrarOsso() {
        System.out.println("enterrando osso >.< ");
    }
}