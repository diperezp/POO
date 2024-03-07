/**
 * @author diego
 * @date 07-03-2024
 * @brief Concepto, structura y sintaxis de una arreglo bidimensional (matriz)
 */
package matriz1;

//Importamos la class Scanner
import java.util.Scanner;

public class Matriz1 {

    public static void main(String[] args) {
        final int row=10;
        final int column=10;
        
        //Instanciamos en un objeto la class Scanner
        Scanner inPut= new Scanner(System.in);
        
        //Definimos una matriz 4x5
        int matriz[][]=new int[row][column];
        
        //Definimos contadores para recorrer la matriz
        int i;  //filas
        int j;  //columnas
        
        //Asignamos valores a todos los elementos de la matriz
        
        for (i=0;i<row;i++){
            for(j=0;j<column;j++){
                System.out.print("Ingrese el elemento de la fila "+i+" y columna "+j+": ");
                matriz[i][j]=inPut.nextInt();
            }
            
        }
        System.out.println("");
        System.out.println("Matriz: ");
        System.out.println("");

        for (i=0;i<row;i++){
            for(j=0;j<column;j++){
                System.out.printf(matriz[i][j]+"\t");
                
            }
            System.out.println("");
            
        }
    
        
        
        
        
    }
    
}
