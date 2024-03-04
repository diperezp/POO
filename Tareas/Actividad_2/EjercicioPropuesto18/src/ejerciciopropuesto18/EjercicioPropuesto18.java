/**
 *
 * @author diego
 * @date 03-03-2024
 * @brief En este programa se resuelve el Ejercicio Propuesto
 * 18 del libro de logica de programacion de Efrain Oviedo
 * 
 */
package ejerciciopropuesto18;


public class EjercicioPropuesto18 {
    
    public static void main(String[] args) {
        //Creamos un objeto de la class Empleado
        Empleado empleado1 = new Empleado();
        //Asignamos el codigo del empleado
        empleado1.code=156417;
        //Asignamos el nombre del empleado
        empleado1.fName="Jose";
        //Asignamos el valor de horas trabajadas por el empleado1
        empleado1.nHours=48;
        //Asignamos el valor por horas
        empleado1.valueHours=20000;
        //Asignamos el porcetaje de retencion para el empleado1
        empleado1.percRetention=0.10;
        
        //Imprimimos toda la informacion del empleado1
        System.out.println("Empleado 1");
        System.out.println("Codigo: "+empleado1.code);
        System.out.println("Nombre: "+empleado1.fName);
        System.out.println("Salario bruto: "+empleado1.brutoSalary());
        System.out.println("Salario neto: "+empleado1.netoSalary());
        
        
    }
    
}
