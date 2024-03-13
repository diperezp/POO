
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
        //Instanciamos la class Triangulo Equilatero
        TrianguloEquilatero triangulo = new TrianguloEquilatero();
        

        
        
        //Definimos una objeto de la class Scanner
        Scanner inPut = new Scanner(System.in);
        //Insertamos el valor del lado de tipo double
        System.out.print("Intruzca el valor del lado del triangulo: ");
        triangulo.edge = inPut.nextDouble();
        
        
        
        //Imprimimos los los atributos del triangulo
        System.out.println("El triangulo equilatero de lado "+triangulo.edge+" tiene: ");
        
        System.out.printf("La altura maxima del triangulo es: %.2f \n",triangulo.alturaTrian());
        
        System.out.printf("El perimetro del triangulo es: %.2f \n",triangulo.perimetroTrian());
        
        System.out.printf("El area del triangulo es: %.2f \n",triangulo.areaTrian());
        
    }
    
}
