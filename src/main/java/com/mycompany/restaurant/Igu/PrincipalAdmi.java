
package com.mycompany.restaurant.Igu;

import com.mycompany.restaurant.Logica.Usuarios;
import java.awt.Color;


public class PrincipalAdmi extends javax.swing.JFrame {

   Usuarios usu;
    
    public PrincipalAdmi(Usuarios usu) {
        initComponents();
        this.usu = usu;
         // Configura el color de fondo del panel principal  a un beige crema
        jPanel1.setBackground(new Color(250, 243, 224));

        // Define un color verde  para los botones
        Color verdeVivo = new Color(102, 187, 106);

        // Configuración del botón de Gestion de mesas
        btnGestionMesas.setBackground(verdeVivo);
        btnGestionMesas.setForeground(Color.WHITE);
        btnGestionMesas.setFocusPainted(false);
        
        //Configuracion del botón de crear cuenta administrador
        btnCrearAdmi.setBackground(verdeVivo);
        btnCrearAdmi.setForeground(Color.WHITE);
        btnCrearAdmi.setFocusPainted(false);
        
         //Configuracion del botón de ver reservas de todos los usuarios
        btnReservas.setBackground(verdeVivo);
        btnReservas.setForeground(Color.WHITE);
        btnReservas.setFocusPainted(false);
        
       
          //Configuracion del botón  perfil admin
         btnPerfilAdmin.setBackground(verdeVivo);
         btnPerfilAdmin.setForeground(Color.WHITE);
         btnPerfilAdmin.setFocusPainted(false);
           
         //Configuracion del botón de Salir del programa
        btnSalir.setBackground(verdeVivo);
        btnSalir.setForeground(Color.WHITE);
        btnSalir.setFocusPainted(false);

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGestionMesas = new javax.swing.JButton();
        btnCrearAdmi = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtUsuario = new javax.swing.JLabel();
        btnPerfilAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Gestión de Restaurante");

        btnGestionMesas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnGestionMesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gestion mesas.png"))); // NOI18N
        btnGestionMesas.setText("Gestión mesas");
        btnGestionMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionMesasActionPerformed(evt);
            }
        });

        btnCrearAdmi.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCrearAdmi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agregar-contacto (1).png"))); // NOI18N
        btnCrearAdmi.setText("Gestión usuarios");
        btnCrearAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearAdmiActionPerformed(evt);
            }
        });

        btnReservas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ver reservas6.png"))); // NOI18N
        btnReservas.setText("Ver reservas");
        btnReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservasActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iniciar-sesion (1)k.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        btnPerfilAdmin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnPerfilAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perfil.png"))); // NOI18N
        btnPerfilAdmin.setText("Mi perfil");
        btnPerfilAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGestionMesas, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(btnReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCrearAdmi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPerfilAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGestionMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPerfilAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         // Obtenemos el nombre de usuario
        String usuario = usu.getNombre_usuario();

        // Mostramos el nombre en el JTextField
        txtUsuario.setText(usuario);
    }//GEN-LAST:event_formWindowOpened

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //Cerramos sesión
        IniciarSesion session=new IniciarSesion();
        session.setVisible(true);
        session.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        //Mostramos una nueva ventana y cerramos la otra
        VerReservas ver=new VerReservas(usu);
        ver.setVisible(true);
        ver.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnReservasActionPerformed

    private void btnCrearAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearAdmiActionPerformed
        //Mostramos una nueva ventana y cerramos la otra
        GestionUsuarios usuario=new GestionUsuarios(usu);
        usuario.setVisible(true);
        usuario.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btnCrearAdmiActionPerformed

    private void btnGestionMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionMesasActionPerformed
        //Mostramos una nueva ventana y cerramos la otra
        GestionMesas mesa=new GestionMesas(usu);
        mesa.setVisible(true);
        mesa.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnGestionMesasActionPerformed

    private void btnPerfilAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilAdminActionPerformed
         //Mostramos una nueva ventana y cerramos la otra
        PerfilUsuario perfil=new PerfilUsuario(usu);
        perfil.setVisible(true);
        perfil.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnPerfilAdminActionPerformed

 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearAdmi;
    private javax.swing.JButton btnGestionMesas;
    private javax.swing.JButton btnPerfilAdmin;
    private javax.swing.JButton btnReservas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
