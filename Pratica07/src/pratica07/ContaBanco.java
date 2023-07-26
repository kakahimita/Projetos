
package pratica07;


public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void Construtor() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    // metodos
    
    public void estadoAtual() {
        System.out.println("numConta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("status: " + this.isStatus());
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("conta aberta com sucesso!");
        
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada, ainda tem dinheiro!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada, está em debito");
        } else {
            System.out.println("conta fechada com sucesso!");
        }
        
    }
    
    public void depositar(float v) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("deposito realizado com sucesso!");
        } else {
            System.out.println("impossivel depositar em uma conta fechada!");
        }
        
    }
    
    public void sacar(float v) {
        if (this.isStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("saldo insuficiente para saque!");
            }
        } else {
            System.out.println("impossivel sacar de uma conta fechada!");
        }
        
    }
    
    public void pagarMensal() {
        int t = 0;
        if (this.getTipo() == "CC") {
            t = 12;
        } else if (this.getTipo() == "CP") {
            t = 20;
        }
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - t);
            System.out.println("Mensalidade paga por " + this.getDono());
        } else {
            System.out.println("Impossivel pagar uma conta fechada!");
        }
        
        
    }
    
    
    
    // gets e sets
    
    public int getNumConta() {
        return numConta;
    }
    
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getDono() {
        return dono;
    }
    
    public void setDono(String dono) {
        this.dono = dono;
    }
    
    public float getSaldo() {
        return saldo;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public boolean isStatus() {
        return status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    
}
