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
    
    //Colores
    final int blanco=color.compareTo("Blanco");
    final int verde=color.compareTo("Verde");
    final int amarillo=color.compareTo("Amarillo");
    final int azul=color.compareTo("Azul");
    final int rojo=color.compareTo("Rojo");
    
    //Definimos los metodos del sorteo del almacen
    public double calcValuePag(){
        //Evaluamos el color de la bolita retirada
        if(blanco==1){
            pDes=0;             //0% de descuento
        }
        else if(verde==1){
            pDes=10;            //10% de descuento
        }
        else if(amarillo==1){
            pDes=25;            //25% de descuento
        }
        else if (azul==1){
            pDes=50;            //50% de descuento
        }
        else if(rojo==1) {
            pDes=100;          //100% de descuento
        }
        //Calculo del valor a Pagar
        valPag=valComp*(100-pDes)/100;
        return valPag;
    }
    
    
}
