package ex028;

/**
 *
 * @author kakah
 */
public class Ex028 {


    public static void main(String[] args) {

        // exercicio de POO 
        // com exemplo de agregação com classes
        
        
        Video v[] = new Video[3];
        v[0] = new Video("aula 1 de POO");
        v[1] = new Video("aula 12 de PHP");
        v[2] = new Video("aula 10 de html");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("luis", 27, "M", "kaka");
        g[1] = new Gafanhoto("creuza", 19, "F", "creuzita");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]); // luis assiste HTML
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0], v[1]); // creuza assiste PHP
        vis[0].avaliar(87.0f);
        System.out.println(vis[0].toString());
        
        
        System.out.println("----------");
        System.out.println("-------");
        
        /*
        System.out.println(v[0].toString());
        System.out.println("----------------");
        System.out.println(g[1].toString());
        */
        
    }

}
