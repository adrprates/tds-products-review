package com.senacead.productsreview.model;

import java.util.Date;

public class Usuario {
    
    //atributos
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    private Date data_cadastro;

    //construtor
    public Usuario(Integer id, String nome, String email, String senha, Date data_cadastro) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.data_cadastro = data_cadastro;
    }
    
    //construtor vazio
    public Usuario(){
        
    }

    //getters e setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
}
