package conexaoJDBC;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * colocar o nome do seu BD,seu user e senha.
 */
public class SingleConnection {
    private static String url      = "jdbc:postgresql://localhost:5432/pizzaria2";
    private static String user     = "postgres";
    private static String password = "postgres";
    private static Connection connection = null;
    /**************/
    static {
        conectar();
    }
    /**************/
    public SingleConnection() {
        conectar();
    }
    /** se conexão igual a null então conectar **/
    private static void conectar(){
        try {
                if (connection == null){
                    Class.forName("org.postgresql.Driver");
                    connection = DriverManager.getConnection(url,user,password);
                    connection.setAutoCommit(false);
                    System.out.println("Conexão estabelecida com sucesso!");
                    System.out.println("Conectado  em:"+url);
                    System.out.println("usuario:"+user.toUpperCase());
                }
        }catch (Exception e){
            System.out.println("ERRO AO ESTABELECER CONEXÃO COM:"+url);
            e.printStackTrace();
        }
    }
    /**************/
    public static  Connection getConnection(){
        return connection;
    }
}
