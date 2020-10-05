
package Interfaces;

import Clases.Cliente;
import Interfaces.VentanaP;
import Interfaces.VentanaP;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        
         VentanaP v = new VentanaP();
         v.setExtendedState(MAXIMIZED_BOTH);// sirve para que la ventana principal se abra toda la pantalla
         v.setVisible(true);
         //dispose(); // sirve para que la ventana de acceso se cierre sola
         JOptionPane.showMessageDialog(null, "BIENVENIDO");
    }
   
    
}
