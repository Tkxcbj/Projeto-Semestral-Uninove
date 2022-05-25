package Pacotes;

import java.util.Date;

public class Produto {

    private int idProduto;
    private String nomeProduto;
    private int quantidade;
    private int quantidadeIdeal;
    private double valorProduto;
    private String dataStr;
    private Date data;

    public Produto() {
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidadeIdeal() {
        return quantidadeIdeal;
    }

    public void setQuantidadeIdeal(int quantidadeIdeal) {
        this.quantidadeIdeal = quantidadeIdeal;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }   

    public String getDataStr() {
        return dataStr;
    }

    public void setDataStr(String dataStr) {
        this.dataStr = dataStr;
    }
    
    
    
}
