
package ex018;


public class Ex018 {


    public static void main(String[] args) {
        
        Caneta c1 = new Caneta("nic", "amarelo", 0.4f);
        c1.status();
        System.out.println(" ");
        
        Caneta c2 = new Caneta("kkk", "verde", 0.3f);
        c2.status();
        System.out.println(" ");
        
        // metodos getts e setts
        
        // servem para proteger o acesso ao atributo atributo.
        // o atributo n vai estar disponivel livremente
        // você não consegue acessar diretamente o atributo
        
        c1.setModelo("Bik");
        //c1.modelo = "bic";
        
        c1.setPonta(0.4f);
        //c1.ponta = 4.5f;
        
        
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());

    }
    
}
