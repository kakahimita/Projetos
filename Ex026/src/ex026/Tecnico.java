
package ex026;


public class Tecnico extends Aluno {
    
    private String registroProfissional;
    
    // metodo especial
    public void praticar() {
        System.out.println("estou praticando :X " + this.getNome());
    }
    
    //getters e setters
    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
