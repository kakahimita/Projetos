
package pratica09;


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
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("status: " + this.isStatus());
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        if ("CP".equals(t)) {
            this.setStatus(true);
            this.setSaldo(30);
            System.out.println("conta poupança cadastrada!");
        } else if ("CC".equals(t)) {
            this.setStatus(true);
            this.setSaldo(50);
            System.out.println("conta corrente cadastrada!");
        } else {
            System.out.println("opção não encontrada!");
        }
    }
    
    public void fecharConta() {
        if (this.isStatus()) {
            if (this.getSaldo() > 0) {
                System.out.println("conta com saldo!");
            } else if (this.getSaldo() < 0) {
                System.out.println("conta com dividas!");
            } else {
                System.out.println("conta fechada com sucesso!");
                this.setStatus(false);
            }
        } else {
            System.out.println("conta não encontrada!");
        }
    }
    
    public void depositar(float v) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("depsito realizado! TOTAL: " + this.getSaldo());
        } else {
            System.out.println("conta não cadastrada!");
        }
        
    }
    
    public void sacar(float f) {
        if ( this.isStatus()) {
            if (this.getSaldo() >= f) {
                this.setSaldo(this.getSaldo() - f);
                System.out.println("saque realizado! TOTAL: " + this.getSaldo());
            } else {
                System.out.println("saldo insucifiente!");
            }
        } else {
            System.out.println("conta com status: OFF");
        }
        
    }
    
    public void pagarMensal() {
        int v = 0;
        if (this.isStatus()) {
            if ("CC".equals(this.getTipo())) {
                v = 10;
            } else if ("CP".equals(this.getTipo())) {
                v = 20;
            }
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Pagamento realizado com sucesso!");
            
        } else {
            System.out.println("conta não cadastrada!");
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
