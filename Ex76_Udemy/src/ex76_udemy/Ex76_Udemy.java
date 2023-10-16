package ex76_udemy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import model.entities.AluguelDeCarro;
import model.entities.Veiculo;
import model.services.BrazilTaxService;
import model.services.RentalService;

/**
 *
 * @author kakah
 */
public class Ex76_Udemy {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        System.out.println("Entre com os dados do Aluguel");
        System.out.print("Modelo do carro: ");
        String modeloCarro = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
        
        AluguelDeCarro cr = new AluguelDeCarro(start, finish, new Veiculo(modeloCarro));
        
        System.out.print("Entre com o preço por hora:");
        double precoPorHora = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double precoPorDia = sc.nextDouble();
        
        RentalService rentalService = new RentalService(precoPorHora, precoPorDia, new BrazilTaxService());
        
        rentalService.processarFatura(cr);
        
        System.out.println("Fatura");
        System.out.println("Pagamento basico: " + cr.getFatura().getPagamentoBasico());
        System.out.println("Imposto: " + cr.getFatura().getImposto());
        System.out.println("Pagamento Total: " + cr.getFatura().getPagamentoTotal());
        
        sc.close();
    }
}
