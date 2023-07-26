
package aula02;

public class Aula02 {

    public static void main(String[] args) {
        
        // Criando um objeto Caneta
        
        Caneta c1 = new Caneta();
        c1.modelo = "cravejada";
        c1.cor = "Azul";  // chamando atributo
        c1.ponta = 0.5f;
        c1.carga = 100;
        
        
        c1.destampar();   // chamando metodos
        c1.rabiscar();
        System.out.println("STATUS C1");
        
        c1.status();
        
        
        System.out.println("-------------");
        
        Caneta c2 = new Caneta();  // criando caneta 2
        c2.modelo = "ferrari";
        c2.cor = "vermelho";
        c2.ponta = 0.5f;
        c2.carga = 100;
        
        System.out.println("STATUS C2");
        
        c2.tampar();
        c2.status();
        c2.rabiscar();
        
        

    }
    
}
