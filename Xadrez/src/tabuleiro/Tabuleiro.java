package tabuleiro;

/**
 *
 * @author kakah
 */
public class Tabuleiro {

    private int linha;
    private int coluna;
    private Peca[][] pecas;

    //construtor
    public Tabuleiro(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        pecas = new Peca[linha][coluna];
    }
    
    //metodos
    public Peca peca(int linha, int coluna){
        return pecas[linha][coluna];
    }
    
    public Peca peca(Posicao posicao) {
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }
    
    public void ColocarPeca(Peca peca, Posicao posicao) {
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }

    //getters e setters
    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
}