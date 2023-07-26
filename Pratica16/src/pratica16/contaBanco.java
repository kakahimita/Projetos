
package pratica16;


public class contaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

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
        if ("cp".equals(t)) {
            this.setTipo(t);
            this.setStatus(true);
            this.setSaldo(50);
            System.out.println("conta poupança cadastrada!");
            System.out.println("saldo: " + this.getSaldo());
        } else if ("cc".equals(t)) {
            this.setTipo(t);
            this.setStatus(true);
            this.setSaldo(30);
            System.out.println("conta corrente cadastrada!");
            System.out.println("saldo: " + this.getSaldo());
        } else {
            System.out.println("opção não encontrada!");
        }
        
    }
    
    public void fecharConta() {
        if(this.isStatus()) {
            if(this.getSaldo() > 0) {
                System.out.println("conta com saldo! :/");
            } else if (this.getSaldo() < 0) {
                System.out.println("conta com divida :(");
            } else {
                this.setStatus(false);
                System.out.println("conta fechada com sucesso!");
            }
        } else {
            System.out.println("sua conta está OFF! :(");
        }
        
    }
    
    public void depositar(float r) {
        if(this.isStatus()) {
            this.setSaldo(this.getSaldo() + r);
            System.out.println("deposito de " + r + " realizado!");
            System.out.println("saldo: " + this.getSaldo());
        } else {
            System.out.println("conta OFF! :/");
        }
        
    }
    
    public void sacar(float v) {
        if (this.isStatus()) {
            if(this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque realizado de " + v);
                System.out.println("saldo: " + this.getSaldo());
            } else {
                System.out.println("saldo insuficiente!");
            }
        } else {
            System.out.println("conta não cadastrada!");
        }
        
    }
    
    public void pagarMensal() {
        float v = 0;
        
        if(this.isStatus()) {
            if(this.getTipo() == "cc") {
                v = 15;
            } else if(this.getTipo() == "cp") {
                v = 20;
            }
            
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("pagamento realiza com com sucesso! :D");
                System.out.println("saldo: " + this.getSaldo());
            } else {
                System.out.println("saldo insuficiente! :'/");
            }
            
        } else {
            System.out.println("status conta OFF! :'/");
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
