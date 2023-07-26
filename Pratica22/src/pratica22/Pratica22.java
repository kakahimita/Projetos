
package pratica22;


public class Pratica22 {


    public static void main(String[] args) {
        
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Luis", "Brasil", 27, 1.56f, 56.6f, 20, 0, 0);
        
        l[1] = new Lutador("snoopdog", "França", 37, 1.90f, 60.5f, 10, 5, 3);
        
        
        Luta UFC = new Luta();
        
        UFC.marcarLuta(l[0], l[1]);
        UFC.lutar();
        System.out.println("--------");
        l[0].status();
        System.out.println("--------");
        l[1].status();
        
    }
    
}
