
package ex024;


public class Ex024 {


    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("luis", 27, "M");
        Pessoa p2 = new Pessoa("maria", 29, "F");
        
        Livro l1 = new Livro("Narnia", "capanga", 300, p1);
        
        l1.abrir();
        l1.folhear(140);
        l1.avancarPag();
        l1.voltarPag();
        
        System.out.println(l1.detalhes());

    }
    
}
