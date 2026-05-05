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
        
        this.frmFiguras.btnArea.addActionListener(this);
        this.frmFiguras.btnPerimetro.addActionListener(this);
        
        this.frmFiguras.lblDigite.setVisible(false);
        this.frmFiguras.lbl2.setVisible(false);
        this.frmFiguras.lbl3.setVisible(false);
        this.frmFiguras.txtVar1.setVisible(false);
        this.frmFiguras.txtVar2.setVisible(false);
        this.frmFiguras.txtVar3.setVisible(false);
        
        eventos();
        
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
    
    private void cmbFigurasActionPerformed (java.awt.event.ActionEvent evt){
        
        String figura = this.frmFiguras.cmbFiguras.getSelectedItem().toString();
        
        //triangulo, cuadrado, rectangulo, poligono regular
        
        if (figura.equals("Circulo")){
            
            reiniciar();
            this.frmFiguras.lblDigite.setVisible(true);
            this.frmFiguras.lblDigite.setText("Digite el radio de circulo: ");
            this.frmFiguras.txtVar1.setVisible(true);
            
        }
        
        else if (figura.equals("Triangulo")){
            
            reiniciar();
            this.frmFiguras.lblDigite.setText("Digite el tamaño del lado 1: ");
            this.frmFiguras.lbl2.setText("Digite el temaño del lado 2: ");
            this.frmFiguras.lbl3.setText("Digite el temaño del lado 3: ");
            this.frmFiguras.lblDigite.setVisible(true);
            this.frmFiguras.lbl2.setVisible(true);
            this.frmFiguras.lbl3.setVisible(true);
            this.frmFiguras.txtVar1.setVisible(true);
            this.frmFiguras.txtVar2.setVisible(true);
            this.frmFiguras.txtVar3.setVisible(true);
            
        }
        
        else if (figura.equals("Cuadrado")){
            
            reiniciar();
            this.frmFiguras.txtVar1.setVisible(true);
            this.frmFiguras.lblDigite.setText("Digite el tamaño de los lados del cuadrado: ");
            this.frmFiguras.lblDigite.setVisible(true);
            
        }
        
        else if (figura.equals("Rectangulo")){
            
            reiniciar();
            this.frmFiguras.lblDigite.setText("Digite el tamaño de los lados más largos: ");
            this.frmFiguras.lbl2.setText("Digite el tamaño de los lados más cortos: ");
            this.frmFiguras.lblDigite.setVisible(true);
            this.frmFiguras.lbl2.setVisible(true);
            this.frmFiguras.txtVar1.setVisible(true);
            this.frmFiguras.txtVar2.setVisible(true);
            
        }
        
        else if (figura.equals("Poligono regular")){
            
            reiniciar();
            this.frmFiguras.lblDigite.setText("Digite el tamaño de uno de los lados del poligono: ");
            this.frmFiguras.lblDigite.setVisible(true);
            this.frmFiguras.txtVar1.setVisible(true);
            
        }
        
    }

    private void reiniciar(){
        
        this.frmFiguras.lblDigite.setVisible(false);
        this.frmFiguras.lbl2.setVisible(false);
        this.frmFiguras.lbl3.setVisible(false);
        this.frmFiguras.txtVar1.setVisible(false);
        this.frmFiguras.txtVar2.setVisible(false);
        this.frmFiguras.txtVar3.setVisible(false);
        
    }
    
    public void calcularArea(){
        
        
        
    }
    
    public void calcularPerimetro(){
        
        
        
    }
    
    private void eventos() {
    
        this.frmFiguras.cmbFiguras.addActionListener(new java.awt.event.ActionListener() {
        
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            
                cmbFigurasActionPerformed(evt);
        }
    });
}
    
}
