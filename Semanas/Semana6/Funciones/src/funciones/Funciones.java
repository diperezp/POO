/**
 *
 * @author diego
 * @date   12-03-2024
 */
package funciones;
//Importamos la class Scanner
import java.util.Scanner;

public class Funciones {

    public static void main(String[] args) {
        double x,y,z,w=0;
        
        Scanner scan= new Scanner(System.in);
        
        System.out.print("Ingrese el valor de x: ");
        x=scan.nextDouble();

        System.out.print("Ingrese el valor de y: ");
        y=scan.nextDouble();
        
        System.out.print("Ingrese el valor de z: ");
        z=scan.nextDouble();        

        System.out.print("Ingrese el valor de w: ");
        w=scan.nextDouble();
        
        
        System.out.println(Operaciones.suma(x, y));
        System.out.println(Operaciones.suma(x,y,z));
        System.out.println(Operaciones.suma(x,y,z,w));        
        System.out.println(Operaciones.resta(x, y));
        System.out.println(Operaciones.multiplicacion(x, y));
        System.out.println(Operaciones.division(x, y));
    }
    
}
