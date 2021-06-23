package controlador;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VistaMaquina;
import vista.VistaPrincipal;

/**
 *
 * @author osval
 */
public class ControladorPrincipal implements ActionListener {

    private VistaPrincipal viewPrincipal;

    public ControladorPrincipal(VistaPrincipal viewPrincipal) {
        this.viewPrincipal = viewPrincipal;
        this.viewPrincipal.menuMaquinas.addActionListener(this);
    }

    public void iniciarPantallaPrincipal() {
        viewPrincipal.setVisible(true);
        viewPrincipal.setTitle("PRUEBA DIFERENTES PANELES EN UN SOLO JFRAME");
        viewPrincipal.setSize(new Dimension(1280, 720));
        viewPrincipal.setLocationRelativeTo(null);
        //viewPrincipal.setExtendedState(6);
    }

    public void despejar(Object obj) {
        viewPrincipal.panel.removeAll();
        viewPrincipal.panel.setLayout(new java.awt.BorderLayout());//****
        viewPrincipal.panel.add((Component) obj, BorderLayout.CENTER);
        viewPrincipal.panel.revalidate();
        viewPrincipal.panel.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (viewPrincipal.menuMaquinas == e.getSource()) {
            VistaMaquina vista = new VistaMaquina();
            //Maquina maq = new Maquina();
            //DAOMaquina daom = new DAOMaquina();
            ControladorMaquina ctrlM = new ControladorMaquina(vista);
            despejar(vista);
            ctrlM.iniciarFormMaquina();
        }

    }

}
