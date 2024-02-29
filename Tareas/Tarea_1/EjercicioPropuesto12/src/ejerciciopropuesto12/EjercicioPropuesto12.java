/**
 * @author diperezp
 * @brief Salario de Empleado
 */
package ejerciciopropuesto12;


public class EjercicioPropuesto12 {

    public static void main(String[] args) {
        /*
        Definimos la variables necesarias para
        el desarrollo del programa
        */
        double salarioBruto;
        int horasTrabajadas;
        double precioHora;
        double percentRetencion;
        double retencion;
        double salarioNeto;
       
        //Asignamos los valores de cada variable
        horasTrabajadas=48;
        precioHora=5000;
        percentRetencion=0.125;
        
        //Calculamos
        salarioBruto=horasTrabajadas*precioHora;
        
        retencion=salarioBruto*percentRetencion;
        
        salarioNeto=salarioBruto-retencion;
        
        //Imprimimos los valores calculados
        System.out.println("El Salario bruto del trabajador es : "+salarioBruto);
        System.out.println("El valor de la retencion es : "+retencion);
        System.out.println("EL Salario neto del trabajador es : "+salarioNeto);
        
    }
    
}
