package Vista;

import Modelo.ProductoUnitario;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

public class VistaLimpieza extends javax.swing.JFrame {

    VistaLogin VistaPrincipal;

    public VistaLimpieza(VistaLogin VistaPrincipal) {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("LIMPIEZA");
        this.VistaPrincipal = VistaPrincipal;
        listar();
        SpinnerUnitarioLimpieza.setModel(modelo());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLimpieza = new javax.swing.JTable();
        LIMPIEZA = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        SpinnerUnitarioLimpieza = new javax.swing.JSpinner();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(404, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 60));

        tablaLimpieza.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaLimpieza);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 500, 120));

        LIMPIEZA.setBackground(new java.awt.Color(31, 128, 166));
        LIMPIEZA.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        LIMPIEZA.setForeground(new java.awt.Color(31, 128, 166));
        LIMPIEZA.setText("LIMPIEZA");
        jPanel1.add(LIMPIEZA, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

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
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 140, 30));

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
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));
        jPanel1.add(SpinnerUnitarioLimpieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 60, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
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
        desicion = tablaLimpieza.getSelectedRow();
        if (desicion == -1) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Seleccione un producto de la tabla", "AVISO", JOptionPane.WARNING_MESSAGE);
        } else {
            String cod = (String) tablaLimpieza.getValueAt(desicion, 0);
            
            ProductoUnitario producto = VistaPrincipal.gestionProducto.buscarProductoU(cod);
            
             int cant = (Integer) SpinnerUnitarioLimpieza.getValue();
            producto.setCantidad(cant);
            
            int nuevoStock = producto.getStock() - producto.getCantidad();
            System.out.println("h"+producto.getStock());
            
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
        tablaLimpieza.setModel(VistaPrincipal.gestionProducto.listarLimpieza());
    }

    public SpinnerNumberModel modelo() {
        SpinnerNumberModel model = new SpinnerNumberModel(
                new Integer(1), // Dato visualizado al inicio en el spinner
                new Integer(1), // Límite inferior
                new Integer(6), // Límite superior
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
//            java.util.logging.Logger.getLogger(VistaLimpieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VistaLimpieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VistaLimpieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VistaLimpieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VistaLimpieza().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LIMPIEZA;
    private javax.swing.JSpinner SpinnerUnitarioLimpieza;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaLimpieza;
    // End of variables declaration//GEN-END:variables
}
