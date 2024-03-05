/**
 *
 * @author diego
 * @date 04-03-2024
 * @brief Codificacin del Ejercicio Resuelto 13 del libro de logica
 * de programacion de Efrain Oviedo.
 */
package ejercicioresuelto13;

//Importamos la class Scanner
import java.util.Scanner;

public class EjercicioResuelto13 {


    public static void main(String[] args) {
        
        //Instanciamos la class Sorteo
        Sorteo mySorteo = new Sorteo();
        
        //Instaciamos la class Scanner
        Scanner myInPut= new Scanner(System.in);
        
        //Pedimos el valor de la compra
        System.out.print("Introduce el valor de la compra: ");
        mySorteo.valComp=myInPut.nextDouble();
        
        //Pedimos el color de la pelota retirada
        System.out.print("Introduce el color del pelota: ");
        mySorteo.color=myInPut.next();
        
        //Espacio
        System.out.println("");
        
        //Imprimimos los resultados
        //Valor de la compra
        System.out.println("El valor de la compra es: "+mySorteo.valComp);
        
        //Color de la pelota sacada
        System.out.println("El color de la pelota retirada es: "+mySorteo.color);
        
        //Valor que se debe pagar
        System.out.println("El valor que se debe pagar es: "+mySorteo.calcValuePag());
        
        //Porcentaje de descuento
        System.out.println("El porcentaje de descuento es: "+mySorteo.pDes+"%");
        

        
        
        
        
    }
    
}