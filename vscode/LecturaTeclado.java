/**
 * @author diperezp
 * @version 1.0
 * @since 2021-09-01
 * @brief This is a simple program to read from the keyboard
 */
//Import the Scanner class
import java.util.Scanner;

public class LecturaTeclado {
    public static void main(String[] args){
        int x;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x=entrada.nextInt();
        System.out.println("You entered: "+x);
    }
    
}
