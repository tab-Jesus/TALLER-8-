/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.taller8.Docs.ej3;

/**
 *
 * @author JESUS DAVID
 */
public class Gerente extends Empleado{
    
    String departamento;

    public Gerente (String nombre, String salario, String departamento){
        
        

            super(nombre, salario);
           this.departamento = departamento;
                   
                   }           
    
    @Override
    public void mostrarDetalles(){
        
        super.mostrarDetalles();
        System.out.println("Nombre:" + nombre + "Salario:" + salario + "Departamento:"+ departamento );
        
    }
    
}
