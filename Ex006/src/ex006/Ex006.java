
package ex006;


public class Ex006 {


    public static void main(String[] args) {
        
        //operadores relacionais usando operacao ternaria.
        
        //         Operadores Relacionais
        //---------------------------------------------
        // >  |     Maior que     |  5  >  2  | true  |  
        // <  |     Menor que     |  4  <  1  | false |
        // >= | Maior ou igual a  |  8 >=  3  | true  |
        // <= | Menor ou igual a  |  6 <=  6  | true  |
        // == |      Igual a      |  9 ==  8  | false |
        // != |   Diferente de    |  4 !=  5  | true  |
        //---------------------------------------------
        
        // 1)
        // comparando Strings
        
        String nome1 = "Luis";
        String nome2 = "Luis";
        String nome3 = new String("Luis");
        String res;
        res = (nome1==nome3)?"igual":"diferente";
        System.out.println(res);
        
        // o resultado dessa expreçao vai ser Diferente
        // mesmo o conteudo das variaveis contendo o mesmo dados (Luis)
        // o nome3 foi criado utilizando a clausa 'new'
        // entao ele n  tem tecnicamente a mesma estrutura
        // de nome1 e nome2 mesmo sendo "iguais"
        
        // inves de utilizar o operador relacional ==
        // como o nome1 é um objeto entao ele pode ter metodos
        // como o equals(nome3)
        // o metodo equals verifica se um conteudo de um objeto
        // é igual o outro
        
        // para objeto ao inves de usar == utilize equals.
        
        String nome4 = "Luiz";
        String nome5 = "Luiz";
        String nome6 = new String("Luiz");
        String rez;
        rez = (nome4.equals(nome6))?"Igual":"diferente";  // utilizando equals
        System.out.println(rez);                          // comparando objeto
        
        
        
        
        
        
        
        
        
        
        
        

    }
    
}
