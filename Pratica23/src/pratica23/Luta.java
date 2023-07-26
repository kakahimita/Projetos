
package pratica23;

import java.util.Random;

public class Luta {
    
    public Lutador desafiado;
    public Lutador desafiante;
    public int rounds;
    public boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.desafiado = l1;
            this.desafiante = l2;
            this.aprovada = true;
            System.out.println("== Luta Aprovada ===");
            System.out.println(this.desafiado.getNome() + " VS " + this.desafiante.getNome());
        } else {
            System.out.println("categoria invalida :/");
            this.desafiado = null;
            this.desafiante = null;
            this.aprovada = false;
        }
    }
    
    public void lutar() {
        if(this.isAprovada()) {
            System.out.println("### DESAFIADO ###");
            System.out.println(this.desafiado.getNome() + " pesando " + this.desafiado.getPeso());
            System.out.println("categoria: " + this.desafiado.getCategoria());
            System.out.println("Vitorias: " + this.desafiado.getVitorias());
            System.out.println("Derrotas: " + this.desafiado.getDerrotas());
            System.out.println("### DESAFIANTE ###");
            System.out.println(this.desafiante.getNome() + " pesando " + this.desafiante.getPeso());
            System.out.println("categoria: " + this.desafiante.getCategoria());
            System.out.println("Vitorias: " + this.desafiante.getVitorias());
            System.out.println("Derrotas: " + this.desafiante.getDerrotas());
            System.out.println("=========================================");
            
            Random aleatorio = new Random();
            int vitoria = aleatorio.nextInt(3);  // 0 1 2
            
            switch(vitoria) {
                case 0: // empate
                    System.out.println("Empate!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // desafiado vence
                    System.out.println("Vitoria de " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // desafiante vence
                    System.out.println("vitoria de " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            
        } else {
            System.out.println("A luta não foi aprovada!");
        }
    }
    
    //gets e sets
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
