package entidades;

import entidades.enums.NivelTrabalhador;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author kakah
 */
public class Trabalhador {
    
    private String nome;
    private NivelTrabalhador level;
    private Double salarioBase;
    
    private Departamento departamento;
    private List<HorasContratos> contratos = new ArrayList<>();
    
    //construtor
    public Trabalhador() {
    }

    public Trabalhador(String nome, NivelTrabalhador level, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.level = level;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }
    
    //metodos
    public void adicionarContrato(HorasContratos contrato) {
        contratos.add(contrato);
    }
    
    public void removerContrato(HorasContratos contrato) {
        contratos.remove(contrato);
    }
    
    public double renda(int ano, int mes) {
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();
        for(HorasContratos c : contratos) {
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if(ano == c_ano && mes == c_mes) {
                soma += c.valorTotal();
            }
        }
        return soma;
    }
    
    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalhador getLevel() {
        return level;
    }

    public void setLevel(NivelTrabalhador level) {
        this.level = level;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HorasContratos> getContratos() {
        return contratos;
    }

    @Override
    public String toString() {
        return "Trabalhador{" + "nome=" + nome + ", level=" + level + ", salarioBase=" + salarioBase + ", departamento=" + departamento + ", contratos=" + contratos + '}';
    }
    
}