package ex065_udemy;

import entidades.Comentarios;
import entidades.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author kakah
 */
public class Ex065_Udemy {


    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Comentarios c1 = new Comentarios("Comentanto bla bla bla...!");
        Comentarios c2 = new Comentarios("wow that's awesome!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Titulo do Livro", "Conteudo do post!", 12);
        
        p1.adicionarComentario(c1);
        p1.adicionarComentario(c2);

        System.out.println(p1);
        
    }

}
