package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author kakah
 */
public class Cliente {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private String nome;
    private String email;
    private Date aniversario;

    //construtors
    public Cliente() {
    }

    public Cliente(String nome, String email, Date aniversario) {
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    //toString
    @Override
    public String toString() {
        return nome + " (" + sdf.format(aniversario) + ") - " + email;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getAniversario() {
        return aniversario;
    }

    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }
}