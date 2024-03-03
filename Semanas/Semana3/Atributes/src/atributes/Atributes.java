
/**
 *
 * @author diego
 * @date 22-02-2024
 * @brief Creamos dos objetos de la class DummmyClass
 * y cambiamos el valor del atributo propio de la class en uno
 * de los objetos
 */
package atributes;

public class Atributes {


    public static void main(String[] args) {
        //Instanciamos las class creando un objeto
        DummyClass myObj1= new DummyClass();
        //Cambiamos el valor del atributo de la clase
        myObj1.atributes1=25;
        
        //Instanciamos nuevamente la class creando un objeto 
        DummyClass myObj2= new DummyClass();
        
        //Analisis del comportamiento del atributo en los dos objetos
        
        System.out.println("El valor del atributo del objeto1 es :"+myObj1.atributes1);
        System.out.println("El valor del atributo del objeto2 es :"+myObj2.atributes1);
        
        
        //ejecutamos
        
        //Resultado
        /*
        El valor del atributo del objeto1 es :25
        El valor del atributo del objeto2 es :5
        */
        //conclusiones
        /*
        En el analisis del atributo creado como se crea en la class
        DummyClass, Resulta que cuando se crea objeto de la class no afecta 
        en nada ala definicion de la clase, es decir los atributos de la clase
        conservan el valor que tenian cuando se definio la clase.
        */
        
        
        
        
    }
    
}
