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
public class teste {
    public static void main(String[] args) {
        VeiculoNacional v1 = new VeiculoNacional(01, "Honda", "montadora",
                                                98, 96, "123", "carro",
                                                98, 16, true, 9);
    
        VeiculoImportado v2 = new VeiculoImportado(02, "Honda", "montadora",
                                                98, 96, "123", "carro",
                                                98, 16, false, 10, 11);
        
        Controle c1 = new Controle();
        c1.addVeiculos(v1);
        c1.addVeiculos(v2);
        System.out.println(c1.imprimirTodosVeiculos());
        System.out.println(c1.imprimirVeiculosNacionais());
        System.out.println(c1.imprimirVeiculosImportados());
        System.out.println(c1.imprimirVeiculosDisponiveis());
    }
}
