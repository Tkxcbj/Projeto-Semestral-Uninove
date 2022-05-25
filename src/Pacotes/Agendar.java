package Pacotes;

import java.util.Date;

public class Agendar {
    
    private Date data;
    private String dateStr;
    private String cpf;
    private String hora;
    private String duracao;
    private String nomeDentista;
    private String cro;
    private String procedimento;
    private String anotacao;
    private int idFinaceiro;

    public Agendar() {
    }

    public String getDateStr() {
        return dateStr;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
  
    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }   
    
    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }

    public String getNomeDentista() {
        return nomeDentista;
    }

    public void setNomeDentista(String nomeDentista) {
        this.nomeDentista = nomeDentista;
    }

    public int getIdFinaceiro() {
        return idFinaceiro;
    }

    public void setIdFinaceiro(int idFinaceiro) {
        this.idFinaceiro = idFinaceiro;
    }
    
    
    
}
