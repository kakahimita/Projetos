
package aula02;

public class Aula02 {

    public static void main(String[] args) {
        
        // Criando um objeto Caneta
        
        Caneta c1 = new Caneta();
        c1.modelo = "bic";
        c1.cor = "azul";
        // c1.ponta = (float) 1.5;  // atributo privado
        c1.carga = 70;
        //c1.tampada = false;
        
        c1.tampar();
        c1.status();
        c1.rabiscar();

        
        

    }
    
}
