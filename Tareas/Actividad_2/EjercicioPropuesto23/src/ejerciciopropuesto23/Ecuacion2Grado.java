/**
 *
 * @author diego
 * @date 07-03-2024
 * @brief 
 */
package ejerciciopropuesto23;


public class Ecuacion2Grado {
    

    
    //Definimos los coeficiente de la ecuacion de segundo grado
    /*Ax²+Bx+C=0*/
    
    private double A;
    private double B;
    private double C;
    
    //Creamos un constructor de la class
    public Ecuacion2Grado(double a,double b,double c){
        A=a;
        B=b;
        C=c;
    }
    
    //Una ecuacion tiene dos soluciones complejas posibles
    //Definimos variables para almacenar estas
    private double realPart1;
    private double imgPart1;
    private double realPart2;
    private double imgPart2;
    
    /**definimos un metodo para la solucion de la ecuacion 
     * que imprima las soluciones
     */
    public void solucionEcuacion(){
        //Definimos una variable para saber si la solucion tiene parte imaginaria
        double imgDet=Math.pow(B, 2)-4*A*C;
        
        //Evaluamos si tiene parte imaginaria
        if(imgDet<0){
            realPart1=-B/(2*A);
            imgPart1=Math.sqrt(Math.abs(imgDet))/(2*A);
            realPart2=realPart1;
            imgPart2=imgPart1;
            
            //Imprimimos los resultados
            System.out.printf("La primera solucion de la ecuacion de segundo grado es: %.2f + %.2f i\n", realPart1,imgPart1);
            System.out.printf("La segunda solucion de la ecuacion de segundo grado es: %.2f - %.2f i\n",realPart2, imgPart2);
            
        }
        //Si no tiene parte imaginaria
        else{
            realPart1=(-B+Math.sqrt(imgDet))/(2*A);
            realPart2=(-B-Math.sqrt(imgDet))/(2*A);
            
            System.out.printf("La primera solucion de la ecuacion de segundo grado es: %.2f\n", realPart1);
            System.out.printf("La segunda solucion de la ecuacion de segundo grado es: %.2f\n", realPart2);
            
            
            
        }
    }
    
    
    
    
}
