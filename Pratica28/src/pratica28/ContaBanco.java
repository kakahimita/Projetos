
package pratica28;


public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //metodo construtor

    public ContaBanco() {
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
    
    
    //metodos especiais
    public void abrirConta(String t) {
        if("cp".equals(t) && !(this.isStatus())) {
            this.setTipo(t);
            this.setSaldo(30);
            this.setStatus(true);
            System.out.println("conta poupança cadastrada com sucesso!");
            System.out.println("saldo: " + this.getSaldo());
        } else if ("cc".equals(t) && !(this.isStatus())) {
            this.setTipo(t);
            this.setSaldo(15);
            this.setStatus(true);
            System.out.println("conta corrente cadastrada!");
            System.out.println("saldo: " + this.getSaldo());
        } else {
            System.out.println("opção não encontrada :/ ");
        }
    }
    
    public void fecharConta() {
        if(this.isStatus()) {
            if(this.getSaldo() > 0) {
                System.out.println("solicitação invalida");
                System.out.println("conta com credito!");
            } else if (this.getSaldo() < 0) {
                System.out.println("solicitação invalida");
                System.out.println("conta com debito!");
            } else {
                System.out.println("solicitação ativada");
                System.out.println("conta OFF");
                this.setStatus(false);
            }
        }
    }
    
    public void depositar(float d) {
        if(this.isStatus()) {
            this.setSaldo(this.getSaldo() + d);
            System.out.println("depoisito de " + d + " realizado!");
            System.out.println("saldo: " + this.getSaldo());
        } else {
            System.out.println("status: OFF");
        }
    }
    
    public void sacar(float v) {
        if(this.isStatus()) {
            if(this.getSaldo() > 0 && this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque realizado de " + v);
                System.out.println("saldo: " + this.getSaldo());
            } else {
                System.out.println("tentativa de saque no valor de " + v);
                System.out.println("saldo insuficiente");
            }
        } else {
            System.out.println("status: OFF");
        }
        
    }
    
    public void pagarMensal() {
        if(this.isStatus()) {
            if("cc".equals(this.getTipo())) {
                this.setSaldo(this.getSaldo() - 15);
                System.out.println("Mensalidade Paga com sucesso!");
                System.out.println("valor de 15");
                System.out.println("saldo: " + this.getSaldo());
            } else if ("cp".equals(this.getTipo())) {
                this.setSaldo(this.getSaldo() - 25);
                System.out.println("Mensalidade Paga com sucesso!");
                System.out.println("valor de 25");
                System.out.println("saldo: " + this.getSaldo());
            }
        } else {
            System.out.println("status: OFF");
        }
    }
    
    //gets e sets
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
