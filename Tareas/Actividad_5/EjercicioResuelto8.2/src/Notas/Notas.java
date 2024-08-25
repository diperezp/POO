/**
 *
 * @author diego
 */
package Notas;
//Importamos la clase que me permite el uso de vectores
import java.util.*;


public class Notas {
    //Definicion de la lista
     double[] listaNotas= new double[5];;
    
    
    public void Notas(){
        //Definimos la longitid de la lista
        
        //Iniciamos los valor del vector con valores dummy
        this.listaNotas[0]=0;
        this.listaNotas[1]=0;
        this.listaNotas[2]=0;
        this.listaNotas[3]=0;
        this.listaNotas[4]=0;
        
        
        
        
    }
    
    /**
     * Metodo que calcula el promedio del array de notas
     * @return El valor promedio del array notas
     */
    
    public double calcularPromedio(){
        
        double promedio=0;
        //Sumamos todos los valores de la lista
        for (double numero:listaNotas){
            promedio+=numero;
        }
        
        //Dividimos por la cantidad de valores que hay en la lista
        promedio/=listaNotas.length;
        
        //Devolvemos el valor del 
        return promedio;
        
    }
    
    /**
     * Metodo que calula la desviacion estandar del array de notas
     * @return desviacion estandar del array notas
     */
    double calcularDesviacion(){
        
        //Llamamos la funcion clacular promedio
        
        double prom = calcularPromedio();
        
        
        double suma=0;
        //
        for (double numero:listaNotas){
            suma +=Math.pow(numero-prom,2);
  
        }
        
        return Math.sqrt(suma/listaNotas.length);
    }
    
    /**
     * Metodo que calcula el valor menor del array notas
     * @return valor menor del array notas
     */
    double calcularMenor(){
        
        //Asignamos el primer valor del arreglo para comparalo con los demas
        double menor=listaNotas[0];
        //Comparamos con los demas valores de la lista incluyendo con el mismo
        for(double numero:listaNotas){
            if(numero<menor){
                //Si es menor que el elemento anterior se le asigna como el menor
                menor=numero;
            }
            
        }
        return menor;
    }
    
    /**
     * Metodo para calcular el valor mayor del array notas
     * @return el valor mayor del array notas
     */
    double calcularMayor(){
        //Asignamos el primer valor de la lista para comparar con los demas
       double mayor=listaNotas[0];
       //Comparamos con los demas valores, incluyendo con el mismo
       for(double numero:listaNotas){
           if(numero>mayor){
               //Si es meyor que el elemento anterior se le asigna como el mayor
               mayor=numero;
           }
       }
       return mayor;
       
    }
    
    
}
