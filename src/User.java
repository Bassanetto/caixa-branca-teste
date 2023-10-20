import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
    Este bloco importa as classes necessárias para interagir com um banco de dados MySQL, como Connection, DriverManager, ResultSet, e Statement.
 */

public class User {
    /**
     Começa a definição da classe User.
     **/
    public Connection conectarBD() {
        Connection conn = null;
        try{
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        }catch (Exception e) { }
        return conn; }

    /**
     Este método é usado para estabelecer uma conexão com o banco de dados MySQL.
     Ele tenta carregar o driver do MySQL e, em seguida, cria uma conexão com o banco de dados usando as informações de URL, nome de usuário e senha.
     **/

    public String nome="";

    // nome é uma variável que irá armazenar o nome do usuário encontrado no banco de dados.
    public boolean result = false;

    // result é uma variável booleana que será definida como true se o usuário for encontrado e false caso contrário.

    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();
        // INSTRUÇÃO SQL
        sql += "select nome from usuarios ";
        sql += "where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "'";
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome"); }
        } catch (Exception e) { }
        return result; }
    }

    /**
     Este método verifica se um usuário com um determinado login e senha existe no banco de dados.
     Ele cria uma instrução SQL para fazer essa verificação, usando os valores passados como parâmetros.
     Em seguida, ele executa a instrução SQL no banco de dados e verifica se há resultados.
     Se um usuário com o login e senha fornecidos for encontrado, ele define result como true e armazena o nome do usuário na variável nome.
     O método retorna o valor de result, indicando se o usuário foi encontrado ou não.
    **/
