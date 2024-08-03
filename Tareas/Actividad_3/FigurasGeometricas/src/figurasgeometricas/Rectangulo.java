/**
 * @author diperezp
 * @date 01-08-2024
 * @brief Esta clase define objetos de tipo Rectangulo con una base y una 
 * altura como atributos
 */
package figurasgeometricas;


public class Rectangulo {
    
    int base; //Atributo que define la base de un rectangulo
    int altura; // Atributo que define la altura de un rectangulo
    
    
    /**
     * Constructor de la class Rectangulo
     * @param base Parametro que define la base de un rectangulo
     * @param altura Parametro que define la altura de un rectangulo
     */
    
    Rectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
    }
    
    /**
     * Metodo que calcula y devuelve el area de un rectangulo como la
     * multiplicacion de la base por la altura
     * @return Area de un rectangulo
     */
    
    double calcularArea(){
        return base*altura;
    }
    
    /**
     * Metodo que calcula y devuelve el permitro de un rectangulo
     * como (2*base)+(2*altura)
     * @return Perimetro de un rectangulo
     */
    
    double calcularPerimetro(){
        return (2*base)+(2*altura);
    }
    
    
}
