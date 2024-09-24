package com.senacead.productsreview.model;

import java.util.Date;

public class Produto {
    
    //atributos
    private Integer id;
    private String nome;
    private Categoria c;
    private String descricao;
    private Date data_cadastro;

    //construtor
    public Produto(Integer id, String nome, Categoria c, String descricao) {
        this.id = id;
        this.nome = nome;
        this.c = c;
        this.descricao = descricao;
    }
    
    //construtor vazio
    public Produto(){
    
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

    public Categoria getCategoria() {
        return c;
    }

    public void setCategoria(Categoria c) {
        this.c = c;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    } 
}
