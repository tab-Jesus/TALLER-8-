/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.taller8.Docs;

/**
 * Ejercicio1:ClaseVehiculoyClaseCoche
 1. DefineunaclaseVehiculoconlosatributosmarcayvelocidadMaxima.
 2. DefineunaclaseCochequeherededeVehiculoyagregueunatributonumeroDePuertas.
 3. Definemétodosparamostrarlainformacióndelvehículoydelcoche
 * @author JESUS DAVID
 */
public class Vehiculo {
    
    String Marca;
    String VelocidadMaxima;
    
    
    
    public Vehiculo(String Marca, String VelocidadMaxima){
        
        this.Marca = Marca;
        this.VelocidadMaxima = VelocidadMaxima;
       
        
    }
    
    public void mostrarDetalles(){
        
        System.out.println("Marca:" + Marca + ", VelocidadMaxima:" + VelocidadMaxima);
        
    }
    
    
}

