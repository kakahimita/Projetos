
package pratica27;


public class ControleRemoto implements Controlador{
    
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // construtor
    public ControleRemoto() {
        this.setVolume(10);
        this.setLigado(false);
        this.setTocando(false);
    }
    
    @Override
    public void ligar() {
        if(this.isLigado()== false) {
            this.setLigado(true);
        }
    }

    @Override
    public void desligar() {
        if(this.isLigado()) {
            this.setLigado(false);
        }
    }

    @Override
    public void abrirMenu() {
        if(this.isLigado()) {
            System.out.println("=== MENU ===");
            System.out.println("volume: " + this.getVolume());
            System.out.println("Ligado: " + this.isLigado());
            System.out.println("Tocando: " + this.isTocando());
        } else {
            System.out.println("controle desligado :/");
        }
    }

    @Override
    public void fecharMenu() {
        if(this.isLigado()) {
            System.out.println("Fechando Menu...");
        } else {
            System.out.println("controle: OFF");
        }
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()) {
            if(this.getVolume() <= 100) {
                this.setVolume(this.getVolume() + 5);
            } else {
                System.out.println("Volume Maximo >.< ");
            }
        } else {
            System.out.println("controle: OFF");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado()) {
            if(this.getVolume() > 0) {
                this.setVolume(this.getVolume() - 5);
            } else {
                System.out.println("Volume Minimo >.<");
            }
        } else {
            System.out.println("controle: OFF");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado()) {
            if(this.getVolume() > 0) {
                this.setVolume(0);
                System.out.println("Mudo: Ligado");
            } else {
                System.out.println("já está no mudo :X");
            }
        } else {
            System.out.println("controle: OFF");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado()) {
            if(this.getVolume() == 0) {
                this.setVolume(50);
                System.out.println("Mudo: Desligado");
            } else {
                System.out.println("não está mudo O.o");
            }
        }
    }

    @Override
    public void play() {
        if(this.isLigado()) {
            if(this.isTocando() == false) {
                this.setTocando(true);
                System.out.println("TUTS TUTS!");
            } else {
                System.out.println("já está tocando Musica!");
            }
        } else {
            System.out.println("controle: OFF");
        }
    }

    @Override
    public void pause() {
        if(this.isLigado()) {
            if(this.isTocando()) {
                this.setTocando(false);
                System.out.println("Pause ligado!");
            } else {
                System.out.println("PAUSE: ON");
            }
        } else {
            System.out.println("controle: OFF");
        }
    }

    // gets e sets
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    
}
