
package pratica13;


public class ControleRemoto implements Controlador {
    // Atributos
    
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 15;
        this.ligado = true;
        this.tocando = false;
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

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.isLigado()) {
            System.out.println("---- Menu -----");
            System.out.println("está ligado: " + this.isLigado());
            System.out.println("está tocando: " + this.isTocando());
            System.out.println("volume: " + this.getVolume());
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 5);
            System.out.println("Volume: " + this.getVolume());
        } else {
            System.out.println("som desligado!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            if (this.getVolume() <= 0) {
                System.out.println("VOLUME: " + this.getVolume());
            } else if (this.getVolume() >= 0) {
                this.setVolume(this.getVolume() - 5);
                System.out.println("VOLUME: " + this.getVolume());
            }
        } else {
            System.out.println("som desligado!");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        } else {
            System.out.println("desligado!");
        }
    }

    @Override
    public void desligarMudo() {
        
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
            System.out.println("Volume: " + this.getVolume());
        }
        
    }

    @Override
    public void play() {
        if (this.isLigado()) {
            if (this.getVolume() > 0 && !(this.isTocando())) {
                System.out.println("play!! lá lá lá");
                this.setTocando(true);
            } else {
                System.out.println("o som está mudo");
            }
            
        } else {
            System.out.println("o som ta desligado!");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("desligado!");
        }
    }
    
    
    
    
    
}
