package ex059_udemy;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author kakah
 */
public class Ex059_Udemy {


    public static void main(String[] args) {
        
        // Ex vetor Udemy
        
        /* Fazer um programa para ler nome, idade e altura de N pessoas,
         * conforme exemplo. Depois, mostrar na tela a altura média das
         * pessoa, e mostrar também a porcentagem de pessoas com menos
         * 16 anos, bem como os nomes dessas pessoas caso houver.
        */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas serão digitadas?: ");
        int n = sc.nextInt();
        
        String[] nomes = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];
        
        for(int i=0; i<n; i++){
            System.out.print("nome: ");
            nomes[i] = sc.next();
            System.out.print("idade: ");
            idade[i] = sc.nextInt();
            System.out.print("altura: ");
            altura[i] = sc.nextDouble();
        }
        
        System.out.println("=== // ===");
        
        double soma = 0;
        for(int i=0; i<n; i++) {
            soma += altura[i];
        }
        
        double media = soma / n;
        System.out.printf("a altura media é : %.2f%n", media);
        
        int menor = 0;
        for(int i=0; i<n; i++) {
            if(idade[i] < 16) {
                menor++;
            }
        }
        
        double mediaIdade = menor * 100.0 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", mediaIdade);
        
        for(int i=0; i<n; i++) {
            if(idade[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

    }

}
