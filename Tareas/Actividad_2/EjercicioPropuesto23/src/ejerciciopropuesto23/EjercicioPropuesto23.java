
/**
 *
 * @author diego
 * @date 07-03-2024
 * @brief 
 */
package ejerciciopropuesto23;
//Importamos la class Scanner
import java.util.Scanner;

public class EjercicioPropuesto23 {
    public static void main(String[] args) {
        //Instanciamos la class Scanner
        Scanner inPut= new Scanner(System.in);
        
        //Definimos e inicializamos los coeficientes de la ecuacion
        /* Ax²+Bx+C=0*/
        System.out.print("Introduce el coeficiente del termino cuadratico: ");
        double A=inPut.nextDouble();
        System.out.print("Introduce el coeficiente del termino lineal: ");
        double B=inPut.nextDouble();
        System.out.print("Introduce el coeficiente del termino constante: ");
        double C=inPut.nextDouble();
        
        /**Instancimos la class Ecuacion2Grado con el constructor
         * de la class asignando los coeficientes de la ecuacion
         */
        Ecuacion2Grado ecuacion = new Ecuacion2Grado(A, B, C);
        
        //Llamamos el metodo que resulve e imprime los resultados
        ecuacion.solucionEcuacion();
        
        
        
    }
    
}
