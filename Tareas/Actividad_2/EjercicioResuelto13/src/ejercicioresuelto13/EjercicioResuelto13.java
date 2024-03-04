/**
 *
 * @author diego
 * @date 04-03-2024
 * @brief Codificacin del Ejercicio Resuelto 13 del libro de logica
 * de programacion de Efrain Oviedo.
 */
package ejercicioresuelto13;


public class EjercicioResuelto13 {


    public static void main(String[] args) {
        
        Sorteo mySorteo=new Sorteo();
        
        mySorteo.valComp=200000;
        mySorteo.color="Rojo";
        
        System.out.println(mySorteo.calcValuePag());
        
    }
    
}
