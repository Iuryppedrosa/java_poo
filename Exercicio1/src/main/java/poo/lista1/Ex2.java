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
public class Ex2 {
    Scanner sc = new Scanner(System.in);
    double numReal[] = new double[2];
    
    public void leituraTeclado(){
        System.out.printf("Digite um numero real: ");
        numReal[0] = sc.nextDouble();    
        
        System.out.printf("Digite outro numero real: ");
        numReal[1] = sc.nextDouble();  
        
        System.out.printf("Numeros digitados: %.2f %.2f \n", numReal[0], numReal[1]);
        
        double temp = numReal[0];
        numReal[0] = numReal[1];
        numReal[1] = temp;
        
        System.out.printf("Trocando numeros: %.2f %.2f \n", numReal[0], numReal[1]);
    }
    
    
}
