/**
 *
 * @author diego
 * @date 22-02-2024
 * @brief La palabra clave "public" es un modificador de acceso, lo que 
 * significa que se uiliza para establecer el nivel de acceso para classes,
 * atributos, metodos y constructores.
 * 
 * Dividimos los modificadores de acceso en dos grupos 
 * 
 * Modificadore de acceso: controlan el nivel de acceso
 * Modificadore sin acceso: no controlan el nivel de acceso pero controlan 
 * otras funciones
 * 
 * Modificadores 
 * 
 * Para las class, puede utilizar public o default
 * 
 * public: se puede acceder a esta class por otras class
 * default la class es unicamente accesible por las class 
 *         en el mismo packages
 * 
 * 
 * Para atributos, metodos and constructorm
 * 
 * public: el codigo es accedible por todas las class
 * 
 * private: el codigo es unicamente accedible dentro de la class
 * 
 * default: the codigo es accedible un el mismo paquete
 * esto es usado cuando no se especifica un modificador 
 * 
 * protected: el codigo es accedible in the mismo paquete y subclasses
 * 
 * 
 * 
 * 
 * Non-Access Modifiers
 * 
 * Para las classes 
 * 
 * final: the class no puede se heredada por otras class
 * abstract: the class no puede ser usada para crear un objeto 
 * 
 * 
 * Para atributos y metodos
 * 
 * final: el atributo no puede ser modificado o sobreescrito
 * 
 * static: atributos y metodos pertenecen ala class en lugar de un objeto
 * 
 * abstract: solo puede se usado in class tipo abstract, and solo puede 
 * ser usado en metodos el metod no tiene cuerpo, el cuerpo se genera
 * por la subclass que la hereda.
 * 
 * transient: los atributos se omiten al serializar el objeto 
 * que los contiene
 * 
 * syncronized:
 * 
 * volatile: EL valor de un attributo no se almacena en cache localmente
 * y siempre se lee desde la memorial principal
 * 
 * 
 */



package modifiers;


public class Modifiers {


    public static void main(String[] args) {
        //final
        ClassFinal myObj= new ClassFinal();
        //myObj.x=30;
        //myObj.PI=3.141516;
        //No se puede cambiar pues son constantes de la class
        
        //static
        ClassStatic myObj1=new ClassStatic();
        myObj1.myStaticMethod();
        myObj1.myPublicMethod();
        
        //abstract
        
        SubClassAbstract myObj2= new SubClassAbstract();
        
        
        System.out.println("Name: " + myObj2.fname);
        System.out.println("Age: "+ myObj2.age);
        System.out.println("Graduation Year: "+myObj2.graduationYear);
        myObj2.study();
        
        
        
        
        
    }
    
}
