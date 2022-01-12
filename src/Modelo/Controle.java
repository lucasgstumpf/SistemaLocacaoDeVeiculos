/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

/**
 *
 * @author Felipe de Freitas
 */
public final class Controle {

    private final static ArrayList<Locacao> locacoes = new ArrayList();
    private final static ArrayList<Veiculo> veiculos = new ArrayList();
    private final static ArrayList<Cliente> clientes = new ArrayList();
    private final static ArrayList<Funcionario> funcionarios = new ArrayList();
    private final static ArrayList<Seguro> seguros = new ArrayList();

    public Controle() {
    }

    public void addLocacao(Locacao l) {
        this.locacoes.add(l);
    }

    public void removeLocacao(int codigoLocacao) {
        for (Locacao locacao : this.locacoes) {
            if (locacao.getCodigoLocacao() == codigoLocacao) {
                this.locacoes.remove(locacao);
                break;
            }
        }
    }

    public void addVeiculos(Veiculo v) {
        this.veiculos.add(v);
    }

    public void removeVeiculo(int codigoVeiculo) {
        for (Veiculo veiculo : this.veiculos) {
            if (veiculo.getCodigoVeiculo() == codigoVeiculo) {
                this.veiculos.remove(veiculo);
                break;
            }
        }
    }

    public void addClientes(Cliente c) {
        this.clientes.add(c);
    }

