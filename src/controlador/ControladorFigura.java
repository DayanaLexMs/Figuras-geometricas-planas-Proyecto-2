/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.Figura;
import modelo.Lado;
import vista.JFRFiguras;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author USUARIO
 */
public class ControladorFigura implements ActionListener{
    
    JFRFiguras frmFiguras = new JFRFiguras ();
    
    public ControladorFigura(){ 
    }
    
    public ControladorFigura(JFRFiguras frmFiguras){
        
        this.frmFiguras = frmFiguras;
        
        
        
    }
    
    @Override
    public void actionPerformed (ActionEvent e){
        
        if (e.getSource()==this.frmFiguras.btnArea){
            calcularArea();
        }
        if (e.getSource()==this.frmFiguras.btnPerimetro){
            calcularPerimetro();
        }
        
        
        
    }

    
    
    public void calcularArea(){
        
    }
    
    public void calcularPerimetro(){
        
    }
    
}
