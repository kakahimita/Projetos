
package pratica12;


public class ContaBanco {
    
    public int numConta;
    public String tipo;
    public String dono;
    public float saldo;
    public boolean status;

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public void consultar() {
        System.out.println("numConta: " + this.getNumConta());
        System.out.println("tipo: " + this.getTipo());
        System.out.println("dono: " + this.getDono());
        System.out.println("saldo: " + this.getSaldo());
        System.out.println("status: " + this.isStatus());
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        
        if (this.getTipo() == "cc") {
            this.setStatus(true);
            this.setSaldo(30);
            System.out.println("conta " + this.getTipo() + " cadastrada!");
            System.out.println("BONUS: " + this.getSaldo());
        } else if (this.getTipo() == "cp") {
            this.setStatus(true);
            this.setSaldo(50);
            System.out.println("conta " + this.getTipo() + " cadastrada!");
            System.out.println("BONUS: " + this.getSaldo());
        } else {
            System.out.println("opção não encontrada!");
        }
        
    }
    
    public void fecharConta() {
        if (this.isStatus()) {
            if (this.getSaldo() > 0) {
                System.out.println("a conta possui credito!");
            } else if (this.getSaldo() < 0) {
                System.out.println("conta com divida!");
            } else {
                this.setStatus(false);
                System.out.println("conta fechada!");
            }
        }
        
    }
    
    public void depositar(float r) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + r);
            System.out.println("deposito realizado!" + this.getSaldo());
        } else {
            System.out.println("conta n cadastrada!");
        }
        
    }
    
    public void sacar(float v) {
        if (this.isStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque de " + v + " total: " + this.getSaldo());
            } else {
                System.out.println("saldo insuficiente!");
            }
        } else {
            System.out.println("conta ñ cadastrada!");
        }
        
    }
    
    public void pagarMensal() {
        
        int x = 0;
        
        if (this.isStatus()) {
            if ("cc".equals(this.getTipo())) {
                x = 15;
            } else if ("cp".equals(this.getTipo())) {
                x = 20;
            }
            
            this.setSaldo(this.getSaldo() - x);
            System.out.println("mensalidade de " + x + " CONTA: " + this.getSaldo());
            
        } else {
            System.out.println("status OFF!");
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
