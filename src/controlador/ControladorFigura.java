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
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ControladorFigura implements ActionListener{
    
    JFRFiguras frmFiguras = new JFRFiguras ();
    private ArrayList <Figura> listaFiguras = new ArrayList <>();
    
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
            this.frmFiguras.lbl2.setText("Digite el tamaño del lado 2: ");
            this.frmFiguras.lbl3.setText("Digite el tamaño del lado 3: ");
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
            this.frmFiguras.lbl2.setText("Digite la cantidad de lados del poligono: ");
            this.frmFiguras.lblDigite.setVisible(true);
            this.frmFiguras.txtVar1.setVisible(true);
            this.frmFiguras.lbl2.setVisible(true);
            this.frmFiguras.txtVar2.setVisible(true);
            
        }
        
    }

    private void reiniciar(){
        
        this.frmFiguras.lblDigite.setVisible(false);
        this.frmFiguras.lbl2.setVisible(false);
        this.frmFiguras.lbl3.setVisible(false);
        this.frmFiguras.txtVar1.setVisible(false);
        this.frmFiguras.txtVar2.setVisible(false);
        this.frmFiguras.txtVar3.setVisible(false);
        this.frmFiguras.txtVar1.setText("");
        this.frmFiguras.txtVar2.setText("");
        this.frmFiguras.txtVar3.setText("");
        
    }
    
    //aaaa
    // PORQUE NO SALE ESTOOOO
    
    public void calcularArea(){
        
        String figura = this.frmFiguras.cmbFiguras.getSelectedItem().toString();
        double area = 0;
        double lad1 = 0;
        double lad2 = 0;
        double lad3 = 0;
        ArrayList <Lado> lados = new ArrayList <>();
        
        if (figura.equals("Circulo")&&this.frmFiguras.txtVar1.getText().isEmpty()==false){
            
            lad1 = Double.parseDouble(this.frmFiguras.txtVar1.getText());
            Figura f = new Figura (figura, lados);
            f.agregarLado(new Lado (lad1));
            listaFiguras.add(f);
            area = 3.1416 * (lad1 * lad1);
            this.frmFiguras.txtAMostrar.setText("El area del circulo de radio "+lad1+" es: \n"+area);
            
        }
        
            else if (this.frmFiguras.txtVar1.getText().isEmpty()){
                //verificar porque cuando vuelvo al circulo se ejecuta esto
                this.frmFiguras.txtAMostrar.setText("NO SE PUEDE CALCULAR\nDATOS INCOMPLETOS");
            
            }
        
        if (figura.equals("Triangulo")&&this.frmFiguras.txtVar1.getText().isEmpty()==false&&this.frmFiguras.txtVar2.getText().isEmpty()==false&&this.frmFiguras.txtVar3.getText().isEmpty()==false) {
            
            lad1 = Double.parseDouble(this.frmFiguras.txtVar1.getText());
            lad2 = Double.parseDouble(this.frmFiguras.txtVar2.getText());
            lad3 = Double.parseDouble(this.frmFiguras.txtVar3.getText()); 
            double s = (lad1+lad2+lad3)/2;
            
            area = Math.sqrt(s*(s-lad1)*(s-lad2)*(s-lad3));
            this.frmFiguras.txtAMostrar.setText("El triangulo de datos: \n\nLado 1: "+lad1+"\nLado 2: "+lad2+"\nLado 3: "+lad3+"\nTiene un area de "+area);
            //Crear figura triangulo
            
        }
        
        else if (this.frmFiguras.txtVar1.getText().isEmpty()||this.frmFiguras.txtVar2.getText().isEmpty()||this.frmFiguras.txtVar3.getText().isEmpty()){
            
                this.frmFiguras.txtAMostrar.setText("NO SE PUEDE CALCULAR\nDATOS INCOMPLETOS");
            
        }
        
        if (figura.equals("Cuadrado")){
            
            lad1 = Double.parseDouble(this.frmFiguras.txtVar1.getText());
            
            area = Math.pow(lad1, 2);
            this.frmFiguras.txtAMostrar.setText("Un cuadrado de lado: "+lad1+"\nTiene un area de: "+area);
            
        }
        
        else if (this.frmFiguras.txtVar1.getText().isEmpty()){
            
            this.frmFiguras.txtAMostrar.setText("NO SE PUEDE CALCULAR\nDATOS INCOMPLETOS");
            
        }
        
        if (figura.equals("Rectangulo")&&this.frmFiguras.txtVar1.getText().isEmpty()==false&&this.frmFiguras.txtVar2.getText().isEmpty()==false){
            
            lad1 = Double.parseDouble(this.frmFiguras.txtVar1.getText());
            lad2 = Double.parseDouble(this.frmFiguras.txtVar2.getText());
            
            area = lad1 * lad2;
            
            this.frmFiguras.txtAMostrar.setText("Un rectangulo de lados "+lad1+", "+lad2+"\nTiene un area de: "+area);
            
        }
        
        else if (this.frmFiguras.txtVar1.getText().isEmpty()||this.frmFiguras.txtVar2.getText().isEmpty()){
            
            this.frmFiguras.txtAMostrar.setText("NO SE PUEDE CALCULAR\nDATOS INCOMPLETOS");
            
        }
        
        if (figura.equals("Poligono regular")&&this.frmFiguras.txtVar1.getText().isEmpty()==false){
            
            lad1 = Double.parseDouble(this.frmFiguras.txtVar1.getText()); //lado
            lad2 = Double.parseDouble(this.frmFiguras.txtVar2.getText()); //n de lados 
            
            if (lad2<=2){
                this.frmFiguras.txtAMostrar.setText("Un poligono regular no puede tener 2 lados o menos, por favor verifique los datos");
            }
            
            area = (lad2*Math.pow(lad1, 2))/(4*Math.tan((3.1416)/lad2));
            
            this.frmFiguras.txtAMostrar.setText("Un poligono regular de "+lad2+" lados \nTiene un area de: "+area);
        }
        
        else if (this.frmFiguras.txtVar1.getText().isEmpty()||this.frmFiguras.txtVar2.getText().isEmpty()){
            
            this.frmFiguras.txtAMostrar.setText("NO SE PUEDE CALCULAR\nDATOS INCOMPLETOS");
            
        }
        
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
