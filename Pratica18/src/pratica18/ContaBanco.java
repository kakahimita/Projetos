
package pratica18;


public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    
    // metodo construtor 

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
        if (this.isStatus() == false) {
            if("cc".equals(t)) {
                this.setStatus(true);
                this.setSaldo(20);
                this.setTipo(t);
                System.out.println("conta corrente cadastrada!");
                System.out.println("saldo: " + this.getSaldo());
            } else if ("cp".equals(t)) {
                this.setStatus(true);
                this.setSaldo(50);
                this.setTipo(t);
                System.out.println("conta poupança cadastrada! ");
                System.out.println("saldo: " + this.getSaldo());
            } else {
                System.out.println("opção não encontrada!");
            }
        } else {
            System.out.println("conta já está aberta! XD");
        }
    }
    
    public void fecharConta() {
        if(this.isStatus()) {
            if(this.getSaldo() > 0) {
                System.out.println("conta com saldo :/");
            } else if (this.getSaldo() < 0) {
                System.out.println("conta com debito :c");
            } else {
                System.out.println("conta fechada! >.<");
                this.setStatus(false);
            }
        } else {
            System.out.println("conta ñ cadastrada! ://");
        }
        
    }
    
    public void depositar(float b) {
        if(this.isStatus()) {
            this.setSaldo(this.getSaldo() + b);
            System.out.println("deposito realizado " + b);
            System.out.println("saldo: " + this.getSaldo());
        } else {
            System.out.println("status OFF!");
        }
    }
    
    public void sacar(float v) {
        if(this.isStatus()) {
            if(this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque realizado! " + v);
                System.out.println("saldo: " + this.getSaldo());
            }
        } else {
            System.out.println("conta ñ existente!");
        }
        
    }
    
    public void pagarMensal() {
        float f = 0;
        
        if (this.isStatus() == true) {
            if (this.getTipo() == "cc") {
                f = 15;
            } else if (this.getTipo() == "cp") {
                f = 35;
            }
            if (this.getSaldo() >= f) {
            this.setSaldo(this.getSaldo() - f);
            System.out.println("mensalidade paga! " + f);
            System.out.println("saldo: " + this.getSaldo());
            } else {
                System.out.println("saldo insuficiente!");
            }
        } else {
            System.out.println("conta ñ existente :Z");
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
