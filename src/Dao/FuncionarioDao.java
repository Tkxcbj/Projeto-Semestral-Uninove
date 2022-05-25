package Dao;

import Pacotes.Funcionario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author cleyt
 */

public class FuncionarioDao {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    
    //Estabelecendo uma conexão com o banco de dados
    public boolean conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/unidentes", "root", "2270"); //padaria é o nome do banco de dados e 2270 a senha
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
        
    }
    // Inserindo no banco de dados
    public int salvar(Funcionario cadastro){
        try {
            pst = conn.prepareStatement("INSERT INTO funcionario(nome, cpf, cargo, cro, telefone, usuario, porcentagemRepasse, senha, idEndereco) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?);");//Pergutar como vai fazer com o idFuncionario
            pst.setString(1, cadastro.getNome());
            pst.setString(2, cadastro.getCpf());
            pst.setString(3, cadastro.getCargo());
            pst.setString(4, cadastro.getCro());
            pst.setString(5, cadastro.getTelefone());
            pst.setString(6, cadastro.getUsuario());
            pst.setDouble(7, cadastro.getRepasse());
            pst.setString(8, cadastro.getSenha());
            pst.setInt(9, cadastro.getIdEndereco());
            return pst.executeUpdate();
        } catch (SQLException ex) {
            return ex.getErrorCode();
        }
    }
    
    //Retorna valores para sem colocadas na tabela da lista de Funcionarios
    public ArrayList<Funcionario> listar(){
        ArrayList<Funcionario> dados = new ArrayList<>();
        try{
            pst = conn.prepareStatement("SELECT idFuncionario,nome, cpf, telefone, idEndereco, cargo FROM funcionario");
            rs = pst.executeQuery();
            while(rs.next()){    
                Funcionario func = new Funcionario();
                func.setIdFuncionario(rs.getInt("idFuncionario"));
                func.setNome(rs.getString("nome"));               
                func.setTelefone(rs.getString("telefone"));
                func.setIdEndereco(rs.getInt("idEndereco"));
                func.setCargo(rs.getString("cargo"));                
                dados.add(func);
            }
            return dados;
        }catch(SQLException ex){
            return null;
        }
    }
    
    public ArrayList<Funcionario> listar(String valor, String maneira){
        ArrayList<Funcionario> dados = new ArrayList<>();
        if(maneira.equalsIgnoreCase("Tudo")){
            maneira = "nome";
        }else{
            valor = maneira;
            maneira = "cargo";
        }
        
        try{
            pst = conn.prepareStatement("SELECT idFuncionario,nome, cpf, telefone, idEndereco, cargo FROM funcionario WHERE " + maneira + " LIKE ?");
            pst.setString(1, valor + "%");
            System.out.println(maneira + valor);
            System.err.println(pst);
            rs = pst.executeQuery();
            while(rs.next()){
                Funcionario func = new Funcionario();
                func.setIdFuncionario(rs.getInt("idFuncionario"));
                func.setNome(rs.getString("nome"));               
                func.setTelefone(rs.getString("telefone"));
                func.setIdEndereco(rs.getInt("idEndereco"));
                func.setCargo(rs.getString("cargo"));                
                dados.add(func);
            }
            return dados;
        }catch(SQLException ex){
            return null;
        }
    }
    
    public ArrayList<Funcionario> buscarDentista(){
        ArrayList<Funcionario> dentista = new ArrayList<>();
        try{
            pst = conn.prepareStatement("SELECT nome, cro FROM funcionario WHERE cargo='dentista';");
            rs = pst.executeQuery();
            while(rs.next()){
                Funcionario func = new Funcionario();
                func.setNome(rs.getString("nome"));
                func.setCro(rs.getString("cro"));
                dentista.add(func);
            }
            return dentista;
        }catch(SQLException ex){
            System.err.println("Erro no botão (Array)BuscarDentista em FuncionarioDao(ERRO: " + ex.getMessage() + " )");
            return null;
        }
    }
    
    public String buscarDentista(String cro){
        try{
            pst = conn.prepareStatement("SELECT nome FROM funcionario WHERE cro=?");
            pst.setString(1, cro);
            rs = pst.executeQuery();
            if(rs.next());
                String nome = rs.getString("nome");
            return nome;
        }catch(SQLException ex){
            System.err.println("Erro no botão (String)BuscarDentista em FuncionarioDao(ERRO: " + ex.getMessage() + " )");
            return null;
        }
    }
    
    //Retorna todas as informção de funcionario para serem editadas ou visualizadas.
    public Funcionario buscar(int ID){
        Funcionario funcionario = new Funcionario();
        try{
            pst = conn.prepareStatement("SELECT * FROM funcionario WHERE idFuncionario=?;");
            pst.setInt(1, ID);
            rs = pst.executeQuery();
            if(rs.next());
                funcionario.setIdFuncionario(rs.getInt("idFuncionario"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setCro(rs.getString("cro"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setUsuario(rs.getString("usuario"));
                funcionario.setRepasse(rs.getDouble("porcentagemRepasse"));
                funcionario.setSenha(rs.getString("senha"));
                funcionario.setIdEndereco(rs.getInt("idEndereco"));
            return funcionario;           
        }catch(SQLException ex){
            return null;
        }
    }
    
    public int alterar(Funcionario funcionario){
        String sql;
        sql = "UPDATE funcionario SET nome=?, cpf=?, cargo=?, cro=?, telefone=?, usuario=?, porcentagemRepasse=?, senha=? WHERE idFuncionario=?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, funcionario.getNome());
            pst.setString(2, funcionario.getCpf());
            pst.setString(3, funcionario.getCargo());
            pst.setString(4, funcionario.getCro());
            pst.setString(5, funcionario.getTelefone());
            pst.setString(6, funcionario.getUsuario());
            pst.setDouble(7, funcionario.getRepasse());
            pst.setString(8, funcionario.getSenha());
            pst.setInt(9, funcionario.getIdFuncionario());
            return pst.executeUpdate();
            
        }catch(SQLException ex){
            System.err.println("Erro na função alterar, em FuncionarioDao (Erro: " + ex.getMessage() + " )");
            return -1;
        }
    }
    
    public int idEndereco(int idFuncionario){
        try{
            pst = conn.prepareStatement("SELECT idEndereco FROM funcionario WHERE idFuncionario=?;");
            pst.setInt(1, idFuncionario); 
            rs = pst.executeQuery();
            if(rs.next());
                return rs.getInt("idEndereco");
        }catch(SQLException ex){
            System.err.println("Erro na função alterar, em FuncionarioDao (Erro: " + ex.getMessage() + " )");
            return -1;
        }
    }
    
    public int apagar(int idFuncionario){
        try{
            pst = conn.prepareStatement("DELETE FROM funcionario WHERE idFuncionario=?;");
            pst.setInt(1, idFuncionario);
            return pst.executeUpdate();
            
        }catch(SQLException ex){
            System.err.println("Erro na função apagar, em FuncionarioDao (Erro: " + ex.getMessage() + " )");
            return ex.getErrorCode();
        }
    }
    
    
    public void desconectar(){
        try{
         conn.close();
        }catch(SQLException ex){
        }
    }
}
