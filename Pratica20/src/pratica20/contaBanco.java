
package pratica20;


public class contaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    // construtor

    public contaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    // metodo consulta
    
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
                System.out.println("conta poupança cadastrada!");
                System.out.println("saldo: " + this.getSaldo());
            } else {
                System.out.println("opção ñ encontrada :/");
            }
        } else {
            System.out.println("conta já está cadastrada O.o");
        }
        
    }
    
    public void fecharConta() {
        if(this.isStatus()) {
            if(this.getSaldo() > 0) {
                System.out.println("conta com saldo o_o");
            } else if(this.getSaldo() < 0) {
                System.out.println("conta em debito >_<'");
            } else {
                System.out.println("sua conta foi Fechado x_x");
                this.setStatus(false);
            }
        } else {
            System.out.println("você ainda não fez o cadastrado! :X");
        }
        
    }
    
    public void depositar(float d) {
        if(this.isStatus()) {
            this.setSaldo(this.getSaldo() + d);
            System.out.println("deposito realizado!");
            System.out.println("saldo: " + this.getSaldo());
        } else {
            System.out.println("status OFF! >.<");
        }
        
    }
    
    public void sacar(float s) {
        if(this.isStatus()) {
            if(this.getSaldo() >= s) {
                this.setSaldo(this.getSaldo() - s);
                System.out.println("saque realizado! *-*");
                System.out.println("saldo: " + this.getSaldo());
            } else {
                System.out.println("saldo insuficiente! x_x");
            }
        } else {
            System.out.println("cadastre uma conta!");
        }
        
    }
    
    public void pagarMensal() {
        int v = 0;
        
        if(this.isStatus()) {
            
            if(this.getTipo() == "cc") {
                v = 15;
            } else if(this.getTipo() == "cp") {
                v = 30;
            }
            
            if(this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("pagamento realizado! :D");
                System.out.println("saldo: " + this.getSaldo());
            } else { 
                System.out.println("saldo insuficiente! :(");
            }
            
        } else {
            System.out.println("conta não cadastrada! >.<");
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
