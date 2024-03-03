/**
 *
 * @author diego
 * @date 22-02-2024
 * @brief Encapsulacion 
 * es garantizar que los datos "sensibles" esten ocultos a los usuarios, 
 * Para lograr esto, debes:
 * 
 * declarar variables/atributos de clase como private
 * proporcionar metodos publicos de obtencion y configuracion
 * para acceder y actualizar el valor de una private variable
 * 
 * 
 * 
 * ¿Why Encapsulation?
 * 
 * Better control of class attributes and methods
 * Class attributes can be made read-only (if you only use get method)
 * or write-only (if ypu only use th set method)
 * Flexible: the programmer cna change one part of the code without affecting
 * other parts
 * Increased security of data
 */
package encapsulation;


public class Encapsulation {
    
    
    public static void main(String[] args) {
        ClassEncapsulation myObj = new ClassEncapsulation();
        myObj.setName("Diego");  //Seting el valor del atributo
        System.out.println(myObj.getName()); //Geting el valor del atributo
    }
    
}
