package entidades;

import java.util.Date;

/**
 *
 * @author kakah
 */
public class HorasContratos {

    private Date data;
    private Double valorPorHora;
    private Integer horas;

    public HorasContratos() {
    }

    public HorasContratos(Date data, Double valorPorHora, Integer horas) {
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }
    
    //metodo
    public double valorTotal() {
        return valorPorHora * horas;
    }
    
    //getters e setters
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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