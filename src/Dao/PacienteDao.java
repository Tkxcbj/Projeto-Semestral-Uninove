package Dao;

import Pacotes.Paciente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class PacienteDao {
    
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    
    public boolean conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/unidentes", "root", "2270");
            return true;
        }catch(ClassNotFoundException | SQLException ex){
            System.err.println("Erro no botão conectar em PacienteDao(ERRO: " + ex.getMessage() + " )");
            return false;
        }
    }
    
    // inserindo no BD
    public int salvar(Paciente cadastro){
        try {
            pst = conn.prepareStatement("INSERT INTO paciente(Nome, CPF, RG, Data_nascimento, Genero, Estado_Civil, Telefone, Email, Nome_Pai, Nome_Mae, Nome_Conjude, Profissao, Anotacao, idEndereco ) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");//Pergutar como vai fazer com o idFuncionario
            pst.setString(1, cadastro.getNome());
            pst.setString(2, cadastro.getCpf());
            pst.setString(3, cadastro.getRg());
            pst.setString(4, cadastro.getData_nascimento());
            pst.setString(5, cadastro.getGenero());
            pst.setString(6, cadastro.getEstado_civil());
            pst.setString(7, cadastro.getTelefone());
            pst.setString(8, cadastro.getEmail());
            pst.setString(9, cadastro.getPai());
            pst.setString(10, cadastro.getMae());
            pst.setString(11, cadastro.getConjude());
            pst.setString(12, cadastro.getProfissao());
            pst.setString(13, cadastro.getAnotacao());
            pst.setInt(14, cadastro.getidEndereco());
            return pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Erro no Salvar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
    
     public int alterar(Paciente p){
        try{
            pst = conn.prepareStatement("UPDATE paciente SET Nome=?, RG=?, Data_nascimento=?, Genero=?, Estado_Civil=?, Telefone=?, Email=?, Nome_Pai=?, Nome_Mae=?, Nome_Conjude=?, Profissao=?, Anotacao=? WHERE CPF=?");
            pst.setString(1, p.getNome());
            pst.setString(2, p.getRg());
            pst.setString(3, p.getData_nascimento());
            pst.setString(4, p.getGenero());
            pst.setString(5, p.getEstado_civil());
            pst.setString(6, p.getTelefone());
            pst.setString(7, p.getEmail());
            pst.setString(8, p.getPai());
            pst.setString(9, p.getMae());
            pst.setString(10, p.getConjude());
            pst.setString(11, p.getProfissao());
            pst.setString(12, p.getAnotacao());
            pst.setString(13, p.getCpf());
            return pst.executeUpdate();
        }catch(SQLException ex){
            System.err.println("Erro na função alterar, em PacienteDao (Erro: " + ex.getMessage() + " )");
            return -1;
        }
    }
    
    public String retornarNome(String cpf){
        try{
            pst = conn.prepareStatement("SELECT nome FROM paciente WHERE cpf=?;");
            pst.setString(1, cpf);
            rs = pst.executeQuery();
            if(rs.next()){
                return rs.getString("nome");
            }else{
                return null;
            }
        }catch(SQLException ex){
            return null;
        }
    } 
     
     public Paciente buscar(String cpf){
        Paciente paciente;
        try{         
            pst = conn.prepareStatement("SELECT * FROM paciente WHERE CPF=?;");
            pst.setString(1, cpf);
            rs = pst.executeQuery();
            paciente = new Paciente();
            if(rs.next()){
                paciente.setCpf(rs.getString("CPF"));
                paciente.setNome(rs.getString("Nome"));
                paciente.setRg(rs.getString("RG"));
                paciente.setNascimento(rs.getDate("Data_nascimento"));
                paciente.setGenero(rs.getString("Genero"));
                paciente.setEstado_civil(rs.getString("Estado_Civil"));
                paciente.setTelefone(rs.getString("Telefone"));
                paciente.setEmail(rs.getString("Email"));
                paciente.setPai(rs.getString("Nome_Pai"));
                paciente.setMae(rs.getString("Nome_Mae"));
                paciente.setConjude(rs.getString("Nome_Conjude"));
                paciente.setProfissao(rs.getString("Profissao"));
                paciente.setAnotacao(rs.getString("Anotacao"));
                paciente.setidEndereco(rs.getInt("idEndereco"));
                paciente.setidProntuario(rs.getInt("idProntuario"));           
                return paciente;
            }else{
                return null;
            }
        }catch(SQLException ex){
            return null;
        }
    }
     
    public String mostrarNome(String CPF){
        String nome;
        try{
            pst = conn.prepareStatement("SELECT Nome FROM paciente WHERE CPF=?");
            pst.setString(1, CPF);
            rs = pst.executeQuery();
            if(rs.next()){
                nome = rs.getString("Nome");
                return nome;
            }else{
                return null;
            }            
        }catch(SQLException ex){
            System.err.println("Erro no botão buscar em PacienteDao(ERRO: " + ex.getMessage() + " )");
            return null;
        }
    }

    public int retornarIdEndereco(String cpf){
        try{
            pst = conn.prepareStatement("SELECT idEndereco FROM paciente WHERE cpf=?;");
            pst.setString(1, cpf);
            rs = pst.executeQuery();
            if(rs.next());
                return rs.getInt("idEndereco");
        }catch(SQLException ex){
            return -1;
        }
    }
    
    public String retornarCpf(String nome){
        try{
            pst = conn.prepareStatement("SELECT * FROM paciente WHERE Nome LIKE ?");
            pst.setString(1, nome + "%");
            rs = pst.executeQuery();
            if(rs.next()){
                return rs.getString("CPF");
            }else{
                return null;
            }
            
        }catch(SQLException ex){
            System.err.println("Erro no retornarCpf buscar em PacienteDao(ERRO: " + ex.getMessage() + " )");
            return null;
        }
    }

    public ArrayList<Paciente> listar(){
        ArrayList<Paciente> dados = new ArrayList<>();
        try{
            pst = conn.prepareStatement("SELECT CPF, Nome, Telefone, idEndereco FROM paciente");
            rs = pst.executeQuery();
            while(rs.next()){    
                Paciente p = new Paciente();
                p.setCpf(rs.getString("CPF"));
                p.setNome(rs.getString("Nome"));               
                p.setTelefone(rs.getString("Telefone"));
                p.setidEndereco(rs.getInt("idEndereco"));                
                dados.add(p);
            }
            return dados;
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return null;
        }
    }
    
    public ArrayList<Paciente> listar(String valor, String maneira){
        ArrayList<Paciente> dados = new ArrayList<>();
        if(maneira.equalsIgnoreCase("Tudo")){
            maneira = "Nome";
        }else{
            valor = maneira;
            maneira = "cargo";
        }
        
        try{
            pst = conn.prepareStatement("SELECT CPF, Nome, Telefone, idEndereco FROM paciente WHERE " + maneira + " LIKE ?");
            pst.setString(1, valor + "%");
            rs = pst.executeQuery();
            while(rs.next()){
                Paciente p = new Paciente();
                p.setCpf(rs.getString("CPF"));
                p.setNome(rs.getString("Nome"));               
                p.setTelefone(rs.getString("Telefone"));
                p.setidEndereco(rs.getInt("idEndereco"));                
                dados.add(p);
            }
            return dados;
        }catch(SQLException ex){
            System.err.println("Erro no botão Buscar(lista) em PacienteDao(ERRO: )" + ex.getMessage());
            return null;
        }
    }
    
    public int apagar(String Cpf){
        try{
            pst = conn.prepareStatement("DELETE FROM paciente WHERE CPF=?;");
            pst.setString(1, Cpf);
            System.out.println(pst);
            return pst.executeUpdate();     
        }catch(SQLException ex){
            System.err.println("Erro na função apagar, em PacienteDao (Erro: " + ex.getMessage() + " )");
            return ex.getErrorCode();
        }
    }
    
    
    public void desconectar(){
        try{
            conn.close();
        }catch(SQLException ex){
            //Fazer nada
        }
    }
}
