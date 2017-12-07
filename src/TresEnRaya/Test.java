package TresEnRaya;

import Controller.EnRayaControlador;
import Model.EnRayaModelo;
import View.EnRayaView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MichaelJunior
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Parte Mike
        EnRayaView view = new EnRayaView();


        
        //Parte Joel
        EnRayaModelo model = new EnRayaModelo();
        
        
        
        //Parte Adria
        
        EnRayaControlador controller = new EnRayaControlador(model, view);




    }
    
}
