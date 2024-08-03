/**
 * @author diperezp
 * @date 03-08-2024
 * @brief Este class almacena dos parametros y tiene un metodo que compara los dos valores
 */
package ejercicioresuelto7;

public class Comparar {
    
    //Valores a comparar
    static int A, B;
    
    
    //Metodos de comparacion
    String compare(){
        
        
        if(A>B){
            return A+" es mayor que "+B;
        }
        else if(B>A){
            return B+" es mayor que "+A;
        }
        else{
            return A+" es igual a "+B;
        }
    }
    
    
    
}
