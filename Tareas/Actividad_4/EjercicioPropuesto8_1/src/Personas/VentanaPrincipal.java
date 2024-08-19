/**
 *
 * @author diego
 */
package Personas;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * 
 * Esta clase denominada VentanaPrincipal define una intefaz grafica que 
 * permite crear una persona y agregarle a un vector de personas.
 * Luego, se puede eliminar una personas seleccionada o borrar todas las 
 * personas
 * 
 */



public class VentanaPrincipal extends JFrame implements ActionListener {
    
    private ListaPersonas lista; //El objeto ListasPersonas de la aplicacion
    private Container contenedor; /* Un contenedor de elementos graficos*/
    
    
    //Etiqueta estatica para los nombres de los atributos
    private JLabel nombre,apellidos,telefono,direccion;
    //Campos de ingreso de texto 
    private JTextField campoNombre, campoApellidos, campoTelefono, campoDireccion;
    
    //Botones de la interfaz 
    private JButton anadir, eliminar, borrarLista;
    
    //Lista de las personas
    private JList   listaNombres;
    
    //Objeto que modela la lista
    private DefaultListModel modelo;
    
    //Barra de dezplazamiento Vertical
    private JScrollPane scrollLista;
    
    
    /**
     * Constructor de la venta principal
     */
    
    public VentanaPrincipal(){
        lista=new ListaPersonas();  //Crea lista de personas
        
        inicio();
        
        setTitle("Personas"); //Establece el titulo de la ventana
        setSize(270,350); //Establece el tamaño de la ventana
        setLocationRelativeTo(null); //La ventan se posiciona en el centro de la pantalla
        

        //Establece que el boton de cerrar permitira salir de la aplicacion
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); //Establece que el tamaño de la ventana no se puede cambiar           
    }
    
    /**
     * Metodo para crear la ventana con sus diferentes componetes
     * graficos
     */
    
    private void inicio(){
        contenedor = getContentPane(); //Obtiene el panel contenidos de la ventana
        contenedor.setLayout(null); //Establece que el panel no tiene asociado ningun layout
        
        //Establece la etiqueta y el campo nombre
        nombre = new JLabel();
        nombre.setText("Nombre:");
        nombre.setBounds(20,20,135,23); //Establece la posicion de la etiqueta nombre
        
        campoNombre= new JTextField();
        //Establece la posicion de campo nombre
        campoNombre.setBounds(105,20,135,23);
        
        //Establece la etiqueta y el campo apellidos
        apellidos = new JLabel();
        apellidos.setText("Apellidos:"); //Establece la posicion de la etiqueta apellidos
        apellidos.setBounds(20,50,135,23); //Posicion en el contenedor del label
        
        //Campo apellido
        campoApellidos = new JTextField();
        //Establece la posicion del campo de texto apellidos
        campoApellidos.setBounds(105,50,135,23);
        
        //Establece la etiqueta y el campo telefono
        telefono = new JLabel();
        telefono.setText("Telefono:");
        telefono.setBounds(20,80,135,23); //Establece la posicion de la etiqueta telefono
        
        campoTelefono = new JTextField();
        //Establece la posicion del campo de texto telefono
        campoTelefono. setBounds(105,80,135,23);
        
        //Establece la etiqueta y el campo direccion
        direccion = new JLabel();
        direccion.setText("Direccion:");
        direccion.setBounds(20,110,135,23); //Establece la posicion de la etiqueta direccion
        
        campoDireccion= new JTextField();
        //Establece la posicion del campo de texto direccion
        campoDireccion.setBounds(105,110,135,23);
        
        //Establece el boton Añadir persona
        anadir =new JButton();
        anadir.setText("Añadir");
        anadir.setBounds(20,280,80,23); //Establece la posicion de la etiqueta direccion
        
        /*Agregar el boton un ActionListener para que gestione eventos del boton*/
        eliminar.addActionListener(this);
        
        //Establece el boton Borrar lista
        borrarLista=new JButton();
        borrarLista.setText("Borrar Lista");
        borrarLista.setBounds(120,280,120,23); //Establece la posicion del boton borrar lista
        
        /* Agregar el boton un ActionListener para que gestione eventos del boton*/
        borrarLista.addActionListener(this);
        
        
        //Establece la lista grafica de personas
        listaNombres =new JList();
        /*Establece que se pueda seleccionar solamente un elemento de la lista */
        listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        //Establece una barra de desplazamiento vertical
        scrollLista = new JScrollPane();
        //Establece la posicion de la barra de desplazamiento vertical
        scrollLista.setViewportView(listaNombres);
        
        //Se añade cada componentes graficos al contenedor de la ventana
        contenedor.add(nombre);
        contenedor.add(campoNombre);
        contenedor.add(apellidos);
        contenedor.add(campoApellidos);
        contenedor.add(telefono);
        contenedor.add(campoTelefono);
        contenedor.add(direccion);
        contenedor.add(campoDireccion);
        contenedor.add(anadir);
        contenedor.add(eliminar);
        contenedor.add(borrarLista);
        contenedor.add(scrollLista);

    }
    
    /**
     * Metodo que genera los eventos generados en la ventana principal 
     */
    
    @Override
    public void actionPerformed(ActionEvent evento){
        if(evento.getSource()==anadir){
        //Si se pulsa el boton añadir 
        anadirPersona(); //Se invoca añadir persona
    }
        else if(evento.getSource()==eliminar){
            //Si se pulsoel boton eliminar
            /* Se invoca el metodo eliminarNombre que elimina el elemento seleccionado */
            eliminarNombre(listaNombres.getSelectedIndex());
        }
        else if (evento.getSource()==borrarLista){
            /* Si se pulsa el boton borrarlista*/
            borrarLista(); //Se invoca borrar lista
        }
        
        
    }
    
    /**
     * Metodo que agrega una persona al vector de personas y ala lista grafica de personas
     */
    
    private void anadirPersona(){
        /* Se obtiene los campos de texto ingresados y se crea una persona*/
        Persona p = new Persona(campoNombre.getText(), campoApellidos.getText(), campoTelefono.getText(),campoDireccion.getText());
        lista.anadirPersona(p); /* Se añade una persona al vector de personas*/
        String elemento = campoNombre.getText()+"-"+campoApellidos.getText()+"-"+campoTelefono.getText()+"-"+campoDireccion.getText();
        modelo.addElement(elemento); /* Se agrega el texto con los daos de la persona al Jlist*/
        listaNombres.setModel(modelo);
        //Se colocan todos los campos de texto nulos
        campoNombre.setText("");
        campoApellidos.setText("");
        campoTelefono.setText("");
        campoDireccion.setText("");
    }
    
    /**
     * 
     * Metodo que elimina una persona del vector de personas y de la lista grafica de personas
     * en la ventana
     * @param indice Parametro que define la posicion de la persona a eñiminar
     */
    
    private void eliminarNombre(int indice){
        if(indice>=0){
            modelo.removeElementAt(indice); /* Se elimina la persona seleccionada de la lista grafica*/
            lista.eliminarPersona(indice); /* Se elimina la persona seleccionada del vector de personas*/
        }else{
            /* Si no se selecciona ninguna persona, se genera un mensaje de error*/
            JOptionPane.showMessageDialog(null,"Debe seleccionar un elemento", "Error",JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
    /**
     * Metodo que elimina todas las personas del vector de personas
     */
    
    private void borrarLista(){
        lista.borrarLista(); //Se elimina todas las personas del vector
        modelo.clear(); // Limpia el Jlist, la lista grafica de personas
    }
    
    
    
}
