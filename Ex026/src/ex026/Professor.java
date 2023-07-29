

package ex026;


public class Professor extends Pessoa{
    
    private String especialidade;
    private int salario;
    
    //metodo especial
    public void receberAumento() {
        System.out.println("aumento recebido! professor " + this.getNome());
    }
    
    //getters e setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
