/**
 *
 * @author diego
 * @date  12-03-2024
 * 
 */
package matrices2;

//Importamos la class Scanner
import java.util.Scanner;
public class Matrices2 {


    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        int matriz_datos[][]=new int[2][2];
        
        int counter_i=0; //recorrer filas
        int counter_j=0; //recorrer columnas
        
        for (counter_i=0;counter_i<2;counter_i++){
            for ( counter_j = 0; counter_j < 2; counter_j++) {
                System.out.printf("Ingrese el elemento de la posicion %d,%d: ",counter_i,counter_j);
                matriz_datos[counter_i][counter_j]=scan.nextInt();
            }
        }
        System.out.println("La matriz es: ");
        for ( counter_i = 0; counter_i < 2; counter_i++) {
            for ( counter_j = 0; counter_j < 2; counter_j++) {
                System.out.printf("%d\t", matriz_datos[counter_i][counter_j]);
            }
            System.out.println("\n");
            
        }
        
        
    }
    
}
