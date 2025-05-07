/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.swing_exemplo_2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author iuryp
 */
public class Exemplo2 extends JFrame{
    private final JLabel label ;
    
   public Exemplo2(){
       super("Frame com FlowLayout");
       
       JButton b1 = new javax.swing.JButton("Botao 1");
       JButton b2 = new JButton("Botao 2");
       JButton b3 = new JButton("Botao 3");

       
       Container c = this.getContentPane();
       //c.setLayout(new FlowLayout(FlowLayout.LEADING));
       c.setLayout(new GridLayout(0, 2, 30, 30));
       
       // JLabel sem argumentos no construtor
       label = new JLabel();
       label.setText("Label com texto seguido de botoes" );
       label.setHorizontalTextPosition(SwingConstants.LEFT);
       label.setVerticalTextPosition(SwingConstants.TOP);
       
       label.setToolTipText("Este ~e o label");
       b1.setToolTipText("Este é o botao!");
       
       c.add(label);
       c.add(b1);
       c.add(b2);
       c.add(b3);
       this.setSize(850, 500);
       this.setVisible(true);
   }
   
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Exemplo2 ex2 = new Exemplo2();
    }
    
}
