/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;


import controlador.ControladorPrincipal;
import vista.VistaPrincipal;

/**
 *
 * @author osval
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaPrincipal vp = new VistaPrincipal();
        ControladorPrincipal cp = new ControladorPrincipal(vp);
        cp.iniciarPantallaPrincipal();
        
    }
    
}
