package com.produto.celta.dto;

public class ProdutosDTO {

    private Long id;
    private String nomeProduto;
    private String suprimentos;
    private double valorproduto;

    public String getSuprimentos() {
        return suprimentos;
    }

    public void setSuprimentos(String suprimentos) {
        this.suprimentos = suprimentos;
    }

    public double getProductValue() {
        return valorproduto;
    }

    public void setvalorproduto(double valorproduto) {
        this.valorproduto = valorproduto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

}
