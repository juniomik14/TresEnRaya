/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Administrador
 */
public class EnRayaView extends JFrame{
   
    public JButton[] buttons;

    public EnRayaView() {
      //Create and set up the window.
      this.setTitle("3 en Raya");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //Set up the content pane.
      addComponentsToPane(this.getContentPane());
      this.setResizable(false);
      //Display the window.
      this.pack();
      this.setVisible(true);
    }
    
    void addComponentsToPane(Container pane) {

        //JPanel buttons
        JPanel buttonsPanel = new JPanel(new GridLayout(3, 3));
        buttons = new JButton[9];
        for (int i=0;i<buttons.length;i++) {
          buttons[i] = new JButton(" ");
          buttons[i].setPreferredSize(new Dimension(75,75));
          buttons[i].setName(""+(i+1));
          buttonsPanel.add(buttons[i]);
        }
        pane.add(buttonsPanel, BorderLayout.CENTER);
    }
    
    public void reset(){
        for (JButton button : buttons){
            button.setText("");
        }
    }
   
    public int showMessage(String message){
        
        return JOptionPane.showOptionDialog(this, "Gano el Player "+message+"\n ¿Qué desea hacer?", "Fin del juego", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Jugar otra vez", "Salir del programa"}, "Jugar otra vez");
    
        
    }
    
}
