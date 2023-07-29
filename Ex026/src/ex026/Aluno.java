
package ex026;


public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    
    //metodo publico
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de aluno " + this.getNome());
    }
    
    //getter e setter
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
