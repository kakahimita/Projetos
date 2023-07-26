
package amelia2;

import java.util.ArrayList;
import java.util.List;


public class Usuario {
    
    private String nome;
    private String senha;
    private List<ContatoEmergencia> contatosEmergencia;
    
    public Usuario() {
        contatosEmergencia = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public void cadastrarContatoEmergencia(String nome, String telefone) {
        ContatoEmergencia contato = new ContatoEmergencia(nome, telefone);
        contatosEmergencia.add(contato);
        System.out.println("Contato de emergência cadastrado com sucesso!");
    }
    
    public void ligarAutoridades() {
        System.out.println("Estamos ligando para as autoridades e seus contatos");
        if (contatosEmergencia.isEmpty()) {
            System.out.println("Nenhum contato de emergência cadastrado.");
        } else {
            for (ContatoEmergencia contato : contatosEmergencia) {
                System.out.println("Nome: " + contato.getNome());
            }
        }
        System.out.println("Ligando para as autoridades...");
    }
    
}