    public void removeCliente(int codigoCliente) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getCodigoUsuario() == codigoCliente) {
                this.clientes.remove(cliente);
                break;
            }
        }
    }

    public void addFuncionarios(Funcionario f) {
        this.funcionarios.add(f);
    }

    public void removeFuncionario(int codigoFuncionario) {
        for (Funcionario funcionario : this.funcionarios) {
            if (funcionario.getCodigoUsuario() == codigoFuncionario) {
                this.funcionarios.remove(funcionario);
                break;
            }
        }
    }

    public void addSeguros(Seguro s) {
        this.seguros.add(s);
    }

    public void removeSeguro(int getCodigoSeguro) {
        for (Seguro seguro : this.seguros) {
            if (seguro.getCodigoSeguro() == getCodigoSeguro) {
                this.seguros.remove(seguro);
                break;
            }
        }
    }

    public String imprimirTodosVeiculos() {
        System.out.println("Todos veículos cadastrados:");
        int contador = 1;
        String relatorio = "";
        for (Veiculo veiculo : this.veiculos) {
            relatorio += "\n\n#" + contador;
            relatorio += veiculo.imprimirVeiculos();
            contador++;
        }

        return relatorio;
    }

    public String imprimirVeiculosNacionais() {
        System.out.println("\nVeículos nacionais:");
        int contador = 1;
        String relatorio = "";
        for (Veiculo veiculo : this.veiculos) {
            if (veiculo.getClass() == VeiculoNacional.class) {
                relatorio += "\n\n#" + contador;
                relatorio += veiculo.imprimirVeiculos();
                contador++;
            }
        }
        return relatorio;
    }

    public String imprimirVeiculosImportados() {
        System.out.println("\nVeículos Importados:");
        int contador = 1;
        String relatorio = "";
        for (Veiculo veiculo : this.veiculos) {
            if (veiculo.getClass() == VeiculoImportado.class) {
                relatorio += "\n\n#" + contador;
                relatorio += veiculo.imprimirVeiculos();
                contador++;
            }
        }
        return relatorio;
    }

    public String imprimirVeiculosDisponiveis() {
        System.out.println("\nVeículos disponíveis para locação: ");
        int contador = 1;
        String relatorio = "";
        for (Veiculo veiculo : this.veiculos) {
            if (veiculo.isAlugado() == false) {
                relatorio += "\n\n#" + contador;
                relatorio += veiculo.imprimirVeiculos();
                contador++;
            }
        }
        return relatorio;
    }

    public String imprimirVeiculosIndisponiveis() {
        System.out.println("\nVeículos disponíveis para locação: ");
        int contador = 1;
        String relatorio = "";
        for (Veiculo veiculo : this.veiculos) {
            if (veiculo.isAlugado() == true) {
                relatorio += "\n\n#" + contador;
                relatorio += veiculo.imprimirVeiculos();
                contador++;
            }
        }
        return relatorio;
    }

    public String imprimirTodosFuncionarios() {
        System.out.println("\nFuncionários cadastrados:");
        int contador = 1;
        String relatorio = "";
        for (Funcionario funcionario : this.funcionarios) {
            relatorio += "\n\n#" + contador;
            relatorio += funcionario.imprimirFuncionarios();
            contador++;
        }
        return relatorio;
    }

    public String imprimirTodosClientes() {
        System.out.println("\nClientes cadastrados:");
        int contador = 1;
        String relatorio = "";
        for (Cliente cliente : this.clientes) {
            relatorio += "\n\n#" + contador;
            relatorio += cliente.imprimirCliente();
            contador++;
        }
        return relatorio;
    }

    public String imprimirLocacoesPorCliente(int codigoCliente) {
        System.out.println("\nLocação por cliente: ");
        int contador = 1;
        String relatorio = "";
        for (Locacao locacao : this.locacoes) {
            if (locacao.getCodigoCliente() == codigoCliente) {
                relatorio += "\n\n#" + contador;
                relatorio += locacao.imprimirLocacao();
                contador++;
            }
        }
        return relatorio;
    }

    public String imprimirTodasLocacoes() {
        System.out.println("\nLocação por cliente: ");
        int contador = 1;
        String relatorio = "";
        for (Locacao locacao : this.locacoes) {
            relatorio += "\n\n#" + contador;
            relatorio += locacao.imprimirLocacao();
            contador++;
        }
        return relatorio;
    }

    public String imprimirTodosSeguros() {
        System.out.println("\nSeguros: ");
        int contador = 1;
        String relatorio = "";
        for (Seguro seguro : this.seguros) {
            relatorio += "\n\n#" + contador;
            relatorio += seguro.imprimirSeguro();
            contador++;
        }
        return relatorio;
    }

    public String imprimirLocacoesFinalizadas() {
        int contador = 1;
        String relatorio = "";
        for (Locacao locacao : this.locacoes) {
            if (!locacao.isFinalizada()) {
                relatorio += "\n\n#" + contador;
                relatorio += locacao.imprimirLocacao();
                contador++;
            }
        }
        return relatorio;
    }

    public String imprimirLocacoesNaoFinalizadas() {
        int contador = 1;
        String relatorio = "";
        for (Locacao locacao : this.locacoes) {
            if (locacao.isFinalizada()) {
                relatorio += "\n\n#" + contador;
                relatorio += locacao.imprimirLocacao();
                contador++;
            }
        }
        return relatorio;
    }

    public String imprimirLocacoesAtradadas() {
        String relatorio = "";
        int contador = 1;
        Calendar hoje = Calendar.getInstance();
        for (Locacao locacao : this.locacoes) {
            if (locacao.getDataDevolucao().before(hoje)) {
                relatorio += "\n\n#" + contador;
                relatorio += locacao.imprimirLocacao();
                contador++;
            }
        }
        return relatorio;
    }

    public String imprimirLocacoesMes(int mes) {
        String relatorio = "";
        int contador = 1;
        for (Locacao locacao : this.locacoes) {
            if (locacao.getDataDevolucao().get(Calendar.MONTH + 1) == mes) {
                relatorio += "\n\n#" + contador;
                relatorio += locacao.imprimirLocacao();
                contador++;
            }
        }
        return relatorio;
    }

    public String imprimirVeiculosAtradados() {
        String relatorio = "";
        int contador = 1;
        Calendar hoje = Calendar.getInstance();
        for (Locacao locacao : this.locacoes) {
            if (locacao.getDataDevolucao().before(hoje)) {
                for (Veiculo veiculo : this.veiculos){
                    if (locacao.getCodigoVeiculo() == veiculo.getCodigoVeiculo()){
                        relatorio += "\n\n#" + contador;
                        relatorio += veiculo.imprimirVeiculos();
                        contador++;
                    }
                }
            }
        }
        return relatorio;
    }
    
    public String imprimirFuncionariosMes() {
        String relatorio = "\nFuncionário dos meses:";
        for (int i = 1; i <= 12; i++) {
            int maior = 0;
            int codigo = 0;
            ArrayList<Integer> listaCodigoFuncionario = new ArrayList();
            for (Locacao locacao : this.locacoes) {
                listaCodigoFuncionario.add(locacao.getCodigoFuncionario());
            }
            for (int j : listaCodigoFuncionario) {
                codigo = Collections.frequency(listaCodigoFuncionario, j);
                if (codigo > maior) {
                    codigo = maior;
                }
            }
            for (Funcionario funcionario : this.funcionarios) {
                if (funcionario.getCodigoUsuario() == codigo) {
                    relatorio += "\n#" + i + ": " + funcionario.imprimirFuncionarios();
                }
            }
        }
        return relatorio;
    }
    
    public String imprimirVeiculoCliente(int codigoCliente){
        String relatorio = "";
        int contador = 1;
        for (Locacao locacao : this.locacoes){
            if(locacao.getCodigoCliente() == codigoCliente){
                for(Veiculo veiculo : this.veiculos){
                    if(veiculo.getCodigoVeiculo() == locacao.getCodigoVeiculo()){
                        relatorio += "\n\n#" + contador;
                        relatorio += veiculo.imprimirVeiculos();
                        contador++;
                    }
                }
            }
        }
        return relatorio;
    }
}
