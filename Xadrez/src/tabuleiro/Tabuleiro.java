package tabuleiro;

/**
 *
 * @author kakah
 */
public class Tabuleiro {

    private int linhas;
    private int colunas;
    private Peca[][] pecas;

    //construtor
    public Tabuleiro(int linhas, int colunas) {
        if(linhas < 1 || colunas < 1) {
            throw new TabuleiroExcecoes("Erro ao criar tabuleiro: é necessario que haja ao menos 1 linha e 1 coluna");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }
    
    //metodos
    public Peca peca(int linha, int coluna){
        if (!posicaoExistente(linha, coluna)) {
            throw new TabuleiroExcecoes("Posiçao nção tem no tabuleiro");
        }
        return pecas[linha][coluna];
    }
    
    public Peca peca(Posicao posicao) {
        if (!posicaoExistente(posicao)) {
            throw new TabuleiroExcecoes("Posiçao nção tem no tabuleiro");
        }
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }
    
    public void ColocarPeca(Peca peca, Posicao posicao) {
        if (thereIsAPiece(posicao)) {
            throw new TabuleiroExcecoes("já existe uma peça em posição");
        }
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }
    
    public boolean posicaoExistente(int linha, int coluna) {
        return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
    }
    
    public boolean posicaoExistente(Posicao posicao) {
        return posicaoExistente(posicao.getLinha(), posicao.getColuna());
    }
    
    public boolean thereIsAPiece(Posicao posicao) {
        if (!posicaoExistente(posicao)) {
            throw new TabuleiroExcecoes("já existe uma peça em posicao");
        }
        return peca(posicao) != null;
    }

    //getters e setters
    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }
}