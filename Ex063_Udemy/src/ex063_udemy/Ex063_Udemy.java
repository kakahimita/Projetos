package ex063_udemy;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author kakah
 */
public class Ex063_Udemy {


    public static void main(String[] args) {
        
        // Udemy
        
        // Operações importantes com data-hora
        
        /* Principais tipos de data e hora Java (versão 8+)
         
           * Data-hora local
             LocalDate
             LocalDateTime
        
           * Data-hora global
             instant
           
           * Duração
             Duration
        
           * Outros
             Zoneld
             ChronoUnit
        
        */
        
        //imprimir data atual
        LocalDate d01 = LocalDate.now();
        System.out.println(d01);

        //hora local + data atual
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02);
        
        //horario de Londres
        Instant d03 = Instant.now();
        System.out.println(d03);

        // Texto ISO 8601 -> Data é hora
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-05-20T01:30:26");
        
        System.out.println(d04);
        System.out.println(d05);
        
        // Insntanciar dia, mês, ano, [horário] -> data-hora local
        LocalDate d10 = LocalDate.of(2022, 07, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
        
        System.out.println(d10);
        System.out.println(d11);
    }

}
