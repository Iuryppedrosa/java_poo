/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.exercicio_polimorfism;

/**
 *
 * @author iuryp
 */
public class Horista extends Funcionario{
    
    private double valorPorHora;
    private double horasTrabalhadas;
    
    public Horista(double valorPorHora, double horasTrabalhadas, String nome, String dataNascimento){
        super.setNome(nome);
        super.setDataNascimento(dataNascimento);
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public double calcularSalario(){
        return valorPorHora * horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    
}
