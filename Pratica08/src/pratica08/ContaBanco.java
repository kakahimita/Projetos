
package pratica08;


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
    
    public void consultarConta() {
        System.out.println("conta: " + this.getNumConta());
        System.out.println("tipo: " + this.getTipo());
        System.out.println("dono: " + this.getDono());
        System.out.println("saldo: " + this.getSaldo());
        System.out.println("status: " + this.status);
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        } else {
            System.out.println("opcao não encontrada!");
        } 
        System.out.println("conta cadastrada com sucesso!");
        
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("não é possivel fechar, ainda possui dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("não é possivel fechar, conta em debito");
        } else {
            this.setStatus(false);
            System.out.println("conta fechada com sucesso!");
        }
        
    }
    
    public void depositar(float v) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("deposito realizado com suceso" + this.getDono());
        } else {
            System.out.println("impossivel depositar em uma conta fechada");
        }
        
    }
    
    public void sacar(float v) {
        if (this.isStatus()) {
            if (this.getSaldo() >= v) {
                System.out.println("saque realizado com suceso!");
            } else {
                System.out.println("saldo insuficiente!");
            }
        } else {
            System.out.println("impossivel sacar em uma conta fechada");
        }
        
    }
    
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("mensalidade paga com sucesso!");
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
