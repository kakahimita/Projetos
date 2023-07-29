/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica30;

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
        
        this.setAberto(false);
    }
    
    // toString diferenciado

    public String detalhes() {
        return "== Livro == \n" + "titulo: " + titulo + " \nautor:  " + autor + " \ntotPaginas: " + totPaginas + "\npagAtual: " + pagAtual + "\n"
                + "aberto: " + aberto + "\nleitor: " + leitor.getNome() + "";
    }
    
    
    
    // metodos especiais
    @Override
    public void abrir() {
        if(!(this.isAberto())){
            this.setAberto(true);
        } else {
            System.out.println("Livro já está aberto!");
        }
    }

    @Override
    public void fechar() {
        if(this.isAberto()) {
            this.setAberto(false);
        } else {
            System.out.println("Livro já está fechado!");
        }
    }

    @Override
    public void folhear(int f) {
        if(this.isAberto() && this.getTotPaginas() > f) {
            this.setPagAtual(f);
        } else {
            this.setPagAtual(0);
        }
    }

    @Override
    public void avancarPag() {
        if(this.isAberto() && this.getPagAtual() < this.getTotPaginas()) {
            this.setPagAtual(this.getPagAtual() + 1);
        } else {
            this.setPagAtual(0);
        }
    }

    @Override
    public void voltarPag() {
        if(this.isAberto() && this.getPagAtual() > 0) {
            this.setPagAtual(this.getPagAtual() - 1);
        } else {
            this.setAberto(false);
        }
    }
    
    // gets e sets
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
