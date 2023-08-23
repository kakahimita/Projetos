package ex029;

/**
 *
 * @author kakah
 */
public class Ex029 {


    public static void main(String[] args) {
        
        // Arrays 
        
        /*
         * Arrays são estruturas de dados fundamentais que permitem
         * armazenas múltiplos valores do mesmo tipo em uma única
         * variável.
        */
        
        // Declaração e inicialização em uma linha:
        
        int[] numeros = {1, 2, 3, 4, 5};
        
        // Percorrendo uma Arrays:
        
        /*
         * para percorrer os elementos de uma array, você pode
         * usar loops, como o loop 'for':
        */
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        
        // ===================== // ========================== //
        
        // Declaração de arrays em Strings
        
        String[] nomes = new String[]{"Alice","bob", "Charlie"};
        
        // Percorrendo Arrays com Strings utilizando for
        
        for (int j = 0; j < nomes.length; j++) {
            System.out.println(nomes[j]);
        }
        
        System.out.println("============ // ============");
        
        
        // ===================== // ========================== //
        
        // Existem outras formas de aplicar a sintaxe 
        
        // 1)
        
        int[] meuArrays = new int[5];
        
        meuArrays[0] = 10;
        meuArrays[1] = 11;
        meuArrays[2] = 23;
        meuArrays[3] = 43;
        meuArrays[4] = 5;        
        
        for(int k = 0; k < meuArrays.length; k++) {
            System.out.println(meuArrays[k]);
        }
    }

}
