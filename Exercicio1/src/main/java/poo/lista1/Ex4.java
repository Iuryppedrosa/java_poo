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
public class Ex4 {
    
    Scanner sc = new Scanner(System.in);
    int listaNumeros[] = new int[10];
    int maiores[] = new int[2];
      
   public int[] acharDoisMaiores(){
       for(int i = 0; i < 10; i++){
           System.out.printf("Digite um numero: ");
           int numUser = sc.nextInt();
           listaNumeros[i] = numUser;
       }
       
       maiores[0] = listaNumeros[0];
       maiores[1] = listaNumeros[1];
       
       if(maiores[0] < maiores[1]){
           int temp = maiores[0];
           maiores[0] = maiores[1];
           maiores[1] = temp;
       }
       
       for(int i = 2; i < 10; i++){
           if(listaNumeros[i] > maiores[0]){
               maiores[1] = maiores[0];
               maiores[0] = listaNumeros[i];
           }else if(listaNumeros[i] > maiores[1] && listaNumeros[i] < maiores[0]){
               maiores[1] = listaNumeros[i];
           }
       }
       
       System.out.printf("Dois maiores digitados sao: %d %d", maiores[0], maiores[1]);
       return maiores;
   }
    
}
