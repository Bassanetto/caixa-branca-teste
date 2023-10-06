import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    /*5*/ public Connection conectarBD() {
        Connection conn = null;
        /*6*/    try{
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        /*7*/ } catch (Exception e) { }
        /*8*/ return conn; }
    /*1*/  public String nome="";
    /*2*/  public boolean result = false;
    /*3*/  public boolean verificarUsuario(String login, String senha) {
           String sql = "";
    /*4*/  Connection conn = conectarBD();
        // INSTRUÇÃO SQL
        sql += "select nome from usuarios ";
    /*9*/    sql += "where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "'";
    /*10*/ try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
    /*11*/ if (rs.next()) {
                result = true;
                nome = rs.getString("nome"); }
    /*12*/    } catch (Exception e) { }
    /*13*/  return result; }
    }
