package pratica38_lista_udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author kakah
 */
public class Pratica38_Lista_Udemy {


    public static void main(String[] args) {
        
        /* Fazer um programa para ler um número inteiro N e depois os dados
         * (id, nome e salario) de N funcionários. Não deve haver repetição
         * de id.
         *
         * Em seguida, efetuar o aumento de X por cento no salário de um deter-
         * minado funcionário. Para isso, o programa deve ler um id e o valor X.
         * Se o id informado não existir, mostrar uma mensagem e abortar a oper-
         * ação. Ao final, mostrar a listagem atualizada dos funcionários, conf-
         * orme exemplos.
         *
         * Lembre-se de aplicar a técnica de encapsulamento para não permitir
         * que o salário possa ser mudado livremente. Um salário só pode ser 
         * aumentado com base em uma operação de aumento por porcentagem dada.
        */
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Funcionario> list = new ArrayList<>();
        
        System.out.print("Quantos funcionarios?: ");
        int n = sc.nextInt();
        
        for (int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Funcionario #" + i + ": ");
            
            System.out.print("Id: ");
            int id = sc.nextInt();
            while(hasId(list, id)) {
                System.out.print("Id em uso. tente novamente: ");
                id = sc.nextInt();
            }
            
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            list.add(new Funcionario(id, nome, salario));
        }
        
        
        // Amento de salario 
        
        System.out.println();
        System.out.print("escolha um ID para aumento do Funcionario: ");
        int id = sc.nextInt();
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("Id inexistente!");
        } else {
            System.out.println("Porcentagem: ");
            double porcentagem = sc.nextDouble();
            emp.aumentoSalario(porcentagem);
        }
        
        // Lista Funcionarios
        
        System.out.println();
        System.out.println("Listar Funcionarios:");
        for (Funcionario obj : list) {
            System.out.println(obj);
        }
        
        sc.close();

    }
    
    public static boolean hasId(List<Funcionario> list, int id) {
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
