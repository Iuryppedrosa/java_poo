/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.exercicio_polimorfism;

/**
 *
 * @author iuryp
 */
public abstract class Funcionario {
    private String nome;
    private String dataNascimento;
    
    protected Funcionario(String nome, String dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    
    public abstract double calcularSalario();

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getDataNascimento() {
        return dataNascimento;
    }

    protected void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
}
