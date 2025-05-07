/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pratica03;

/**
 *
 * @author iuryp
 */
public class Restaurante extends Empresa{
    private double valorPrato;
    private TipoComida tipoComida;
    
    public Restaurante(){
        super();
    }
    
    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String fone, double valorPrato, TipoComida tipoComida){
        super(nome, endereco, cidade, estado, cep, fone);
        this.valorPrato = valorPrato;
        this.tipoComida = tipoComida;
    }
    
    public void setValorPrato(double valor){
        this.valorPrato = valor;
    }
    
    public double getValorPrato(){
        return valorPrato;
    }
    
    public void setTipoComida(TipoComida tipoComida){
        this.tipoComida = tipoComida;
    }
    
    public TipoComida getTipoComida(){
        return tipoComida;
    }
    
    @Override
    public String toString(){
        return super.toString() + String.format("\nRestaurante - prato: R$ %.2f\nTipo de comida: %s", valorPrato, tipoComida);
    }
    
}

enum TipoComida {
    ARROZ,
    FEIJAO,
    MACARAO
}
