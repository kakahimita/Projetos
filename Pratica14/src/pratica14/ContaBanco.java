
package pratica14;


public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // construtor
    
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    // metodos
    
    public void consultarConta() {
        System.out.println("numConta: " + this.getNumConta());
        System.out.println("tipo: " + this.getTipo());
        System.out.println("dono: " + this.getDono());
        System.out.println("saldo: " + this.getSaldo());
        System.out.println("status: " + this.isStatus());
    }
    
    public void abrirConta(String t) {
        if ("cp".equals(t)) {
            this.setTipo(t);
            this.setSaldo(50);
            this.setStatus(true);
            System.out.println("conta poupança cadastrada!");
        } else if ("cc".equals(t)) {
            this.setTipo(t);
            this.setSaldo(30);
            this.setStatus(true);
            System.out.println("conta corrente cadastrada!");
        } else {
            System.out.println("opção nao encontrada!");
        }
        
    }
    
    public void fecharConta() {
        if (this.isStatus()) {
            if (this.getSaldo() > 0) {
                System.out.println("conta com credito!");
            } else if (this.getSaldo() < 0) {
                System.out.println("conta com debito!");
            } else {
                this.setStatus(false);
                System.out.println("conta fechada com sucesso!");
                System.out.println("status: " + this.isStatus());
            }
        }
        
    }
    
    public void depositar(float c) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + c);
            System.out.println("deposito: " + c);
            System.out.println("TOTAL: " + this.getSaldo());
        } else {
            System.out.println("conta OFF!");
        }
        
    }
    
    public void sacar(float v) {
        if (this.isStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque de " + v + " realizado!");
                System.out.println("VALOR: " + this.getSaldo());
            } else {
                System.out.println("saldo insuficiente!");
            }
        } else {
            System.out.println("status: OFFline");
        }
        
    }
    
    public void pagarMensal() {
        float x = 0;
        
        if (this.isStatus()) {
            if (this.getTipo() == "cp") {
                x = 15;
            } else if (this.getTipo() == "cc") {
                x = 20;
            }
            
            this.setSaldo(this.getSaldo() - x);
            System.out.println("mensalidade paga! " + x);
            System.out.println("total: " + this.getSaldo());
            
        } else {
            System.out.println("conta ñ cadastrada!");
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
