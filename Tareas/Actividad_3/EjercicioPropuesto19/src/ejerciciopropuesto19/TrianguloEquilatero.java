/**
 *
 * @author diego
 * @date 27/07/2024
 * @brief Triangulo Equilatero
 */
package ejerciciopropuesto19;


public class TrianguloEquilatero {
    
    //Definimos los atributos del triangulo
    
    //Lado
    double edge;
    //Area 
    private double area;
    //Perimetro 
    private double perimeter;
    //Altura
    private double height;
    
    
    //Definimos lo metodos de la class
    
    //Calculo del perimetro del triangulo
    public double perimetroTrian(){
        perimeter=3*edge;
        return perimeter;
    }
    
    //Calculo de la altura del triangulo
    public double alturaTrian(){
        height= Math.sin(Math.PI/3)*edge;
        return height;
    }
    
    //Calculo de el area del Triangulo
    public double areaTrian(){
        area=height*edge/2;
        return area;
    }
}