package ex057_udemy;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author kakah
 */
public class Ex057_Udemy {


    public static void main(String[] args) {

        // Exercicio Vetor 
        
        /* Fazer um programa para ler número inteiro N e a altura de N
         * pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar
         * a altura média dessas pessoas.
        */
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double[] vect = new double[n];
        
        for(int i=0; i<n; i++) {
            vect[i] = sc.nextDouble();
        }
        
        double soma = 0.0;
        for(int i=0; i<n; i++) {
            soma += vect[i];
        }
        
        double media = soma / n;
        
        System.out.printf("a altura media é %.2f%n", media);
        
        sc.close();
        
        
    }

}
