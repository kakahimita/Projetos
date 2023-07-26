
package pratica19;


public class contaBanco {
    
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
    
    // metodos 
    
    public void abrirConta(String t) {
        if(this.isStatus() == false) {
            if("cc".equals(t)) {
                this.setTipo(t);
                this.setSaldo(15);
                this.setStatus(true);
                System.out.println("conta corrente cadastrada!");
                System.out.println("saldo: " + this.getSaldo());
            } else if ("cp".equals(t)) {
                this.setTipo(t);
                this.setSaldo(30);
                this.setStatus(true);
                System.out.println("conta poupança cadastrado!");
                System.out.println("saldo: " + this.getSaldo());
            } else {
                System.out.println("opção não encontrada :/");
            }
        } else {
            System.out.println("a conta já está cadastrada XD");
        }
        
    }
    
    public void fecharConta() {
        if(this.isStatus()) {
            if(this.getSaldo() > 0) {
                System.out.println("conta com saldo! :/");
            } else if (this.getSaldo() < 0) {
                System.out.println("conta com debito! :/");
            } else {
                this.setStatus(false);
                System.out.println("conta fechada! :/");
            }
        } else {
            System.out.println("a conta ñ existe xD");
        }
        
    }
    
    public void depositar(float t) {
        if(this.isStatus()) {
            this.setSaldo(this.getSaldo() + t);
            System.out.println("deposito realizado!");
            System.out.println("saldo: " + this.getSaldo());
        } else {
            System.out.println("conta OFF! >.<");
        }
        
    }
    
    public void sacar(float x) {
        if(this.isStatus()){
            if(this.getSaldo() >= x) {
                this.setSaldo(this.getSaldo() - x);
                System.out.println("saque realizado! :D");
                System.out.println("saldo: " + this.getSaldo());
            } else {
                System.out.println("saldo insuficiente! >.<");
            }
        } else {
            System.out.println("conta não cadastrada XD");
        }
        
    }
    
    public void pagarMensal() {
        float v = 0;
        
        if(this.isStatus()) {
            if(this.getTipo() == "cc") {
                v = 10;
            } else if (this.getTipo() == "cp") {
                v = 15;
            }
            
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("pagamento realizado: " + v);
                System.out.println("saldo: " + this.getSaldo());
            } else {
                System.out.println("saldo insuficiente! ://");
            }
        } else {
            System.out.println("conta não cadastrada! >.<");
        }
        
    }
    
    
    public contaBanco() {
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
