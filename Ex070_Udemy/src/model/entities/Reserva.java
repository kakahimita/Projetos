package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import model.exceptions.DomainException;

/**
 *
 * @author kakah
 */
public class Reserva {

    private Integer numeroQuarto;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    //construtor
    public Reserva() {
    }

    //construtor
    public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut){
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Erro na reserva: As datas saida devem ser po"
                    + "sterior a data de entrada");
        }
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    //método 1
    public long duracao() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    //método 2
    public void updatheDates(Date checkIn, Date checkOut) {

        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException("Erro na reserva: As datas de reserva para atualiza"
                    + "ção devem ser datas futuras");
        }
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Erro na reserva: As datas saida devem ser po"
                    + "sterior a data de entrada");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    //toString
    @Override
    public String toString() {
        return "Quarto " + numeroQuarto + ", check-in: " + sdf.format(checkIn) + ", "
                + "checkOut: " + sdf.format(checkOut) + ", " + duracao() + " noites";
    }

    //getters e setters
    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }
}
