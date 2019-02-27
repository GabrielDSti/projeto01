package DAO;

import conexaoJDBC.SingleConnection;
import model.DaoCliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserPizzariaDAO {

    private Connection connection;

    public UserPizzariaDAO() {
        connection = SingleConnection.getConnection();
    }
    public void cadastraClienteNoBanco  (DaoCliente d){
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
    public List<DaoCliente> buscaClientesNoBanco() throws Exception{
        List<DaoCliente> listaCliente = new ArrayList<DaoCliente>(); /**instancia lista**/
        String sql ="select * from cliente";    /**monta o  select**/
        PreparedStatement statement = connection.prepareStatement(sql); /**passa o sql para o preparedStatement**/
        ResultSet resultado = statement.executeQuery();
        while(resultado.next()){  /**em quanto houver proximo resultado ele itera**/
            DaoCliente cliente = new DaoCliente();
            cliente.setNomeCliente(resultado.getString("nome"));
            cliente.setTelefone(resultado.getString("telefone"));
            cliente.setRua(resultado.getString("rua"));
            cliente.setSetor(resultado.getString("setor"));
            cliente.setQuadra(resultado.getInt("quadra"));
            cliente.setLote(resultado.getInt("lote"));
            cliente.setReferencia(resultado.getString("referencia"));
            listaCliente.add(cliente);
        }
        return listaCliente;
    }
    public List<DaoCliente> buscaUmClienteNoBanco() throws Exception{
        String nome ="Gabriel Dias dos Santos";
        List<DaoCliente> listaCliente = new ArrayList<DaoCliente>(); /**instancia lista**/
        String sql ="select * from cliente c where c.nome like '"+nome+"'";    /**monta o  select**/
        PreparedStatement statement = connection.prepareStatement(sql); /**passa o sql para o preparedStatement**/
        ResultSet resultado = statement.executeQuery();
        while(resultado.next()){  /**em quanto houver proximo resultado ele itera**/
            DaoCliente cliente = new DaoCliente();
            cliente.setNomeCliente(resultado.getString("nome"));
            cliente.setTelefone(resultado.getString("telefone"));
            cliente.setRua(resultado.getString("rua"));
            cliente.setSetor(resultado.getString("setor"));
            cliente.setQuadra(resultado.getInt("quadra"));
            cliente.setLote(resultado.getInt("lote"));
            cliente.setReferencia(resultado.getString("referencia"));
            listaCliente.add(cliente);
        }
        return listaCliente;
    }

}
