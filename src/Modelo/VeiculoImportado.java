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
public class VeiculoImportado extends Veiculo{
    protected float taxaImpostoEstadual;
    protected float taxaImpostoFederal;
    
    public VeiculoImportado(int codigoVeiculo, String nomeModelo, String montadora, 
                    int anoFabricacao, int anoModelo, String placa,
                    String categoria, float valorFipe, float valorDiaria,
                    boolean alugado, float taxaImpostoEstadual, 
                    float taxaImpostoFederal){
        super(codigoVeiculo, nomeModelo, montadora, anoFabricacao, anoModelo,
                placa, categoria, valorFipe, valorDiaria, alugado);
        this.taxaImpostoEstadual = taxaImpostoEstadual;
        this.taxaImpostoFederal = taxaImpostoFederal;
    }

    public float getTaxaImpostoFederal() {
        return taxaImpostoFederal;
    }

    public void setTaxaImpostoFederal(float taxaImpostoFederal) {
        this.taxaImpostoFederal = taxaImpostoFederal;
    }
    
    public float getTaxaImpostoEstadual() {
        return taxaImpostoEstadual;
    }

    public void setTaxaImpostoEstadual(float taxaImpostoEstadual) {
        this.taxaImpostoEstadual = taxaImpostoEstadual;
    }
    
    public void imprimirVeiculoImportado(){
        System.out.println("");
    }
}
