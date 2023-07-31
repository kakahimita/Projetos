package pratica31;

import java.util.Random;

/**
 *
 * @author kakah
 */
public class Lutar {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.desafiado = l1;
            this.desafiante = l2;
            this.aprovada = true;
            System.out.println("Luta marcada com sucesso!");
        } else {
            this.desafiado = null;
            this.desafiante = null;
            this.aprovada = false;
        }
    }
    
    public void lutar() {
        if(this.aprovada) {
            System.out.println("### desafiado ###");
            System.out.println(this.desafiado.getNome());
            System.out.println("vitorias: " + this.desafiado.getVitorias());
            System.out.println("derrotas: " +  this.desafiado.getDerrotas());
            System.out.println("empates: " + this.desafiado.getEmpates());
            System.out.println("### desafiante ###");
            System.out.println(this.desafiante.getNome());
            System.out.println("vitorias: " + this.desafiante.getVitorias());
            System.out.println("derrotas: " + this.desafiante.getDerrotas());
            System.out.println("empate: " + this.desafiante.getEmpates());
            
            System.out.println(this.desafiado.getNome() + " VS " + this.desafiante.getNome());
            
            Random aleatorio = new Random();
            int vitoria = aleatorio.nextInt(3); // 0 1 2
            
            switch(vitoria) {
                case 0: //empate
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    System.out.println("Empate!");
                    break;
                case 1: //vitoria do desafiado
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    System.out.println("vitoria de " + this.desafiado.getNome());
                    break;
                case 2: //vitoria do desafiante
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    System.out.println("vitoria de " + this.desafiante.getNome());
                    break;
            }
        }
    }
    
    
    //getters e setters
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}