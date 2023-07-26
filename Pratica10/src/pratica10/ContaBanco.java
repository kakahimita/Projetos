
package pratica10;


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
    
    // metodos
    
    public void consultarConta() {
        System.out.println("numConta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    
    public void abriConta(String t) {
        this.setTipo(t);
        
        if ("CC".equals(t)) {
            this.setStatus(true);
            System.out.println("conta corrente cadastrada!");
            this.setSaldo(30);
            System.out.println("Saldo Bonus: " + this.getSaldo());
        } else if ("CP".equals(t)) {
            this.setStatus(true);
            System.out.println("conta poupança cadastrada!");
            this.setSaldo(50);
            System.out.println("Saldo Bonus: " + this.getSaldo());
        } else {
            System.out.println("opção não encontrada!");
        }
        
    }
    
    public void fecharConta() {
        if (this.isStatus()) {
            if(this.getSaldo() > 0) {
                System.out.println("conta com saldo!");
            } else if(this.getSaldo() < 0) {
                System.out.println("conta em debito!");
            } else {
                this.setStatus(false);
                System.out.println("conta fechada com sucesso!");
            }
        } else {
            System.out.println("conta não cadastrada!");
        }
        
    }
    
    public void depositar(float f) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + f);
            System.out.println("deposito realizado com sucesso!");
            System.out.println("Saldo: " + this.getSaldo());
        } else {
            System.out.println("conta ñ cadastrada!!!!");
        }
        
    }
    
    public void sacar(float v) {
        if (this.isStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque realizado! valor: " + v);
                System.out.println("conta Banco: " + this.getSaldo());
            } else {
                System.out.println("saldo insuficiente!");
            }
        } else {
            System.out.println("a conta ainda não foi aberta!");
        }
        
    }
    
    public void pagarMensal() {
        int v = 0;
        
        if (this.isStatus()) {
            if ("CC".equals(this.getTipo())) {
                v = 15;
                this.setSaldo(this.getSaldo() - v);
                System.out.println("pagamento realizado TOTAL: " + this.getSaldo());
            } else if ("CP".equals(this.getTipo())) {
                v = 20;
                this.setSaldo(this.getSaldo() - v);
                System.out.println("pagamento realizado TOTAL: " + this.getSaldo());
            }
            
            
        } else {
            System.out.println("status off!");
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
