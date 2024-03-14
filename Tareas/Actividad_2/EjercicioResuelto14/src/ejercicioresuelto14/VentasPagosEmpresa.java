/**
 * @author diego
 * @date 06-05-2024
 * @brief Ventas y pagos de una empresa
 */
package ejercicioresuelto14;


public class VentasPagosEmpresa {

    
    /*Definimos los atributos de la clase*/
    
    //Definimos las ventas que se hacen por departamentos
    double ventasDepart1;
    double ventasDepart2;
    double ventasDepart3;
    
    //Salario Para cada departamento
    double salaryDepart;
    
    //Definimos los salarios por departamentos
    double salaryDepart1;
    double salaryDepart2;
    double salaryDepart3;
    
    //Ventas totales de la empresa
    double ventasTotal;
    
    //33% de las ventas
    double valuePercentIncetiv;

    
    /*Definimos los metodos de la clase*/
    
    //Calculo de los porcentajes y del salario de los departamentos
    public void calcPagosEmpresa(){
        
        //Calculo del valor de ventas totales de la empresa
        ventasTotal=ventasDepart1+ventasDepart2+ventasDepart3;
        
        //El valor correspondiente al 33% de las ventas
        valuePercentIncetiv=ventasTotal*0.33;
        
        //Calculo del salario de los departamentos
        
        //Evaluamos si el departamento 1 aplica para el incentivo
        if(ventasDepart1>valuePercentIncetiv){
            salaryDepart1=salaryDepart*1.2;  //mas 20% de incentivo
        }
        else{
            salaryDepart1=salaryDepart;  
        }
        
        //Evaluamos si el departamento 2 aplica para el incentivo
        if (ventasDepart2>valuePercentIncetiv){
            salaryDepart2=salaryDepart*1.2;  // mas 20% de incentivo
        }
        else{
            salaryDepart2=salaryDepart;  
        }        
        //Evaluamos si el depatamento 3 aplica para el incentivo
        
        if(ventasDepart3>valuePercentIncetiv){
            salaryDepart3=salaryDepart*1.2; //mas 20% de incentivo
        }
        else{
            salaryDepart2=salaryDepart;  
        }        
        
        
    }
    
    
    
    
    
    
}
