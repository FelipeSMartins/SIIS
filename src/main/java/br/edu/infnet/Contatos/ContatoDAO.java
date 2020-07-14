package br.edu.infnet.Contatos;

import br.edu.infnet.FabricaConexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContatoDAO {

    public void inserir(Contato c) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO contatos (idContato, nomeContato, emailContato, telefoneContato) VALUES (?,?,?,?)");
            stmt.setInt(1, c.getIdContato());
            stmt.setString(2, c.getNomeContato());
            stmt.setString(3, c.getEmailContato());
            stmt.setString(4, c.getTelefoneContato());
            stmt.executeUpdate();

            System.out.println("Inserido no banco com sucesso. " + c.getNomeContato());

        } catch (SQLException ex) {
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
}
