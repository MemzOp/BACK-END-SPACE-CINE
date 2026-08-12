import Enums.Genero;

import java.time.LocalDate;

public class Usuario {
    private int id;
    private String nome;
    private  String cpf;
    private Genero genero;
    private String nomeSocial;
    private LocalDate dtNascimento;
    private String email;
    private String telefone;
    private String cep;
    private String senha;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }


    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public Genero getgenero(){
        return genero;
    }
    public void setGenero(Genero genero){
        this.genero = genero;
    }

    public String getNomeSocial(){
        return nomeSocial;
    }

    public void setNomeSocial(String NomeSocial){
        this.nomeSocial = nomeSocial;
    }

    public LocalDate getDtNascimento(){
        return dtNascimento;
    }
    public void setDtNascimento(LocalDate dtNascimento){
        this.dtNascimento = dtNascimento;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getCep(){
        return cep;
    }
    public void setCep(String cep){
        this.cep = cep;

    }

    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }

    public Usuario(){}

    public Usuario(int id, String nome, String cpf, Genero genero, String nomeSocial, LocalDate dtNascimento, String email, String telefone, String cep, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.nomeSocial = nomeSocial;
        this.dtNascimento = dtNascimento;
        this.email = email;
        this.telefone = telefone;
        this.cep = cep;
        this.senha = senha;
    }

}