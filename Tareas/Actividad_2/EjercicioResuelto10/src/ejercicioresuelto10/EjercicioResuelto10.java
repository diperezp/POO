/**
 *
 * @author diego
 * @date 03-03-2024
 * @brief codificacion del ejercicio resuelto 10 cap 4 
 * del libro de logica de programacion de Efrain Oviedo
 */
package ejercicioresuelto10;
//Importamos la class Scanner
import java.util.Scanner;

public class EjercicioResuelto10 {
    
    public static void main(String[] args) {
        
        //Definimos un objeto de la class Estudiante
        Estudiante estudiante1= new Estudiante();
        
        //Definimos un objeto de la class Scanner
        Scanner inPut=new Scanner(System.in);
        
        //Numero de inscripcion
        System.out.print("Inserte el numero de inscripcion: ");
        estudiante1.ni=inPut.nextInt();
        
        //Nombre del estudiante
        System.out.print("Introduce el nombre del estudiante: ");
        estudiante1.nom=inPut.next();
        
        //Patrimonio del estudiante 
        System.out.print("Introduce el patrimonio del estudiante: ");
        estudiante1.pat=inPut.nextDouble();
        
        //Estrato del estudiante
        System.out.print("Introduce el estrato del estudiante: ");
        estudiante1.est=inPut.nextInt();
        
        //Espacio entre informacion de entrada y salida
        System.out.println("");
        
        //imprimimos la informacion del estudiante
        System.out.println("Numero de inscripcion (NI): "+estudiante1.ni);
        
        System.out.println("Nombre (NOM): "+estudiante1.nom);
        
        System.out.println("Patrimonio (PAT): "+estudiante1.pat);
        
        System.out.println("Estrato (ES): "+estudiante1.est);
        
        System.out.println("Valor de Pago de Matricula: "+estudiante1.calcMat());
    }
    
}
