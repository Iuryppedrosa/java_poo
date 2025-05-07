/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package poo.botoes_com_eventos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author iuryp
 */
public class Botoes_com_eventos extends JFrame{

    private JButton botao1, botao2;
    private String strMsg = "Exemplo botao 1";
    private String srtFinalizar = "Finalizar";
    
    public Botoes_com_eventos(){
        super("Testando Botoes");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        
        botao1 = new JButton("Botao exemplo");
        botao1.setToolTipText("Pressione o botao");
        botao1.setActionCommand(strMsg);
        container.add(botao1);
        
        botao2 = new JButton(srtFinalizar);
        botao2.setToolTipText("Finaliza o programa!");
        botao2.setActionCommand(srtFinalizar);
        container.add(botao2);
        
        GerenciadorBotoes gestorBotoes = new GerenciadorBotoes();
        botao1.addActionListener(gestorBotoes);
        botao2.addActionListener(gestorBotoes);
        
        setSize(545, 280);
        setVisible(true);
    }
    

    private class GerenciadorBotoes implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event){
            if(event.getActionCommand().equalsIgnoreCase(strMsg)){
                JOptionPane.showMessageDialog(null, "Vc pressionou um " + event.getActionCommand());
            }else if(event.getActionCommand().equalsIgnoreCase(srtFinalizar)){
                System.exit(0);
            }

        }

    }

    public static void main(String[] args) {
        Botoes_com_eventos application = new Botoes_com_eventos();
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
    }
}


