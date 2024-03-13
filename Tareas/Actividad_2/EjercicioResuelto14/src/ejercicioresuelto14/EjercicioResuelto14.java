/**
 *
 * @author diego
 * @date 06-03-2024
 * @brief Solucion del ejercicio resuelto 14 del capitulo 4, del libro de 
 * logica de programacion de Efrain Oviedo
 */
package ejercicioresuelto14;

//Importamos la class Scanner
import java.util.Scanner;


public class EjercicioResuelto14 {


    public static void main(String[] args) {
        //Instanciamos la Class Scanner
        Scanner inPut= new Scanner(System.in);
        
        //Instanciamos un objeto de la clase VentasPagosEmpresa
        VentasPagosEmpresa pagos= new VentasPagosEmpresa();
        
        //Pedimos por consola el valor de ventas del departamento 1
        System.out.print("Introduce las ventas del departamento 1: ");
        pagos.ventasDepart1=inPut.nextDouble();
        
        //Pedimos por consola el valor de ventas del departamento 2
        System.out.print("Introduce las ventas del departamento 2: ");
        pagos.ventasDepart2=inPut.nextDouble();
        
        //Pedimos por consola el valor de ventas del departamento 3
        System.out.print("Introduce las ventas del departamento 3: ");
        pagos.ventasDepart3=inPut.nextDouble();
        
        //Pedimos por consola el salario de los departamentos
        System.out.print("Introduce el salario del departamento i: ");
        pagos.salaryDepart=inPut.nextDouble();
        
        //Hacemos el calculo de los salarios y los incentivos de los salarios
        pagos.calcPagosEmpresa();
        
        //Imprimimos la informacion de los pagos de los empleados
        
        
        
        

    }
    
}
