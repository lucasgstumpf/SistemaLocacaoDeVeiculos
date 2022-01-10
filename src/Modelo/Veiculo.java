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
public class Veiculo {
    protected int codigoVeiculo;
    protected String nomeModelo;
    protected String montadora;
    protected int anoFabricacao;
    protected int anoModelo;
    protected String placa;
    protected String categoria;
    protected float valorFipe;
    protected float valorDiaria;
    protected boolean alugado;

    Veiculo(int codigoVeiculo, String nomeModelo, String montadora, 
            int anoFabricacao, int anoModelo, String placa, String categoria,
            float valorFipe, float valorDiaria, boolean alugado){
        this.codigoVeiculo = codigoVeiculo;
        this.nomeModelo = nomeModelo;
        this.montadora = montadora;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.placa = placa;
        this.categoria = categoria;
        this.valorFipe = valorFipe;
        this.valorDiaria = valorDiaria;
        this.alugado = alugado;
    }
    
    public int getCodigoVeiculo() {
        return codigoVeiculo;
    }

    public void setCodigoVeiculo(int codigoVeiculo) {
        this.codigoVeiculo = codigoVeiculo;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getValorFipe() {
        return valorFipe;
    }

    public void setValorFipe(float valorFipe) {
        this.valorFipe = valorFipe;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    
    public void imprimirVeiculos(){
        System.out.println("Código do veículo: " + codigoVeiculo +
                            "\nNome do modelo: " + nomeModelo + 
                            "\nMontadora: " + montadora + 
                            "\nAno de fabricação: " + anoFabricacao +
                            "\nAno do modelo: " + anoModelo +
                            "\nPlaca: " + placa + 
                            "\nCategoria: " + categoria);
    }
    
}