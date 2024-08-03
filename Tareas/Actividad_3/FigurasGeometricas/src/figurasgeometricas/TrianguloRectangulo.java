/**
 * @author diperezp
 * @date 01-08-2024
 * @brief Esta clase define objetos de tipo Triangulo Rectangulo con una 
 * base y una altura como atributos
 */
package figurasgeometricas;

public class TrianguloRectangulo {
    
    int base; //Atributo que define la base de un triangulo rectangulo
    int altura; //Atributo que define la altura de un triangulo rectangulo
    
    
    /**
     * Constructor de la clase Triangulo Rectangulo
     * @param base Parametro que define la base de un triangulo
     * rectangulo
     * @param altura Parametro que define la altura de un triangulo
     * rectangulo
     */
    
    public TrianguloRectangulo(int base, int altura){
        this.altura=altura;
        this.base=base;
    }
    
    /**
     * Metodo que calcula y devuelve el area de un triangulo rectangulo
     * como la base multiplicada por la altura sobre 2
     * @return Area de un triangulo rectangulo
     */
    
    double calcularArea(){
        return (base*altura)/2;
    }
    
    /**
     * Metodo que calcula y devuelve el perimetro de un triangulo
     * rectangulo como la suma de la base, la altura y la hipotenusa
     * @return Perimetro de un triangulo rectangulo
     */
    double calcularPerimetro(){
        return (base+altura+calcularHipotenusa());
        
    }
    
    
    
    /**
     * Metodo que calcula y devuelve la hipotenusa de un triangulo rectangulo
     * rectangulo utilizando el teorema de pitagoras
     * @return Hipotenusa de un triangulo rectangulo
     */
    double calcularHipotenusa(){
        return Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
    }
    
    
    /**
     * Metodo que determina si un triangulo es:
     * Equilatero: si sus tres lados son iguales
     * Escaleno: si sus tres lados son todos diferentes
     * Isoceles: si 2 de sus lados son iguales y el otro es diferente
     * de los demas
     */
    String determinarTipoTriangulo(){
        if(base==altura){
            if(base==calcularHipotenusa()){
                return "Triangulo Equilatero";
            }
            else{
                return "Triangulo Isoceles";
            }
        }
        else{
            return "Triangulo Escaleno";
        }
    }
}
