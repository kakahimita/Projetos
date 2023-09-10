package ex048_fg;

/**
 *
 * @author kakah
 */
public class Ex048_FG {


    public static void main(String[] args) {
        // Excercico para ser Feliz :)
        // UNIFG
        
        // Tipo Abstrato de Dados(TAD)
        
        /* 2) Vamos observar na pratica o seguite cenário: o Aluno deve 
         * comparecer em algum dos eventos cadastrados na instituição
         * e depois escrever um relatório sobre o conteúdo apresentado no
         * evento. Este relatório será avaliado por um professor e receberá
         * uma pontuação de 0 a 100. A instituição quer manter uma listagem
         * dos alunos que entregaram relatórios. Cada relatório entregue por
         * um aluno corresponde a uma entrada na lista. Então, os Alunos que 
         * entregaram mais de um relatório irão aparecer mais de uma vez na
         * listagem.
        */ 
        
        // Para a problemática passada vamos manter nosso tipo de dados abstrato
        // Aluno e Lista de Alunos.
        
        Aluno n1 = new Aluno();
        
        ListaAlunos l1 = new ListaAlunos();
        
        n1.setNome("Luis");
        
        l1.adicona(n1);
        
        l1.contem(n1);
        
        
        
        
    }

}
