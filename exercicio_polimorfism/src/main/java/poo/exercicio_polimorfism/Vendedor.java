/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.exercicio_polimorfism;

/**
 *
 * @author iuryp
 */
public class Vendedor extends Funcionario{
    private double valorFixo;
    private double comissao;
    private int qtdVendas;

    public Vendedor(double valorFixo, double comissao, int qtdVendas, String nome, String dataNascimento){
        super.setNome(nome);
        super.setDataNascimento(dataNascimento);
        this.valorFixo = valorFixo;
        this.comissao = comissao;
        this.qtdVendas = qtdVendas;
    }
    
    
    
    public double calcularSalario(){
        return (valorFixo + comissao) * qtdVendas;
    }
    
        public double getValorFixo() {
        return valorFixo;
    }

    public void setValorFixo(double valorFixo) {
        this.valorFixo = valorFixo;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getQtd_vendas() {
        return qtd_vendas;
    }

    public void setQtd_vendas(int qtd_vendas) {
        this.qtd_vendas = qtd_vendas;
    }
    
}
