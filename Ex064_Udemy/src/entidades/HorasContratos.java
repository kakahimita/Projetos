package entidades;

import java.util.Date;

/**
 *
 * @author kakah
 */
public class HorasContratos {
    
    private Date date;
    private Double valorPorHora;
    private Integer horas;

    public HorasContratos() {
    }

    public HorasContratos(Date date, Double valorPorHora, Integer horas) {
        this.date = date;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

    //metodos
    public double valorTotal() {
        return valorPorHora * horas;
    }
    
    //getts e setts
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }
}