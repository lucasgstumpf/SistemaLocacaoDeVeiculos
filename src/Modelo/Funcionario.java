/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Calendar;

/**
 *
 * @author Felipe de Freitas
 */
public class Funcionario extends Usuario{
    protected float salario;
    protected String pis;
    protected String dataAdmissao;

    public Funcionario(int codigoUsuario, String nome, String cpf, String rg,
            String dataNascimento, String endereco, String cep, String email,
            float salario, String pis, String dataAdmissao){
        super(codigoUsuario, nome, cpf, rg, dataNascimento, endereco, cep, email);
        this.salario = salario;
        this.pis = pis;
        this.dataAdmissao = dataAdmissao;
    }
    
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
    public String imprimirFuncionarios(){
        String relatorio = "\nCódigo de usuário: " + this.codigoUsuario +
                           "\nNome: " + this.nome +
                           "\nCPF: " + this.cpf +
                           "\nRG: " + this.rg + 
                           "\nData de Nascimento: " + this.dataNascimento +
                           "\nEndereço: " + this.endereco +
                           "\nCEP: " + this.cep +
                           "\nEmail: " + this.email +
                           "\nSálario: " + this.salario +
                           "\nPIS: " + this.pis +
                           "\nData de admissão: " + this.dataAdmissao;
        return relatorio;
    }
}
