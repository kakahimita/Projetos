package ex068_udemy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author kakah
 */
public class Ex068_Udemy {


    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero do quarto: ");
        int number = sc.nextInt();
        System.out.print("data de entrada (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("data de saida (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());
        
        if (!checkOut.after(checkIn)) {
            System.out.println("Erro na reserva: data de check-out"
                    + "deve ser posterior à data de check-in");
        } else {
            Reserva reserva = new Reserva(number, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);
            
            System.out.println();
            System.out.println("Entre com a data atualizada da reserva: ");
            System.out.print("data de entrada (dd/MM/yyyy):");
            checkIn = sdf.parse(sc.next());
            System.out.print("data de saida (dd/MM/yyyy):");
            checkOut = sdf.parse(sc.next());
            
            Date now = new Date();
            if(checkIn.before(now) || checkOut.before(now)){
                System.out.println("Erro na reserva: As datas de reserva para atualiza"
                        + "ção devem ser datas futuras");
            } else if (!checkOut.after(checkIn)){
                System.out.println("Erro na reserva: As datas saida devem ser po"
                        + "sterior a data de entrada");
            } else {
            
            reserva.updatheDates(checkIn, checkOut);
            
            System.out.println("Reserva: " + reserva);
            }
        }
        sc.close();
    }
}
