package pratica38_trabalhador;

import entidades.Departamento;
import entidades.HorasContratos;
import entidades.Trabalhador;
import entidades.enums.NivelTrabalhador;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author kakah
 */
public class Pratica38_Trabalhador {


    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Entre com o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();
        System.out.println("data de trabalho: ");
        System.out.print("nome: ");
        String nomeTrabalhador = sc.nextLine();
        System.out.print("Level: ");
        String nivelTrabalhador = sc.nextLine();
        System.out.print("Salario base: ");
        Double salarioBase = sc.nextDouble();
        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));
        
        System.out.println("Quantos contratos o trabalhador tem: ");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++) {
            System.out.println("contrato #" + i + " data: ");
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataContrato = sdf.parse(sc.next());
            System.out.print("valor por hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duração de (horas): ");
            int horas = sc.nextInt();
            HorasContratos contrato = new HorasContratos(dataContrato, valorPorHora, horas);
            trabalhador.adicionarContrato(contrato);
        }
        
        System.out.println();
        System.out.print("Entre com mes e ano para calcular o salario (MM/YYY): ");
        String mesEano = sc.next();
        int mes = Integer.parseInt(mesEano.substring(0, 2));
        int ano = Integer.parseInt(mesEano.substring(3));
        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento " + trabalhador.getDepartamento().getNome());
        System.out.println("renda " + mesEano +": " + String.format("%.2f", trabalhador.renda(ano, mes)));
        
        
        sc.close();
    }

}
