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
    private Calendar dataLocacao;
    private Calendar dataDevolucao;
    private float valorTotal;
    private ArrayList<Seguro> segurosContratados;
    private boolean finalizada;
    private int codigoVeiculo;
    
    public Locacao(int codigoLocacao, int codigoCliente, int codigoFuncionario,
                    Calendar dataLocacao, Calendar dataDevolucao, boolean finalizada, int codigoVeiculo){
        this.codigoLocacao = codigoLocacao;
        this.codigoCliente = codigoCliente;
        this.codigoFuncionario = codigoFuncionario;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.finalizada = finalizada;
        this.codigoVeiculo = codigoVeiculo;
    }
        
    public int getCodigoVeiculo() {
        return codigoVeiculo;
    }

    public void setCodigoVeiculo(int codigoVeiculo) {
        this.codigoVeiculo = codigoVeiculo;
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

    public Calendar getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Calendar dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
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
        int mes = this.dataLocacao.get(Calendar.MONTH) + 1;
        int mes2 = this.dataDevolucao.get(Calendar.MONTH) + 1;
        String relatorio = "\nCódigo de locação: " + this.codigoLocacao +
                           "\nCódigo de cliente: " + this.codigoCliente +
                           "\nCódigo de funcionário: " + this.codigoFuncionario +
                           "\nCódigo do veicúlo: " + this.codigoVeiculo +
                           "\nData de locação: " +  this.dataLocacao.get(Calendar.DAY_OF_MONTH) + "/" + mes + "/" + this.dataLocacao.get(Calendar.YEAR) +
                           "\nData de devolução: " + this.dataDevolucao.get(Calendar.DAY_OF_MONTH) + "/" + mes2 + "/" + this.dataDevolucao.get(Calendar.YEAR) +
                           "\nValor total: " + this.valorTotal;
        return relatorio; 
    }
}
