package model.dao;

import conection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Users;

public class UsuarioDAO {
// aqui é onde ficará o CRUD até o momento apenas dos usuários na rede

    public void create(Users usuario) {

        // Metodo de criação dos usuários
        Connection con = ConnectionFactory.getConnection();   // abrindo conexão
        PreparedStatement stmt = null;

        try { //sempre usar o try catch nesse momento pra evitar que o programa trave

            // configurando o stmt para adicionar no BD
            stmt = con.prepareStatement("INSERT INTO users(nome,username,senha)VALUES(?,?,?)");
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getUsername());
            stmt.setString(3, usuario.getSenha());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuario criado com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Não foi possível criar novo usuario!" + ex);

        } finally {

            ConnectionFactory.closeConnection(con, stmt); // fechando conexão. nunca esqueça.
        }

    }

    public boolean checkLogin(String login, String senha) {

        Connection con = ConnectionFactory.getConnection();   // abrindo conexão
        PreparedStatement stmt = null;
        ResultSet result = null;
        boolean check = false;

        try {
            stmt = con.prepareStatement("SELECT * FROM users WHERE username = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            result = stmt.executeQuery();

            if (result.next()) {
                check = true;
            }

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Usuário não encontrado" + ex);
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            ConnectionFactory.closeConnection(con, stmt, result);
        }
        return check;
    }

}
