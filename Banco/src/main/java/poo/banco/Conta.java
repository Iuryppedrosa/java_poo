/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.banco;

/**
 *
 * @author iuryp
 */
public class Conta {
    private double saldo;
    private double limite;
    private String nomeConta;
    private boolean personalite;
    
    public Conta(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;
    }
    
    public Conta(double saldo, double limite, boolean personalite){
        this.saldo = saldo;
        this.limite = limite;
        this.personalite = personalite;
    }
    
    public Conta(){
        this.saldo = 0;
        this.personalite = false;
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public void rendimento(){
        double valorRendimento = (5.0 / 100.0) * saldo;
        this.saldo += valorRendimento;
    }
    
    public void setNome(String nome){
        this.nomeConta = nome;
    }
    
    public String getNome(){
        return nomeConta;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void setLimite(double limite){
        if(limite < saldo){
            this.limite = limite;
        }else{
            System.out.printf("Nao é possivel atribuir um limite de %.2f maior que o seu saldo de %.2f \n", limite, getSaldo());
        }
    }
    
    // ma pratica, visto que getSaldo é reponsavel por trazer o saldo.
    /*
    public double saque(double valor){
        if(this.saldo > valor){
            this.saldo -= valor;
        }else{
            System.out.printf("Nao é possível retirar um valor %.2f que é maior que o seu saldo atual de ", valor, getSaldo());
        }
        return this.saldo;
    }
    */
        
    public void setSaque(double valor){
        if(this.saldo > valor){
            this.saldo -= valor;
        }else{
            System.out.printf("Nao é possível retirar um valor %.2f que é maior que o seu saldo atual de %.2f \n", valor, this.saldo);
        }
    }
    
    public void setTipo(boolean tipo){
        this.personalite = tipo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public double getLimite(){
        return limite;
    }
    
    public boolean getTipo(){
        return personalite;
    }
  
}
