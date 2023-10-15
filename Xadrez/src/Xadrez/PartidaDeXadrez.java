package Xadrez;

import Xadrez.Pecas.Rei;
import Xadrez.Pecas.Torre;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

/**
 *
 * @author kakah
 */
public class PartidaDeXadrez {
    
    private Tabuleiro tabuleiro;

    public PartidaDeXadrez() {
        tabuleiro = new Tabuleiro(8, 8);
        initialSetup();
    }
    
    public XadrezPeca[][] getPecas() {
        XadrezPeca[][] mat = new XadrezPeca[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i=0; i<tabuleiro.getLinhas(); i++) {
            for(int j=0; j<tabuleiro.getColunas(); j++) {
                mat[i][j] = (XadrezPeca) tabuleiro.peca(i, j);
            }
        }
        return mat;
    }
    
    private void colocaNovaPeca(char coluna, int linha, XadrezPeca peca) {
        tabuleiro.colocarPeca(peca, new XadrezPosicao(coluna, linha).toPosicao());
    }
    
    private void initialSetup() {
        colocaNovaPeca('b', 6, new Torre(tabuleiro, Cor.BRANCO));
        colocaNovaPeca('e', 8, new Rei(tabuleiro, Cor.PRETO));
        colocaNovaPeca('e', 1, new Rei(tabuleiro, Cor.BRANCO));
    }
}