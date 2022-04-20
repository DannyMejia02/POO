/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.poo;

/**
 *
 * @author PC-01
 */
public class Principal {
    public static void main(String[] args){
        var telefono = new Telefono();
        telefono.numero = "0987456123";
        telefono.tipo = "Celular";
        var persona = new Persona();
        persona.cedula = "0105896473";
        persona.nombre = "Pedro Ramirez";
        persona.fechaNacimiento = 12-06-1995;
        telefono.propietario = persona;
        var operadoraTelefonica = new OperadoraTelefonica ();
        operadoraTelefonica.descripcion = "Movistar";
        operadoraTelefonica.paginaWeb = "www.movistar.com";
        operadoraTelefonica.codigo = 9845349;
        
        System.out.println("El tipo de telefono es "+telefono.tipo+" con el numero "+telefono.numero
                            +" su dueño es "+persona.nombre + " la operadora es "+operadoraTelefonica.descripcion);
    }
}
        
        
        
        
        
        
                
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

