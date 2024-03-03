/**
 *
 * @author diego
 */
package proyect1class;


public class Proyect1Class {

    
    public static void main(String[] args) {
        //Creamos un objeto de la clase carro
        Car myCarro= new Car();
        
        myCarro.brand="Renault";
        
        //Mostramos la informacion permitida
        System.out.println("El carro es un "+myCarro.brand);
        //Llmamos uno de los metodos de la clase
        myCarro.honk();
    }
    
}
