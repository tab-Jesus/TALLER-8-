/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.taller8.Docs;

/**
 *
 * @author JESUS DAVID
 */
public class Coche extends Vehiculo{
    
    String NumeroDePuertas;

    public Coche (String Marca, String VelocidadMaxima, String NumeroDePuertas){
        
        

            super(Marca, VelocidadMaxima);
           this.NumeroDePuertas = NumeroDePuertas;
                   
                   }           
    
    @Override
    public void mostrarDetalles(){
        
        super.mostrarDetalles();
        System.out.println("NumeroDePuertas:" + NumeroDePuertas);
        
    }
    
}
