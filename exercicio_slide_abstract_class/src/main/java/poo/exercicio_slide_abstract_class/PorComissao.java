/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.exercicio_slide_abstract_class;

/**
 *
 * @author iuryp
 */
public class PorComissao extends Empregado {
    
    private int valorFixo;
    private int comissao;
    private int vendas;
    
    public PorComissao(String nome, String sobrenome, int valorFixo, int comissao, int vendas){
        super.nome = nome;
        super.sobrenome = sobrenome;
        this.valorFixo = valorFixo;
        this.comissao = comissao;
        this.vendas = vendas;
    }
    
    @Override
    public int retornarSalario(){
        return (valorFixo + comissao) * vendas;
    }

    public int getSalario() {
        return valorFixo;
    }

    public void setSalario(int salario) {
        this.valorFixo = salario;
    }

    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
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
        return "PorComissao{" + "salario=" + valorFixo + ", comissao=" + comissao + ", vendas=" + vendas + ", nome=" + super.nome + "sobreNome= " + super.sobrenome + '}';
    }
   
}
