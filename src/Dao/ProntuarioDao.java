package Dao;

import Pacotes.Protuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProntuarioDao {
    
    Connection conn;
    PreparedStatement pst;
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
    
    public boolean salvarPaciente(String cpf, String nome, String contato, double valor){
        try{
            pst = conn.prepareStatement("INSERT INTO prontuario(cpf, nome, contato, valor) VALUES(?,?,?,?);");
            pst.setString(1, cpf);
            pst.setString(2, nome);
            pst.setString(3, contato);
            pst.setDouble(4, valor);
            return pst.executeUpdate() == 1;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean salvar(Protuario prontuario){
        try{
            pst = conn.prepareStatement("INSERT INTO prontuariolist(cpf, Dente, Procedimento, Valor) VALUES(?,?,?,?)");
            pst.setString(1, prontuario.getCpf());
            pst.setString(2, prontuario.getDente());
            pst.setString(3, prontuario.getProcedimento());
            pst.setDouble(4, prontuario.getValor());
            return pst.executeUpdate() == 1;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean alterarValor(double valor, String cpf){
        try{
            pst = conn.prepareStatement("UPDATE prontuario SET valor=? WHERE cpf=?");
            pst.setDouble(1, valor);
            pst.setString(2, cpf);
            return pst.executeUpdate() == 1;
        }catch(SQLException ex){
            return false;
        }
    }
    
    public Protuario buscarDadosPessoal(String cpf){
        Protuario prontuario = new Protuario();
        
        try{
            pst = conn.prepareStatement("SELECT cpf, nome, contato, valor FROM prontuario WHERE cpf=?;");
            pst.setString(1, cpf);
            rs = pst.executeQuery();
            if(rs.next());
                prontuario.setCpf(rs.getString("cpf"));
                prontuario.setNome(rs.getString("nome"));
                prontuario.setContato(rs.getString("contato"));
                prontuario.setValor(rs.getDouble("valor"));
            return prontuario;
        }catch(SQLException ex){
            return null;
        }
    }
    
    public ArrayList<Protuario> buscar(String nome){
        ArrayList<Protuario> valor = new ArrayList<>();
        Protuario prontuario;
        
        try{
            pst = conn.prepareStatement("SELECT cpf, nome, contato, valor FROM prontuario WHERE nome LIKE ? ORDER BY nome ASC;");
            pst.setString(1, nome + "%");
            rs = pst.executeQuery();
            while(rs.next()){
                prontuario = new Protuario();
                prontuario.setCpf(rs.getString("cpf"));
                prontuario.setNome(rs.getString("nome"));
                prontuario.setContato(rs.getString("contato"));
                prontuario.setValor(rs.getDouble("Valor"));
                valor.add(prontuario);
            }
            return valor;
        }catch(SQLException ex){
            return null;
        }
    }
    
    public ArrayList<Protuario> lista(){
        ArrayList<Protuario> valor = new ArrayList<>();
        Protuario prontuario;
        
        try{
            pst = conn.prepareStatement("SELECT cpf, nome, contato, valor FROM prontuario ORDER BY nome ASC;");
            rs = pst.executeQuery();
            while(rs.next()){
                prontuario = new Protuario();
                prontuario.setCpf(rs.getString("cpf"));
                prontuario.setNome(rs.getString("nome"));
                prontuario.setContato(rs.getString("contato"));
                prontuario.setValor(rs.getDouble("Valor"));
                valor.add(prontuario);
            }
            return valor;
        }catch(SQLException ex){
            return null;
        }
    }
    
    public ArrayList<Protuario> listar(String cpf){
        ArrayList<Protuario> valor = new ArrayList<>();
        Protuario prontuario;
        
        try{
            pst = conn.prepareStatement("SELECT * FROM prontuariolist WHERE cpf='" + cpf + "';");
            rs = pst.executeQuery();
            while(rs.next()){
                prontuario = new Protuario();
                prontuario.setDente(rs.getString("Dente"));
                prontuario.setProcedimento(rs.getString("Procedimento"));
                prontuario.setValor(rs.getDouble("Valor"));
                valor.add(prontuario);
            }
            return valor;
        }catch(SQLException ex){
            return null;
        }
    }
    public void apagar(String cpf){
        try{
            //USuario
            pst = conn.prepareStatement("DELETE FROM prontuario WHERE cpf=?;");
            pst.setString(1, cpf);
            pst.executeUpdate();
            //Dados do dent
            pst = conn.prepareStatement("DELETE FROM prontuariolist WHERE cpf=?;");
            pst.setString(1, cpf);
            pst.executeUpdate();
        }catch(SQLException ex){
        }
    }
    
    public void apagar(String cpf, String procedimento){
        try{
            pst = conn.prepareStatement("DELETE FROM prontuariolist WHERE cpf=? AND Procedimento=?;");
            pst.setString(1, cpf);
            pst.setString(2, procedimento);
            pst.executeUpdate();
        }catch(SQLException ex){
        }
    }
    
    public void desconectar(){
        try{
            conn.close();
        }catch(SQLException ex){
        }
    }
}
