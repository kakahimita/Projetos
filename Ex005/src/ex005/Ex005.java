
package ex005;


public class Ex005 {


    public static void main(String[] args) {
        
        // Operador Ternario.
        // também conhecido como operador condicional
        // permite tomar decisões com base em uma condição e retorna
        // um valor com base na decisao
        
        // 1)
        // se 4 > 8 entao retorne 1
        // condiao ? valorSeverdadeiro : valorSeFalso
        // n1 > n2 ?       0           :      1
        
        
        int n1, n2, r;
        n1 = 4;
        n2 = 8;
        r = (n1>n2)?0:1;
        System.out.println(r);
        
        // tambem é possivel fazer operacoes com base na condição
        // 2)
        
        
        int n3, n4, b;
        n3 = 14;
        n4 = 8;
        b = (n3>n4)?n3+n4:n3-n4;  // como n3 e maior que n4
        System.out.println(b);    // entao ele faz a soma de 14+8 = 22
        
        
        
        

    }
    
}
