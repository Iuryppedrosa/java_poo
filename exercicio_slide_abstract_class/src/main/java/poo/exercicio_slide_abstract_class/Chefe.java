/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.exercicio_slide_abstract_class;

/**
 *
 * @author iuryp
 */
public class Chefe extends Empregado {
    int salario;
    
    public Chefe(String nome, String sobrenome, int salario){
        super.nome = nome;
        super.sobrenome = sobrenome;
        this.salario = salario;
    }
    
    
    @Override
    public int retornarSalario(){
        return salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
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
        return "Chefe{" + "salario=" + salario + "Nome: " + super.nome + "SobreNome: " + super.sobrenome + '}';
    }
    
}
