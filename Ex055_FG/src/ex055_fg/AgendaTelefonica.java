package ex055_fg;

/**
 *
 * @author kakah
 */
class AgendaTelefonica {

    private Contato[] contatos = new Contato[10];
    private int totalDeContatos = 0;

    public int tamanho() {
        return this.totalDeContatos;
    }

    boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= this.totalDeContatos;
    }

    boolean posicaoOcupada(int posicao) {
        return posicao < this.contatos.length && posicao >= 0;
    }

    public boolean contem(String nomeContato) {
        for (int i = 0; i < this.totalDeContatos; i++) {
            if (nomeContato.equals(this.contatos[i].getNome())) {
                return true;
            }
        }
        return false;
    }

    private void garantaEspaco() {
        if (this.totalDeContatos == this.contatos.length) {
            Contato[] novaArray = new Contato[this.contatos.length * 2];
            for (int i = 0; i < this.contatos.length; i++) {
                novaArray[i] = this.contatos[i];
            }
            this.contatos = novaArray;
        }
    }

    public void adiciona(String nome, String numero) {
        Contato contato = new Contato(nome, numero);
        this.garantaEspaco();
        this.contatos[this.totalDeContatos] = contato;
        this.totalDeContatos++;
    }

    public Contato pega(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida pesquisada");
        }
        return this.contatos[posicao];
    }

    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.totalDeContatos - 1; i++) {
            this.contatos[i] = this.contatos[i + 1];
        }
        this.contatos[this.totalDeContatos - 1] = null;
        this.totalDeContatos--;
    }

    public void adiciona(int posicao, Contato contato) {
        this.garantaEspaco();
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = this.totalDeContatos - 1; i >= posicao; i--) {
            this.contatos[i + 1] = this.contatos[i];
        }
        this.contatos[posicao] = contato;
        this.totalDeContatos++;
    }

    public String exibirLista() {
        StringBuilder lista = new StringBuilder();
        for (int i = 0; i < this.totalDeContatos; i++) {
            lista.append(this.contatos[i].toString()).append("\n");
        }
        return lista.toString();
    }

    public String toString() {
        return exibirLista();
    }
}
