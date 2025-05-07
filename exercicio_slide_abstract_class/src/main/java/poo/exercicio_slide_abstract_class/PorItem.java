/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.exercicio_slide_abstract_class;

/**
 *
 * @author iuryp
 */
public class PorItem extends Empregado{
    private int valorProducao;
    private int qtdProduzida;
    
    
    public PorItem(String nome, String sobrenome, int valorProducao, int qtdProduzida){
        super.nome = nome;
        super.sobrenome = sobrenome;
        this.valorProducao = valorProducao;
        this.qtdProduzida = qtdProduzida;
    }
    
    @Override
    public int retornarSalario(){
        return valorProducao * qtdProduzida;
    }

    public int getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(int valorProducao) {
        this.valorProducao = valorProducao;
    }

    public int getQtdProduzida() {
        return qtdProduzida;
    }

    public void setQtdProduzida(int qtdProduzida) {
        this.qtdProduzida = qtdProduzida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    

    @Override
    public String toString() {
        return "PorItem{" + "Nome: " + super.nome + "SObrenome: " + super.sobrenome + "valorProducao=" + valorProducao + ", qtdProduzida=" + qtdProduzida + '}';
    }
    
    
}
