/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package poo.lista1;

import java.util.Scanner;

/**
 *
 * @author iuryp
 */
public class Lista1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World!");
        /*
        
        System.out.println("-------- EXERCICIO 1 --------");
        Ex1 exercicio1 = new Ex1();
        int valorSoma = exercicio1.soma(1,2);
        System.out.println("Resultado: " + valorSoma);
        
        // teste static method
        int valorMultiplicacao = multiplicacao(5, 5);
        System.out.println("Resultado multiplicacao: " + valorMultiplicacao);
        
        
        System.out.println("-------- EXERCICIO 2 --------");
        
        Ex2 exercicio2 = new Ex2();
        exercicio2.leituraTeclado();
        
        System.out.println("-------- EXERCICIO 3 --------");
        Ex3 exercicio3 = new Ex3();
        int maior = exercicio3.acharMaior();
        System.out.printf("Maior numero digitado: %d \n", maior);
        
        
        System.out.println("-------- EXERCICIO 4 --------");
        Ex4 exercicio4 = new Ex4();
        exercicio4.acharDoisMaiores();
        
        System.out.println("\n -------- EXERCICIO 5 --------");
        Ex5 exercicio5 = new Ex5();
        System.out.print("Digite um valor inicial: ");
        int valorInicial = sc.nextInt();
        
        System.out.print("Digite uma razao: ");
        int razao = sc.nextInt();
        
        exercicio5.termosPA(valorInicial, razao);

        */
        System.out.println("\n -------- EXERCICIO 6 --------");
        Ex6 exercicio6 = new Ex6();
        exercicio6.shortestOfAll();
    }
    
    
    // teste
    static int multiplicacao(int num1, int num2){
        int resultado = num1 * num2;
        return resultado;
    }
}
