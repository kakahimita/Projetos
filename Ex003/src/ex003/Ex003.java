
package ex003;


public class Ex003 {


    public static void main(String[] args) {
        
        // 1)
        // operadores aritmeticos
        
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A media é igual a: "+ m);
        
        // 2)
        // exemplo de incremento
        
        int numero = 5;
        numero++;
        System.out.println(numero);
        
        // 3)
        // exemplo de descremento
        
        int numero1 = 5;
        numero1--;
        System.out.println(numero1);
        
        // 4)
        // exemplo de pre-incremento
        
        int numer2 = 5;
        int valor2 = 5 + ++numer2;
        System.out.println(valor2);
        
        // 5)
        // exemplo de pos-incremento
        
        int numero3 = 5;
        int valor3 = 5 + numero3++;
        System.out.println(valor3);
        System.out.println(numero3);
        
        // 6)
        // Operadores de Atribuição
        
        // += Somar e atribuir     | a += b | a = a + b
        // -= subtrair e atribuir  | a -= b | a = a - b
        // mult e atribuir         | a *= b | a = a * b
        // dividir e atribuir      |¨a /= b | a = a / b
        // resto e atribuir        | a %= b | a = a % b
        
        int x = 4;
        x += 2;  // x = x + 2
        System.out.println(x);
        
        // e a mesma coisa que escrever!
        
        int z = 4;
        z = z + 2;
        System.out.println(z);
        
        
        
        
        
        
        

    }
    
}
