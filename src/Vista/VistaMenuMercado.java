package Vista;

public class VistaMenuMercado extends javax.swing.JFrame {

    VistaLogin VistaPrincipal;
    
    public VistaMenuMercado(VistaLogin VistaPrincipal) {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("MERCADO");
        this.VistaPrincipal = VistaPrincipal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnLacteos = new javax.swing.JButton();
        btnBebidas = new javax.swing.JButton();
        btnCarnes = new javax.swing.JButton();
        btnLimpieza = new javax.swing.JButton();
        btnFV = new javax.swing.JButton();
        btnDespensa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCarritos = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(546, 584));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(540, 620));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("FRUTA/VERDURA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CARNES");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LACTEOS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DESPENSA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("BEBIDAS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LIMPIEZA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, -1, -1));

        btnLacteos.setBackground(new java.awt.Color(217, 50, 80));
        btnLacteos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos-lacteos.png"))); // NOI18N
        btnLacteos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        btnLacteos.setBorderPainted(false);
        btnLacteos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLacteosActionPerformed(evt);
            }
        });
        jPanel1.add(btnLacteos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 140, 120));

        btnBebidas.setBackground(new java.awt.Color(217, 50, 80));
        btnBebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/soft-drink.png"))); // NOI18N
        btnBebidas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        btnBebidas.setBorderPainted(false);
        btnBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidasActionPerformed(evt);
            }
        });
        jPanel1.add(btnBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 140, 120));

        btnCarnes.setBackground(new java.awt.Color(217, 50, 80));
        btnCarnes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/meat.png"))); // NOI18N
        btnCarnes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        btnCarnes.setBorderPainted(false);
        btnCarnes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarnesActionPerformed(evt);
            }
        });
        jPanel1.add(btnCarnes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 140, 120));

        btnLimpieza.setBackground(new java.awt.Color(217, 50, 80));
        btnLimpieza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cleaning.png"))); // NOI18N
        btnLimpieza.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        btnLimpieza.setBorderPainted(false);
        btnLimpieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiezaActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 140, 120));

        btnFV.setBackground(new java.awt.Color(217, 50, 80));
        btnFV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vegetable.png"))); // NOI18N
        btnFV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        btnFV.setBorderPainted(false);
        btnFV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFVActionPerformed(evt);
            }
        });
        jPanel1.add(btnFV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 140, 120));

        btnDespensa.setBackground(new java.awt.Color(217, 50, 80));
        btnDespensa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pantry.png"))); // NOI18N
        btnDespensa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        btnDespensa.setBorderPainted(false);
        btnDespensa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespensaActionPerformed(evt);
            }
        });
        jPanel1.add(btnDespensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 140, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconMarket.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoMedio.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        btnCarritos.setBackground(new java.awt.Color(0, 0, 0));
        btnCarritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carro-de-la-carretilla.png"))); // NOI18N
        btnCarritos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        btnCarritos.setBorderPainted(false);
        btnCarritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritosActionPerformed(evt);
            }
        });
        jPanel1.add(btnCarritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 30, 60, 50));

        btnVolver.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver-flecha.png"))); // NOI18N
        btnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        btnVolver.setBorderPainted(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritosActionPerformed
        VistaCarrito carrito = new VistaCarrito(VistaPrincipal);
        carrito.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCarritosActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VistaHome home = new VistaHome(VistaPrincipal);
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnLacteosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLacteosActionPerformed
        VistaLacteos lacteos = new VistaLacteos(VistaPrincipal);
        lacteos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLacteosActionPerformed

    private void btnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidasActionPerformed
        VistaBebidas bebidas = new VistaBebidas(VistaPrincipal);
        bebidas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBebidasActionPerformed

    private void btnCarnesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarnesActionPerformed
      VistaCarnes carnes = new VistaCarnes(VistaPrincipal);
      carnes.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnCarnesActionPerformed

    private void btnFVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFVActionPerformed
      VistaFV fv = new VistaFV(VistaPrincipal);
      fv.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnFVActionPerformed

    private void btnLimpiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiezaActionPerformed
       VistaLimpieza limpieza = new VistaLimpieza(VistaPrincipal);
       limpieza.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnLimpiezaActionPerformed

    private void btnDespensaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDespensaActionPerformed
        VistaDespensa despensa = new VistaDespensa(VistaPrincipal);
        despensa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDespensaActionPerformed

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
//            java.util.logging.Logger.getLogger(VistaMenuMercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VistaMenuMercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VistaMenuMercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VistaMenuMercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VistaMenuMercado().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBebidas;
    private javax.swing.JButton btnCarnes;
    private javax.swing.JButton btnCarritos;
    private javax.swing.JButton btnDespensa;
    private javax.swing.JButton btnFV;
    private javax.swing.JButton btnLacteos;
    private javax.swing.JButton btnLimpieza;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
