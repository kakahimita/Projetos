package ex035_faculdade_arrays;

/**
 *
 * @author kakah
 */
public class Ex035_Faculdade_Arrays {


    public static void main(String[] args) {
        
        // Arrays
        
        /* Um array é uma estrutura de dados que permite armazenas
         * múltiplos elementos do mesmo tipo em uma única variável.
         * Os elementos em uma array são organizados em posições
         * numeradas, começando geralmente de 0. Isso facilita o 
         * acesso e manipulação dos dados armazenados.
        */
        
        // 1) || Para criar um array em java: ||
        
        // declarando um array de inteiros com tamanho 5
        int[] meuArray = new int[5];
        
        // Atribuindo valores ás posições do array
        meuArray[0] = 10;
        meuArray[1] = 20;
        meuArray[2] = 30;
        meuArray[3] = 40;
        meuArray[4] = 50;
        
        // Também pode criar um array e inicializá-lo com valores
        // ná mesma linha:
        int[] meuArray1 = {10, 20, 30, 40, 50};
        
        // Para acessar um valor específico em um array, utilize 
        // o índice correspondente:
        int primeiroValor = meuArray[0];
        int terceiroValor = meuArray[2];
        
        // 2) || Percorrendo elementos de um Array: ||
        
        /* Existem várias formas de percorrer um array em Java, utilizando
         * três maneiras comuns: loop "for", o loop "while" e a estrutura
         * "for-each".
        */
        
        /* 1. Usando o loop "for":
         * 
         * O loop "for" é uma ótima opção quando você sabe quantos elementos
         * o array possui e quer iterar sobre eles de forma específica.
        */
        
        for(int i = 0; i < meuArray.length; i++) {
            System.out.println("Elemento índice " + i + " : " + meuArray[i]);
        }
        
        System.out.println("==== // ==== // ====");
        
        /* 1.1 Usando o loop "while":
         * 
         * O loop "while" é uma boa escolha quando você quer iterar enquanto
         * uma condição é verdadeira, e não necessariamente sabe de antemão
         * quantos elementos existem no array.
        */

        int j = 0;
        
        while (j < meuArray.length) {
            System.out.println("Elemento índice " + j + " : " + meuArray[j]);
            j++;
        }
        
        System.out.println("==== // ==== // ====");
        
        /* 1.2 Usando o loop "for-each"(for aprimorado):
         *
         * O loop "for-each" é ideial quando você quer iterar sobre todos os
         * elementos do array, sem se preocupar com os índices.
        */
        
        for(int x : meuArray) {
            System.out.println(x);
        }
        
        /* Obs.finais:
         *
         * O loop "for-each" elimina a necessidade de gerenciar índices e
         * torna o código mais limpo. No entanto, não é adequado se você
         * precisar acessar índices específicos ou modificar elementos do
         * array durante a interação.
         *
         * Escolha a abordagem que melhor se adapte ás suas necessidades
         * e ao contexto do seu código. Cada uma das opções tem suas vantagens
         * e desvantagens, então é importante considerar o que é mais apropriado
         * para a situação específica em que você está trabalhando.
        */
        
    }

}
