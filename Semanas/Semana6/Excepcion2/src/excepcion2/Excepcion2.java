/**
 *
 * @author diperezp
 * @date 14-03-2024
 * @brief
 */
package excepcion2;
/**
 * Si dentro del try hay una division por 0 
 * entonces se captura el error y se lanza el mensaje
 * 
 */

public class Excepcion2 {


    public static void main(String[] args) {
        try{
            int a =30, b=0;
            int c=a/b;
            System.out.println("Result = "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Can't divide a number by 0");
        }
    }
    
}
