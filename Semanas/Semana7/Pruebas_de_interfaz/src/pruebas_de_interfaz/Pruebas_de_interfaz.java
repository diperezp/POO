/**
 *
 * @author diperezp
 * @date   23-04-2024
 */
package pruebas_de_interfaz;


public class Pruebas_de_interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //instanciamos la class Pantalla
        Pantalla panta = new Pantalla();
        //Hacemos visible la interfaz
        panta.setVisible(true);
        //Que no se muestre con respecto a nada
        panta.setLocationRelativeTo(null);
        
    }
    
}
