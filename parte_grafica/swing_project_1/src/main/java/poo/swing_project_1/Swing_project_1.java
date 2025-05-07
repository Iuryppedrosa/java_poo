/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package poo.swing_project_1;
import poo.swing_exemplo_2.Exemplo2;
import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author iuryp
 */
public class Swing_project_1 extends JFrame {
    
    public Swing_project_1(){
        super("Janela Exemplo");
        this.setSize(520, 340);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Swing_project_1 janela = new Swing_project_1();
        // classe Anonima
        janela.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
            
            @Override
            public void windowActivated(WindowEvent e){
               System.out.print("Teste \n");
            }
            @Override
            public void windowDeactivated(WindowEvent e){
               System.out.print("Teste 2\n");
            }
        });
    }
}
