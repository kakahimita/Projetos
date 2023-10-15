package Xadrez;

import Xadrez.Pecas.Rei;
import Xadrez.Pecas.Torre;
import tabuleiro.Peca;
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
        for (int i = 0; i < tabuleiro.getLinhas(); i++) {
            for (int j = 0; j < tabuleiro.getColunas(); j++) {
                mat[i][j] = (XadrezPeca) tabuleiro.peca(i, j);
            }
        }
        return mat;
    }
    
    public XadrezPeca executarMovimento(XadrezPosicao posicaoOrigem, XadrezPosicao posicaoDestino){
        Posicao origem = posicaoOrigem.toPosicao();
        Posicao destino = posicaoDestino.toPosicao();
        validarPosicaoOrigem(origem);
        Peca capturarPeca = fazerMovimento(origem, destino);
        return (XadrezPeca)capturarPeca;
    }
    
    private Peca fazerMovimento(Posicao origem, Posicao destino) {
        Peca p = tabuleiro.removerPeca(origem);
        Peca pecaCapturada = tabuleiro.removerPeca(destino);
        tabuleiro.colocarPeca(p, destino);
        return pecaCapturada;
    }
    
    private void validarPosicaoOrigem(Posicao posicao) {
        if (!tabuleiro.thereIsAPiece(posicao)) {
            throw new XadrezExcecoes("Não existe peça na posição de origem");
        }
    }

    private void colocaNovaPeca(char coluna, int linha, XadrezPeca peca) {
        tabuleiro.colocarPeca(peca, new XadrezPosicao(coluna, linha).toPosicao());
    }

    private void initialSetup() {
        colocaNovaPeca('c', 1, new Torre(tabuleiro, Cor.BRANCO));
        colocaNovaPeca('c', 2, new Torre(tabuleiro, Cor.BRANCO));
        colocaNovaPeca('d', 2, new Torre(tabuleiro, Cor.BRANCO));
        colocaNovaPeca('e', 2, new Torre(tabuleiro, Cor.BRANCO));
        colocaNovaPeca('e', 1, new Torre(tabuleiro, Cor.BRANCO));
        colocaNovaPeca('d', 1, new Rei(tabuleiro, Cor.BRANCO));

        colocaNovaPeca('c', 7, new Torre(tabuleiro, Cor.PRETO));
        colocaNovaPeca('c', 8, new Torre(tabuleiro, Cor.PRETO));
        colocaNovaPeca('d', 7, new Torre(tabuleiro, Cor.PRETO));
        colocaNovaPeca('e', 7, new Torre(tabuleiro, Cor.PRETO));
        colocaNovaPeca('e', 8, new Torre(tabuleiro, Cor.PRETO));
        colocaNovaPeca('d', 8, new Rei(tabuleiro, Cor.PRETO));
    }
}
