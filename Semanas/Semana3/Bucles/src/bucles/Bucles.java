
/**
 *
 * @author diego
 */
package bucles;

public class Bucles {

    public static void main(String[] args) {
        int i =0;
        while(i<5){
            
            System.out.println(i);
            i++;
        }
        i=5;
        do{
            
            System.out.println(i);
            i++;
            
        }while(i<5);
        
        
        int[] datos=new int[10];  //Creacion de vectro datos
        
        for (int e=0;e<10;e++){
            datos[e]=e;
            System.out.println(datos[e]);
            
        }
        
        
    }
    
}
