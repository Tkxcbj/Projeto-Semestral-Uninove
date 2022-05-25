package Pacotes;

import java.util.Date;

public class Paciente {

    private String nome;
    private String cpf;
    private String rg;
    private String data_nascimento;
    private Date nascimento;
    private String genero;
    private String estado_civil;
    private String telefone;
    private String email;
    private String pai;
    private String mae;
    private String conjude;
    private String profissao;
    private String anotacao;
    private int idEndereco;
    private int idProntuario;

    public Paciente() {
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getConjude() {
        return conjude;
    }

    public void setConjude(String conjude) {
        this.conjude = conjude;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }

    public int getidEndereco() {
        return idEndereco;
    }

    public void setidEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public int getidProntuario() {
        return idProntuario;
    }

    public void setidProntuario(int idProntuario) {
        this.idProntuario = idProntuario;
    }

}
