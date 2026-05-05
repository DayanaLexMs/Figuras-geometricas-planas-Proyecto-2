/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Figura {
    
    private String nombre;
    private ArrayList <Lado> lados;

    public Figura() {
    }

    public Figura(String nombre, ArrayList<Lado> lados) {
        this.nombre = nombre;
        this.lados = lados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Lado> getLados() {
        return lados;
    }

    public void setLados(ArrayList<Lado> lados) {
        this.lados = lados;
    }
    
    public void agregarLado (Lado l){
        
        lados.add(l);
        
    }
    
}
