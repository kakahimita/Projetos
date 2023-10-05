package ex061_udemy_lacoforeach;

/**
 *
 * @author kakah
 */
public class Ex061_Udemy_LacoForEach {


    public static void main(String[] args) {
        
        // Udemy
        
        /* O laço 'for each' é uma estrutura de controle de fluxo que é 
         * usada para iterar sobre os elementos de um array ou coleção.
        */

        String[] vetor = new String[] {"Maria", "BOB", "Alex"};
        
        //Estrutra de repetir "tradicional"
        for (int i=0; i<vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        
        System.out.println("==== // ====");
        
        // Leitura: "para cada objeto 'obj' contido em vetor, faça:"
        for (String obj : vetor) {
            System.out.println(obj);
        }
        
        
    }

}
