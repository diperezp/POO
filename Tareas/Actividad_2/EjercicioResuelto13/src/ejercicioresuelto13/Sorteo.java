/**
 *
 * @author diego
 * @date 04-03-2024
 * @brief Class del sorteo del almacen
 */
package ejercicioresuelto13;


public class Sorteo {
    //Definimos los atributo del sorteo del almacen
    //Valor de la compra
    double valComp;
    
    //Color de la bola
    String color;
    
    // Valor a pagar
    private double valPag;
    
    //Porcentaje de descuento
    double pDes;
    
    //Definimos los metodos del sorteo del almacen
    public double calcValuePag(){
        //Evaluamos el color de la bolita retirada
        if(color.compareTo()){
            pDes=0;             //0% de descuento
        }
        else if(){
            pDes=10;            //10% de descuento
        }
        else if(color=="Amarillo"){
            pDes=25;            //25% de descuento
        }
        else if (color=="Azul"){
            pDes=50;            //50% de descuento
        }
        else{
            pDes=100;          //100% de descuento
        }
        //Calculo del valor a Pagar
        valPag=valComp*(100-pDes)/100;
        return valPag;
    }
    
    
}
