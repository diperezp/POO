/**
 *
 * @author if401-09
 */
package ejemplo16;


public class Warrior implements Character,Weapon{
    //Implementacion de los metodos heredados
    public void attack(){
        System.out.println("Warrior attacks with a sword");
        
    }
    
    public void use(){
        System.out.println("The warrior uses to sword");
    }

    
    
}
