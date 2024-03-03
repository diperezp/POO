/**
 * @author diego
 * @date 22-02-2024
 * @brief En esta clase se crearan metodos en sus diferentes formas 
 * para analizar su funcinamiento
 */
package prumethodos;

public class DummyClass {
    //Definimos un metodo de tipo static 
    static void method(){
        
        //Imprimira por pantalla
        System.out.println("Hello World! static");
        
    }
    //Este metodos solo es posible utilizar dentro de la class por lo 
    //que se puede utilizar para hacer conformar un methodo publico
            
    
    //Definimos un metodo de tipo public
    public void method1(){
        //Imprimira por pantalla
        System.out.println("Hello World! public");
        method();
    }
    //Este metodo solo es posible de utilizar siempre y cuando se instancia la
    //clase en un onjeto y se llame el methodo
    
}
