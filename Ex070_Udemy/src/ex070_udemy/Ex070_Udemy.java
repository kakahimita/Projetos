package ex070_udemy;

import model.entities.Reserva;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.exceptions.DomainException;

/**
 *
 * @author kakah
 */
public class Ex070_Udemy {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Numero do quarto: ");
            int number = sc.nextInt();
            System.out.print("data de entrada (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("data de saida (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reserva reserva = new Reserva(number, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Entre com a data atualizada da reserva: ");
            System.out.print("data de entrada (dd/MM/yyyy):");
            checkIn = sdf.parse(sc.next());
            System.out.print("data de saida (dd/MM/yyyy):");
            checkOut = sdf.parse(sc.next());

            reserva.updatheDates(checkIn, checkOut);
            System.out.println("Reserva: " + reserva);
        } catch (ParseException e) {
            System.out.println("Data invalida");
        } catch (DomainException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("erro inesperado");
        }
        sc.close();
    }
}
