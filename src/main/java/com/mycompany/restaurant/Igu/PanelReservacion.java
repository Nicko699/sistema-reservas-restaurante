package com.mycompany.restaurant.Igu;

import com.mycompany.restaurant.Logica.ControlLogica;
import com.mycompany.restaurant.Logica.Mesas;
import com.mycompany.restaurant.Logica.Usuarios;
import java.awt.Color;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelReservacion extends javax.swing.JFrame {

    ControlLogica cont6;
    Usuarios usu;

    public PanelReservacion(Usuarios usu) {
        cont6 = new ControlLogica();
        this.usu = usu;
        initComponents();

        // Configuramos el color de fondo del panel principal  a un beige crema
        jPanel2.setBackground(new Color(250, 243, 224));

        // Definimos un color verde  para los botones
        Color verdeVivo = new Color(102, 187, 106);

        // Configuración del botón de Reservación
        btnReservacion.setBackground(verdeVivo);
        btnReservacion.setForeground(Color.WHITE);
        btnReservacion.setFocusPainted(false);

        // Configuración del botón de Volver
        btnVolver.setBackground(verdeVivo);
        btnVolver.setForeground(Color.WHITE);
        btnVolver.setFocusPainted(false);

        // Configuración del botón de Salir
        btnSalir.setBackground(verdeVivo);
        btnSalir.setForeground(Color.WHITE);
        btnSalir.setFocusPainted(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnReservacion = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Reservación ");

        jScrollPane1.setViewportView(Tabla);

        btnReservacion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnReservacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/7061954 (1).png"))); // NOI18N
        btnReservacion.setText(" Reservar");
        btnReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservacionActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volver (1).png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
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

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Selecciona una mesa disponible y después presiona Reservar para continuar.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReservacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      IniciarSesion session=new IniciarSesion();
      session.setVisible(true);
      session.setLocationRelativeTo(null);
      this.dispose();   
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // Mostramos una nueva ventana y cerramos la otra 
        PrincipalUser user = new PrincipalUser(usu);
        user.setVisible(true);
        user.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservacionActionPerformed
        // Verificamos si la tabla tiene filas, es decir, si hay mesas disponibles
        if (Tabla.getRowCount() > 0) {

            // Verificamos si el usuario seleccionó alguna fila de la tabla
            if (Tabla.getSelectedRow() != -1) {

                // Obtenemos el ID de la mesa de la fila seleccionada (columna 0)
                int id_mesa = Integer.parseInt(String.valueOf(Tabla.getValueAt(Tabla.getSelectedRow(), 0)));

                // Creamos una nueva ventana de reservación pasando el usuario y el ID de la mesa seleccionada. además, 
                //Cerramos la otra ventana para continuar con la reserva
                Reservacion reser = new Reservacion(usu, id_mesa);
                reser.setVisible(true);
                reser.setLocationRelativeTo(null);
                this.dispose();

            } else {
                // Mostramos un mensaje indicando que no se seleccionó ninguna mesa
                mostrarMensaje("No se selecciono una mesa", "Error", "Error al reservar");
            }

        } else {
            // Mostramos un mensaje indicando que la tabla está vacía, es decir, no hay mesas disponibles
            mostrarMensaje("Lista vacía", "Error", "Error al reservar");
        }


    }//GEN-LAST:event_btnReservacionActionPerformed
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
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Mostramos el nombre del usuario en la interfaz y cargamos la tabla de mesas
        String usuario = usu.getNombre_usuario();
        txtUsuario.setText(usuario);
        cargarTabla();

    }//GEN-LAST:event_formWindowOpened
    private void cargarTabla() {
        // Definimos el modelo que queremos en la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            // Hacemos que las filas y columnas no sean editables
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

// Definimos los títulos de las columnas de la tabla
        Object titulos[] = {"Id_mesa", "Capacidad", "Disponibilidad"};
        modeloTabla.setColumnIdentifiers(titulos);

// Traemos la lista de mesas desde el controlador
        List<Mesas> listaMesas = cont6.traerMesas2();

// Verificamos que la lista no sea nula
        if (listaMesas != null) {

            // Ordenamos las mesas por su ID de menor a mayor
            Collections.sort(listaMesas, new Comparator<Mesas>() {
                @Override
                public int compare(Mesas m1, Mesas m2) {
                    return Integer.compare(m1.getId(), m2.getId());
                }
            });

            // Recorremos la lista de mesas y agregamos cada mesa como una fila en la tabla
            for (Mesas lista : listaMesas) {
                Object objeto[] = {lista.getId(), lista.getCapacidad(), lista.getDisponibilidad()};
                modeloTabla.addRow(objeto);
            }
        }

// Asignamos el modelo con los datos a la tabla de la interfaz
        Tabla.setModel(modeloTabla);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnReservacion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
