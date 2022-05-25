package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import Pacotes.Financeiro;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class FinaceiroDao {
    
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    
    public boolean conectar(){
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/unidentes", "root", "2270");
          return true;
        }catch(ClassNotFoundException | SQLException ex){
            System.err.println("Erro no função conectar em FinaceiroDao(ERRO: " + ex.getMessage() + " )");
            return false;
        }    
    }
    
    public String coverterBD(Date valor){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");;
        return formato.format(valor).substring(6) + "-" + formato.format(valor).substring(3, 5) + "-" + formato.format(valor).substring(0, 2);
    }
    
    public String coverterBD(String valor){
        return valor.substring(6) + "-" + valor.substring(3, 5) + "-" + valor.substring(0, 2);
    }
    
    public int salvar(Financeiro financeiro){
        int resposta;
        String dataFormatada;
        
        try{
            dataFormatada = financeiro.getEnviarData().substring(6) + "-" + financeiro.getEnviarData().substring(3, 5) + "-" + financeiro.getEnviarData().substring(0, 2);
            pst = conn.prepareStatement("INSERT INTO financeiro(valor, desconto, dentista,`Data`) VALUES(?,?,?,?)");
            pst.setDouble(1, financeiro.getValor());
            pst.setDouble(2, financeiro.getDesconto());
            pst.setString(3, financeiro.getDentista());
            pst.setString(4, dataFormatada);
            resposta = pst.executeUpdate();
            if(resposta == 1){
                pst = conn.prepareStatement("select max(idFinanceiro) FROM financeiro;");
                rs = pst.executeQuery();
                if(rs.next()){
                    return rs.getInt("max(idFinanceiro)");
                }else{
                    return -1;
                }
            }else{
                return -1;
            }
        }catch(SQLException ex){
            System.err.println("Erro no função salvar em FinaceiroDao(ERRO: " + ex.getMessage() + " )");
            return -1;
        }
    }

    public boolean alterar(Financeiro financeiro){
        String dataFormatada;
        
        try{
            dataFormatada = financeiro.getEnviarData().substring(6) + "-" + financeiro.getEnviarData().substring(3, 5) + "-" + financeiro.getEnviarData().substring(0, 2);
            pst = conn.prepareStatement("UPDATE financeiro SET valor=?, desconto=?, dentista=?,`Data`=? WHERE idFinanceiro=?");
            pst.setDouble(1, financeiro.getValor());
            pst.setDouble(2, financeiro.getDesconto());
            pst.setString(3, financeiro.getDentista());
            pst.setString(4, dataFormatada);
            pst.setInt(5, financeiro.getId());
            return pst.executeUpdate() > 0;
        }catch(SQLException ex){
            System.err.println("Erro no função alterar em FinaceiroDao(ERRO: " + ex.getMessage() + " )");
            return false;
        }
    }
    
    public ArrayList<Financeiro> buscar(){ //Busca todos os registros de finacia
        Financeiro financeiro;
        ArrayList<Financeiro> dados;
        try{
            pst = conn.prepareStatement("SELECT valor, desconto, dentista,`Data` FROM financeiro ORDER BY `Data`;");
            rs = pst.executeQuery();
            dados = new ArrayList<>();
            while(rs.next()){
                financeiro = new Financeiro();
                financeiro.setValor(rs.getDouble("valor"));
                financeiro.setDesconto(rs.getDouble("desconto"));
                financeiro.setDentista(rs.getString("dentista"));
                financeiro.setData(rs.getDate("Data"));
                dados.add(financeiro);
            }
            return dados;
        }catch(SQLException ex){
            System.err.println("Erro no função (Array)buscar em FinaceiroDao(ERRO: " + ex.getMessage() + " )");
            return null;
        }
    }
    
    
    public Financeiro buscar(int id){ //Busca apenas um registro de finacia com base no seu id
        Financeiro finaceiro = new Financeiro();
        try{
            pst = conn.prepareStatement("SELECT valor, desconto FROM financeiro WHERE idFinanceiro=" + id);
            rs = pst.executeQuery();
            if(rs.next());
                finaceiro.setValor(rs.getDouble("valor"));
                finaceiro.setDesconto(rs.getDouble("desconto"));
                return finaceiro;
        }catch(SQLException ex){
            System.err.println("Erro no função (Financeiro)buscar em FinaceiroDao(ERRO: " + ex.getMessage() + " )");
            return null;  
        }
    }
    
    public ArrayList<Financeiro> buscar(String data1, String data2){ //Busca um periodo de data na tabela do finaceiro
        //Variveis
        ArrayList<Financeiro> dados;
        Financeiro financeiro;
        
        try{
            pst = conn.prepareStatement("SELECT * FROM financeiro WHERE `data` BETWEEN ? AND ? ORDER BY `data`;"); //Preparando o comando sql
            pst.setString(1, data1);
            pst.setString(2, data2);
            rs = pst.executeQuery();
            dados = new ArrayList<>();
            while(rs.next()){
                financeiro = new Financeiro(); //Gerando uma nova capsula
                financeiro.setData(rs.getDate("data")); //encapsulando Data
                financeiro.setDentista(rs.getString("dentista")); //encapsulando dentista
                financeiro.setDesconto(rs.getDouble("desconto")); //encapsulando desconto
                financeiro.setValor(rs.getDouble("valor")); //encapsulando valor
                dados.add(financeiro); //Adcionando a capusla a um vetor
            }
            return dados; // Retornando o vetor
        }catch(SQLException ex){ //Erro OU não possui nada na data idicada
            System.err.println("Erro no função (ArrayList<Financeiro>)buscar em FinaceiroDao(ERRO: " + ex.getMessage() + " )");
            return null;
        }
    }
    
    public ArrayList<Financeiro> buscarReceita(String nome){
        ArrayList<Financeiro> financeiro;
        Financeiro valor;
        try{
            pst = conn.prepareStatement("SELECT * FROM financeiro WHERE dentista LIKE '" + nome + "%'");
            rs = pst.executeQuery();
            financeiro = new ArrayList<>();
            while(rs.next()){
                valor = new Financeiro();
                valor.setData(rs.getDate("data"));
                valor.setDentista(rs.getString("dentista"));
                valor.setDesconto(rs.getDouble("desconto"));
                valor.setValor(rs.getDouble("valor")); 
                financeiro.add(valor);
            }
            return financeiro;
        }catch(SQLException ex){
            System.err.println("Erro no função buscarReceita em FinaceiroDao(ERRO: " + ex.getMessage() + " )");
            return null;
        }
    }
    // GRAFICO BRUTO ESSA PARTE
    public boolean adicionar(String semana, double ganho, double perda){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date diaAtual = new Date(), dataPesquisada;
        int min, max, prox;
        try{
            pst = conn.prepareStatement("select max(comparador), min(comparador) FROM graficobruto;");
            rs = pst.executeQuery();
            if(rs.next());
                pst = conn.prepareStatement("select utima FROM graficobruto WHERE `data` BETWEEN ? AND ?;");
                rs = pst.executeQuery();
                if(rs.next());
                    try{
                        prox = Integer.parseInt(formato.format(rs.getDate("atualizado")).substring(0, 2)) + 7;
                        if(prox > 30){
                            prox = 1;
                        }
                        diaAtual = formato.parse(prox + formato.format(diaAtual).substring(2));
                        dataPesquisada = formato.parse(formato.format(rs.getDate("utima")));
                    }catch(ParseException ex){
                        return false;
                    }
                if(dataPesquisada.equals(diaAtual) && rs.getBoolean("concluida") == false){
                    String dia = formato.format(diaAtual).substring(6) + "-" + formato.format(diaAtual).substring(3, 5) + "-" + formato.format(diaAtual).substring(0, 2);
                    min = rs.getInt("min(comparador)");
                    max = rs.getInt("max(comparador)");
                    pst = conn.prepareStatement("INSERT INTO graficobruto(`semana`, `ganho`, `perda`, atualizado, concluida) VALUES(?,?,?);");
                    pst.setString(1, semana);
                    pst.setDouble(2, ganho);
                    pst.setDouble(3, perda);
                    pst.setString(3, dia);
                    pst.setBoolean(3, true);
                    if(pst.executeUpdate() == 1){
                        pst = conn.prepareStatement("DELETE FROM graficobruto WHERE comparador=" + min);
                        return pst.executeUpdate() == 1;
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
        }catch(SQLException ex){
            System.out.println("Erro no adicinar em FinanceiroDao ERRO: " + ex.getMessage());
            return false;
        }
    }
    
    public String[] buscarValor(){
        int pos = 0;
        String valores[];
        
        try{
            pst = conn.prepareStatement("SELECT * FROM graficobruto");
            rs = pst.executeQuery();
            valores = new String[12];
            while(rs.next()){
                valores[pos++] = rs.getString("semana");
                valores[pos++] = String.valueOf(rs.getDouble("ganho"));
                valores[pos++] = String.valueOf(rs.getDouble("perda"));
            }
            return valores;
        }catch(SQLException ex){
            System.out.println("Erro no (double[])buscarValor em FinanceiroDao ERRO: " + ex.getMessage());
            return null;
        }
    } 
    
    // FIM DO GRAFICO BRUTO 
    
    
    public void desconectar(){
        try{
            conn.close();
        }catch(SQLException ex){
            //fazer nd
        }
    }
}
