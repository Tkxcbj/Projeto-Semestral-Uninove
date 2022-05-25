package Pacotes;

import java.util.Date;

public class Financeiro {

    private int id;
    private double valor;
    private double desconto;
    private double total;
    private String dentista;
    private String enviarData;
    private Date data;

    public Financeiro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDentista() {
        return dentista; 
    }

    public void setDentista(String  dentista) {
        this.dentista = dentista;
    }
    
    public String getEnviarData() {
        return enviarData;
    }

    public void setEnviarData(String enviarData) {
        this.enviarData = enviarData;
    }
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
       
}
