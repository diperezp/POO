/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Personas;


import javax.swing.*;



/**
 *
 * @author diego
 */
public class VentanaPrincipal extends javax.swing.JFrame {
        ListaPersonas lista = new ListaPersonas();
        javax.swing.DefaultListModel modelo = new javax.swing.DefaultListModel();
    

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        

        
        
        
        setTitle("Personas");
        setSize(270,350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JLabel();
        apellidos = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoApellidos = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        anadir = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        borrarLista = new javax.swing.JButton();
        direccion = new javax.swing.JLabel();
        campoDireccion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaNombres = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombre.setText("Nombre:");

        apellidos.setText("Apellidos: ");

        telefono.setText("Telefono: ");

        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });

        anadir.setText("Añadir");
        anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        borrarLista.setText("Borrar Lista");
        borrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarListaActionPerformed(evt);
            }
        });

        direccion.setText("Direccion: ");

        campoDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDireccionActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listaNombres);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre)
                            .addComponent(apellidos)
                            .addComponent(telefono)
                            .addComponent(direccion))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(anadir)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(campoNombre)
                            .addComponent(campoApellidos)
                            .addComponent(campoTelefono)
                            .addComponent(campoDireccion)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(borrarLista)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidos)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccion)
                    .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(anadir)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminar)
                    .addComponent(borrarLista))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    
    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void campoDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDireccionActionPerformed

    private void anadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirActionPerformed

        if(campoNombre.getText().trim().isEmpty() || campoApellidos.getText().trim().isEmpty() || campoTelefono.getText().trim().isEmpty() || campoDireccion.getText().trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null,"Debe de ingresar los datos\nen todos los campos de texto", "Error",JOptionPane.ERROR_MESSAGE);

        }
        else{
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
    }//GEN-LAST:event_anadirActionPerformed

    private void borrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarListaActionPerformed
        lista.borrarLista(); //Se elimina todas las personas del vector
        modelo.clear(); // Limpia el Jlist, la lista grafica de personas
    }//GEN-LAST:event_borrarListaActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int indice = listaNombres.getSelectedIndex();
        if(indice>=0){
            modelo.removeElementAt(indice); /* Se elimina la persona seleccionada de la lista grafica*/
            lista.eliminarPersona(indice); /* Se elimina la persona seleccionada del vector de personas*/
        }else{
            /* Si no se selecciona ninguna persona, se genera un mensaje de error*/
            JOptionPane.showMessageDialog(null,"Debe seleccionar un elemento", "Error",JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_eliminarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anadir;
    private javax.swing.JLabel apellidos;
    private javax.swing.JButton borrarLista;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel direccion;
    private javax.swing.JButton eliminar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaNombres;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables
}