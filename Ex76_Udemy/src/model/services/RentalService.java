package model.services;

import java.time.Duration;
import model.entities.AluguelDeCarro;
import model.entities.Fatura;

/**
 *
 * @author kakah
 */
public class RentalService {
    
    private Double precoPorHora;
    private Double precoPorDia;
    
    private BrazilTaxService taxService;

    public RentalService() {
    }

    public RentalService(Double precoPorHora, Double precoPorDia, BrazilTaxService taxService) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.taxService = taxService;
    }
    
    public void processarFatura(AluguelDeCarro aluguelDeCarro) {
        
        double minutos = Duration.between(aluguelDeCarro.getStart(), aluguelDeCarro.getFinish()).toMinutes();
        double horas = minutos / 60.0;
        
        double pagamentoBasico;
        if (horas <= 12.0) {
            pagamentoBasico = precoPorHora * Math.ceil(horas);
        } else {
            pagamentoBasico = precoPorDia * Math.ceil(horas / 24.0);
        }
        
        double imposto = taxService.imposto(pagamentoBasico);
        
        aluguelDeCarro.setFatura(new Fatura(pagamentoBasico, imposto));
    }
}