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
    
    public void imprimirTodosVeiculos(){
        System.out.println("Todos veículos cadastrados:");
        int contador = 1;
        for(Veiculo veiculo : this.veiculos){
            System.out.println("\n#" + contador);
            veiculo.imprimirVeiculos();
            contador++;
        }
        
        
    }
    
    public void imprimirVeiculosNacionais(){
        System.out.println("\nVeículos nacionais:");
        int contador = 1;
        for(Veiculo veiculo : this.veiculos){
            if(veiculo.getClass() == VeiculoNacional.class){
                System.out.println("\n#" + contador);
                veiculo.imprimirVeiculos();
                contador++;
            }
        }
    }
    
    public void imprimirVeiculosImportados(){
        System.out.println("\nVeículos Importados:");
        int contador = 1;
        for(Veiculo veiculo : this.veiculos){
            if(veiculo.getClass() == VeiculoImportado.class){
                System.out.println("\n#" + contador);
                veiculo.imprimirVeiculos();
                contador++;
            }
        }
    }
    
    public void imprimirVeiculosDisponiveis(){
        System.out.println("\nVeículos disponíveis para locação: ");
        int contador = 1;
        for(Veiculo veiculo : this.veiculos){
            if(veiculo.isAlugado() == false){
                System.out.println("\n#" + contador);
                veiculo.imprimirVeiculos();
                contador++;
            }
        }
    }
    
    public void imprimirVeiculosIndisponiveis(){
        System.out.println("\nVeículos disponíveis para locação: ");
        int contador = 1;
        for(Veiculo veiculo : this.veiculos){
            if(veiculo.isAlugado() == true){
                System.out.println("\n#" + contador);
                veiculo.imprimirVeiculos();
                contador++;
            }
        }
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
    
    public void imprimirTodosFuncionarios(){
        System.out.println("\nFuncionários cadastrados:");
        int contador = 1;
        for(Funcionario funcionario : this.funcionarios){
            System.out.println("\n#" + contador);
            funcionario.imprimirFuncionarios();
            contador++;
        }
    }
    
    
    public void imprimirTodosClientes(){
        System.out.println("\nClientes cadastrados:");
        int contador = 1;
        for(Cliente cliente : this.clientes){
            System.out.println("\n#" + contador);
            cliente.imprimirCliente();
            contador++;
        }
    }
    
    public void imprimirLocacoesPorCliente(int codigoCliente){
        System.out.println("\nLocação por cliente: ");
        int contador = 1;
        for(Locacao locacao : this.locacoes){
            if(locacao.getCodigoCliente() == codigoCliente){
                System.out.println("\n#" + contador);
                locacao.imprimirLocacao();
                contador++;
            }
        }
    }
    
    public void imprimirTodasLocacoes(){
        System.out.println("\nLocação por cliente: ");
        int contador = 1;
        for(Locacao locacao : this.locacoes){
            System.out.println("\n#" + contador);
            locacao.imprimirLocacao();
            contador++;
        }
    }
    
    public void imprimirTodosSeguros(){
        System.out.println("\nSeguros: ");
        int contador = 1;
        for(Seguro seguro : this.seguros){
            System.out.println("\n#" + contador);
            seguro.imprimirSeguro();
            contador++;
        }
    }
}
