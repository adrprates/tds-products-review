package com.senacead.productsreview.model;

public class Categoria {
    
    //atributos
    private Integer id;
    private String nome;
    
    //construtor
    public Categoria(Integer id, String nome){
        this.id = id;
        this.nome = nome;
    }
    
    //construtor vazio
    public Categoria(){
        
    }
    
    //getters e setters
    public Integer getId(){
        return id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
}
