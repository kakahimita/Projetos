
package ex013;


public class Ex013 {


    public static void main(String[] args) {
        
        // Estrutura de repetição
        // while  -> enquanto
        
        // 1)
        
        int cc = 0;
        while(cc<4) {
            System.out.println("cambalhota " + cc);
            cc++;
        }
        
        System.out.println("----------------------------"); // corte para EX
        
        // tambem é possivel mudar o fluxo de um laço
        // com continue ou break
        
        // nesse caso utilizando o continue
        // o contador de cambalhotas vai evitar a contagem
        // do numero 5 e 7
        
        // 2)
        
        int cc1 = 0;
        while (cc1<10) {
            cc1++;
            if (cc1 == 5 || cc1 == 7) {
                continue;
            }
            System.out.println("cambalhota " + cc1);
        }
        
        System.out.println("---------------------------------"); // corte para EX
        
        // outro exemplo é a utilizaçao do break
        // comando de interrupção do laço
        
        // break
        
        // 3)
        
        int cc2 = 0;
        while (cc2<10) {
            cc2++;
            if (cc2 == 2 || cc2 == 3 || cc2 == 4) {
                continue;
            }
            if (cc2 == 7) {
                break;
            }
            System.out.println("cambalhota " + cc2);
        }
        
        

    }
    
}
