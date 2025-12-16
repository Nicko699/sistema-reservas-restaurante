
package com.mycompany.restaurant.Igu;

import com.mycompany.restaurant.Logica.ControlLogica;
import com.mycompany.restaurant.Logica.Usuarios;
import java.awt.Color;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionUsuarios extends javax.swing.JFrame {
    Usuarios usu;
    ControlLogica control=new ControlLogica();
    
    public GestionUsuarios(Usuarios usu) {
        initComponents();
        this.usu=usu;
        
          // Configura el color de fondo del panel principal  a un beige crema
        jPanel1.setBackground(new Color(250, 243, 224));

        // Define un color verde  para los botones
        Color verdeVivo = new Color(102, 187, 106);

        // Configuración del botón de Crear Usuario
        btnCrearUsuario.setBackground(verdeVivo);
        btnCrearUsuario.setForeground(Color.WHITE);
        btnCrearUsuario.setFocusPainted(false);

        // Configuración del botón de Editar Usuario
        btnEditarUsuario.setBackground(verdeVivo);
        btnEditarUsuario.setForeground(Color.WHITE);
        btnEditarUsuario.setFocusPainted(false);

        // Configuración del botón de Eliminar Usuario
        btnEliminarUsuario.setBackground(verdeVivo);
        btnEliminarUsuario.setForeground(Color.WHITE);
        btnEliminarUsuario.setFocusPainted(false);

        // Configuración del botón de Actualizar Usuario
        btnActualizar.setBackground(verdeVivo);
        btnActualizar.setForeground(Color.WHITE);
        btnActualizar.setFocusPainted(false);

        // Configuración del botón de Volver
        btnVolver.setBackground(verdeVivo);
        btnVolver.setForeground(Color.WHITE);
        btnVolver.setFocusPainted(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnCrearUsuario = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Gestión de Usuarios");

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla);

        btnCrearUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCrearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Crear2.png"))); // NOI18N
        btnCrearUsuario.setText("Crear ");
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });

        btnEditarUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editar.png"))); // NOI18N
        btnEditarUsuario.setText("Editar ");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        btnEliminarUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borrar (1) (1).png"))); // NOI18N
        btnEliminarUsuario.setText("Eliminar ");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volver4 (1).png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
          //cargamos la tabla de mesas de la bd a la interfaz
        cargarTabla();
        
        String nombre = usu.getNombre_usuario();
        txtUsuario.setText(nombre);
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        //Mostramos una nueva ventana y cerramos la otra
        CrearCuenta crear = new CrearCuenta(usu);
        crear.setVisible(true);
        crear.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        // Verificamos si la tabla contiene al menos una fila
        if (Tabla.getRowCount() > 0) {

            // Verificamos si hay una fila seleccionada en la tabla
            if (Tabla.getSelectedRow() != -1) {

                // Obtenemos el id del usuario desde la primera columna (columna 0) de la fila seleccionada
                int id_usuario = Integer.parseInt(
                    String.valueOf(Tabla.getValueAt(Tabla.getSelectedRow(), 0))
                );

                // Creamos una nueva ventana de edición pasando el id del usuario seleccionado
                EditarUsuario edit = new EditarUsuario(id_usuario,usu);
                edit.setVisible(true);
                edit.setLocationRelativeTo(null);
                this.dispose();

            } else {
                // Si no se seleccionó ninguna fila, mostramos un mensaje de error
                mostrarMensaje("Tabla Vacía", "Error", "Error al editar");
            }

        } else {
            // Si la tabla no tiene filas (está vacía), mostramos un mensaje de error
            mostrarMensaje("No se selecciono una mesa", "Error", "Error editar");
        }
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed

        // Verificamos si la tabla tiene al menos una fila
        if (Tabla.getRowCount() > 0) {

            // Verificamos si hay una fila seleccionada en la tabla
            if (Tabla.getSelectedRow() != -1) {

                // Obtenemos el id del usuario desde la primera columna (columna 0) de la fila seleccionada
                int id_usuario = Integer.parseInt(String.valueOf(
                    Tabla.getValueAt(Tabla.getSelectedRow(), 0)
                ));
                
                // Llamamos al controlador para eliminar el usuario con el id obtenido
                control.eliminarUsuario(id_usuario);

                // Mostramos un mensaje indicando que la mesa fue eliminada con éxito
                mostrarMensaje("Usuario eliminado", "Info", "Eliminación Exitosa");

                // Recargamos la tabla para actualizar
                cargarTabla();
            } else {
                // Si no se seleccionó ninguna fila, mostramos un mensaje de error
                mostrarMensaje("No se ha seleccionado un usuario", "Error", "Error al eliminar");
            }
        } else {
            // Si la tabla está vacía, mostramos un mensaje de error
            mostrarMensaje("No se selecciono un usuario", "Error", "Error al eliminar");
        }

        }

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
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        //Cargamos los datos de la tabla
        cargarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //Mostramos una nueva ventana y cerramos la otra
        PrincipalAdmi admi = new PrincipalAdmi( usu);
        admi.setVisible(true);
        admi.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

       private void cargarTabla() {
        //definir el modelo que queremos la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            //que las filas y colunas no sean editables
            @Override
            public boolean isCellEditable(int row, int column) {

                return false;

            }

        };
        
        Object titulos[] = {"Id", "Nombre", "Usuario","Rol","Telefono"};
        modeloTabla.setColumnIdentifiers(titulos);
        //Traemos los usuarios de la BD
        List<Usuarios> listaUsuarios= control.traerListaUsuarios();
        //Verificamos si en la BD los usuarios no esten vacias
        if (listaUsuarios != null) {
            //Ordenamos los usuarios por el numero
            Collections.sort(listaUsuarios, new Comparator<Usuarios>() {
                @Override
                public int compare(Usuarios u1, Usuarios u2) {
                    return Integer.compare(u1.getId(), u2.getId());
                }
            });

            //Recorremos la lista de usuarios
            for (Usuarios usuario : listaUsuarios) {
                Object objeto[] = {usuario.getId(), usuario.getNombre(), usuario.getNombre_usuario(), usuario.getRol(), usuario.getTelefono()};
                modeloTabla.addRow(objeto);

            }

        }
        //Cambiamos el contenido de la tabla
        Tabla.setModel(modeloTabla);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
