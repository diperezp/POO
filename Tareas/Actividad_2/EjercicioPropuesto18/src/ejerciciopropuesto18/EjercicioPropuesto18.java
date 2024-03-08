/**
 *
 * @author diego
 * @date 03-03-2024
 * @brief En este programa se resuelve el Ejercicio Propuesto
 * 18 del libro de logica de programacion de Efrain Oviedo
 * 
 */
package ejerciciopropuesto18;
//Importamos la class Scanner
import java.util.Scanner;

public class EjercicioPropuesto18 {
    
    public static void main(String[] args) {
        //Instanciamos la class Scanner
        Scanner inPut=new Scanner(System.in);
        
        //Creamos un objeto de la class Empleado
        Empleado empleado1 = new Empleado();
        //Asignamos el codigo del empleado
        System.out.print("Introduce el codigo del empleado: ");
        empleado1.code=inPut.nextInt();
        
        //Asignamos el nombre del empleado
        System.out.print("Introduce el nombre del empleado: ");
        empleado1.fName=inPut.next();
        
        //Asignamos el numero de horas trabajadas por el empleado1
        System.out.print("Introduce el numero de horas trabajadas: ");
        empleado1.nHours=inPut.nextInt();
        
        //Asignamos el valor por horas
        System.out.print("Introduce el valor de las horas del empleado: ");
        empleado1.valueHours=inPut.nextDouble();
        
        //Asignamos el porcetaje de retencion para el empleado1
        System.out.print("Introduce el porcentaje de retencion: ");
        empleado1.percRetention=inPut.nextDouble()/100;
        
        //Imprimimos toda la informacion del empleado1
        System.out.println("Empleado 1");
        System.out.println("Codigo: "+empleado1.code);
        System.out.println("Nombre: "+empleado1.fName);
        System.out.println("Salario bruto: "+empleado1.brutoSalary());
        System.out.println("Salario neto: "+empleado1.netoSalary());
        
        
    }
    
}
