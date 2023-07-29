
package pratica30;

public class Pratica30 {

    public static void main(String[] args) {
        
        Livro l[] = new Livro[6];
        
        Pessoa p[] = new Pessoa[8];
        
        p[0] = new Pessoa("luis", 27, "M");
        
        l[0] = new Livro("Narnia", "stalin", 500, p[0]);
        
        l[0].abrir();
        l[0].folhear(0);
        l[0].voltarPag();
        l[0].abrir();
        l[0].avancarPag();
        
        System.out.println(l[0].detalhes());
        
    }
    
}
