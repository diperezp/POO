/**
 *
 * @author diego
 * @brief Ejercicio Aritmetico
 */
package ejercicioresuelto5;


public class EjercicioResuelto5 {
    
    
    
    public static void main(String[] args) {
        /*Definimos la variables que necesitamos 
        para el desarrollo del programa
        */
        double suma,x,y;
        //Asignamos un valor alas variables
        suma=0;
        x=20;
        suma=suma+x;
        y=40;
        
        //Usamos el metodo Math.pow();
        //Es importante tener en cuenta que los parametros
        //del metodo pow recibe valores tipo double
        x=x+Math.pow(y, 2);
        suma=suma+x/y;
        
        //Por ultimo imprimimos el valor de suma
        System.out.println("El valor de suma es: "+suma);
        
        
    }
    
}
