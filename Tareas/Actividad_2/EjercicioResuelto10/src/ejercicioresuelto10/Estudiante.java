/**
 *
 * @author diego
 * @date 03-03-2024
 * @brief Datos socioeconomicos de un estudiante
 */
package ejercicioresuelto10;

public class Estudiante {
    //Definimos los atributos socioeconomicos del Estudiante;
    //Numero de inscripcion
    int ni;
    //Nombre 
    String nom;
    //Patrimonio
    double pat;
    //Estrato social
    int est;
    //Valor de matricula
    private double pagMat;
    
    //Definimos los metodos de la class
    //Metodo del calculo de la matricula
    public double calcMat(){
        
        //Valor minimo de matricula
        pagMat=50000;
        
        //Excedente dependiente del estado socioeconomico
        if(pat>2000000 & est>3){
            pagMat+=pat*0.03; //mas 3% del patrimonio
        }
        return pagMat;
    }
    
    
}
