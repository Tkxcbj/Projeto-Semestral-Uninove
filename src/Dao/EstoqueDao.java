package Dao;

import Pacotes.Produto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class EstoqueDao {
    
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    
    public boolean conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/unidentes?zeroDateTimeBehavior=convertToNull", "root", "2270");
            return true;
        }catch(SQLException | ClassNotFoundException ex){
            return false;
        }
    }
    
    public int salvar(Produto produto){
        try{
            pst = conn.prepareStatement("INSERT INTO estoque VALUES(?,?,?,?,?,?);");
            pst.setInt(1, produto.getIdProduto());
            pst.setString(2, produto.getNomeProduto());
            pst.setString(3, produto.getDataStr());
            pst.setInt(4, produto.getQuantidade());
            pst.setInt(5, produto.getQuantidadeIdeal());
            pst.setDouble(6, produto.getValorProduto());
            return pst.executeUpdate();
        }catch(SQLException ex){
            System.err.println("Erro no função Salvar em ProdutoDao(ERRO: " + ex.getMessage() + " )");
            return -1;
        }
    }
    
    public boolean alterar(Produto produto){
        try{
            pst = conn.prepareStatement("UPDATE estoque SET `Nome_produto`=?,`Vencimento`=?,`Quantidade`=?,`Quantidade_ideal`=?,`Valor_do_produto`=? WHERE idProduto=?");
            pst.setString(1, produto.getNomeProduto());
            pst.setString(2, produto.getDataStr());
            pst.setInt(3, produto.getQuantidade());
            pst.setInt(4, produto.getQuantidadeIdeal());
            pst.setDouble(5, produto.getValorProduto());
            pst.setInt(6, produto.getIdProduto());
            return pst.executeUpdate() == 1;
        }catch(SQLException ex){
            System.err.println("Erro no função alterar em ProdutoDao(ERRO: " + ex.getMessage() + " )");
            return false;
        }
    }
    
    public boolean alterarQuantidade(int quantidade, int cod){
        try{
            pst = conn.prepareStatement("UPDATE estoque SET Quantidade=? WHERE idProduto=?");
            pst.setInt(1, quantidade);
            pst.setInt(2, cod);
            return pst.executeUpdate() == 1;
        }catch(SQLException ex){
            System.err.println("Erro no função alterarQuantidade em ProdutoDao(ERRO: " + ex.getMessage() + " )");
            return false;
        }
    }
    
    
    public ArrayList<Produto> listar(){       
        ArrayList<Produto> produto = new ArrayList<>();
        try{
            pst = conn.prepareStatement("SELECT Nome_produto, idProduto, Quantidade, Quantidade_ideal,Vencimento FROM estoque ORDER BY Nome_produto ASC;");
            rs = pst.executeQuery();
            while(rs.next()){
                Produto prod = new Produto();
                prod.setIdProduto(rs.getInt("idProduto"));
                prod.setNomeProduto(rs.getString("Nome_produto"));
                prod.setQuantidade(rs.getInt("Quantidade"));
                prod.setQuantidadeIdeal(rs.getInt("Quantidade_ideal"));
                prod.setData(rs.getDate("Vencimento"));
                produto.add(prod);
            }
            return produto;
        }catch(SQLException ex){
            System.err.println("Erro no função Listar em ProdutoDao(ERRO: " + ex.getMessage() + " )");
            return null;
        }
    }
    
    public ArrayList<Produto> buscar(String valor){
        ArrayList<Produto> produto = new ArrayList<>();
        try{
            pst = conn.prepareStatement("SELECT * FROM estoque WHERE Nome_produto LIKE ? ORDER BY Nome_produto ASC;");
            pst.setString(1, valor + "%");
            rs = pst.executeQuery();
            while(rs.next()){
                Produto prod = new Produto();
                prod.setIdProduto(rs.getInt("idProduto"));
                prod.setNomeProduto(rs.getString("Nome_produto"));
                prod.setQuantidade(rs.getInt("Quantidade"));
                prod.setQuantidadeIdeal(rs.getInt("Quantidade_ideal"));
                prod.setData(rs.getDate("Vencimento"));
                produto.add(prod);
            }
            return produto;
        }catch(SQLException ex){
            System.err.println("Erro no função buscar em ProdutoDao(ERRO: " + ex.getMessage() + " )");
            return null;
        }
    }
    
    public Produto buscar(int cod){
        Produto produto;
        try{
            pst = conn.prepareStatement("SELECT * FROM estoque WHERE idProduto=?");
            pst.setInt(1, cod);
            rs = pst.executeQuery();
            if(rs.next()){
                produto = new Produto();
                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setNomeProduto(rs.getString("Nome_produto"));
                produto.setQuantidade(rs.getInt("Quantidade"));
                produto.setQuantidadeIdeal(rs.getInt("Quantidade_ideal"));
                produto.setValorProduto(rs.getDouble("Valor_do_produto"));
                produto.setData(rs.getDate("Vencimento"));
                return produto;
            }else{
                return null;
            }
        }catch(SQLException ex){
            System.err.println("Erro no função (Produto)buscar em ProdutoDao(ERRO: " + ex.getMessage() + " )");
            return null;
        }
    }
    
    public boolean apagar(int idCodigo){
        try{
            pst = conn.prepareStatement("DELETE FROM estoque WHERE idProduto=?");
            pst.setInt(1, idCodigo);
            return pst.executeUpdate() == 1;
        }catch(SQLException ex){
            System.err.println("Erro no função apagar em ProdutoDao(ERRO: " + ex.getMessage() + " )");
            return false;
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
