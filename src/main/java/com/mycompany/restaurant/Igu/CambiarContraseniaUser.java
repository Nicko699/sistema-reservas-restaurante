
package com.mycompany.restaurant.Igu;

import com.mycompany.restaurant.Logica.ControlLogica;
import com.mycompany.restaurant.Logica.HashearPassword;
import com.mycompany.restaurant.Logica.Usuarios;
import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class CambiarContraseniaUser extends javax.swing.JFrame {

    Usuarios usu;
    ControlLogica control=new ControlLogica();
     HashearPassword hasheo= new HashearPassword();
     
    public CambiarContraseniaUser(Usuarios usu) {
        this.usu=usu;
        initComponents();
        
        // Configura el color de fondo del panel principal  a un beige crema
        jPanel1.setBackground(new Color(250, 243, 224));

        // Define un color verde  para los botones
        Color verdeVivo = new Color(102, 187, 106);

        // Configuración del botón confirnar
        btnConfirmar.setBackground(verdeVivo);
        btnConfirmar.setForeground(Color.WHITE);
       btnConfirmar.setFocusPainted(false);
    }
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        textPassword = new javax.swing.JPasswordField();
        textNewPassword = new javax.swing.JPasswordField();
        textNewPassword2 = new javax.swing.JPasswordField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel5.setText("Cambiar contraseña");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setText("Contraseña actual:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("Nueva contraseña:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("Confirmar contraseña:");

        btnConfirmar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editarContraseña (1).png"))); // NOI18N
        btnConfirmar.setText("Cambiar Contraseña");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borrar (2).png"))); // NOI18N
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        textPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNewPassword))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNewPassword2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(btnConfirmar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNewPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
     //Traemos el usuario de la bd
    Usuarios usuario=control.traerUsuario(usu.getId());
    //Comprobanos que exista
        if (usuario!=null) {
             //Obtenemos la contraseña del usuario desde el campo textPassword
            String passwordIngresada=textPassword.getText();
             //Verificamos que la contrseña ingresada no venga vacía, si viene lanzamos una alerta
            if (passwordIngresada.isEmpty()) {
                  mostrarMensaje("No has ingresado tu contraseña", "Error", "¡Campo vacío!");
                  return;
            }
           //Comparamos la contraseña ingresada por el usuario y la hasheada de la bd y comporbamos si coinciden
            boolean coincide=hasheo.verificarPassword(passwordIngresada, usu.getContraseña());
            
            if (coincide) {
                //Comprobamos que los compos de nueva contreña y confirmar contrseña no vengan vacíos
                  if (textNewPassword.getText().isEmpty() || textNewPassword2.getText().isEmpty()) {
                  mostrarMensaje("Campos vacíos", "Error", "¡Campo vacío!");
                  return;
            }
                //Conprobamos que los 2 campos de nueva contraseña y confirmar contraseña tengan la misma contraseña
                if (textNewPassword.getText().equalsIgnoreCase(textNewPassword2.getText())) {
                    //Hasheamos la nueva contraseña
                   String passwordHash=hasheo.hashPassword(textNewPassword.getText());
                   //Guardamos la nueva contraseña del usuario
                   usuario.setContraseña(passwordHash);
                    //La guardamos en la bd
                   control.editarUsuario(usuario);
                   //Monstramos un mensaje de exito
                   mostrarMensaje("Contraseña cambiada con éxito", "Info", "¡Cambio exitoso!");
                   
                    //Mostramos una nueva ventana y cerramos la otra después de actualizar
                    PerfilUsuario perfil=new PerfilUsuario(usu);
                    perfil.setVisible(true);
                    perfil.setLocationRelativeTo(null);
                   this.dispose();
                //Si no, lanzamos un mensaje, de que los 2 campos de nueva contraseña y confirmar contraseña no coinciden   
           } else {
            mostrarMensaje("Las nuevas contraseñas no coinciden", "Error", "¡No se pudo cambiar!");
        }
                // si no, lanzamos un mensaje, de que la contraseña actual es incorrecta
    } else {
        mostrarMensaje("La contraseña actual es incorrecta", "Error", "¡No se pudo cambiar!");
    }
// si no, lanzamos un mensaje, de que el usuario no se encuentra en el sistema 
} else {
    mostrarMensaje("Usuario no registrado en nuestro sistema", "Error", "¡No se pudo cambiar!");
}
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        //Mostramos una nueva ventana y cerramos la otra
        PerfilUsuario perfil=new PerfilUsuario(usu);
        perfil.setVisible(true);
        perfil.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void textPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPasswordActionPerformed
      public void mostrarMensaje(String mensaje, String tipo, String titulo) {
  // Este método muestra un mensaje en pantalla.
// Dependiendo del tipo Info o Error, cambia el ícono del mensaje.
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salir;
    private javax.swing.JPasswordField textNewPassword;
    private javax.swing.JPasswordField textNewPassword2;
    private javax.swing.JPasswordField textPassword;
    // End of variables declaration//GEN-END:variables
}
