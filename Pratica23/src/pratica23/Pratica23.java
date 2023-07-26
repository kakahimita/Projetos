
package pratica23;

public class Pratica23 {

    public static void main(String[] args) {
        
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Luis", "Brasil", 27, 1.56f, 55.0f, 10, 10, 4);
        
        l[1] = new Lutador("samurai", "japao", 30, 1.80f, 60.0f, 100, 0, 0);
        
        Luta UFC = new Luta();
        
        UFC.marcarLuta(l[0], l[1]);
        System.out.println("--------------------");
        UFC.lutar();
        System.out.println("-------------");
        l[0].status();
        System.out.println("=====");
        l[1].status();
        
    }
    
}
