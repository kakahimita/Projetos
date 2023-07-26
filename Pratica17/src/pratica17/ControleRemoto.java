
package pratica17;


public class ControleRemoto implements Controlador {
    
    private int volume;
    private boolean ligado;
    private boolean tocando;

    
    
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
    
    // construtor

    public ControleRemoto() {
        this.setLigado(false);
        this.setVolume(50);
    }
    
    

    // metodos
    
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
        System.out.println("--Menu--");
        System.out.println("ligado: " + this.isLigado());
        System.out.println("tocando: " + this.isTocando());
        System.out.println("volume: " + this.getVolume());
        } else {
            System.out.println("controle desligado! :/");
        }
    }

    @Override
    public void fecharMenu() {
        
        if(this.isLigado()) {
        System.out.println("Fechando menu... o.O'");
        } else {
            System.out.println("controle desligado! :X");
        }
        
    }

    @Override
    public void maisVolume() {
        
        if(this.isLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("controle desligado!");
        }
        
    }

    @Override
    public void menosVolume() {
        
        if(this.isLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("controle desligado!");
        }
    }

    @Override
    public void ligarMudo() {
        
        if(this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        } else {
            System.out.println("desligado!");
        }
    }

    @Override
    public void desligarMudo() {
        
        if(this.isLigado()) {
            if(this.getVolume() == 0) {
                this.setVolume(50);
            } else if (this.getVolume() != 0) {
                System.out.println("mas está tocando lerdão O.o");
            }
        } else {
            System.out.println("controle desligado >.<");
        }
        
    }

    @Override
    public void play() {
        
        if(this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        } else {
            System.out.println("OFF!");
        }
    }

    @Override
    public void pause() {
        
        if(this.isLigado() && (this.isTocando())) {
            this.setTocando(false);
        } else {
            System.out.println("OFF");
        }
    }
    
    
    
}
