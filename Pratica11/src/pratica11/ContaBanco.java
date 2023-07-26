
package pratica11;


public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public void consultarConta() {
        System.out.println("numConta: " + this.getNumConta());
        System.out.println("tipo: " + this.getTipo());
        System.out.println("dono: " + this.getDono());
        System.out.println("saldo: " + this.getSaldo());
        System.out.println("status: " +  this.isStatus());
        
    }
    
    public void abrirConta(String t) {
        this.setStatus(true);
        if ("cp".equals(t)) {
            this.setSaldo(30);
            this.setTipo(t);
            System.out.println("conta poupança cadastrada! VALOR: " + this.getSaldo());
        } else if ("cc".equals(t)) {
            this.setSaldo(50);
            this.setTipo(t);
            System.out.println("conta corrente cadastrada! VALOR: " + this.getSaldo());
        } else {
            System.out.println("opção ñ encontrada!");
            this.setStatus(false);
        }
        
    }
    
    public void fecharConta() {
        if (this.isStatus()) {
            if (this.getSaldo() > 0) {
                System.out.println("conta con saldo! TOTAL: " + this.getSaldo());
            } else if (this.getSaldo() < 0) {
                System.out.println("conta com divida! TOTAL: " + this.getSaldo());
            } else {
                this.setStatus(false);
                System.out.println("conta fechada com sucesso!");
            }
        } else {
            System.out.println("status: OFF");
        }
        
    }
    
    public void depositar(float f) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + f);
            System.out.println("deposito de: " + f + " com sucesso!");
        } else {
            System.out.println("STATUS> offf");
        }
        
    }
    
    public void sacar(float v) {
        if (this.isStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque realizado! SALDO: " + this.getSaldo());
            } else {
                System.out.println("valor insuficiente!");
            }
        } else {
            System.out.println("conta: OFF");
        }
        
    }
    
    public void pagarMensal() {
        float v = 0;
        
        if (this.isStatus()) {
            if ("cp".equals(this.getTipo())) {
                v = 15;
            } else if ("cp".equals(this.getTipo())) {
                v = 20;
            }
            
            this.setSaldo(this.getSaldo() - v);
            System.out.println("pagamento realizado! " + v + " TIPO: " + this.getTipo());
            System.out.println("TOTAL: " + this.getSaldo());
            
        } else {
            System.out.println("status oFF");
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
