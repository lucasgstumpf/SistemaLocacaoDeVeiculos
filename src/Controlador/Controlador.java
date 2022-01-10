/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Controle;
import Modelo.Funcionario;
import Modelo.Locacao;
import Modelo.Seguro;
import Modelo.VeiculoImportado;
import Modelo.VeiculoNacional;

/**
 *
 * @author Felipe de Freitas
 */
public class Controlador {
    private final Controle controle = new Controle();
    
    public void addVeiculosImportados(int codigoVeiculo, String nomeModelo, 
            String montadora, int anoFabricacao, int anoModelo, String placa,
            String categoria, float valorFipe, float valorDiaria, boolean alugado,
            float taxaImpostoEstadual, float taxaImpostoFederal){
        
        VeiculoImportado v = new VeiculoImportado(codigoVeiculo, nomeModelo, montadora,
            anoFabricacao, anoModelo, placa, categoria, valorFipe, valorDiaria, 
            alugado, taxaImpostoEstadual, taxaImpostoFederal);
        
        controle.addVeiculos(v);
    }
    
    public void addVeiculosNacionais(int codigoVeiculo, String nomeModelo, 
            String montadora, int anoFabricacao, int anoModelo, String placa,
            String categoria, float valorFipe, float valorDiaria, boolean alugado,
            float taxaImpostoEstadual){
        
        VeiculoNacional v = new VeiculoNacional(codigoVeiculo, nomeModelo, montadora,
            anoFabricacao, anoModelo, placa, categoria, valorFipe, valorDiaria, 
            alugado, taxaImpostoEstadual);
        
        controle.addVeiculos(v);
    }
    
    public void addClientes(int codigoUsuario, String nome, String cpf, String rg,
            String dataNascimento, String endereco, String cep, String email,
            String categoriaCNH, String numeroCNH, String validadeCNH,
            boolean clienteOuro){
        
        Cliente c = new Cliente(codigoUsuario, nome, cpf, rg, dataNascimento, 
            endereco, cep, email, categoriaCNH, numeroCNH, validadeCNH, clienteOuro);
        
        controle.addClientes(c);
    }
    
    public void addFuncionarios(int codigoUsuario, String nome, String cpf, String rg,
            String dataNascimento, String endereco, String cep, String email,
            float salario, String pis, String dataAdmissao){
        
        Funcionario f = new Funcionario(codigoUsuario, nome, cpf, rg, dataNascimento, 
            endereco, cep, email, salario, pis, dataAdmissao);
        
        controle.addFuncionarios(f);
    }
    
    public void addLocacoes(int codigoLocacao, int codigoCliente, int codigoFuncionario,
                    String dataLocacao, String dataDevolucao, float valorTotal,
                    boolean finalizada){
        
        Locacao l = new Locacao(codigoLocacao, codigoCliente, codigoFuncionario,
            dataLocacao, dataDevolucao, valorTotal, finalizada);
        
        controle.addLocacao(l);
    }
    
    public void addSeguros(int codigoSeguro, String nome, String tipo, 
            String descricao, float valor){
        
        Seguro s = new Seguro(codigoSeguro, nome, tipo, descricao, valor);
        
        controle.addSeguros(s);
    }
}
