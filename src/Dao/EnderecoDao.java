package Dao;

import Pacotes.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EnderecoDao {
    
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    
    public boolean conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/unidentes", "root", "2270");
            return true;
        }catch(SQLException | ClassNotFoundException ex){
            return false;
        }
    }
    
    public int adicionarEndereco(Endereco endereco){
        try{
            pst = conn.prepareStatement("INSERT INTO endereco(Rua, Numero, Complemento, Bairro, Cidade, CEP, Estado) VALUES(?, ?, ?, ?, ?, ?, ?);");
            pst.setString(1, endereco.getRua());
            pst.setInt(2, endereco.getNumero());
            pst.setString(3, endereco.getComplemento());
            pst.setString(4, endereco.getBairro());
            pst.setString(5, endereco.getCidade());
            pst.setString(6, endereco.getCep());
            pst.setString(7, endereco.getEstado());
            int resultado = pst.executeUpdate();
            if(resultado == 1){
                pst = conn.prepareStatement("select max(idEndereco) FROM endereco;");
                rs = pst.executeQuery();
                if(rs.next());
                    resultado = rs.getInt("max(idEndereco)");
                    return resultado;
            }else{
                return -1;
            }
    }catch(SQLException ex){
            return -1;
        }
    }
    
    public Endereco buscar(int id){
        Endereco endereco = new Endereco();
        try{
            pst = conn.prepareStatement("SELECT * FROM endereco WHERE idEndereco=?;");
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if(rs.next());
                endereco.setRua(rs.getString("Rua"));
                endereco.setNumero(rs.getInt("Numero"));
                endereco.setComplemento(rs.getString("Complemento"));
                endereco.setBairro(rs.getString("Bairro"));
                endereco.setCidade(rs.getString("Cidade"));
                endereco.setCep(rs.getString("CEP"));
                endereco.setEstado(rs.getString("Estado"));
                return endereco;
        }catch(SQLException ex){
            return null;
        }
    }
    
    public String buscarRua(int id){
        String endereco;
        try{
            pst = conn.prepareStatement("SELECT Rua FROM endereco WHERE idEndereco=?;");
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if(rs.next());
                if(rs.getString("Rua").equalsIgnoreCase("null")){
                    endereco = "Não Informado";
                }else{
                    endereco = rs.getString("Rua");
                }
            return endereco;
        }catch(SQLException ex){
            return null;
        }
    }
    
    public int alterar(Endereco endereco){
        try{
            pst = conn.prepareStatement("UPDATE endereco SET Rua=?, Numero=?, Complemento=?, Bairro=?, Cidade=?, CEP=?, Estado=? WHERE idEndereco=?");
            pst.setString(1, endereco.getRua());
            pst.setInt(2, endereco.getNumero());
            pst.setString(3, endereco.getComplemento());
            pst.setString(4, endereco.getBairro());
            pst.setString(5, endereco.getCidade());
            pst.setString(6, endereco.getCep());
            pst.setString(7, endereco.getEstado());
            pst.setInt(8, endereco.getIdEndereco());
            return pst.executeUpdate();
        }catch(SQLException ex){
            return -1;
        }
    }
     
    public int apagar(int idEndereco){
        System.err.println(idEndereco);
        try{
            pst = conn.prepareStatement("DELETE FROM endereco WHERE idEndereco=?;");           
            pst.setInt(1, idEndereco);
            System.out.println(pst);
            return pst.executeUpdate();
        }catch(SQLException ex){
            return ex.getErrorCode();
        }
    }
    
    public void desconectar(){
        try{
            pst.close();
            conn.close();
        }catch(SQLException ex){
        }
    }
    
}
