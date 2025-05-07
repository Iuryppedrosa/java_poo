/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.exercicio_polimorfism;

/**
 *
 * @author iuryp
 */
public class Chefe extends Funcionario{
    private double salario;
    
    public Chefe(double salario, String nome, String dataNascimento){
        super.setNome(nome);
        super.setDataNascimento(dataNascimento);
        this.salario = salario;
    }
    
    @Override
    public double calcularSalario(){
        return salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
