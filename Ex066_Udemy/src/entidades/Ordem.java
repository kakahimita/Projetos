package entidades;

import entidades.enums.OrdemStatus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author kakah
 */
public class Ordem {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    private Date momento;
    private OrdemStatus status;
    private Cliente cliente;
    
    private List<OrdemItens> ordemItens = new ArrayList<OrdemItens>();
    
    //construtor
    public Ordem() {
    }

    public Ordem(Date momento, OrdemStatus status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    //metodos
    public void adicionarItem(OrdemItens ordemIten){
        ordemItens.add(ordemIten);
    }
    
    public void removerItem(OrdemItens ordemIten){
        ordemItens.remove(ordemIten);
    }
    
    public double total(){
        double soma = 0.0;
        for(OrdemItens it : ordemItens) {
            soma += it.subTotal();
        }
        return soma;
    }
    
    //toString -> por ser um toString mt grande, utilizamos o StringBuilder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: ");
        sb.append(sdf.format(momento) + "\n");
        sb.append("Status do pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Ordem do produto:\n");
        for(OrdemItens itens : ordemItens) {
            sb.append(itens + "\n");
        }
        sb.append("Valor Total: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
    
    //getters e setters
    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public OrdemStatus getStatus() {
        return status;
    }

    public void setStatus(OrdemStatus status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}