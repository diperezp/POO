/**
 *
 * @author diego
 * @date 07-03-2024
 * @brief 
 */
package vector1;

import java.util.Scanner;
public class Vector1 {

    public static void main(String[] args) {
        //Instanciamos en un objeto la class Scanner
        Scanner inPut=new Scanner(System.in);
        
        //Definimos un vector
        int datos[]=new int[6];
        
        int i,valor,suma=0;
        
        float promedio;
        
        for(i=0;i<6;i++){
        System.out.print("Ingrese el valor de la componente "+i+": ");    
        datos[i]= inPut.nextInt();
        }
        
        for(int e:datos){
            suma+=e;
            
        }
        
        System.out.println("la Suma es: "+ suma);
        promedio=suma/6;
        System.out.printf("El promedio de los datos: %.2f",promedio);
        System.out.println("");
    }
    
}
