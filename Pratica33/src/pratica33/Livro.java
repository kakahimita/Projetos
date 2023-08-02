package pratica33;

/**
 *
 * @author kakah
 */
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        
        this.setPagAtual(0);
        this.setAberto(false);
    }
    
    // metodo especial
    @Override
    public String toString() {
        return "== Livro ==\n" + "titulo: " + titulo + "\nautor: " + autor + "\ntotPaginas: " + totPaginas + "\npagAtual: " + pagAtual + "\naberto: " + aberto + "\nleitor: " + leitor.getNome() + "";
    }

    @Override
    public void abrir() {
        if(!(this.isAberto())) {
            this.setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if(this.isAberto()) {
            this.setAberto(false);
        }
    }

    @Override
    public void folhear(int f) {
        if(this.isAberto() && this.getTotPaginas() >= f) {
            this.setPagAtual(f);
        } else {
            System.out.println("erro >.<");
        }
    }

    @Override
    public void avancarPag() {
        if(this.isAberto() && this.getTotPaginas() > this.getPagAtual()) {
            this.setPagAtual(this.getPagAtual() + 1);
        } else {
            this.setPagAtual(0);
        }
    }

    @Override
    public void voltarPag() {
        if(this.isAberto() && this.getPagAtual() > 0) {
            this.setPagAtual(this.getPagAtual() - 1);
        }
    }

    //getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
}