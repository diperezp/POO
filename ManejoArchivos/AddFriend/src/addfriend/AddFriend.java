
/**
 *
 * @author diego
 */
package addfriend;



import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;
import java.util.Scanner;

class AddFriend {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

                
        
        try {
            // Get the name of the contact to be updated
            // from the Command line argument
            System.out.println("Enter name:");
            String newName = entrada.nextLine();
            
                    
            // Get the number to be updated
            // from the Command line argument
            System.out.println("Enter number: ");
            long newNumber = entrada.nextLong();
            
            String nameNumberString;
            String name;
            long number;
            int index;
            
            // Using file pointer creating the file.
            File file = new File("friendsContact.txt");
            
            /**
             * Verifica si el archivo existe y si no existe lo crea pero vacio
             */
            if (!file.exists()) {
                // Create a new file if not exists.
                file.createNewFile();
            }
            // Instaciamos la clase que no sirve para acceder al archivo
            /**
             * los parametros que recibe son un objeto de tipo File y 
             * un string que le da la condicion de acceso 
             * r-solo lectura
             * w-solo escritura
             * rw - lectura y escritura
             * rwd
             */
            RandomAccessFile raf= new RandomAccessFile(file, "rw");
            
            //Creamos una variable bolenana y la inciamos en false
            boolean found = false;
            
            // Checking whether the name
            // of contact already exists.
            // getFilePointer() give the current offset
            // value from start of the file.
            
            while (raf.getFilePointer() < raf.length()) {

                /**
                 * Asigan linea a linea por cada iteracion 
                 * a la varibale nameNumberString
                 * y pasa la posicion del cursor al inicio de la siguiente 
                 * linea.
                 */
                nameNumberString = raf.readLine();

                /**
                 * Como en el archivo el texto tiene el siguiente formato 
                 * nombre!numero, separa nombre y numero les asigna el tipo a
                 * correspondiente y los mete en un arreglo
                 */
                String[] lineSplit= nameNumberString.split("!");
                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);

		//Evalua si los datos ingresado ya existen en el archivo y cambia o no la variable found a true
		if (name.equals(newName) || number == newNumber) {
                    found = true;
                    break;
                }
            }
            /*Si no se encontro ninguna coincidencia*/
            if (found == false) {

            /**
             * Asigna ala varibale nameNumberString un string con el siguiente formato
             * nombre!numero
             * 
             */
            nameNumberString= newName + "!"+ String.valueOf(newNumber);
            
            /**
             * Cambia el formato del texto a formato ASCII
             */
            raf.writeBytes(nameNumberString);

            //Pone el cursor en el incio de la siguiente linea
            raf.writeBytes(System.lineSeparator());

            // Print the message
            System.out.println(" Friend added. ");

            // Closing the resources.
            raf.close();
            }
            // The contact to be updated
            // could not be found
            else {

            // Closing the resources.
            raf.close();

            // Print the message
            System.out.println(" Input name" + " does not exists. ");
            }
        }
        
        catch (IOException ioe) {

	System.out.println(ioe);
	}
	catch (NumberFormatException nef) {
            System.out.println(nef);
	}
    }
}

