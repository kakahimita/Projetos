package Xadrez.Pecas;

import Xadrez.Cor;
import Xadrez.XadrezPeca;
import tabuleiro.Tabuleiro;

/**
 *
 * @author kakah
 */
public class Rei extends XadrezPeca{

    public Rei(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }
    
    @Override
    public String toString() {
        return "R";
    }

}