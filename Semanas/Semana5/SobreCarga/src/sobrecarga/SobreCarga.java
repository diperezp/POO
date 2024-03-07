/**
 *
 * @author diego
 * @date 07-03-2024
 * @brief sobrecarga de metodos
 * Un metodo se puede sobrecargar es decir para una class se puede hacer 
 * varios metodos con el mismo nombre y diferente funcionamiento 
 * por ejemplo el metodo mayor puede comparar con un metodo se puede 
 * comparar 2 numeros y con otro metodo con el mismo nombre puede comparar
 * 3 numeros
 */
package sobrecarga;


public class SobreCarga {

    public static void main(String[] args) {
        System.out.println("EL numero mayor entre 2 y 4 es: "+ Funciones.mayor(2,4));
        System.out.println("EL numero mayor entre 2, 4 y 6 es: "+Funciones.mayor(2, 4,6));
    }
    

    
}
