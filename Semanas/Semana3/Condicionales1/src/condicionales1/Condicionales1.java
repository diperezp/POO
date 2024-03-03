/**
 *
 * @author diego
 */
package condicionales1;


public class Condicionales1 {

    public static void main(String[] args) {
        int time = 2;
        if(time<18 & time>10){
            System.out.println("Good day.");
        }
        else if(time<10){
            System.out.println("Good morning");
        }
        else{
            System.out.println("Good evening");
        }
    }
    
}
