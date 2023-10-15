package aplicacao;

import Xadrez.PartidaDeXadrez;
import Xadrez.XadrezPeca;
import Xadrez.XadrezPosicao;
import java.util.Scanner;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

/**
 *
 * @author kakah
 */
public class Programa {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        PartidaDeXadrez partidaDeXadrez = new PartidaDeXadrez();

        while (true) {
            UI.printTabuleiro(partidaDeXadrez.getPecas());
            System.out.println();
            System.out.print("origem: ");
            XadrezPosicao origem = UI.posicaoXadrezPronto(sc);
            
            System.out.println();
            System.out.print("destino: ");
            XadrezPosicao destino = UI.posicaoXadrezPronto(sc);
            
            XadrezPeca pecaCapturada = PartidaDeXadrez.executarMovimento(origem, destino);
        }
    }
}
