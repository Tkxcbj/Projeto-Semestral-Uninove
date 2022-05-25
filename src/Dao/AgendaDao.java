package Dao;

import Pacotes.Agendar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AgendaDao {
    
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    DateFormat formato = new SimpleDateFormat("HH:mm");
               
    
    public boolean conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/unidentes", "root", "2270");
            return true;
        }catch(ClassNotFoundException | SQLException ex){
            return false;
        }
    }

    public String formatar(String texto){
        String formatacao = texto.substring(6) + "-" + texto.substring(3, 5) + "-" + texto.substring(0, 2);    
        return formatacao;
    }
    
    
    public int salvar(Agendar agenda){
        try{
            pst = conn.prepareStatement("INSERT INTO agenda(cpfPaciente, Data, Horario, Duracao_consulta, cro, Procedimento, Descrição, idFinaceiro) VALUES(?,?,?,?,?,?,?,?);");
            pst.setString(1, agenda.getCpf());
            pst.setString(2, agenda.getDateStr());
            pst.setString(3, agenda.getHora());
            pst.setString(4, agenda.getDuracao());
            pst.setString(5, agenda.getCro());
            pst.setString(6, agenda.getProcedimento());
            pst.setString(7, agenda.getAnotacao());
            pst.setInt(8, agenda.getIdFinaceiro());
            return pst.executeUpdate();
        }catch(SQLException ex){
            return ex.getErrorCode();
        }
    }
    
    public int alterar(Agendar agenda, String dia, String hora){
        try{
            pst = conn.prepareStatement("UPDATE agenda SET `Data`=?,`Horario`=?, `Duracao_consulta`=?,`cro`=?,`Descrição`=?, Procedimento=? WHERE cpfPaciente=? AND Data=? AND Horario=?");
            pst.setString(1, agenda.getDateStr());
            pst.setString(2, agenda.getHora());
            pst.setString(3, agenda.getDuracao());
            pst.setString(4, agenda.getCro());
            pst.setString(5, agenda.getAnotacao());
            pst.setString(6, agenda.getProcedimento());
            pst.setString(7, agenda.getCpf());
            pst.setString(8, dia);    
            pst.setString(9, hora); 
            return pst.executeUpdate();
        }catch(SQLException ex){
            return -1;
        }
    }
   
    public Agendar buscar(String data, String cpf, String horario){
        Agendar consulta = new Agendar();
        String hora, duracao;
        try{
            pst = conn.prepareStatement("SELECT * FROM agenda WHERE cpfPaciente=? AND `Data`=? AND Horario=?;");
            pst.setString(1, cpf);
            pst.setString(2, data);
            pst.setString(3, horario);
            rs = pst.executeQuery();
            if(rs.next());
                consulta.setCpf(rs.getString("cpfPaciente"));
                consulta.setCro(rs.getString("cro"));
                consulta.setData(rs.getDate("Data"));
                consulta.setProcedimento(rs.getString("Procedimento"));
                consulta.setAnotacao(rs.getString("Descrição"));
                consulta.setIdFinaceiro(rs.getInt("idFinaceiro"));
                hora = formato.format(rs.getTime("Horario")); //Time para String ↓
                consulta.setHora(hora);
                duracao = formato.format(rs.getTime("Duracao_consulta"));
                consulta.setDuracao(duracao);
            return consulta;
        }catch(SQLException ex){
             return null;
        }
    }
    
    public Agendar buscar(String data, String cpf){
        Agendar agenda;
        String hora;
        
        try{
            pst = conn.prepareStatement("SELECT * FROM agenda WHERE `Data`=? AND cpfPaciente=?");
            pst.setString(1, data);
            pst.setString(2, cpf);
            rs = pst.executeQuery();
            if(rs.next()){
                agenda = new Agendar();
                agenda.setData(rs.getDate("Data"));
                agenda.setCro(rs.getString("Cro"));               
                agenda.setProcedimento(rs.getString("Procedimento"));
                hora = formato.format(rs.getTime("Horario")); //Time para String ↓
                agenda.setHora(hora);
                return agenda;
            }else{
                return null;
            }
        }catch(SQLException ex){
            return null;
        }
    }
    
    public ArrayList<Agendar> buscarData(String data){
        ArrayList<Agendar> dados;
        Agendar agenda;
        String hora;
        
        try{
            pst = conn.prepareStatement("SELECT Horario FROM agenda WHERE `Data`=? ORDER BY `Data`;");
            pst.setString(1, data);
            rs = pst.executeQuery();
            dados = new ArrayList<>();
            while(rs.next()){
                agenda = new Agendar();
                hora = formato.format(rs.getTime("Horario"));
                agenda.setHora(hora);
                dados.add(agenda);
            }
            return dados;
        }catch(SQLException ex){
            return null;
        }
    }
    
    public ArrayList<Agendar> buscarPeriodo(String de, String ate){
        ArrayList<Agendar> valores = new ArrayList<>();
        String hora;
        try{
            pst = conn.prepareStatement("SELECT cpfPaciente, Data, Horario, cro, Procedimento FROM `agenda` WHERE `Data` BETWEEN ? and ? ORDER BY `Data`;");
            pst.setString(1, de);
            pst.setString(2, ate);
            rs = pst.executeQuery();
            while(rs.next()){
                Agendar agenda = new Agendar();
                agenda.setData(rs.getDate("Data"));              
                agenda.setCpf(rs.getString("cpfPaciente"));
                agenda.setCro(rs.getString("cro"));
                agenda.setProcedimento(rs.getString("Procedimento"));
                hora = formato.format(rs.getTime("Horario"));
                agenda.setHora(hora);
                valores.add(agenda);
            }
            return valores;
        }catch(SQLException ex){
            return null;
        }
    }
    
    
    public ArrayList<Agendar> listarTodos(){
        ArrayList<Agendar> dados = new ArrayList<>();
        try{
            pst = conn.prepareStatement("SELECT * FROM agenda;");
            rs = pst.executeQuery();
            while(rs.next()){
                Agendar valores = new Agendar();
                String horaFormatada = formato.format(rs.getTime("Horario"));
                valores.setHora(horaFormatada);
                valores.setData(rs.getDate("Data"));
                valores.setCpf(rs.getString("cpfPaciente"));
                valores.setCro(rs.getString("Cro"));
                valores.setProcedimento(rs.getString("Procedimento"));
                dados.add(valores);
            }
            return dados;
        }catch(SQLException ex){
            return null;
        }
    }
    
    public int apagarAntigos(){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date diaAtual = new Date();
        String diaFormatado = format.format(diaAtual).substring(6) + "-" + format.format(diaAtual).substring(3, 5) + "-" + format.format(diaAtual).substring(0, 2);
        try{
            pst = conn.prepareStatement("DELETE FROM `agenda` WHERE `data` < ?;");
            pst.setString(1, diaFormatado);
            return pst.executeUpdate();
        }catch(SQLException ex){
            return -1;
        }
    }
    
    public void desconectar(){
        try{
            //pst.close();\
            conn.close();
        }catch(SQLException ex){
            //Fazer nada
        }
    }
    
}
