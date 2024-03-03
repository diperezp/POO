
package constructor;

/**
 *
 * @author diego
 * @date 22-02-2024
 * @brief un constructor enjava es un metodo especial 
 * que se utiliza para inicializar objetos. Se llaman 
 * constructor cuando se crea un objeto de una clase.
 * Se puede utilizar para establecer valores inciales
 * para los atributos
 */
public class Constructor {
    int x; //Create a class attribute
    
    //Create a class constructor for Constructor class
    public Constructor(){
        x=5; // asignamos el valor inicial para el atributo de la class
        
    }


    public static void main(String[] args) {
        Constructor myObj=new Constructor(); //Creamos un objeto de la class Constructor
        System.out.println(myObj.x);
        //Creamos un objeto de la class Constructor1
        Constructor1 myObj1= new Constructor1(20);
        System.out.println(myObj1.x);
        
        //Creamos un objeto de la clas Constructor2
        Constructor2 myObj2=new Constructor2(50,100);
        
        System.out.println(myObj2.attribut1Class);
        System.out.println(myObj2.attribut2Class);

    }
    
}
