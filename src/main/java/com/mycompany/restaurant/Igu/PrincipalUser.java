package com.mycompany.restaurant.Igu;

import com.mycompany.restaurant.Logica.Usuarios;
import java.awt.Color;

public class PrincipalUser extends javax.swing.JFrame {

    Usuarios usu;

    public PrincipalUser(Usuarios usu) {
        initComponents();
        this.usu = usu;

        // Configura el color de fondo del panel principal  a un beige crema
        jPanel2.setBackground(new Color(250, 243, 224));

        // Define un color verde  para los botones
        Color verdeVivo = new Color(102, 187, 106);

        // Configuración del botón de Reservación
        btnGestionMesas.setBackground(verdeVivo);
        btnGestionMesas.setForeground(Color.WHITE);
        btnGestionMesas.setFocusPainted(false);

        // Configuración del botón de Ver reservas
        btnReservas.setBackground(verdeVivo);
        btnReservas.setForeground(Color.WHITE);
        btnReservas.setFocusPainted(false);

        // Configuración del botón de Sala de espera
        btnEditarUsuario.setBackground(verdeVivo);
        btnEditarUsuario.setForeground(Color.WHITE);
        btnEditarUsuario.setFocusPainted(false);

        // Configuración del botón de Salir
        btnSalir.setBackground(verdeVivo);
        btnSalir.setForeground(Color.WHITE);
        btnSalir.setFocusPainted(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGestionMesas = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtUsuario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtUsuarioPropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Menú principal");

        btnGestionMesas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnGestionMesas.setIcon(new javax.swing.ImageIcon("C:\\Users\\maria\\Documents\\NetBeansProjects\\Restaurant\\src\\main\\java\\com\\mycompany\\restaurant\\Imagenes\\icons8-calendario-más-96 (1).png")); // NOI18N
        btnGestionMesas.setText("Reservación");
        btnGestionMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionMesasActionPerformed(evt);
            }
        });

        btnReservas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnReservas.setIcon(new javax.swing.ImageIcon("C:\\Users\\maria\\Documents\\NetBeansProjects\\Restaurant\\src\\main\\java\\com\\mycompany\\restaurant\\Imagenes\\7061954 (1).png")); // NOI18N
        btnReservas.setText("Ver reservas");
        btnReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservasActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\maria\\Documents\\NetBeansProjects\\Restaurant\\src\\main\\java\\com\\mycompany\\restaurant\\Imagenes\\iniciar-sesion (1)k.png")); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEditarUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perfil.png"))); // NOI18N
        btnEditarUsuario.setText("Mi perfil");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGestionMesas, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(btnEditarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGestionMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnEditarUsuario))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(436, Short.MAX_VALUE)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Obtenemos el nombre de usuario
        String usuario = usu.getNombre_usuario();

        // Mostramos el nombre en el JTextField
        txtUsuario.setText(usuario);
    }//GEN-LAST:event_formWindowOpened

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       IniciarSesion session=new IniciarSesion();
      session.setVisible(true);
      session.setLocationRelativeTo(null);
      this.dispose();                          
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGestionMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionMesasActionPerformed
        // Mostramos una nueva ventana y cerramos la otra 
        PanelReservacion reser = new PanelReservacion(usu);
        reser.setVisible(true);
        reser.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnGestionMesasActionPerformed

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        // Mostramos una nueva ventana y cerramos la otra 
        VerReservasUsu ver = new VerReservasUsu(usu);
        ver.setVisible(true);
        ver.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnReservasActionPerformed

    private void txtUsuarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtUsuarioPropertyChange
   
    }//GEN-LAST:event_txtUsuarioPropertyChange

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
   // Mostramos una nueva ventana y cerramos la otra 
       PerfilUsuario perfil=new PerfilUsuario( usu);     
       perfil.setVisible(true);
       perfil.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnGestionMesas;
    private javax.swing.JButton btnReservas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
