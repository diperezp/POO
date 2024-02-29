
/**
 * @author diperezp
 * @brief El cuadrado y el cubo de un numero 
 */
package ejerciciopropuesto14;

public class EjercicioPropuesto14 {


    public static void main(String[] args) {
        //Definimos la variable numero, cuadrado y cubo
        double numero;
        double cuadrado;
        double cubo;
        /*
        es importante que el tipo de la variable sea 
        double pues el metodo pow que posteriormente
        utilizaresmos, recibe como parametro 
        una variable tipo double
        */
        //Asignamos un valor a numero
        numero=20;
        
        //Calculamos el cuadrado de numero
        cuadrado=Math.pow(numero, 2);
        //Calculamos el cubo de numero
        cubo=Math.pow(numero, 3);
        
        //Imprimimos los valores calculados
        System.out.println("El cuadrado de "+numero +" es :"+cuadrado);
        System.out.println("El cubo de "+numero+" es :"+cubo);
    }
    
}
