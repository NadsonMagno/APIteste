package com.teste.exemplo.model;

public class Produto {
    //#region Atributos
    private Integer id;
    private String nome;
    private Integer quantidade;
    private Double preco;
    private String descricao;
    //#endregion
   

    public Produto(Integer id, String nome, Integer quantidade, Double preco, String descricao) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.descricao = descricao;
    }


 //#region Getters e Setters
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



    public Integer getQuantidade() {
        return quantidade;
    }



    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }



    public Double getPreco() {
        return preco;
    }



    public void setPreco(Double preco) {
        this.preco = preco;
    }



    public String getDescricao() {
        return descricao;
    }



    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //#endregion


    
}
