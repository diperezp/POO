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
    

   
    
    //Definimos los metodos del sorteo del almacen
    public double calcValuePag(){
        switch (color) {
            case "Blanco":
                pDes=0;             //0% de descuento
                break;
            case "Amarillo":
                pDes=10;            //10% de descuento
                break;
            case "Verde":
                pDes=25;            //25% de descuento
                break;
            case "Azul":
                pDes=50;            //50% de descuento
                break;
            case "Rojo":
                pDes=100;           //100% de descuento
                break;
            default:
                break;
                pDes=100;           //100% de descuento si no es de la bolas anteriores
        }
        //Calculo del valor a Pagar
        valPag=valComp*(100-pDes)/100;
        return valPag;
    }
    
    
}