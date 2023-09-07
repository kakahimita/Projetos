package ex037_fg_soma_array_metodo;

/**
 *
 * @author kakah
 */
public class Calculadora {
    
    public void soma(int[] array) {
        
        int soma = 0;
        
        for(int i = 0; i < array.length; i++)
            soma += array[i];
        
        System.out.println("Somando os valores do array: " + soma);
        
    }

}