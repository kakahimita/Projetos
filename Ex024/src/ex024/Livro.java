
package ex024;


public class Livro implements Publicacao{
    
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // construtor

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        
        this.setAberto(false);
        this.setPagAtual(0);
    }
    
    
    // metodo especial

    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + "\n, autor=" + autor + "\n, totPaginas=" + totPaginas + "\n, pagAtual=" + pagAtual + "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() +
                "\n, idade=" + leitor.getIdade() + "\n, sexo=" + leitor.getSexo() +'}';
    }

    
    // interface
    @Override
    public void abrir() {
        if(this.isAberto() == false) {
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
    public void folhear(int p) {
        if(this.isAberto()) {
            if(this.getTotPaginas() > p) {
                this.setPagAtual(p);
                System.out.println("Pagina: " + this.getPagAtual());
            } else {
                this.setPagAtual(0);
            }
        } else {
            System.out.println("livro fechada >.>");
        }
    }

    @Override
    public void avancarPag() {
        if(this.isAberto()) {
            if(this.getPagAtual() < this.getTotPaginas()) {
                this.setPagAtual(this.getPagAtual() + 1);
                System.out.println("Pagina avançada " + this.getPagAtual());
            } else if (this.getPagAtual() >= this.getTotPaginas()){
                System.out.println("final do livro!");
            }
        } else {
            System.out.println("livro fechado :X ");
        }
    }

    @Override
    public void voltarPag() {
        if(this.isAberto()) {
            if(this.getPagAtual() < this.getTotPaginas() && this.getPagAtual() > 0) {
                this.setPagAtual(this.getPagAtual() - 1);
            } else {
                System.out.println("inicio do Livro!");
            }
        } else {
            System.out.println("livro fechado");
        }
    }
    
    
    //gets e sets
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
