package Dao;

import Pacotes.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoginDao {
    
    PreparedStatement pst;
    Connection conn;
    ResultSet rs;
    
    public boolean conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/unidentes", "root", "2270");
            return true;
        }catch(ClassNotFoundException | SQLException ex){
            return false;
        }
    }
    
    public Login verificarUsuario(Login login){
       Login resultado = new Login();
       try{
            pst = conn.prepareStatement("SELECT nome, senha, cargo FROM funcionario WHERE usuario=? and Senha=?;");
            pst.setString(1, login.getUsuario());
            pst.setString(2, login.getSenha());
            rs = pst.executeQuery();
            if(rs.next());
                resultado.setUsuario(rs.getString("Nome"));
                resultado.setSenha(rs.getString("Senha"));
                resultado.setCargo(rs.getString("Cargo"));
                return resultado;           
       }catch(SQLException ex){
           System.err.println(ex.getMessage());
           return null;
       }
    }
    
}
