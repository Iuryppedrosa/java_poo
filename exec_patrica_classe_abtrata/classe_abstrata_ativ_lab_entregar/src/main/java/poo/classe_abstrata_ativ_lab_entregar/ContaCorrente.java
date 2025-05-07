/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.classe_abstrata_ativ_lab_entregar;

/**
 *
 * @author iuryp
 */
public abstract class ContaCorrente {
    protected float saldo;
    protected boolean estado; // 1 = ativa ; 0 = inativa
    protected int numConta;
    protected int senha;
    
    public abstract boolean debitaValor(float val, int pwd);
    
    //sobrecarga
    public abstract void debitaValor(float val);
    
    public abstract float getSaldo(int pwd);
    
    public abstract void creditaValor(int pwd, float val);
    
    protected abstract boolean getEstado(int pwd);
    
    protected abstract void setEstado(int pwd, boolean e);
    
    protected abstract boolean isSenha(int pwd);  
}
