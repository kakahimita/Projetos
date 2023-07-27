
package pratica25;

public class Pratica25 {

    public static void main(String[] args) {
        
        Lutador l1 = new Lutador("luis", "brasil", 27, 1.56f, 55.0f, 11, 2, 5);
        
        Lutador l2 = new Lutador("alemao", "frança", 28, 1.57f, 55.0f, 16, 5, 2);
        
        System.out.println("=====");
        l1.status();
        System.out.println("=====");
        l2.status();
        
        Lutar UFC = new Lutar();
        
        UFC.marcarLuta(l1, l2);
        UFC.lutar();
        
        System.out.println("=====");
        l1.status();
        System.out.println("=====");
        l2.status();
    }
    
}
