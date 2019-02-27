import DAO.UserPizzariaDAO;

import model.DaoCliente;
import org.junit.Test;

import java.util.List;

public class TesteBancoJdbc {

    @Test
    public void initBanco(){
        UserPizzariaDAO dao = new UserPizzariaDAO(); /**instanceia o dao para poder accessar o metodo salvar**/
        DaoCliente cliente = new DaoCliente(); /**instanceia cliente para pegar os dados**/
        dao.cadastraClienteNoBanco(cliente); /**passa cliente como parametro no metodo cadastraClienteNoBanco
                                                pois ele exige um parametro do tipo DaoCliente**/
    }
    @Test
    public void initBuscaClientes() {/**busca TODOS os clientes cadastrados no banco**/
        UserPizzariaDAO dao = new UserPizzariaDAO();
        try {
            List<DaoCliente> clientes = dao.buscaClientesNoBanco();
            for(DaoCliente cliente :clientes){
                System.out.println(cliente);
                System.out.println("---------------------------------" +
                        "----------------------------------------------"
                        +"---------------------------------------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void initBuscaUmCliente(){
        UserPizzariaDAO dao = new UserPizzariaDAO();
        try {
            List<DaoCliente> cliente = dao.buscaUmClienteNoBanco();
            for (DaoCliente daoCliente :cliente){
                System.out.println(daoCliente);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
