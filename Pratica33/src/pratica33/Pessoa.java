package pratica33;

/**
 *
 * @author kakah
 */
public class Pessoa {
    
    private String nome;
    private int nascimento;
    private String sexo;
    private int idade;

    //construtor
    public Pessoa(String nome, int nascimento, String sexo) {
        this.nome = nome;
        this.setNascimento(nascimento);
        this.sexo = sexo;
    }
    
    //metodo especial
    public void fazerAniver() {
    }
    
    public void status() {
        System.out.println("nome: " + this.getNome());
        System.out.println("nascimento: " + this.getNascimento());
        System.out.println("sexo: " + this.getSexo());
        System.out.println("Idade: " + this.getIdade());
    }
    
    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNascimento() {
        return nascimento;
    }

    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
        this.setIdade();
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade() {
        int ano = 2023;
        this.idade = ano - this.nascimento;
    }
    
    
}