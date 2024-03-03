/**
 * @auhtor diperezp
 * @date 22-02-2024
 * @brief primer proyecto para la realizacion de los ejercicios de 
 * clase de la semana 3, cuarta clase.
 */
package dummy22february;
//un paquete guarda un conjunto de clases

public class Dummy22February {


    public static void main(String[] args) {
        
        //Instanciamos la clase Estudiante
        Estudiante estudiante1=new Estudiante();
        //Asignamos los atributos del objeto
        estudiante1.IDE=124656;
        estudiante1.name="Diego";
        estudiante1.lastName="Pineda";
        estudiante1.address="Calle 50 # 50-139";
        estudiante1.phone=315866;
        
        
        //Imprimimos algunos atributos del objeto estudiante1
        System.out.println("Identificacion "+estudiante1.IDE);
        System.out.println("Nombre "+estudiante1.name);
        System.out.println("Apellido "+estudiante1.lastName);
        System.out.println("Telefono "+estudiante1.phone);
        System.out.println("Direccion "+estudiante1.address);
        
        System.out.println("");
        //Instanciamos la clase Empleado
        Empleado empleado1 =new Empleado();
        
        //Asignamos algunos de los atributos de empleado
        //Atributos heredados de la class Estudiante
        empleado1.IDE=546571;
        empleado1.name="Jose";
        empleado1.lastName="Angarita";
        empleado1.phone=312830;
        empleado1.address="Calle 45 # 30-54";
        //Atributos propios de la clase Estudiante
        empleado1.company="Universidad Nacional de Colombia";
        empleado1.salary=1000000;
        
        
        //Imprimos algunos datos del objeto empleado1
        System.out.println("Empleado "+empleado1.name+" " +empleado1.lastName);
        System.out.println("IDE "+empleado1.IDE);
        System.out.println("Direccion "+empleado1.address);
        System.out.println("Phone "+empleado1.phone);
        System.out.println("Empresa "+empleado1.company);
        System.out.println("Salario "+empleado1.salary);
        
        
        
        
        
        
        
    }
    
}
