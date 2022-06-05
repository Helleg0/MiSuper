package Vista;

import Modelo.Factura;
import Modelo.Producto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaCarrito extends javax.swing.JFrame {

    VistaLogin VistaPrincipal;
    DefaultTableModel modeloTablaCarrito;

    public VistaCarrito(VistaLogin VistaPrincipal) {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("CARRITO");
        this.VistaPrincipal = VistaPrincipal;
        modeloTablaCarrito = new DefaultTableModel();
        modeloTablaCarrito.addColumn("Codigo");
        modeloTablaCarrito.addColumn("Nombre");
        modeloTablaCarrito.addColumn("Categoria");
        modeloTablaCarrito.addColumn("Precio");
        tablaCarrito.setModel(modeloTablaCarrito);
        llenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCarrito = new javax.swing.JTable();
        btnFacturar = new javax.swing.JButton();
        jcbTipoFactura = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/supermarketVentana.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoPequeño.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 60));

        jLabel5.setBackground(new java.awt.Color(31, 128, 166));
        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(31, 128, 166));
        jLabel5.setText("CARRITO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        tablaCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaCarrito);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 530, 130));

        btnFacturar.setBackground(new java.awt.Color(217, 50, 80));
        btnFacturar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnFacturar.setForeground(new java.awt.Color(255, 255, 255));
        btnFacturar.setText("FACTURAR");
        btnFacturar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51)));
        btnFacturar.setBorderPainted(false);
        btnFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFacturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 140, 30));

        jcbTipoFactura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo Factura", "Full", "Puntos" }));
        jPanel1.add(jcbTipoFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 280, 130, 30));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backX36.png"))); // NOI18N
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 60, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VistaMenuMercado mercado = new VistaMenuMercado(VistaPrincipal);
        mercado.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturarActionPerformed
        if (jcbTipoFactura.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione el tipo de facturación", "AVISO", JOptionPane.WARNING_MESSAGE);

        } else {
            
            int totalF = VistaPrincipal.carrito.totalFactura();

            if (jcbTipoFactura.getSelectedIndex() == 1) {
                
                limpiarTabla();
                Factura fac1 = VistaPrincipal.gestionFacturas.getFactura((String) jcbTipoFactura.getSelectedItem());

                int totalDescuento = fac1.getPuntosFactura(VistaPrincipal.cliente);
                System.out.println("total descuento1 " + totalDescuento);
                 VistaPrincipal.totalFactura = totalF - totalDescuento;
                System.out.println("vista factura " + totalF);
                if (VistaPrincipal.gestionCliente.actualizarPuntos(VistaPrincipal.cliente.getIdCliente(),
                        VistaPrincipal.cliente.getNombreCompleto(),
                        VistaPrincipal.cliente.getEmail(),
                        VistaPrincipal.cliente.getPassword(),
                        VistaPrincipal.cliente.getPuntos() + 50)) {
                    System.out.println("actulizado");
                } else {
                    System.out.println("error");
                }

                VistaFactura facturar = new VistaFactura(VistaPrincipal);
                facturar.setVisible(true);
                this.dispose();
            } else if (jcbTipoFactura.getSelectedIndex() == 2) {
              
                limpiarTabla();
                Factura fac2 = VistaPrincipal.gestionFacturas.getFactura((String) jcbTipoFactura.getSelectedItem());

                int totalDescuento = fac2.getPuntosFactura(VistaPrincipal.cliente);
                VistaPrincipal.totalDescuento = totalDescuento;

                VistaPrincipal.totalFactura = totalF - totalDescuento;

                if (VistaPrincipal.gestionCliente.actualizarPuntos(VistaPrincipal.cliente.getIdCliente(),
                        VistaPrincipal.cliente.getNombreCompleto(),
                        VistaPrincipal.cliente.getEmail(),
                        VistaPrincipal.cliente.getPassword(),
                        VistaPrincipal.cliente.getPuntos() + 50)) {
                    System.out.println("actulizado suma puntos");

                    if (VistaPrincipal.gestionCliente.actualizarPuntos(VistaPrincipal.cliente.getIdCliente(),
                            VistaPrincipal.cliente.getNombreCompleto(),
                            VistaPrincipal.cliente.getEmail(),
                            VistaPrincipal.cliente.getPassword(),
                            VistaPrincipal.cliente.getPuntos() - 50)) {
                        System.out.println("actulizado resta puntos");
                        
                        
                    } else {
                        System.out.println("error");
                    }

                } else {
                    System.out.println("error");
                }

                VistaFactura facturar = new VistaFactura(VistaPrincipal);
                facturar.setVisible(true);
                this.dispose();

            }

        }
    }//GEN-LAST:event_btnFacturarActionPerformed

    public void llenarTabla() {
        int totalProductos = VistaPrincipal.carrito.productos.size();
        System.out.println(totalProductos);
        for (int i = 0; i < totalProductos; i++) {
            Producto producto = (Producto) VistaPrincipal.carrito.productos.get(i);
            String[] info = new String[4];
            info[0] = producto.getCod();
            info[1] = producto.getNombre();
            info[2] = producto.getCategoria();
            info[3] = String.valueOf(producto.getPrecio());

            modeloTablaCarrito.addRow(info);
        }
    }
    
       public void limpiarTabla() {
        for (int i = 0; i < modeloTablaCarrito.getRowCount(); i++) {
            modeloTablaCarrito.setRowCount(0);
        }
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VistaCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VistaCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VistaCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VistaCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VistaCarrito().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFacturar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTipoFactura;
    private javax.swing.JTable tablaCarrito;
    // End of variables declaration//GEN-END:variables
}
