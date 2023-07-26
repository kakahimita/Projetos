package pratica24;

public class ControleRemoto implements Controlador{
    
    public int volume;
    public boolean ligado;
    public boolean tocando;

    // metodo construtor

    public ControleRemoto() {
        this.setVolume(10);
        this.setLigado(true);
        this.setTocando(false);
    }
    
    // metodos especiais
    @Override
    public void ligar() {
        if(this.isLigado() == false) {
            this.setLigado(true);
            System.out.println("Ligado!");
        } else {
            System.out.println("controle já está ligado >.<");
        }
    }

    @Override
    public void desligar() {
        if(this.isLigado()) {
            this.setLigado(false);
            System.out.println("Até mais !!");
        } else {
            System.out.println("já estou desligado! zZzzZ");
        }
    }

    @Override
    public void abrirMenu() {
        if(this.isLigado()) {
            System.out.println("=== Menu ===");
            System.out.println("Volume: " + this.getVolume());
            System.out.println("Ligado: " + this.isLigado());
            System.out.println("Tocando: " + this.isTocando());
        } else {
            System.out.println("controle: OFF :(");
        }
    }

    @Override
    public void fecharMenu() {
        if(this.isLigado()) {
            System.out.println("Fechando menu! ...");
        } else {
            System.out.println("controle: OFF :/");
        }
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado()) {
            if(this.getVolume() > 0) {
                this.setVolume(this.getVolume() - 5);
            } else {
                System.out.println("o volume já está em 0");
            }
        } else {
            System.out.println("controle: OFF!");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado()) {
            if(this.getVolume() > 0) {
                this.setVolume(0);
                System.out.println("Mudo ON!");
            } else {
                System.out.println("já está MUDO!");
            }
        } else {
            System.out.println("Ligar controle!");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado()) {
            
            if(this.getVolume() == 0) {
                this.setVolume(50);
                System.out.println("Mudo desligado!");
            } else {
                System.out.println("já está fora do mudo");
            }
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())) {
            System.out.println("tuts tuts!");
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()) {
            this.setTocando(false);
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
