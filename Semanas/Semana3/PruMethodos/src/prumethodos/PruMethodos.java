/**
 *
 * @author diego
 * @date 22-02-2024
 * @brief En este proyecto se crearan y probaran clases con metodos
 * ademas se analisara la diferencia entre metodos static and public
 */
package prumethodos;


public class PruMethodos {
    
    
    public static void main(String[] args) {
        
        //Teniendo en cuenta que el unico metodo publico es method1
        // es este el unico que se puede llamar por fuera de la class
        //Instanciamos la class en el myObj
        DummyClass myObj=new DummyClass();
        myObj.method1();//Llamamos el methodo
        
        
        
    }
    
}
