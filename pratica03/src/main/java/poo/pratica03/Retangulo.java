/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pratica03;

/**
 *
 * @author iuryp
 */
public class Retangulo {
    
    private double length;
    private double width;
    
    public Retangulo(double lenght, double width){
        this.length = lenght;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length < 20 ? length : 0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width < 20 ? width : 0;
    }
    
    public double perimetro(){
        return (length * 2) + (width * 2);
        
    }
    
    public double area(){
        return width * length;
    }
    
}
