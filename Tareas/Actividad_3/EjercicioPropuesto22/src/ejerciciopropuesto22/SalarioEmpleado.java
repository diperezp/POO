/**
 * @author diperezp
 * @date 03-08-2024
 * @brief Salario  y Nombre de un empleado
 */
package ejerciciopropuesto22;

public class SalarioEmpleado {
    
    //Definimos lo atributos necesarios para describir el salario del empleado
    //Nombre del empleado
    String Nombre;
    //Salario por hora del empleado
    double SalarioHours;
    //Horas trabajadas del empleado
    int HoursTrabajadas;
    
    /**
     * @param empty
     * @return Devuelve el valor del salario neto del empleado 
     * siempre y cuando sea mayor a 450000
     */
    
    String calcularSalario(){
        //Salario neto del empleado
        double Salario=SalarioHours*HoursTrabajadas;
        if(Salario>450000){
            return "Nombre: "+Nombre+"\n"+"Salario Neto: "+Salario+"\n";
            
        }
        else{
            return "Nombre: "+Nombre+"\n";
        }
    }
    
    
}
