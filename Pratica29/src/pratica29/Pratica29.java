
package pratica29;

public class Pratica29 {

    public static void main(String[] args) {
        
        Lutador l = new Lutador("luis", "brasil", 27, 1.56f, 56.0f, 11, 4, 3);
        Lutador l2 = new Lutador("pedro", "brasil", 27, 1.56f, 56.0f, 11, 4, 3);
        
        Lutar UFC = new Lutar();
        
        l.status();
        System.out.println("====");
        
        UFC.marcarLuta(l2, l);
        UFC.lutar();
        
        System.out.println("=====");
        l.status();
        System.out.println("=====");
        l2.status();
    }
    
}
