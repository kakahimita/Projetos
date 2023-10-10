package entites;

/**
 *
 * @author kakah
 */
public class Empregador_Terceirizado extends Empregador{
    
    private Double mudancaAdicional;

    public Empregador_Terceirizado() {
        super();
    }
    public Empregador_Terceirizado(String nome, Integer horas, Double valorPorHora, Double mudancaAdicional) {
        super(nome, horas, valorPorHora);
        this.mudancaAdicional = mudancaAdicional;
    }
    
    @Override
    public double pagamento() {
        return super.pagamento() + mudancaAdicional * 1.1;
    }

    public Double getMudancaAdicional() {
        return mudancaAdicional;
    }

    public void setMudancaAdicional(Double mudancaAdicional) {
        this.mudancaAdicional = mudancaAdicional;
    }
}