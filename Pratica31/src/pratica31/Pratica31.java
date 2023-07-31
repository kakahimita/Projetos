package pratica31;

import java.util.Scanner;

/**
 *
 * @author kakah
 */
public class Pratica31 {


    public static void main(String[] args) {
        
        //Lutador l = new Lutador("luis", "brasil", 25, 12.4f, 2.1f, 5, 2, 1);
        
        Lutador l[] = new Lutador[5];
        
        l[0] = new Lutador("luis", "brasil", 27, 1.55f, 55.5f, 5, 6, 7);
        l[1] = new Lutador("exit", "olanda", 25, 1.66f, 60.3f, 10, 2, 5);
        
        Lutar UFC = new Lutar();
        
        l[0].status();
        l[1].status();
        
        System.out.println("====");
        
        UFC.marcarLuta(l[0], l[1]);
        System.out.println("=====");
        UFC.lutar();
        System.out.println("=====");

        l[0].status();
        l[1].status();
        
    }

}
