package Controller;

import Controller.Helper.LoginHelper;
import Model.Usuario;
import View.Login;

/**
 *
 * @author kakah
 */
public class LoginController {
    
    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema() {
        
        // Pegar um usuario da view
        Usuario usuario = helper.obterModelo();
        
        //Pesquisar Usuario no Banco
        //se o usuario da view tiver mesmo usuario e senha
        //que o mesmo usuario vindo do banco
        //direcionar para meu principal
        
        // senão mostrar uma mensagem ao usuario "Usuario ou senha invalidos"
    }

    public void fizTarefa() {
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei ou fiz tarefa");
    }
    
}