package DAO;

import conexaoJDBC.SingleConnection;
import model.DaoCliente;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserPizzariaDAO {

    private Connection connection;

    public UserPizzariaDAO() {
        connection = SingleConnection.getConnection();
    }
    public void salvar  (DaoCliente d){
        try {
            String sql = "insert into cliente (nome,telefone,rua,setor,quadra,lote,referencia) values(?,?,?,?,?,?,?)";
            PreparedStatement insert = connection.prepareStatement(sql);
            insert.setString(1,d.getNomeCliente());
            insert.setString(2,d.getTelefone());
            insert.setString(3,d.getRua());
            insert.setString(4,d.getSetor());
            insert.setInt(5,d.getQuadra());
            insert.setInt(6,d.getLote());
            insert.setString(7,d.getReferencia());
            insert.execute();
            connection.commit(); /** salva os dados no banco**/
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
