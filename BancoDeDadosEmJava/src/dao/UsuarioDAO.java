package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;
import view.FormCadastroView;

/**
 *
 * @author kakah
 */
public class UsuarioDAO {
    
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Usuario usuario) throws SQLException {
            
            String sql = "insert into usuario(usuario,senha) values('"+ usuario.getUsuario() +"','"+ usuario.getSenha() +"');";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            connection.close();
    }

}