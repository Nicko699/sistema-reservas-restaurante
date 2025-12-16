
package com.mycompany.restaurant.Igu;


import com.mycompany.restaurant.Logica.ControlLogica;
import com.mycompany.restaurant.Logica.Usuarios;
import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class EditarUsuario extends javax.swing.JFrame {

    Usuarios usu;
    int id_usuario;
    ControlLogica control = new ControlLogica();
    
    public EditarUsuario(int id_usuario,Usuarios usu) {
      
        initComponents();
        this.usu=usu;
        
        this.id_usuario=id_usuario;
        
         // Configura el color de fondo del panel principal  a un beige crema
        jPanel1.setBackground(new Color(250, 243, 224));

        // Define un color verde  para los botones
        Color verdeVivo = new Color(102, 187, 106);

        // Configuración del botón confirmar
        btnConfirmar.setBackground(verdeVivo);
        btnConfirmar.setForeground(Color.WHITE);
        btnConfirmar.setFocusPainted(false);

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboRol = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borrar (2).png"))); // NOI18N
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        btnConfirmar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perfilEditar (1).png"))); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Editar Usuario");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setText("Nombre:");

        textNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("Nombre Usuario:");

        textUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsuarioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("Teléfono:");

        textTelefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefonoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setText("Rol:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboRol, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
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

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        //Mostramos una nueva ventana y cerramos la otra
        GestionUsuarios usuario=new GestionUsuarios(usu);
        usuario.setVisible(true);
        usuario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
       //Traemos al usuario seleccionado de la bd
        Usuarios usuario=control.traerUsuario(id_usuario);
      //Verificamos que exista el usuario en la bd
        if (usuario!=null) {
            //Verificamos que no puede haber campos vacios como el nombre, nombreUsuario y telefono
            if(textNombre.getText().isEmpty()){
                mostrarMensaje("El nombre no puede estar vacío","Error","No se pudo editar");
            }
            if(textUsuario.getText().isEmpty()){
                mostrarMensaje("El nombre de usuario no puede estar vacío","Error","No se pudo editar");
            }
            if(textTelefono.getText().isEmpty()){
                mostrarMensaje("El telefono no puede estar vacío","Error","No se pudo editar");
            }
            
             //Obtenemos los cambios del usuario en los campos de la interfaz
            usuario.setNombre(textNombre.getText());
            usuario.setNombre_usuario(textUsuario.getText());

            Long telefono=Long.valueOf(textTelefono.getText());
           

            usuario.setTelefono(telefono);
             //Comprobamos si el rol seleccionado es igual administrador y si es asi guardamos el rol Admi
            if (comboRol.getSelectedItem().toString().equalsIgnoreCase("Administrador")) {
                
               usuario.setRol("Admi");
            }
               //Comprobamos si el rol seleccionado es igual usuario y si es asi guardamos el rol User
              if (comboRol.getSelectedItem().toString().equalsIgnoreCase("Usuario")) {
                
               usuario.setRol("User");
            }
              
          //Guardamos el usuario editado
            control.editarUsuario(usuario);
        //si el usuario que ha iniciado sesion se ha editado a el mismo, se cambia el nombre de usuario por el nuevo si es que lo cambió
        //Para que se muestre en pantalla
     if (usu.getId() == usuario.getId()) {
    this.usu = usuario; //Actualizamos el usuario de la sesión
}
            //MOstramos un mnesaje de exito y nos redirigimos a la pantalla gestion de usuarios
           mostrarMensaje("El usuario ha sido actualizado","Info","¡Usuario actualizado exitosamente!");
           GestionUsuarios usuario2= new GestionUsuarios(usu);
            usuario2.setVisible(true);
            usuario2.setLocationRelativeTo(null);
            this.dispose();

        }
        else{
            mostrarMensaje("El usuario no existe","Error","No se pudo editar");
        }

    }//GEN-LAST:event_btnConfirmarActionPerformed
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
    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void textUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUsuarioActionPerformed

    private void textTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefonoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Traemos al usuario de la bd
       Usuarios usuario=control.traerUsuario(id_usuario);
        //Comprobamos si existe en la bd
        if (usuario!=null) {
         //Cargamos los campos por los datos del usuario
        String telefono=String.valueOf(usuario.getTelefono());
        
        textNombre.setText(usuario.getNombre());
        textUsuario.setText(usuario.getNombre_usuario());
        textTelefono.setText(telefono);
           //Si el usuario tiene Rol Admi se carga primero el administrador para que aparezca seleccionado en el combo y de ultimas el Usuario para escoger
            if (usuario.getRol().equalsIgnoreCase("Admi")) {
                
               comboRol.addItem("Administrador");
               comboRol.addItem("Usuario");
                
            }
             //Si el usuario tiene Rol user se carga primero el Usuario para que aparezca seleccionado en el combo y de ultimas el administrador para escoger
            if (usuario.getRol().equalsIgnoreCase("User")) {
                comboRol.addItem("Usuario");
                   comboRol.addItem("Administrador"); 
            }
        }
        //Si el usario no existe mandamos un  mensaje de error
        else{
           mostrarMensaje("El usuario no existe","Error","No se pudo editar");
        }
        
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<String> comboRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salir;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textTelefono;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
}
