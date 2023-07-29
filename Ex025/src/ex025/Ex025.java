
package ex025;

public class Ex025 {

    public static void main(String[] args) {
        // exercicio de Herança POO // Projeto Pessoa e e funcionarios
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("claudio");
        p4.setNome("fabiana");
        
        p1.setSexo("M");
        p4.setSetor("F");
        p2.setIdade(18);
        
        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        
        p3.receberAumento(550.2f);
        p4.mudarTrabalho();
        p2.cancelarMatr();
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
    
}
