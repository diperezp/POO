/**
 *
 * @author diego
 */
package Personas;

/**
 * Esta clase denomina Persona modela una persona cuenta con 
 * los atributos: nombre, apellidos, telefono y direccion.
 * 
 */

public class Persona {
    
    String nombre; // Atributo que identifica el nombre de una persona 
    String apellidos; // Atributo que identifica los apellidos de una persona
    String telefono; //Atributo que identifica el telefono de una persona 
    String direccion; // Atributo que identifica la direccion de una persona 
    
    
    /**
     * Contructor de la clase Persona
     * @param nombre Parametro que define el nombre de una persona 
     * @param apellidos Parametro que define los apellidos de una persona
     * @param telefono Parametro que define el telefono de una persona
     * @param direccion Parametro que define la direccion de una persona
     */
    
    public Persona(String nombre, String apellidos, String telefono, String direccion){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.telefono=telefono;
        this.direccion=direccion;
    }
    
}
