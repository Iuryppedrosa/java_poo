/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.exercicio_slide_abstract_class;

/**
 *
 * @author iuryp
 */
public class PorHora extends Empregado {
    int valorHora;
    int totalHoras;
    
    public PorHora(String nome, String sobrenome, int valorHora, int totalHoras){
        super.nome = nome;
        super.sobrenome = sobrenome;
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }
    
    @Override
    public int retornarSalario(){
        return valorHora * totalHoras;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
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
        return "PorHora{" + "Nome: " + super.nome + "SobreNome: " + super.sobrenome + "valorHora=" + valorHora + ", totalHoras=" + totalHoras + '}';
    }
    
    
}
