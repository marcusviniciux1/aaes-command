package org.example;

public class FI {

    private String nome;
    private double valor;
    private String situacao;

    public FI(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getSituacao() {
        return situacao;
    }

    public void comprar() {
        this.situacao = "Fundo Imobiliário comprado";
    }

    public void vender() {
        this.situacao = "Fundo Imobiliário vendido";
    }
}