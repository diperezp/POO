/**
 *
 * @author diego
 */
package friends;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class CRUD {
    /*Esta funcion adiciona un amigo al archivo creado friendsContact*/
    public void addFriend(String newName,long newNumber){
        try {
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
    //
    
    /* Esta funcion devuelva la cantidad de lineas que tiene el archivo*/
    public int lenghtFile(){
        long lines=0;
        try{
            File file = new File("friendsContact.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            lines=Files.lines(Paths.get("friendsContact.txt")).count();
        }
        catch (IOException ioe)
        {
            System.out.println(ioe);
        }
        catch (NumberFormatException nef)
        {
            System.out.println(nef);
        }
        
        return (int)lines;
    }
    //
    
    /*Esta funcion devulve un arreglo con todas las lineas del archivo friendsContact.txt */
    public String[] readFriend(int lines){
        String[] lista = new String[lines];
        
         try {
            String nameNumberString;
            String name;
            long number;
            int index;

            // Using file pointer creating the file.
            File file = new File("friendsContact.txt");

            if (!file.exists()) {

                // Create a new file if not exists.
                file.createNewFile();
            }

            //Instaciamos la class RandomAccesFile para poder Acceder al archivo como "rw" lectores y escritores
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;
            
            /**
             * Iniciamos con la lectura del texto que esta en el archivo
             * 
             */
            int counter_i=0;
            while (raf.getFilePointer() < raf.length()) {

                // asignamos linea a linea ala varibale nameNumberString
                nameNumberString = raf.readLine();
                
                /**
                 * Separamos nombre y numero y los metemos en un arreglo con
                 * su tipo correspondiente
                 */
                String[] lineSplit = nameNumberString.split("!");

                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);

                //Guardamos la 
                lista[counter_i]=(  name +"!" + number + "\n");
                counter_i++;
 
            }

        }
        catch (IOException ioe)
        {
            System.out.println(ioe);
        }
        catch (NumberFormatException nef)
	{
            System.out.println(nef);
        }
         
        return lista;

    }
    //
    
    /*Esta funcion elimina a una persona del archivo*/
    public void deleteFriend(String delName){
        try {
            
            String nameNumberString;
            String name;
            long number;
            int index;
            
            // Using file pointer creating the file.
            File file = new File("friendsContact.txt");
            
            if (!file.exists()) {
                
                // Create a new file if not exists.
                file.createNewFile();
            }
            
            // Opening file in reading and write mode.
            RandomAccessFile raf= new RandomAccessFile(file, "rw");
            boolean found = false;
            
            // Checking whether the name of contact exists.
            // getFilePointer() give the current offset
            // value from start of the file.
            while (raf.getFilePointer() < raf.length()) {
                
                // reading line from the file.
                nameNumberString = raf.readLine();
                
                // splitting the string to get name and
                // number
                String[] lineSplit = nameNumberString.split("!");
                
                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
                
                // if condition to find existence of record.
                if (name.equals(delName)) {
                    found = true;
                    break;
                }
            }
            
            // Delete the contact if record exists.
            if (found == true) {
                
                // Creating a temporary file
                // with file pointer as tmpFile.
                File tmpFile = new File("temp.txt");
                
                // Opening this temporary file
                // in ReadWrite Mode
                RandomAccessFile tmpraf= new RandomAccessFile(tmpFile, "rw");
                
                // Set file pointer to start
                raf.seek(0);
                
                // Traversing the friendsContact.txt file
                while (raf.getFilePointer()< raf.length()) {
                    
                    // Reading the contact from the file
                    nameNumberString = raf.readLine();
                    
                    index = nameNumberString.indexOf('!');
                    name = nameNumberString.substring(0, index);
                    
                    // Check if the fetched contact
                    // is the one to be deleted
                    if (name.equals(delName)) {
                        
                        // Skip inserting this contact
                        // into the temporary file
                        continue;
                    }
                    
                    // Add this contact in the temporary
                    // file
                    tmpraf.writeBytes(nameNumberString);
                    
                    // Add the line separator in the
                    // temporary file
                    tmpraf.writeBytes(System.lineSeparator());
                }
                
                // The contact has been deleted now
                // So copy the updated content from
                // the temporary file to original file.
                // Set both files pointers to start
                raf.seek(0);
                tmpraf.seek(0);
                
                // Copy the contents from
                // the temporary file to original file.
                while (tmpraf.getFilePointer()< tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }
                
                // Set the length of the original file
                // to that of temporary.
                raf.setLength(tmpraf.length());
                
                // Closing the resources.
                tmpraf.close();
                raf.close();
                
                // Deleting the temporary file
                tmpFile.delete();
                
                System.out.println(" Friend deleted. ");
            } // The contact to be deleted
            // could not be found
            else {
                
                // Closing the resources.
                raf.close();
                
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe);
        }
        
    }
    //
    
    /* Esta funcion actuliza el numero de la persona seleccionada */
    public void updateFriend(String upName, long newNumber){
                try {
            

            
            String nameNumberString;
            String name;
            long number;
            int index;
            
            // Using file pointer creating the file.
            File file = new File("friendsContact.txt");
            
            if (!file.exists()) {
                
                // Create a new file if not exists.
                file.createNewFile();
            }
            
            // Opening file in reading and write mode.
            RandomAccessFile raf= new RandomAccessFile(file, "rw");
            boolean found = false;
            
            // Checking whether the name
            // of contact already exists.
            // getFilePointer() give the current offset
            // value from start of the file.
            while (raf.getFilePointer() < raf.length()) {
                
                // reading line from the file.
                nameNumberString = raf.readLine();
                
                // splitting the string to get name and
                // number
                String[] lineSplit= nameNumberString.split("!");
                
                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
                
                // if condition to find existence of record.
                if (name.equals(upName) || number == newNumber) {
                    found = true;
                    break;
                }
            }
            
            // Update the contact if record exists.
            if (found == true) {
                
                // Creating a temporary file
                // with file pointer as tmpFile.
                File tmpFile = new File("temp.txt");
                
                // Opening this temporary file
                // in ReadWrite Mode
                RandomAccessFile tmpraf= new RandomAccessFile(tmpFile, "rw");
                
                // Set file pointer to start
                raf.seek(0);
                
                // Traversing the friendsContact.txt file
                while (raf.getFilePointer()< raf.length()) {
                    
                    // Reading the contact from the file
                    nameNumberString = raf.readLine();
                    
                    index = nameNumberString.indexOf('!');
                    name = nameNumberString.substring(0, index);
                    
                    // Check if the fetched contact
                    // is the one to be updated
                    if (name.equals(upName)) {
                        
                        // Update the number of this contact
                        nameNumberString= name + "!" + String.valueOf(newNumber);
                    }
                    
                    // Add this contact in the temporary
                    // file
                    tmpraf.writeBytes(nameNumberString);
                    
                    // Add the line separator in the
                    // temporary file
                    tmpraf.writeBytes(System.lineSeparator());
                }
                
                // The contact has been updated now
                // So copy the updated content from
                // the temporary file to original file.
                
                // Set both files pointers to start
                raf.seek(0);
                tmpraf.seek(0);
                
                // Copy the contents from
                // the temporary file to original file.
                while (tmpraf.getFilePointer()< tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }
                
                // Set the length of the original file
                // to that of temporary.
                raf.setLength(tmpraf.length());
                
                // Closing the resources.
                tmpraf.close();
                raf.close();
                
                // Deleting the temporary file
                tmpFile.delete();
                
                System.out.println(" Friend updated. ");
            }
            
            // The contact to be updated
            // could not be found
            else {
                
                // Closing the resources.
                raf.close();
                
                // Print the message
                System.out.println(" Input name"+ " does not exists. ");
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
