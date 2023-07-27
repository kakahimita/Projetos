
package pratica25;

import java.util.Random;

public class Lutar {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public Lutar() {
        this.aprovada = false;
    }
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.desafiado = l1;
            this.desafiante = l2;
            this.aprovada = true;
            System.out.println("a Luta foi marcada com sucesso!");
            System.out.println(this.desafiado.getNome() + " VS " + this.desafiante.getNome());
        } else {
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("a luta não pode acontecer");
        }
    }
    
    public void lutar() {
        if(this.isAprovada()) {
            System.out.println("### DESAFIADO ###");
            System.out.println("nome: " + this.desafiado.getNome());
            System.out.println("vitorias: " + this.desafiado.getVitorias());
            System.out.println("derrotas: " + this.desafiado.getDerrotas());
            System.out.println("Empates: " + this.desafiado.getEmpates());
            System.out.println("Categoria: " + this.desafiado.getCategoria());
            System.out.println("### DESAFIANTE ###");
            System.out.println("nome: " + this.desafiante.getNome());
            System.out.println("vitorias: " + this.desafiante.getVitorias());
            System.out.println("derrotas: " + this.desafiante.getDerrotas());
            System.out.println("Empates: " + this.desafiante.getEmpates());
            System.out.println("Categoria: " + this.desafiante.getCategoria());
            
            System.out.println("========================");
            System.out.println(this.desafiado.getNome() + " VS " + this.desafiante.getNome());            
            
            
            Random aleatorio = new Random();
            int vitorias = aleatorio.nextInt(3); // 1 2 3

            switch(vitorias) {
                case 0: // empate
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    System.out.println("Empate!");
                    break;
                case 1: // vitoria desafiado
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    System.out.println("vitoria " + this.desafiado.getNome());
                    break;
                case 2: // vitoria desafiante
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    System.out.println("vitoria " + this.desafiante.getNome());
                    break;
            }
        } else {
            System.out.println("a Luta precisa ser Marcada :/ ");
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
