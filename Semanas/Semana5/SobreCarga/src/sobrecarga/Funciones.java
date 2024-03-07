/**
 *
 * @author e420-00
 * @date 07-03-2024
 * @brief 
 */
package sobrecarga;


public class Funciones {
    
    
    static int mayor(int x, int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    static int mayor(int x, int y, int z){
        if(x>y && x>z){
            return x;
        }
        else if(y>x && y>z){
            return y;
        }
        else{
            return z;
        }
            
    }
    
}
