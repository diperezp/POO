/**
 *
 * @author diperezp
 * @date 14-03-2024
 * @brief 
 */
package excepcion3;

//Importamos al class Scanner
import java.util.Scanner;


public class Excepcion3 {
    
    
    public static void main(String[] args) {
        Scanner inPut= new Scanner(System.in);
        try{
            // "akki " is not a number
            System.out.print("Enter Number:");
            int num = inPut.nextInt();
            System.out.printf("the number is ");
            System.out.println(num);
        }
        catch(Exception e){
            //e.printStackTrace();
            System.out.println(" A Number Format exception has ocurred");
        }
    }
    
}
