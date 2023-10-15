package aplicacao;

import Xadrez.PartidaDeXadrez;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

/**
 *
 * @author kakah
 */
public class Programa {


    public static void main(String[] args) {

        PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();
        UI.printTabuleiro(partidaDeXadrez.getPecas());
    }
}
