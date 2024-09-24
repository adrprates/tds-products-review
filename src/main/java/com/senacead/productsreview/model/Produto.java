package com.senacead.productsreview.model;

import java.util.Date;

public class Produto {
    
    //atributos
    private Integer id;
    private String nome;
    private Integer categoria_id;
    private String descricao;
    private Date data_cadastro;

    //construtor
    public Produto(Integer id, String nome, Integer categoria_id, String descricao) {
        this.id = id;
        this.nome = nome;
        this.categoria_id = categoria_id;
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

    public Integer getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(Integer categoria_id) {
        this.categoria_id = categoria_id;
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
