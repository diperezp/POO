/**
 * @author diperezp
 * @brief  Solucion de unos de los ejercicios del libro guia
 * @data 24-02-2024
 * 
 */

package com.mycompany.ejercicio_cinco;

public class Ejercicio_Cinco {

    public static void main(String[] args) {
        
        double Suma,X,Y;
        Suma=0;
        X=20;
        Suma=Suma+X;
        Y=40;
        X=X+Y;
        X=X+Math.pow(Y, 2);
        Suma=Suma+(X/Y);
        System.out.println("El valor de la Suma :"+Suma);
        
        
    }
}
