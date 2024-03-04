
/**
 *
 * @author diego
 * @date 03-03-2024
 * @brief Solucion del ejercicio Propuesto del libro
 * de logica de programacion de Efrain Oviedo
 * 
 */
package ejerciciopropuesto19;
//Importamos la class Scanner
import java.util.Scanner;

public class EjercicioPropuesto19 {
    //Triangulo Equilatero
    public static void main(String[] args) {
        //Definimos el lado del triangulo 
        double  edge;
        //Definimos los parametros del Triangulo
        double height;   //altura
        double area;     //area
        double perimeter; //perimetro
        
        
        //Definimos una objeto de la class Scanner
        Scanner inPut = new Scanner(System.in);
        //Insertamos el valor del lado de tipo double
        System.out.print("Intruzca el valor de lado del triangulo: ");
        edge = inPut.nextDouble();
        
        perimeter=3*edge; 
        height= edge*Math.sin(Math.PI/3);
        area= (height*edge)/2;
        
        //Imprimimos los los atributos del triangulo
        System.out.println("El triangulo equilatero de lado "+edge+" tiene: ");
        
        System.out.println("La altura maxima del triangulo es: "+height);
        
        System.out.println("El perimetro del triangulo es: "+perimeter);
        
        System.out.println("El area del triangulo es: "+area);
        
    }
    
}
