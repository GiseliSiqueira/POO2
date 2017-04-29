/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nossadistribuidora.model;

/**
 *
 * @author Giseli
 */
public abstract class Produto {
    private String marca;
    private int quantidadeEstoque;
    private float valor;
    private String nome;
    private String caracteristica;
    private boolean disponibilidadeEstoque;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public boolean getDisponibilidadeEstoque() {
        return disponibilidadeEstoque;
    }

    public void setDisponibilidadeEstoque(boolean disponibilidadeEstoque) {
        this.disponibilidadeEstoque = disponibilidadeEstoque;
    }
    
    
}
