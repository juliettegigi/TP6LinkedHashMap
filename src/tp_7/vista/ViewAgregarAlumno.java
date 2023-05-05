/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_7.vista;

import controlador.Validaciones;
import java.awt.Color;
import javax.swing.JOptionPane;
import tp_7.entidades.Alumno;

/**
 *
 * @author julie
 */
public class ViewAgregarAlumno extends javax.swing.JPanel {
private Validaciones v=new Validaciones(3); 
    public ViewAgregarAlumno() {
        initComponents();
            setSize(592,429);
        jButton_guardar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_legajo = new javax.swing.JTextField();
        jTextField_apellido = new javax.swing.JTextField();
        jTextField_nombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton_guardar = new javax.swing.JButton();
        errorLegajo = new javax.swing.JLabel();
        errorApellido = new javax.swing.JLabel();
        errorNombre = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario alumno");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("LEGAJO: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("APELLIDO:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NOMBRE:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jTextField_legajo.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_legajo.setText("ingrese un número");
        jTextField_legajo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_legajoFocusGained(evt);
            }
        });
        jTextField_legajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_legajoKeyReleased(evt);
            }
        });
        add(jTextField_legajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 230, -1));

        jTextField_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_apellidoKeyReleased(evt);
            }
        });
        add(jTextField_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 340, -1));

        jTextField_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_nombreKeyReleased(evt);
            }
        });
        add(jTextField_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 340, -1));

        jButton1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jButton1.setText("Salir");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, -1));

        jButton2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, -1, -1));

        jButton_guardar.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jButton_guardar.setText("Guardar");
        jButton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardarActionPerformed(evt);
            }
        });
        add(jButton_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));
        add(errorLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 290, 20));
        add(errorApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 420, 20));
        add(errorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 420, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_legajoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_legajoFocusGained
        if(jTextField_legajo.getText().equals("ingrese un número"))
            jTextField_legajo.setText("");
         jTextField_legajo.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jTextField_legajoFocusGained

    private void jTextField_legajoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_legajoKeyReleased
        v.soloNumeros(jTextField_legajo.getText(), 0);
        errorLegajo.setText(v.getError(0));
        jButton_guardar.setEnabled(v.validar());
    }//GEN-LAST:event_jTextField_legajoKeyReleased

    private void jTextField_apellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_apellidoKeyReleased
       jTextField_apellido.setText(jTextField_apellido.getText().toUpperCase());
        v.validarTexto(jTextField_apellido.getText(), 1);
        errorApellido.setText((v.getError(1)));
         jButton_guardar.setEnabled(v.validar());
    }//GEN-LAST:event_jTextField_apellidoKeyReleased

    private void jTextField_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nombreKeyReleased
          jTextField_nombre.setText(jTextField_nombre.getText().toUpperCase());
        v.validarTexto(jTextField_nombre.getText(), 2);
        errorNombre.setText((v.getError(2)));
         jButton_guardar.setEnabled(v.validar());
    }//GEN-LAST:event_jTextField_nombreKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         jTextField_legajo.setText("ingrese un número");
        jTextField_legajo.setForeground(new Color(153,153,153));
        jTextField_apellido.setText("");
        jTextField_nombre.setText("");
        
        errorApellido.setText("");
        errorNombre.setText("");
        errorLegajo.setText("");
       
        v.initErrores();
        jButton_guardar.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarActionPerformed
           int legajo=Integer.parseInt(jTextField_legajo.getText());
     String nombre=jTextField_nombre.getText();
     String apellido=jTextField_apellido.getText();
     
     if(Colegio.alumnos.containsKey(legajo)){
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres hacer esto?", "Confirmar acción", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.NO_OPTION) {
            System.out.println("El usuario ha cancelado la acción.");
            return;
        } 
     } 
            Colegio.alumnos.put(legajo,new Alumno(legajo,nombre,apellido));
            JOptionPane.showMessageDialog(null,"Alumno agregado");
            jButton1.setEnabled(false);
            v.initErrores();
    }//GEN-LAST:event_jButton_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorApellido;
    private javax.swing.JLabel errorLegajo;
    private javax.swing.JLabel errorNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField_apellido;
    private javax.swing.JTextField jTextField_legajo;
    private javax.swing.JTextField jTextField_nombre;
    // End of variables declaration//GEN-END:variables
}