/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicioresuelto10;

/**
 *
 * @author diego
 */
public class EstudianteInterfaz extends javax.swing.JFrame {

    /**
     * Creates new form EstudianteInterfaz
     */
    public EstudianteInterfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroInscripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreEstudiante = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPatrimonioEstudiante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEstratoEstudiante = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCalculoMatricula = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMatricula = new javax.swing.JTextArea();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Matricula de Estudiante");

        jLabel2.setText("Numero de Inscripcion");

        txtNumeroInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroInscripcionActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre Estudiante");

        txtNombreEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEstudianteActionPerformed(evt);
            }
        });

        jLabel4.setText("Patrimonio Estudiante");

        txtPatrimonioEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatrimonioEstudianteActionPerformed(evt);
            }
        });

        jLabel5.setText("Estrato Estudiante");

        txtEstratoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstratoEstudianteActionPerformed(evt);
            }
        });

        jLabel6.setText("Informacion de Matricula");

        btnCalculoMatricula.setText("Liquidacion de Matricula");
        btnCalculoMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculoMatriculaActionPerformed(evt);
            }
        });

        txtAreaMatricula.setColumns(20);
        txtAreaMatricula.setRows(10);
        jScrollPane1.setViewportView(txtAreaMatricula);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNumeroInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEstratoEstudiante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                .addComponent(txtPatrimonioEstudiante, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCalculoMatricula)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNumeroInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPatrimonioEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEstratoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnCalculoMatricula)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Instanciamos la class Estudiante fuera de las aplicaciones para que el ambito
    //del objeto abarque todas las funciones
    Estudiante student=new Estudiante();
    
    private void txtNumeroInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroInscripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroInscripcionActionPerformed

    private void btnCalculoMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculoMatriculaActionPerformed
        
        //Asignamos los valores escritos en los text field  a los parametros del objeto
        
        //Numero de inscripcion
        student.ni=Integer.parseInt(txtNumeroInscripcion.getText());
        
        //Nombre
        student.nom=txtNombreEstudiante.getText();
        
        //Patrimonio
        student.pat=Double.parseDouble(txtPatrimonioEstudiante.getText());
        
        //Estrato
        student.est=Integer.parseInt(txtEstratoEstudiante.getText());
        
        //Limpiamos el valor del area de texto
        
        txtAreaMatricula.setText("");
        
        //Adicionamos la informacion relaciona con la matricula del estudiante
        //Numero de inscripcion
        txtAreaMatricula.append("Numero de Inscripcion: "+student.ni+"\n");
        //Nombre del estudiante
        txtAreaMatricula.append("Nombre Estudiante: "+student.nom+"\n");
        //Valor de la matricula
        txtAreaMatricula.append("Valor de la matricula: "+ student.calcMat()+"\n");
        
        
        
        
    }//GEN-LAST:event_btnCalculoMatriculaActionPerformed

    private void txtNombreEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEstudianteActionPerformed

    private void txtPatrimonioEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatrimonioEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatrimonioEstudianteActionPerformed

    private void txtEstratoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstratoEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstratoEstudianteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculoMatricula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea txtAreaMatricula;
    private javax.swing.JTextField txtEstratoEstudiante;
    private javax.swing.JTextField txtNombreEstudiante;
    private javax.swing.JTextField txtNumeroInscripcion;
    private javax.swing.JTextField txtPatrimonioEstudiante;
    // End of variables declaration//GEN-END:variables
}