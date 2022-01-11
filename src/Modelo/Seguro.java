/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Felipe de Freitas
 */
public class Seguro {
    private int codigoSeguro;
    private String nome;
    private String tipo;
    private String descricao;
    private float valor;
    

    public Seguro(int codigoSeguro, String nome, String tipo, String descricao){
        this.codigoSeguro = codigoSeguro;
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public int getCodigoSeguro() {
        return codigoSeguro;
    }

    public void setCodigoSeguro(int codigoSeguro) {
        this.codigoSeguro = codigoSeguro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public String imprimirSeguro(){
        String relatorio = "\nCódigo do seguro: " + this.codigoSeguro +
                           "\nNome: " + this.nome +
                           "\nTipo: " + this.tipo +
                           "\nDescrição: " + this.descricao +
                           "\nValor: " + this.valor;
        return relatorio;
    }
}
