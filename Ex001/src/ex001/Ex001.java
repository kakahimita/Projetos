
package ex001;


public class Ex001 {


    public static void main(String[] args) {
        
        // 1)
        // Tipos Primitivos
        //imprimindo numeros reais
        
        float nota = 7.5f;
        System.out.println("A nota é " + nota);
        
        // 2)
        // outra forma de escrever o mesmo codigo:
        // o resultado é o mesmo
        
        float nota1 = (float) 5.2;
        System.out.println("A nota é " + nota);
        
        // 3)
        // tambem e possivel colocar o resultado formatado!
        
        //formatado em 2 casas decimais
        //obs: printF 
        //obs2: \n quebra de linha
        //obs3: 2 = quantidade de casas decimais
        
        float nota2 = 8.2f;
        System.out.printf("A nota é %.3f \n", nota2);
        
        // 4)
        // para imprimir um nome junto com a formatacao
        // utilizar %s
        
        String nome = "Luís";
        float nota3 = 5.2f;
        System.out.printf("A nota de %s é %.4f \n", nome, nota3);
        
        // 4/1)
        // outra forma de fazer o codigo 
        
        
        String nome1 = "asdww";
        float nota4 = 2.1f;
        System.out.printf("a nota de " + nome1 + "é %.3f \n", nota4);
        
        // tambem é possivel fazer a mesma sintaxe alterando
        // print por format
        
        String nome2 = "gugudada";
        float nota5 = 4.1f;
        System.out.format("A nota e %.3f \n", nota5);
        
        
        
        
        

    }
    
}
