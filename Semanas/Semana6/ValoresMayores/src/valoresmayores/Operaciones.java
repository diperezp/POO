/**
 * @author diego
 * @date 12-03-2024
 */
package valoresmayores;


public class Operaciones {
    
    static double mayor(double x, double y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    static int mayor(int x, int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    
    static double mayor(double x, double y, double z){
        if(z>x && z>y){
            return z;
        }
        else if(x>z && x>y){
            return x;
        }
        else{
            return y;
        }
    }
    
}
