/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.exercicio_polimorfism;

/**
 *
 * @author iuryp
 */
public class Operario extends Funcionario{
    private double valorProducao;
    private int qtdProduzida;
    
    public Operario(double valorProducao, int qtdProduzida, String nome, String dataNascimento){
        super.setNome(nome);
        super.setDataNascimento(dataNascimento);
        this.qtdProduzida = qtdProduzida;
        this.valorProducao = valorProducao;
    }
    
    public double calcularSalario(){
        return valorProducao * qtdProduzida;
    }
}
