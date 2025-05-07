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
public class Ex5 {
    
    Scanner sc = new Scanner(System.in);
    
    
    public void termosPA(int inicial, int razao){
        int listaPA[] = new int[20];
        // an = a1 + (n -1) * r;
        
        for(int i =0; i < 20; i++){
            listaPA[i] = inicial + razao;
            inicial = listaPA[i];
            System.out.printf("Lista PA %d: %d\n", i, listaPA[i]);
        }        
    }
    
}
