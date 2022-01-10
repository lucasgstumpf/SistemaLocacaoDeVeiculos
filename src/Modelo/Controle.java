/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Felipe de Freitas
 */
public class Controle {
    private final ArrayList<Locacao> locacoes = new ArrayList();
    private final ArrayList<Veiculo> veiculos = new ArrayList();
    private final ArrayList<Cliente> clientes = new ArrayList();
    private final ArrayList<Funcionario> funcionarios = new ArrayList();
    private final ArrayList<Seguro> seguros = new ArrayList();
    
    public Controle(){
    }
    
    public void addLocacao(Locacao l){
        this.locacoes.add(l);
    }
    
    public void removeLocacao(int codigoLocacao){
        for(Locacao locacao : this.locacoes){
            if(locacao.getCodigoLocacao() == codigoLocacao){
                this.locacoes.remove(locacao);
                break;
            }
        }
    }
    
    public void addVeiculos(Veiculo v){
        this.veiculos.add(v);
    }
    
    public void removeVeiculo(int codigoVeiculo){
        for(Veiculo veiculo : this.veiculos){
            if(veiculo.getCodigoVeiculo() == codigoVeiculo){
                this.veiculos.remove(veiculo);
                break;
            }
        }
    }
            
    public void addClientes(Cliente c){
        this.clientes.add(c);
    }
    
    public void removeCliente(int codigoCliente){
        for(Cliente cliente : this.clientes){
            if(cliente.getCodigoUsuario() == codigoCliente){
                this.clientes.remove(cliente);
                break;
            }
        }
    }
    
    public void addFuncionarios(Funcionario f){
        this.funcionarios.add(f);
    }
   
    public void removeFuncionario(int codigoFuncionario){
        for(Funcionario funcionario : this.funcionarios){
            if(funcionario.getCodigoUsuario() == codigoFuncionario){
                this.funcionarios.remove(funcionario);
                break;
            }
        }
    }
    
    public void addSeguros(Seguro s){
        this.seguros.add(s);
    }
    
    public void removeSeguro(int getCodigoSeguro){
        for(Seguro seguro : this.seguros){
            if(seguro.getCodigoSeguro() == getCodigoSeguro){
                this.seguros.remove(seguro);
                break;
            }
        }
    }
    
    public String imprimirTodosVeiculos(){
        System.out.println("Todos veículos cadastrados:");
        int contador = 1;
        String relatorio = "";
        for(Veiculo veiculo : this.veiculos){
            relatorio += "\n\n#" + contador;
            relatorio += veiculo.imprimirVeiculos();
            contador++;
        }
        
        return relatorio;
    }
    
    public String imprimirVeiculosNacionais(){
        System.out.println("\nVeículos nacionais:");
        int contador = 1;
        String relatorio = "";
        for(Veiculo veiculo : this.veiculos){
            if(veiculo.getClass() == VeiculoNacional.class){
                relatorio += "\n\n#" + contador;
                relatorio += veiculo.imprimirVeiculos();
                contador++;
            }
        }
        return relatorio;
    }
    
    public String imprimirVeiculosImportados(){
        System.out.println("\nVeículos Importados:");
        int contador = 1;
        String relatorio = "";
        for(Veiculo veiculo : this.veiculos){
            if(veiculo.getClass() == VeiculoImportado.class){
                relatorio += "\n\n#" + contador;
                relatorio += veiculo.imprimirVeiculos();
                contador++;
            }
        }
        return relatorio;
    }
    
    public String imprimirVeiculosDisponiveis(){
        System.out.println("\nVeículos disponíveis para locação: ");
        int contador = 1;
        String relatorio = "";
        for(Veiculo veiculo : this.veiculos){
            if(veiculo.isAlugado() == false){
                relatorio += "\n\n#" + contador;
                relatorio += veiculo.imprimirVeiculos();
                contador++;
            }
        }
        return relatorio;
    }
    
    public String imprimirVeiculosIndisponiveis(){
        System.out.println("\nVeículos disponíveis para locação: ");
        int contador = 1;
        String relatorio = "";
        for(Veiculo veiculo : this.veiculos){
            if(veiculo.isAlugado() == true){
                relatorio += "\n\n#" + contador;
                relatorio += veiculo.imprimirVeiculos();
                contador++;
            }
        }
        return relatorio;
    }
    
    /**
    public void imprimirVeiculosPorCliente(int codigoCliente){
        System.out.println("");
        for(Locacao locacao : this.locacoes){
            if(locacao.getCodigoCliente() == codigoCliente){
                for(Veiculo veiculo : this.veiculos){
                    if(veiculo.getCodigoVeiculo() == locacao.get)
                }
            }
        }
    }
    **/
    
    public String imprimirTodosFuncionarios(){
        System.out.println("\nFuncionários cadastrados:");
        int contador = 1;
        String relatorio = "";
        for(Funcionario funcionario : this.funcionarios){
            relatorio += "\n\n#" + contador;
            relatorio += funcionario.imprimirFuncionarios();
            contador++;
        }
        return relatorio;
    }
    
    
    public String imprimirTodosClientes(){
        System.out.println("\nClientes cadastrados:");
        int contador = 1;
        String relatorio = "";
        for(Cliente cliente : this.clientes){
            relatorio += "\n\n#" + contador;
            relatorio += cliente.imprimirCliente();
            contador++;
        }
        return relatorio;
    }
    
    public String imprimirLocacoesPorCliente(int codigoCliente){
        System.out.println("\nLocação por cliente: ");
        int contador = 1;
        String relatorio = "";
        for(Locacao locacao : this.locacoes){
            if(locacao.getCodigoCliente() == codigoCliente){
                relatorio += "\n\n#" + contador;
                relatorio += locacao.imprimirLocacao();
                contador++;
            }
        }
        return relatorio;
    }
    
    public String imprimirTodasLocacoes(){
        System.out.println("\nLocação por cliente: ");
        int contador = 1;
        String relatorio = "";
        for(Locacao locacao : this.locacoes){
            relatorio += "\n\n#" + contador;
            relatorio += locacao.imprimirLocacao();
            contador++;
        }
        return relatorio;
    }
    
    public String imprimirTodosSeguros(){
        System.out.println("\nSeguros: ");
        int contador = 1;
        String relatorio = "";
        for(Seguro seguro : this.seguros){
            relatorio += "\n\n#" + contador;
            relatorio += seguro.imprimirSeguro();
            contador++;
        }
        return relatorio;
    }
}
