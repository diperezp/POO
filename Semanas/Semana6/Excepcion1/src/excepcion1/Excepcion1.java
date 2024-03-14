
/**
 *
 * @author diperezp
 * @date 14-03-2024
 * @brief 
 */
package excepcion1;

public class Excepcion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int[] myNumbers={1,2,3};
            
            System.out.println(myNumbers[0]);
            System.out.println(myNumbers[1]);
            System.out.println(myNumbers[2]);
            System.out.println(myNumbers[0]);
            
        }
        catch(Exception e){
            System.out.println("Ocurrio un overflow en la impresion myNumbers");
        }
    }
    
}
