
package ex026;

public class Ex026 {


    public static void main(String[] args) {
        // exercicio de herança
        
        /*Visitante v1 = new Visitante();
        
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        
        System.out.println(v1.toString()); */
        
        // criando pessoa aluno
        Aluno a1 = new Aluno();
        
        a1.setNome("claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        //criando pessoa/aluno/bolsista
        Bolsista b1 = new Bolsista();
        
        b1.setMatricula(1112);
        b1.setNome("jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        // criando pessoa/professor
        Professor p1 = new Professor();
        p1.setNome("lexlutor");
        p1.receberAumento();
        
        // criando pessoa/aluno/tecnico
        Tecnico t1 = new Tecnico();
        t1.setNome("darius");
        t1.setCurso("SISTEMAS");
        t1.setRegistroProfissional("OAB");
        t1.praticar();
    }
    
}
