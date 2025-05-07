/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package poo.exercicio_polimorfism;

import java.util.Scanner;

/**
 *
 * @author iuryp
 */
public class Exercicio_polimorfism {
    
    static Funcionario func [] = new Funcionario[4];
    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String escolha = "sim";
        int tipoFuncionario;
        
        do{
            System.out.print("Qual o tipo de funcionario vc deseja criar:\n1-Chefe\n2-Operario\n3-Horista\n4-Vendedor");
            tipoFuncionario = sc.nextInt();
            
        }while(escolha.equalsIgnoreCase("sim"));
    
    }
}
