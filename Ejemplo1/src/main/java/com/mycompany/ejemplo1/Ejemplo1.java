/**
 * 
 * @author diperezp
 * @brief Inicio del curso de programacion
*/

package com.mycompany.ejemplo1;

public class Ejemplo1 {

    public static void main(String[] args) {
        /*Definimos y asignamos un valor a una 
         *variable que contega la edad de juan
         */
        int Edad_Juan=9;
        //Definimos varibles para que contega la edad del resto de la familia
        int Edad_Albert,Edad_Ana,Edad_Mama;
        //Asignamos el valor de la edad de albert con respecto ala edad de juan
        Edad_Albert=2*(Edad_Juan/3);
        ////Asignamos el valor de la edad de ana con respecto ala edad de juan
        Edad_Ana=4*(Edad_Juan/3);
        //Asignamos el valor de la edad de Mama relacionado con la edad de la familia
        Edad_Mama= Edad_Juan + Edad_Albert +Edad_Ana;
        //Imprimos la deducion de las edades de la familia
        System.out.println("La edades son: ");
        System.out.println("Juan :" +Edad_Juan);
        System.out.println("Albert :"+ Edad_Albert);
        System.out.println("Ana :"+Edad_Ana);
        System.out.println("Mama :"+Edad_Mama);
        
        
    }
}
