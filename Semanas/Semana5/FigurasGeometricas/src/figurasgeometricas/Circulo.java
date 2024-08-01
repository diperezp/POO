/**
 *
 * @author diperezp
 * @date 1-08-2024
 * @brief Esta clase defina objetos de tipo Circulo con su radio como atributo
 * 
 */
package figurasgeometricas;


public class Circulo {
    
    int radio; // Atributo que define el radio del circulo
    
    /**
     * Constructor de la class Circulo
     * @param radio parametro que define el radio del circulo
     */
    
    Circulo(int radio){
        this.radio=radio;
    }
    
    
    /**
     * Metodo que calcula el area de un circulo como pi 
     * multiplicado por el radio al cuadrado
     * @return Area del circulo
     */
    
    double calcularArea(){
        return Math.PI*Math.pow(radio, 2);
    }
    
    
    /**
     * Metodo que calcula y devuelve el perimetro de un circulo como 
     * la multiplicacion de pi por el radio por 2
     * @return Perimetro de un circulo
     */
    
    double calcularPerimetro(){
        return 2*Math.PI*radio;
    }
    
   
    
    
    
}
