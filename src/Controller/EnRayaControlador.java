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
public class EnRayaControlador {
     private EnRayaModelo model;
    private EnRayaView view;

    public EnRayaControlador(EnRayaModelo model, EnRayaView view) {
        this.model = model;
        this.view = view;
        //Add listeners to the view
        for (JButton button : view.buttons){
            button.addActionListener((ActionListener) this);
        }
    }

}

