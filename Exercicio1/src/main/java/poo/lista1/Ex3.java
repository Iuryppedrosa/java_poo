/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.lista1;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author iuryp
 */
public class Ex3 {
    Scanner sc = new Scanner(System.in);
    int maior;
    
   public int acharMaior(){
       for(int i = 0; i < 7; i++){
           System.out.printf("Digite um numero: ");
           int numUser = sc.nextInt();
           if(i == 0){
               maior = numUser;
           }
           if(numUser > maior){
               maior = numUser;
           }
       }
       return maior;
   }
 
    
}
