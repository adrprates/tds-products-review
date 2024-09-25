package com.senacead.productsreview.model;

import java.util.Date;

public class Avaliacao {
    
    //atributos
    private Integer id;
    private Produto p;
    private Usuario u;
    private int nota;
    private String comentario;
    private Date data_avaliacao;

    //construtor
    public Avaliacao(Integer id, Produto p, Usuario u, int nota, String comentario) {
        this.id = id;
        this.p = p;
        this.u = u;
        this.nota = nota;
        this.comentario = comentario;
    }
    
    //construtor vazio
    public Avaliacao(){
        
    }

    //getters e setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Produto getP() {
        return p;
    }

    public void setP(Produto p) {
        this.p = p;
    }

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getData_avaliacao() {
        return data_avaliacao;
    }

    public void setData_avaliacao(Date data_avaliacao) {
        this.data_avaliacao = data_avaliacao;
    }
    
    
    
    
}
