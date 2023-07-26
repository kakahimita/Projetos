
package pratica22;

import java.util.Random;


public class Luta {
    
    public Lutador desafiado;
    public Lutador desafiante;
    public int rounds;
    public boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria().equals(l1.getCategoria()) && l1 != l2) {
            this.desafiado = l1;
            this.desafiante = l2;
            this.aprovada = true;
            System.out.println("a Luta entre " + this.desafiado.getNome() + " VS " + this.desafiante.getNome());
            System.out.println("Marcada com sucesso!");
        } else {
            System.out.println("categoria incompatível");
            this.desafiado = null;
            this.desafiante = null;
            this.aprovada = false;
        }
        
    }
    
    public void lutar() {
        if(this.isAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.status();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.status();
            
            Random aleatorio = new Random();
            int vitoria = aleatorio.nextInt(3); // 0 1 2
            System.out.println("=== RESULTADO DA LUTA ===");
            
            switch(vitoria) {
                case 0: // empate
                    System.out.println("EMPATE!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // desafiante vence
                    System.out.println("vitoria de " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // desafiado vence
                    System.out.println("vitoria de " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            
            System.out.println("------------");
        } else {
            System.out.println("a luta não pode acontecer :/");
        }
        
    }
    
    // sets e gets
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
