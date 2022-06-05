package Vista;

import Modelo.Producto;
import javax.swing.table.DefaultTableModel;

public class VistaFactura extends javax.swing.JFrame {

    VistaLogin VistaPrincipal;
    DefaultTableModel modeloTablaFactura;
    public VistaFactura(VistaLogin VistaPrincipal) {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("FACTURACION");
        this.VistaPrincipal = VistaPrincipal;
        modeloTablaFactura = new DefaultTableModel();
        modeloTablaFactura.addColumn("Codigo");
        modeloTablaFactura.addColumn("Nombre");
        modeloTablaFactura.addColumn("Categoria");
        modeloTablaFactura.addColumn("Precio");
        tablaFactura.setModel(modeloTablaFactura);
        llenarTabla();
        jbCedula.setText(VistaPrincipal.cliente.getIdCliente());
        jbNombre.setText(VistaPrincipal.cliente.getNombreCompleto());
        jbPuntos1.setText(String.valueOf(VistaPrincipal.cliente.getPuntos()));
        jbTotal.setText(String.valueOf(this.VistaPrincipal.totalFactura));
        jbDescuento.setText(String.valueOf(VistaPrincipal.totalDescuento));
    }

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

            modeloTablaFactura.addRow(info);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbT = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFactura = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jbCedula = new javax.swing.JLabel();
        jbNombre = new javax.swing.JLabel();
        jbTotal = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jbPuntos1 = new javax.swing.JLabel();
        jbT1 = new javax.swing.JLabel();
        jbDescuento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/supermarketVentana.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
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
                .addContainerGap(488, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 60));

        jLabel5.setBackground(new java.awt.Color(31, 128, 166));
        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(31, 128, 166));
        jLabel5.setText("FACTURA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(31, 128, 166));
        jLabel4.setText("NOMBRE CLIENTE:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("*RECIBIRA UNA COPIA DE ESTA FACTURA CUANDO LLEGUE SU DOMICILIO*");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(31, 128, 166));
        jLabel7.setText("PUNTOS:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jbT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbT.setForeground(new java.awt.Color(31, 128, 166));
        jbT.setText("DESCUENTO:");
        jPanel1.add(jbT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        tablaFactura.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaFactura);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 580, 140));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(31, 128, 166));
        jLabel9.setText("CEDULA:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jbCedula.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbCedula.setForeground(new java.awt.Color(0, 0, 0));
        jbCedula.setText("2654666");
        jPanel1.add(jbCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jbNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbNombre.setForeground(new java.awt.Color(0, 0, 0));
        jbNombre.setText("RODOLFO");
        jPanel1.add(jbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jbTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbTotal.setForeground(new java.awt.Color(0, 0, 0));
        jbTotal.setText("NO");
        jPanel1.add(jbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        btnAceptar.setBackground(new java.awt.Color(217, 50, 80));
        btnAceptar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51)));
        btnAceptar.setBorderPainted(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, 140, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(31, 128, 166));
        jLabel10.setText("PRODUCTOS:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jbPuntos1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbPuntos1.setForeground(new java.awt.Color(0, 0, 0));
        jbPuntos1.setText("NO");
        jPanel1.add(jbPuntos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jbT1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbT1.setForeground(new java.awt.Color(31, 128, 166));
        jbT1.setText("TOTAL:");
        jPanel1.add(jbT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jbDescuento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbDescuento.setForeground(new java.awt.Color(0, 0, 0));
        jbDescuento.setText("NO");
        jPanel1.add(jbDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        VistaPrincipal.carrito.productos.clear();
        VistaHome home = new VistaHome(VistaPrincipal);
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

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
//            java.util.logging.Logger.getLogger(VistaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VistaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VistaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VistaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VistaFactura().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jbCedula;
    private javax.swing.JLabel jbDescuento;
    private javax.swing.JLabel jbNombre;
    private javax.swing.JLabel jbPuntos1;
    private javax.swing.JLabel jbT;
    private javax.swing.JLabel jbT1;
    private javax.swing.JLabel jbTotal;
    private javax.swing.JTable tablaFactura;
    // End of variables declaration//GEN-END:variables
}
