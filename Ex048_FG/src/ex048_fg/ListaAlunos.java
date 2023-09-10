package ex048_fg;

import java.util.Arrays;

/**
 *
 * @author kakah
 */
public class ListaAlunos {
    
    /* Vamos declarar o total de alunos do problema para entender
     * a solução.
    */
    private Aluno[] alunos = new Aluno[10];
    
    private int totalDealunos = 0;
    
    // Metodos
    
    public int tamanho() {
        return this.totalDealunos;
    }
    
    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= this.totalDealunos;
    }
    
    private boolean posicaoOcupada(int posicao) {
        return posicao < this.alunos.length && posicao >= 0;
    }
    
    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.totalDealunos; i++) {
            if(aluno.equals(this.alunos[i])) {
                return true;
            }
        }
        return false;
    }
    
    private void garantaEspaco() {
        if (this.totalDealunos == this.alunos.length) {
            Aluno[] novaArray = new Aluno[this.alunos.length * 2];
            for (int i = 0; i < this.alunos.length; i++) {
                novaArray[i] = this.alunos[i];
            }
            this.alunos = novaArray;
        }
    }
    
    public void adicona(Aluno aluno) {
        
        this.garantaEspaco();
        this.alunos[this.totalDealunos] = aluno;
        this.totalDealunos++;
    }
    
    public Aluno pega(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicao inválida pesquisada");
        }
        return this.alunos[posicao];
    }
    
    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("posicao inválida");
        }
        for (int i = posicao; i < this.totalDealunos - 1; i++) {
            this.alunos[i] = this.alunos[i + 1];
        }
        this.totalDealunos--;
    }
    
    public void adiciona(int posicao, Aluno aluno) {
        this.garantaEspaco();
        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posicao inválida");
        }
        for (int i = this.totalDealunos - 1; i >= posicao; i--) {
            this.alunos[i + 1] = this.alunos[i];
        }
        this.alunos[posicao] = aluno;
        this.totalDealunos++;
    }
    
    public String toString() {
        return Arrays.toString(alunos);
    }

}