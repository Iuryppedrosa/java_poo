 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.lista1;

import java.util.Scanner;

/**
 *
 * @author iuryp
 */
public class Ex6 {
    Scanner sc = new Scanner(System.in);
    
   public void shortestOfAll(){
       double menor = 0;
       double valores[] = new double[5];
       for(int i = 0; i < 5; i++){
           System.out.print("Digite um numero: ");
           valores[i] = sc.nextDouble();
           
           if(i == 0){
              menor = valores[i];
           }
           
           if(valores[i] < menor){
               menor = valores[i];
           }
       }
       
       System.out.printf("Menor: %.2f \n", menor);
       
       for(int i = 0; i < 5; i++){
           valores[i] += menor;
           System.out.printf("%.2f, ", valores[i]);
       }
   }
}
