/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.classe_abstrata_ativ_lab_entregar;

/**
 *
 * @author iuryp
 */
public class ContaEspecial extends ContaCorrente {
    
    private float limite;
    
    public ContaEspecial(float limite, float saldo, int numConta, int senha)
    {
        this.limite = limite;
        super.numConta = numConta;
        super.saldo = saldo;
        super.senha = senha;
        super.estado = true;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public boolean debitaValor(float val, int pwd) {
        if(pwd != super.senha){
            return (false);
        }
        if(super.estado != true){
            return (false);
        }
        if(val <= 0){
            return (false);
        }
        if(val > super.saldo){
            return (false);
        }
        
        super.saldo -= val;
        if(saldo == 0){
            super.estado = false;
        }
        return (true);
        
    }

    @Override
    public void debitaValor(float val) {
        super.saldo -= val;
    }

    @Override
    public float getSaldo(int pwd) {
        if(super.senha == pwd){
            return super.saldo;
        }else{
            return -1;
        }
    }

    @Override
    public void creditaValor(int pwd, float val) {
        if(super.senha == pwd){
            saldo += val;
        }
    }

    @Override
    protected boolean getEstado(int pwd) {
        if(super.senha == pwd){
            return super.estado;
        }else{
          return false;
        }
    }

    @Override
    protected void setEstado(int pwd, boolean estado) {
        if(super.senha == pwd){
            super.estado = estado;
        }
    }

    @Override
    protected boolean isSenha(int pwd) {
        if(super.senha == pwd){
            return true;
        }else{
            return false;
        }
    }
    
}
