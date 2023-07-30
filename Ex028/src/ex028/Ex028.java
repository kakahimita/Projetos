package ex028;

/**
 *
 * @author kakah
 */
public class Ex028 {


    public static void main(String[] args) {

        Video v[] = new Video[3];
        v[0] = new Video("aula 1 de POO");
        v[1] = new Video("aula 12 de PHP");
        v[2] = new Video("aula 10 de html");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("luis", 27, "M", "kaka");
        g[1] = new Gafanhoto("creuza", 19, "F", "creuzita");
        
        System.out.println(v[0].toString());
        System.out.println(g[1].toString());
        
        
    }

}
