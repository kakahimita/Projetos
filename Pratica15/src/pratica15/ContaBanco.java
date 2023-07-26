
package pratica15;


public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    
    public void consultarConta() {
        System.out.println("numConta: " + this.getNumConta());
        System.out.println("tipo: " + this.getTipo());
        System.out.println("dono: " + this.getDono());
        System.out.println("saldo: " + this.getSaldo());
        System.out.println("status: " + this.isStatus());
    }

    public void abrirConta(String t) {
        if ("cp".equals(t)) {
            this.setStatus(true);
            this.setTipo(t);
            this.setSaldo(50);
            System.out.println("conta poupança cadastrada!");
            System.out.println("saldo: " + this.getSaldo());
        } else if ("cc".equals(t)) {
            this.setStatus(true);
            this.setTipo(t);
            this.setSaldo(30);
            System.out.println("conta corrente cadastrada!");
            System.out.println("saldo: " + this.getSaldo());
        } else {
            System.out.println("opções não encontrada!");
        }
        
    }
    
    public void fecharConta() {
        if (this.isStatus()) {
            if (this.getSaldo() > 0) {
                System.out.println("conta com saldo!");
            } else if (this.getSaldo() < 0) {
                System.out.println("conta com debito!");
            } else {
                System.out.println("conta fechada com sucesso!");
                this.setStatus(false);
            }
        } else {
            System.out.println("conta não cadastrada!");
        }
    }
    
    public void depositar(float t) {
        if(this.isStatus()) {
            this.setSaldo(this.getSaldo() + t);
            System.out.println("deposito de " + t + " realizado!");
            System.out.println("saldo: " + this.getSaldo());
        } else {
            System.out.println("conta OFF!");
        }
        
    }
    
    public void sacar(float v) {
        if(this.isStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque realizado: " + v + " :D");
                System.out.println("saldo: " + this.getSaldo());
            } else {
                System.out.println("saldo insuficiente! :(");
            }
        } else {
            System.out.println("conta OFF!");
        }
        
    }
    
    public void pagarMensal() {
        float v = 0;
        
        if (this.isStatus()) {
            if (this.getTipo() == "cp") {
                v = 20;
            } else if (this.getTipo() == "cc") {
                v = 15;
            }
            
            if (this.getSaldo() >= v) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("mensalidade paga!");
            System.out.println("saldo: " + this.getSaldo());
            } else {
                System.out.println("saldo insuficiente!");
            }
        } else {
            System.out.println("conta status OFF!");
        }
        
    }
    
    
    // construtor

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
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
