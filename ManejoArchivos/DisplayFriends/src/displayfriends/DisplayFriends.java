package displayfriends;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;

class DisplayFriends {

    public static void main(String[] args) {
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
            System.out.println(raf.length());
            System.out.println(raf.getFilePointer());
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

                //Presentamos los datos de cada linea del texto en la terminal
                System.out.println("Friend Name: " + name + "\n"+ "Contact Number: " + number + "\n");
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
        }
    }
