/**
 *
 * @author diego
 */
package EjemploClass3;


public class EjemploClass3 {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        
        estudiante1.ID=1002063852;
        estudiante1.name="Diego";
        estudiante1.lastname="Pineda";
        estudiante1.Phone=31586;
        
        System.out.println("Identificacion: "+estudiante1.ID);
        System.out.println("Nombre: "+estudiante1.name);
        System.out.println("Apellido: "+estudiante1.lastname);
        System.out.println("Numero de Telefono: "+estudiante1.Phone);
        
        
        Empleado empleado1 = new Empleado();
        
        empleado1.ID=15518;
        empleado1.name="Jairo";
        empleado1.lastname="Lopez";
        empleado1.Address="Calle 50 # 50-139";
        empleado1.Phone=31589;
        empleado1.Empresa="unal";
        empleado1.Salario=400000;
        



                
    }
    
}
