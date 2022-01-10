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
    protected String validadeCNH;
    protected boolean clienteOuro;

    public Cliente(int codigoUsuario, String nome, String cpf, String rg,
            String dataNascimento, String endereco, String cep, String email,
            String categoriaCNH, String numeroCNH, String validadeCNH,
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

    public String getValidadeCNH() {
        return validadeCNH;
    }

    public void setValidadeCNH(String validadeCNH) {
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
                           "\nData de Nascimento: " + this.dataNascimento +
                           "\nEndereço: " + this.endereco +
                           "\nCEP: " + this.cep +
                           "\nEmail: " + this.email +
                           "\nCategoria CNH: " + this.categoriaCNH +
                           "\nNúmero CNH: " + this.numeroCNH + 
                           "\nValidade CNH: " + this.validadeCNH;
        return relatorio;
    }
}
