package Xadrez;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

/**
 *
 * @author kakah
 */
public class XadrezPeca extends Peca{
    
    private Cor cor;

    //construtor
    public XadrezPeca(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro);
        this.cor = cor;
    }

    //getters e setters
    public Cor getCor() {
        return cor;
    }
}