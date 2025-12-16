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

public class GestionMesas extends javax.swing.JFrame {

    ControlLogica cont4;
     Usuarios usu;
    public GestionMesas(Usuarios usu) {
        initComponents();
        cont4 = new ControlLogica();
         this.usu = usu;

        // Configura el color de fondo del panel principal  a un beige crema
        jPanel1.setBackground(new Color(250, 243, 224));

        // Define un color verde  para los botones
        Color verdeVivo = new Color(102, 187, 106);

        // Configuración del botón de Crear mesas
        btnCrearMesas.setBackground(verdeVivo);
        btnCrearMesas.setForeground(Color.WHITE);
        btnCrearMesas.setFocusPainted(false);

        // Configuración del botón de Editar mesas
        btnEditarMesas.setBackground(verdeVivo);
        btnEditarMesas.setForeground(Color.WHITE);
        btnEditarMesas.setFocusPainted(false);

        // Configuración del botón de Eliminar mesas
        btnEliminarMesas.setBackground(verdeVivo);
        btnEliminarMesas.setForeground(Color.WHITE);
        btnEliminarMesas.setFocusPainted(false);

        // Configuración del botón de Actualizar mesas
        btnActualizar.setBackground(verdeVivo);
        btnActualizar.setForeground(Color.WHITE);
        btnActualizar.setFocusPainted(false);

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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnCrearMesas = new javax.swing.JButton();
        btnEditarMesas = new javax.swing.JButton();
        btnEliminarMesas = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Gestión de Mesas");

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

        btnCrearMesas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCrearMesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Crear2.png"))); // NOI18N
        btnCrearMesas.setText("Crear ");
        btnCrearMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearMesasActionPerformed(evt);
            }
        });

        btnEditarMesas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEditarMesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editar.png"))); // NOI18N
        btnEditarMesas.setText("Editar ");
        btnEditarMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarMesasActionPerformed(evt);
            }
        });

        btnEliminarMesas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEliminarMesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borrar (1) (1).png"))); // NOI18N
        btnEliminarMesas.setText("Eliminar ");
        btnEliminarMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMesasActionPerformed(evt);
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

        btnSalir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iniciar-sesion (1)k.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

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
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarMesas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarMesas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCrearMesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                        .addComponent(btnCrearMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //Mostramos una nueva ventana y cerramos la otra
        PrincipalAdmi admi = new PrincipalAdmi( usu);
        admi.setVisible(true);
        admi.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCrearMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMesasActionPerformed
        //Mostramos una nueva ventana y cerramos la otra
        CrearMesas mesa = new CrearMesas(usu);
        mesa.setVisible(true);
        mesa.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCrearMesasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //cargamos la tabla de mesas de la bd a la interfaz
        cargarTabla();
        
         String nombre = usu.getNombre_usuario();
        txtUsuario.setText(nombre);
        cargarTabla();

    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMesasActionPerformed

        // Verificamos si la tabla tiene al menos una fila
        if (Tabla.getRowCount() > 0) {

            // Verificamos si hay una fila seleccionada en la tabla
            if (Tabla.getSelectedRow() != -1) {

                // Obtenemos el id de la mesa desde la primera columna (columna 0) de la fila seleccionada
                int id_mesa = Integer.parseInt(String.valueOf(
                        Tabla.getValueAt(Tabla.getSelectedRow(), 0)
                ));

                // Llamamos al controlador para eliminar la mesa con el id obtenido
                cont4.eliminarMesa(id_mesa);

                // Mostramos un mensaje indicando que la mesa fue eliminada con éxito
                mostrarMensaje("Mesa eliminada", "Info", "Eliminación Exitosa");

                // Recargamos la tabla para actualizar la vista con los cambios
                cargarTabla();
            } else {
                // Si no se seleccionó ninguna fila, mostramos un mensaje de error
                mostrarMensaje("Tabla Vacía", "Error", "Error al eliminar");
            }
        } else {
            // Si la tabla no tiene filas (está vacía), mostramos un mensaje de error
            mostrarMensaje("No se selecciono un dato", "Error", "Error al eliminar");
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
    }//GEN-LAST:event_btnEliminarMesasActionPerformed

    private void btnEditarMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarMesasActionPerformed
       // Verificamos si la tabla contiene al menos una fila
if (Tabla.getRowCount() > 0) {
    
    // Verificamos si hay una fila seleccionada en la tabla
    if (Tabla.getSelectedRow() != -1) {
        
        // Obtenemos el id de la mesa desde la primera columna (columna 0) de la fila seleccionada
        int id_mesa = Integer.parseInt(
            String.valueOf(Tabla.getValueAt(Tabla.getSelectedRow(), 0))
        );
        
        // Creamos una nueva ventana de edición pasando el id de la mesa seleccionada
        EditarMesas edit = new EditarMesas(id_mesa,usu);
        edit.setVisible(true);
        edit.setLocationRelativeTo(null);
        this.dispose();
        
    } else {
        // Si no se seleccionó ninguna fila, mostramos un mensaje de error
        mostrarMensaje("Tabla Vacía", "Error", "Error al editar");
    }

} else {
    // Si la tabla no tiene filas (está vacía), mostramos un mensaje de error
    mostrarMensaje("No se selecciono una mesa", "Error", "Error al editar");
}

    }//GEN-LAST:event_btnEditarMesasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       IniciarSesion session=new IniciarSesion();
      session.setVisible(true);
      session.setLocationRelativeTo(null);
      this.dispose();   
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        //Cargamos los datos de la tabla
        cargarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void cargarTabla() {
        //definir el modelo que queremos la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            //que las filas y colunas no sean editables
            @Override
            public boolean isCellEditable(int row, int column) {

                return false;

            }

        };
        Object titulos[] = {"Id", "Capacidad", "Disponibilidad"};
        modeloTabla.setColumnIdentifiers(titulos);
        //Traemos las mesas de la BD
        List<Mesas> listaMesa = cont4.traerMesas2();
        //Verificamos si en la BD las mesas no esten vacias
        if (listaMesa != null) {
            //Ordenamos las mesas por el numero
            Collections.sort(listaMesa, new Comparator<Mesas>() {
                @Override
                public int compare(Mesas m1, Mesas m2) {
                    return Integer.compare(m1.getId(), m2.getId());
                }
            });

            //Recorremos la lista de mesa
            for (Mesas mesa : listaMesa) {
                Object objeto[] = {mesa.getId(), mesa.getCapacidad(), mesa.getDisponibilidad()
                };
                modeloTabla.addRow(objeto);

            }

        }
        //Cambiamos el contenido de la tabla
        Tabla.setModel(modeloTabla);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCrearMesas;
    private javax.swing.JButton btnEditarMesas;
    private javax.swing.JButton btnEliminarMesas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
