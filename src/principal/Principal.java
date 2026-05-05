/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;
import controlador.ControladorFigura;
import vista.JFRFiguras;

/**
 *
 * @author USUARIO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFRFiguras frmFiguras = new JFRFiguras ();
        frmFiguras.setVisible(true);
        ControladorFigura cntrFigura = new ControladorFigura (frmFiguras);
    }
    
}
