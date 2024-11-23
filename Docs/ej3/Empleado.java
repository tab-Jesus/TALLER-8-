/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.taller8.Docs.ej3;

/**
 *
 * @author JESUS DAVID
 */
public class Empleado {
    
    String nombre;
    String salario;
    
    
    
    public Empleado(String nombre, String salario){
        
        this.nombre = nombre;
        this.salario = salario;
       
        
    }
    
    public void mostrarDetalles(){
        
        System.out.println("Nombre:" + nombre + ", Salario:" + salario);
        
    }
    
    
}