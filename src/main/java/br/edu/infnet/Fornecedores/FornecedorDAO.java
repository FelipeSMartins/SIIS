package br.edu.infnet.Fornecedores;

import br.edu.infnet.FabricaConexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FornecedorDAO {

    public void inserir(Fornecedor f) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO fornecedores (idFornecedor, nomeFantasia, razaoSocial) VALUES (?,?,?)");
            stmt.setInt(1, f.getIdFornecedor());
            stmt.setString(2, f.getNomeFantasia());
            stmt.setString(3, f.getRazaoSocial());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
}
