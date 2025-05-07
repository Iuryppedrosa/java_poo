/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pratica_excecoes;

/**
 *
 * @author iuryp
 */
public class TesteFilha extends TestePai{
    int valorDois;
    
    public TesteFilha(int valor, int valorDois){
        super(valor);
        this.valorDois = valorDois;
    }
    
    public int getFilha(){
        return valor + valorDois;
    }
    
}
