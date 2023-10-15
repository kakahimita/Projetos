package Xadrez.Pecas;

import Xadrez.Cor;
import Xadrez.XadrezPeca;
import tabuleiro.Tabuleiro;

/**
 *
 * @author kakah
 */
public class Torre extends XadrezPeca{

    public Torre(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public String toString() {
        return "T";
    }
    
}