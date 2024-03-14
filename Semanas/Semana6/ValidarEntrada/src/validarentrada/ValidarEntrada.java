/**
 *
 * @author diperezp
 * @date 14-03-2024
 * 
 */
package validarentrada;
//importamos la class Scanner
import java.util.Scanner;

public class ValidarEntrada {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        double wallHeight =0.0;
        boolean valid=false;
        
        do{
            try{
                System.out.println("Enter wall height (feet): ");
                wallHeight =scan.nextDouble();
                valid=false;
                
                if(wallHeight<=0){
                    throw new Exception ("Invalid Input");
                }
            }
            catch(Exception e){
                System.out.println("Invalid Input");
            }
        }while(!valid);
        
    }
    
}
