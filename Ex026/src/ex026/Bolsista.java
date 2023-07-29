
package ex026;


public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    
    // sobreposição do metodo pagarMensalidade do Aluno
    // que foi sobreposto para o metodo do bolsista
    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado");
    }
    
    //getters e setters
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
