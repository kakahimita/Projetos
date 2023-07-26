
package pratica21;


public class Pratica21 {


    public static void main(String[] args) {
        
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("luis", "Brasil", 31, 1.75f, 68.9f, 11, 2, 1);
        
        l[1] = new Lutador("pretty boy", "França", 29, 1.68f, 57.8f, 14, 2, 3);
        
        l[2] = new Lutador("baby lift", "Brasil", 29, 1.70f, 80.8f, 20, 0, 0);
        
        Luta NOVALUTA = new Luta();
        
        NOVALUTA.marcarLuta(l[0], l[2]);
        NOVALUTA.lutar();
        
        System.out.println("-----");
        
        l[0].status();
        System.out.println("===");
        l[1].status();
        System.out.println("===");
        l[2].status();
        
        
    }
    
}
