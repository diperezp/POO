/**
 *
 * @author diego
 * @date 12-03-2024
 */
package sobrecargaconstructor;


public class Casa {
        int direccion;
        int Ciudad;
    
    Casa(){
    }
    
    Casa(int direccion){
        direccion=direccion;
        
    }
    
    Casa(int direccion,int ciudad){
        direccion=direccion;
        ciudad=ciudad;
    }    
    
    
    
}
