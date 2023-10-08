package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author kakah
 */
public class Post {
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    private Date momento;
    private String title;
    private String conteudo;
    private Integer likes;
    
    private List<Comentarios> comentarios = new ArrayList<>();

    public Post() {
    }

    public Post(Date momento, String title, String conteudo, Integer likes) {
        this.momento = momento;
        this.title = title;
        this.conteudo = conteudo;
        this.likes = likes;
    }
    
    //metodos
    public void adicionarComentario(Comentarios comentario) {
        comentarios.add(comentario);
    }
    
    public void removerComentario(Comentarios comentario) {
        comentarios.remove(comentario);
    }
    
    //toString
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(momento) + "\n");
        sb.append(conteudo + "\n");
        sb.append("comentarios:\n");
        for (Comentarios c : comentarios) {
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }
    
    
    //getters e setters
    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comentarios> getComentario() {
        return comentarios;
    }
}