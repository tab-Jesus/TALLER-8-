/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.taller8.Docs.ej2;

/**
 *
 * @author JESUS DAVID
 */
public class Estudiante extends Persona{
    
    String Matricula;

    public Estudiante (String nombre, String edad, String Matricula){
        
        

            super(nombre, edad);
           this.Matricula = Matricula;
                   
                   }           

    public Estudiante(String nombre, String edad) {
        super(nombre, edad);
    }
    
    @Override
    
    public void mostrarDetalles(){
        
        super.mostrarDetalles();
        System.out.println("Matricula:" + Matricula);
        
    }
    
}
