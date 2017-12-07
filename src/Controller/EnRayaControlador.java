/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import Model.EnRayaModelo;
import View.EnRayaView;

/**
 *
 * @author Administrador
 */
public class EnRayaControlador implements  ActionListener{
      private EnRayaModelo model;
    private EnRayaView view;

    public EnRayaControlador(EnRayaModelo model, EnRayaView view) {
        this.model = model;
        this.view = view;
        //Add listeners to the view
        for (JButton button : view.buttons){
            button.addActionListener(this);
        }
       
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            for (JButton button : view.buttons){
            if (button == e.getSource()){
                  String s = model.setMovimiento(Integer.parseInt(button.getName()));
                  //update view
                  button.setText(s);
                  //check winner
                  int seleccion = -1;
                  if( model.getGanador()== 1) {seleccion = view.showMessage(" 'X' ");}
                  else if( model.getGanador()== 2) {seleccion = view.showMessage(" 'O' ");}
                  else if(model.getGanador()== 3) {seleccion = view.showMessage(" 'Es un empate' ");}
            
                  switch (seleccion){
                      case 0:{
                          model.reset();
                          view.reset();
                          break;
                      }
                      case 1:{
                          System.exit(0); //Exit
                          break;
                      }
                  }
            }}

    }
   }
            
        
        
        
    
    


