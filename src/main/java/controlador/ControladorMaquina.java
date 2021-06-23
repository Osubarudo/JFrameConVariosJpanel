/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VistaMaquina;

/**
 *
 * @author osval
 */
public class ControladorMaquina implements ActionListener{
    private VistaMaquina vista;

    public ControladorMaquina(VistaMaquina vista) {
        this.vista = vista;
    }
    
     public void iniciarFormMaquina() {
        vista.setVisible(true);
        vista.setSize(1280, 720);
        //vista.txtID.enable(false);
        //vista.jTable1.setModel(modelo);
        //cargar();
        //vista.jTable1.addMouseListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
