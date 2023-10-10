package ex067_udemy;

import entites.Empregador;
import entites.Empregador_Terceirizado;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author kakah
 */
public class Ex067_Udemy {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Empregador> list = new ArrayList<>();
        
        System.out.print("Entrar com numero de empregados: ");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            System.out.println("Empregado #" + i + " data:");
            System.out.print("terceirizado (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("horas:");
            int horas = sc.nextInt();
            System.out.print("valor por horas: ");
            double valorPorHora = sc.nextDouble();
            if (ch == 'y') {
                System.out.print("taxa adicional: ");
                double taxaAdicional = sc.nextDouble();
                list.add(new Empregador_Terceirizado(nome, horas, valorPorHora, taxaAdicional));
            } else {
                list.add(new Empregador(nome, horas, valorPorHora));
            }
        }
        
        System.out.println();
        System.out.println("Pagamento:");
        for (Empregador emp : list) {
            System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.pagamento()));
        }
        
        sc.close();
    }

}
