/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Felipe de Freitas
 */
public class Locacao {
    private int codigoLocacao;
    private int codigoCliente;
    private int codigoFuncionario;
    private String dataLocacao;
    private String dataDevolucao;
    private float valorTotal;
    private ArrayList<Seguro> segurosContratados;
    private boolean finalizada;
    

    
    public Locacao(int codigoLocacao, int codigoCliente, int codigoFuncionario,
                    String dataLocacao, String dataDevolucao, boolean finalizada){
        this.codigoLocacao = codigoLocacao;
        this.codigoCliente = codigoCliente;
        this.codigoFuncionario = codigoFuncionario;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.finalizada = finalizada;
    }

    public int getCodigoLocacao() {
        return codigoLocacao;
    }

    public void setCodigoLocacao(int codigoLocacao) {
        this.codigoLocacao = codigoLocacao;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ArrayList<Seguro> getSegurosContratados() {
        return segurosContratados;
    }

    public void setSegurosContratados(ArrayList<Seguro> segurosContratados) {
        this.segurosContratados = segurosContratados;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }
    
    public String imprimirLocacao(){
        String relatorio = "\nCódigo de locação: " + this.codigoLocacao +
                           "\nCódigo de cliente: " + this.codigoCliente +
                           "\nCódigo de funcionário: " + this.codigoFuncionario +
                           "\nData de locação: " + this.dataLocacao +
                           "\nData de devolução: " + this.dataDevolucao +
                           "\nValor total: " + this.valorTotal;
        return relatorio; 
    }
}
