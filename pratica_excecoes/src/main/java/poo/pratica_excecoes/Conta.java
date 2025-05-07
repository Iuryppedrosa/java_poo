/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pratica_excecoes;
/**
 *
 * @author iuryp
 */
public class Conta {
    public double salario;
    public double saldo;
    
    public Conta () {
        saldo = 0;
    }
    
    public void saca(double valor) throws RuntimeException {
        if(!congruencia(valor)){
            saldo -= valor;
        }
    } 
    
    public void deposita(double valor) {
        if(valor < 0){
            throw new IllegalArgumentException("O valor depositado deve ser positivo");
        }else{
           saldo += valor;  
        }
  
    }   
    
    public boolean congruencia(double valor){
        if(valor > saldo){
            throw new CongruenciaException("Valor nao disponivel!");
        }
        return true;
    }
    
}
