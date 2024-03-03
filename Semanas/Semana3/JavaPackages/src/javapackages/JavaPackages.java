/**
 *
 * @author diego
 * @date 22-02-2024
 * @brief Un paquete en java se utiliza para agrupar clases relacionadas 
 * Usamos paquetes para evitar confilctos de nombres y escribir un codigo
 * mejor mantenible. Los paquetes se dividen en dos categorias
 *  -Paquetes integrados (paquetes de la API de java)
 *  -paquetes definidos por el usuario (crear tus propios paquetes)
 * 
 */
package javapackages;

import java.util.Scanner; //Importamos la class Scanner de el paquete java.util

public class JavaPackages {
    
    
    
            
    public static void main(String[] args) {
        Scanner myObj =new Scanner(System.in);
        System.out.println("Enter username");
        String userName = myObj.nextLine();
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Enter Age: ");
        String userAge = myObj1.nextLine();
        System.out.println("Username is: "+userName);
        System.out.println("Your Age is: "+userAge);
        
        
        
        
    }
    
}
