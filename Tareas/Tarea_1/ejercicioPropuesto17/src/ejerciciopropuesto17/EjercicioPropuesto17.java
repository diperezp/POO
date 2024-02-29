/**
 * @author diperezp
 * @brief Calculo del area y perimetro de un circulo
 */
package ejerciciopropuesto17;

public class EjercicioPropuesto17 {
    
    public static void main(String[] args) {
        //Definimos la varibles necesarias
        double radio;
        double area;
        double circunferencia;
        
        //Asignamos el valor del radio del circulo
        radio=2;
        
        //Calculamos el area y el perimetro del circulo
        area=Math.pow(radio, 2)*Math.PI;
        circunferencia=2*radio*Math.PI;
        
        //Imprimimos el resultado de los calculos
        System.out.println("El area del circulo con radio "+radio+" es :"+area);
        System.out.println("El perimetro del circulo con radio "+radio+" es :"+circunferencia);
    }
    
}
