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
public class Cliente extends Usuario{
    protected String categoriaCNH;
    protected String numeroCNH;
    protected Calendar validadeCNH;
    protected boolean clienteOuro;

    public Cliente(int codigoUsuario, String nome, String cpf, String rg,
            Calendar dataNascimento, String endereco, String cep, String email,
            String categoriaCNH, String numeroCNH, Calendar validadeCNH,
            boolean clienteOuro){
        super(codigoUsuario, nome, cpf, rg, dataNascimento, endereco, cep, email);
        this.categoriaCNH = categoriaCNH;
        this.numeroCNH = numeroCNH;
        this.validadeCNH = validadeCNH;
        this.clienteOuro = clienteOuro;
    }
    
    public String getCategoriaCNH() {
        return categoriaCNH;
    }

    public void setCategoriaCNH(String categoriaCNH) {
        this.categoriaCNH = categoriaCNH;
    }

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

    public Calendar getValidadeCNH() {
        return validadeCNH;
    }

    public void setValidadeCNH(Calendar validadeCNH) {
        this.validadeCNH = validadeCNH;
    }

    public boolean isClienteOuro() {
        return clienteOuro;
    }

    public void setClienteOuro(boolean clienteOuro) {
        this.clienteOuro = clienteOuro;
    }
    
    public String imprimirCliente(){
        String relatorio = "\nCódigo de usuário: " + this.codigoUsuario +
                           "\nNome: " + this.nome +
                           "\nCPF: " + this.cpf +
                           "\nRG: " + this.rg + 
                           "\nData de Nascimento: "  + this.dataNascimento.get(Calendar.DAY_OF_MONTH) + "/" + this.dataNascimento.get(Calendar.MONTH + 1) + "/" + this.dataNascimento.get(Calendar.YEAR) +
                           "\nEndereço: " + this.endereco +
                           "\nCEP: " + this.cep +
                           "\nEmail: " + this.email +
                           "\nCategoria CNH: " + this.categoriaCNH +
                           "\nNúmero CNH: " + this.numeroCNH + 
                           "\nValidade CNH: " + this.validadeCNH.get(Calendar.DAY_OF_MONTH) + "/" + this.validadeCNH.get(Calendar.MONTH + 1) + "/" + this.validadeCNH.get(Calendar.YEAR) ;
        return relatorio;
    }
}
