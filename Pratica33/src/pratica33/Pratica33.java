package pratica33;
import java.util.Scanner;
/**
 *
 * @author kakah
 */
public class Pratica33 {


    public static void main(String[] args) {
        
        Pessoa p[] = new Pessoa[5];
        Livro l[] = new Livro[5];
        
        p[0] = new Pessoa("luis", 1995, "M");
        l[0] = new Livro("Narnia", "sherlock roms", 500, p[0]);
        
        p[0].status();
        l[0].abrir();
        l[0].folhear(1);
        l[0].voltarPag();
        System.out.println("======");
        System.out.println(l[0].toString());
    }

}
