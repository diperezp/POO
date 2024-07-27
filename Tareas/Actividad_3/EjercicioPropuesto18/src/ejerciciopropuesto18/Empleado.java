/**
 * @author diego
 * @date 03-03-2023
 * @brief Class del Empleado
 */
package ejerciciopropuesto18;


public class Empleado {
    //Definimos los atributos del Empleado
    
    //Codido del empleado
    int code;
    //Nombre del empleado
    String fName;
    //Numero de horas trabajadas
    int nHours;
    //Valor hora trabajadas
    double valueHours;
    //Porcentaje Retencion en la fuente
    double percRetention;
    
    //Salario bruto
    private double bSalary;
    
    //Salario Neto
    private double nSalary;
    
    //Definimos los metodos de la class
    
    //calculo del salario bruto
    public double brutoSalary(){
        bSalary= nHours*valueHours;
        return bSalary;
    }
    
    //Calculomos el salario neto del empleado
    public double netoSalary(){
        nSalary=bSalary*(1-percRetention);
        return nSalary;
    }
    
    
}
