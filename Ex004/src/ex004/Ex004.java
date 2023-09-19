
package ex004;


public class Ex004 {


    public static void main(String[] args) {
        
        // Funções matemáticas em Java
        
        // utilizando Class Math
        
        // PI   | PI - Constante | Math.PI       | 3.1415... |
        // pow  | Exponenciação  | Math.pow(5,2) |     25    |
        // sqrt | Raiz Quadrada  | Math.sqrt(25) |      5    |
        // cbrt |¨Raiz Cúbica    | Math.cbrt(27) |      3    |
        
        // 1) utilizando alguns desses valores em exemplos praticos
        
        // Obs:type quest para converter um numero "inteiro"
        // para "float".
        
        //Raiz Quadrada de 5 = 2.236..
        int n = 5;
        
        float res = (float) Math.sqrt(n);    // type quest  | Raiz quadrada    
        System.out.println(res);
        
        
        // Arredondamentos Class Math
        // exemplo de arredondamento dos numeros 
        
        // abs   | Valor Absoluto        | Math.abs(-10)    |  10  |
        // floor | Arredonda para baixo  | Math.floor(3.9)  |   3  |
        // ceil  | Arredonda para Cima   | Math.ceil(4.2)   |   5  |
        // round | Arredonda Artimetica  | Math.round(5.6)  |   6  |
        
        // 2) Arredondando 7.3 para BAIXO = 7
        
        float v = 7.3f;
        int ar = (int) Math.floor(v);
        System.out.println(ar);
        
        // 3) Arredondando 5.6 para CIMA = 6
        
        float r = 5.6f;
        int ar1 = (int) Math.ceil(r);
        System.out.println(ar1);
        
        // 4) Arredondamento Artimetico de 6.5 = 7
        
        float a = 6.5f;
        int ar2 = (int) Math.round(a);
        System.out.println(ar2);
        
        // 5)
        // Gerador de Número com Match.random();
        // Obs: Match.random(); apenas gera um numero
        // aleatorio entre 0.0 e 1.0
        
        double ale = Math.random();
        System.out.println(ale);
        
        // 6)
        // para gerar um numero entre 5 e 10 é preciso usar um
        // pouco de matematica
        // segue abaixo um exemplo de numeros aleatorios entre 5 e 10
        
        double ale1 = Math.random();
        int n23 = (int) (5 + ale *(10-5));
        System.out.println("random 5  a  10 : "+ n23);
        
        // 7)
        // obs: para mudar os numeros 
        // basta mudar a formula
        // (5 + ale *(10-5));
        //  15        50-15
        // contagem de 15 a 50
        
        double ale2 = Math.random();
        int n25 = (int) (15 + ale *(50-15));
        System.out.println("random 15 a  50 : "+ n25);
        
        // 8)
        // de 1 a 100
        
        double ale3 = Math.random();
        int n26 = (int) (1 + ale * (100-1));
        System.out.println("random 1  a 100 : "+ n26);
        
        // obs: para maiores informações das funções Math
        // acesse java.lang.Math

    }
    
}
