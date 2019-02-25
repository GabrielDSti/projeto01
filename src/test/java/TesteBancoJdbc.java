import DAO.UserPizzariaDAO;

import model.DaoCliente;
import org.junit.Test;

public class TesteBancoJdbc {

    @Test
    public void initBanco(){
        UserPizzariaDAO dao = new UserPizzariaDAO(); /**instanceia o dao para poder accessar o metodo salvar**/
        DaoCliente cliente = new DaoCliente(); /**instanceia cliente para pegar os dados**/
        dao.salvar(cliente); /**passa cliente como parametro no ometodo salvar pois ele exige um parametro do tipo DaoCliente**/
    }
}
