
/**
 *
 * @author diego
 * @date 12-03-2024
 * 
 */
package vectores2;
//Importamos la class Scanner
import java.util.Scanner;
public class Vectores2 {
    
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int vector_datos[]= new int[5];
        int counter_i=0;
        for ( counter_i=0;counter_i<5;counter_i++){
            System.out.printf("Introduce el valor de la componenete %d: ",counter_i);
            vector_datos[counter_i]=scan.nextInt();
    }
        for (counter_i=0;counter_i<5;counter_i++){
            System.out.printf("El vector tiene: %d en la posicion %d\n",vector_datos[counter_i],counter_i);
            
        }
        
    }
    
}
