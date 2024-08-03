/**
 * @author diperezp
 * @name Ecuacion2Grado
 */
package ejerciciopropuesto23;


public class Ecuacion2Grado {
    

    
    
    

    
    //Definimos los coeficiente de la ecuacion de segundo grado
    /*Ax²+Bx+C=0*/
    
    double A;
    double B;
    double C;
    
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
    
    
    /**
     * 
     * @param value
     * @param decimals
     * @return value redondeado a decimal
     */
    public static double roundToDecimals(double value, double decimals){
        double scale=Math.pow(10,decimals);
        return Math.round(value*scale)/scale;
    }
    
    /**definimos un metodo para la solucion de la ecuacion 
     * que imprima las soluciones
     */
    public String[] solucionEcuacion(){
        //Definimos una variable para saber si la solucion tiene parte imaginaria
        double imgDet=Math.pow(B, 2)-4*A*C;
        
        //Definimos el vector que va almacenar las soluciones de la ecuacion
        String[] Soluciones={"",""};
        
        //Evaluamos si tiene parte imaginaria
        if(imgDet<0){
            realPart1=-B/(2*A);
            imgPart1=Math.sqrt(Math.abs(imgDet))/(2*A);
            realPart2=realPart1;
            imgPart2=imgPart1;
            
            //Redondeamos a 3 decimales los resultados
            realPart1=roundToDecimals(realPart1, 3);
            imgPart1=roundToDecimals(imgPart1, 3);
            realPart2=roundToDecimals(realPart2, 3);
            imgPart2=roundToDecimals(imgPart2, 3);


            //Asignamos el valor de la solucion 1
            Soluciones[0]=realPart1+" + i"+imgPart1;
            //Asignamos el valor de la solucion 2
            Soluciones[1]=realPart2+" - i"+imgPart2;
            
            
            //Imprimimos los resultados
            //System.out.printf("La primera solucion de la ecuacion de segundo grado es: %.2f + %.2f i\n", realPart1,imgPart1);
            //System.out.printf("La segunda solucion de la ecuacion de segundo grado es: %.2f - %.2f i\n",realPart2, imgPart2);
            
        }
        //Si no tiene parte imaginaria
        else{
            
            realPart1=(-B+Math.sqrt(imgDet))/(2*A);
            realPart2=(-B-Math.sqrt(imgDet))/(2*A);
            
            //Redondeamos los resultados
            realPart1=roundToDecimals(realPart1, 3);
            realPart2=roundToDecimals(realPart2, 3);


            
            //Asignamos el valor de la solucion 1
            Soluciones[0]=realPart1+"";
            //Asignamos el valor de la solucion 2
            Soluciones[1]=realPart2+"";
            
            
            
            
            //System.out.printf("La primera solucion de la ecuacion de segundo grado es: %.2f\n", realPart1);
            //System.out.printf("La segunda solucion de la ecuacion de segundo grado es: %.2f\n", realPart2);
            
            
            
        }
        
        return Soluciones;
        
    }
    
    
    
    
}

