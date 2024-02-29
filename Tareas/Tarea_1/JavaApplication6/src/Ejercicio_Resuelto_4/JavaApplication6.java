/**
 * @author diperezp
 * @brief  Relacion de edades de la familia de Juan
 */
package Ejercicio_Resuelto_4;


public class JavaApplication6 {

    public static void main(String[] args) {
        //Definimos la variables necesarias para el funcionamiento del programa.
        
        int edadJuan;
        int edadAlbert,edadAna,edadMama;
        
        //Asignamos un valor ala edad de Juan
        edadJuan=9;
        
        //albert tiene 2/3 la edad de juan
        edadAlbert=2*(edadJuan/3);
        
        //ana tiene 4/3 la edad de juan
        edadAna=4*(edadJuan/3);
        
        //La edad de la mama es la suma de los tres hijos
        edadMama=edadJuan+edadAlbert+edadAna;
        
        /*
        Imprimimos por pantalla la edad de todos los 
        miembros de la familia.
        */
        System.out.println("Las edades son: ");
        System.out.println("La edad de juan es: "+edadJuan);
        System.out.println("La edad de Albert es: "+edadAlbert);
        System.out.println("La edad de Ana es: "+edadAna);
        System.out.println("La edad de la Mama es: "+edadMama);
        
        
    }
    
}
