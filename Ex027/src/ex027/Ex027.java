package ex027;

/**
 *
 * @author kakah
 */
public class Ex027 {


    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        
        System.out.println("=====");
        c.locomover();
        k.locomover();
        c.emitirSom();
        k.emitirSom();
        g.soltarBolha();
        p.soltarBolha();
        System.out.println("======");
        
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        System.out.println("=====");
        a.locomover();
        a.alimentar();
        System.out.println("====");
        
        p.locomover();
        
    }

}
