package Vista;

import Modelo.ProductoUnitario;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

public class VistaDespensa extends javax.swing.JFrame {

    VistaLogin VistaPrincipal;

    public VistaDespensa(VistaLogin VistaPrincipal) {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("DESPENSA");
        this.VistaPrincipal = VistaPrincipal;
        listar();
        SpinnerUnitarioDespensa.setModel(modelo());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LIMPIEZA = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDespensa = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        SpinnerUnitarioDespensa = new javax.swing.JSpinner();

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
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(408, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 60));

        LIMPIEZA.setBackground(new java.awt.Color(31, 128, 166));
        LIMPIEZA.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        LIMPIEZA.setForeground(new java.awt.Color(31, 128, 166));
        LIMPIEZA.setText("DESPENSA");
        jPanel1.add(LIMPIEZA, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        tablaDespensa.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaDespensa);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 510, 120));

        btnAgregar.setBackground(new java.awt.Color(217, 50, 80));
        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51)));
        btnAgregar.setBorderPainted(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 140, 30));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backX36.png"))); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        jPanel1.add(SpinnerUnitarioDespensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 60, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VistaMenuMercado mercado = new VistaMenuMercado(VistaPrincipal);
        mercado.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int desicion = -1;
        desicion = tablaDespensa.getSelectedRow();
        if (desicion == -1) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Seleccione un producto de la tabla", "AVISO", JOptionPane.WARNING_MESSAGE);
        } else {
            String cod = (String) tablaDespensa.getValueAt(desicion, 0);

            ProductoUnitario producto = VistaPrincipal.gestionProducto.buscarProductoU(cod);

            int cant = (Integer) SpinnerUnitarioDespensa.getValue();
            producto.setCantidad(cant);

            int nuevoStock = producto.getStock() - producto.getCantidad();

            int precioTemp = producto.getCostoTotal();

            producto.setPrecio(precioTemp);

            if (cant <= producto.getStock()){
                if (VistaPrincipal.gestionProducto.modificar(producto.getCod(), nuevoStock)){
                    VistaPrincipal.carrito.agregarProducto(producto);
                    JOptionPane.showMessageDialog(this, "Producto agregado al carrito.");
                    listar();
                } else{
                    JOptionPane.showMessageDialog(this, "No se ha podido añadir el producto.");
                }
            } else{
                JOptionPane.showMessageDialog(this, "Lo sentimos, en este momento no tenemos unidades disponibles.");
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    public void listar() {
        tablaDespensa.setModel(VistaPrincipal.gestionProducto.listarDespensa());
    }

    public SpinnerNumberModel modelo() {
        SpinnerNumberModel model = new SpinnerNumberModel(
                new Integer(1), // Dato visualizado al inicio en el spinner
                new Integer(1), // Límite inferior
                new Integer(10), // Límite superior
                new Integer(1) // incremento-decremento
        );

        return model;
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
//            java.util.logging.Logger.getLogger(VistaDespensa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VistaDespensa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VistaDespensa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VistaDespensa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VistaDespensa().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LIMPIEZA;
    private javax.swing.JSpinner SpinnerUnitarioDespensa;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDespensa;
    // End of variables declaration//GEN-END:variables
}
