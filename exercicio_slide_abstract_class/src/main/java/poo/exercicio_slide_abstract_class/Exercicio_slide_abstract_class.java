/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package poo.exercicio_slide_abstract_class;

/**
 *
 * @author iuryp
 */
public class Exercicio_slide_abstract_class {
    
    

    public static void main(String[] args) {
        Empregado ep[] = new Empregado[5];
        System.out.println("Hello World!");
        
        ep[0] = new Chefe("Joao", "Silva", 1500);
        System.out.println("Nome: " + ep[0].nome);
        System.out.println("Sobrenome: " + ep[0].sobrenome);
        System.out.println("Salario para" + ep[0].nome + "é de:" + ep[0].retornarSalario() + "\n");
        
        ep[1] = new PorComissao("Jairo", "Rezende", 1500, 500, 30);
        System.out.println("Nome: " + ep[1].nome);
        System.out.println("Sobrenome: " + ep[1].sobrenome);
        System.out.println("Salario para" + ep[1].nome + "é de: " + ep[1].retornarSalario() + "\n");  
    }
}
