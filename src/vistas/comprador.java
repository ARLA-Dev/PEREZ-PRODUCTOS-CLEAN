package vistas;

public class comprador extends javax.swing.JInternalFrame {

    public comprador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cedula_c = new javax.swing.JTextField();
        lupa_c = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nombre_c = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tlf_c = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        direccion_c = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        crear_c = new javax.swing.JButton();
        modificar_c = new javax.swing.JButton();
        limpiar_c = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Comprador");
        setMinimumSize(new java.awt.Dimension(900, 720));
        setPreferredSize(new java.awt.Dimension(900, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel2.setText("Cédula");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        cedula_c.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jPanel1.add(cedula_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 330, -1));

        lupa_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_o1.png"))); // NOI18N
        lupa_c.setBorderPainted(false);
        lupa_c.setContentAreaFilled(false);
        lupa_c.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lupa_c.setFocusPainted(false);
        lupa_c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_o2.png"))); // NOI18N
        lupa_c.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_o2.png"))); // NOI18N
        jPanel1.add(lupa_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel3.setText("Nombre Completo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        nombre_c.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jPanel1.add(nombre_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 330, -1));

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel4.setText("Número Telefónico");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        tlf_c.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jPanel1.add(tlf_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 330, -1));

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel5.setText("Dirección");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        direccion_c.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jPanel1.add(direccion_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 330, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 10, 650));

        crear_c.setBackground(new java.awt.Color(33, 150, 243));
        crear_c.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        crear_c.setText("CREAR");
        crear_c.setFocusPainted(false);
        crear_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_cActionPerformed(evt);
            }
        });
        jPanel1.add(crear_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 320, -1));

        modificar_c.setBackground(new java.awt.Color(33, 150, 243));
        modificar_c.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        modificar_c.setText("MODIFICAR");
        modificar_c.setFocusPainted(false);
        modificar_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_cActionPerformed(evt);
            }
        });
        jPanel1.add(modificar_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 320, -1));

        limpiar_c.setBackground(new java.awt.Color(33, 150, 243));
        limpiar_c.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        limpiar_c.setText("LIMPIAR");
        limpiar_c.setFocusPainted(false);
        limpiar_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_cActionPerformed(evt);
            }
        });
        jPanel1.add(limpiar_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 320, -1));

        jLabel6.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jLabel6.setText("PÉREZ PRODUCTOS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jLabel7.setText("CLEAN");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comprador.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bolsas-de-compra.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 950, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crear_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_cActionPerformed

    }//GEN-LAST:event_crear_cActionPerformed

    private void modificar_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_cActionPerformed

    }//GEN-LAST:event_modificar_cActionPerformed

    private void limpiar_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_cActionPerformed


    }//GEN-LAST:event_limpiar_cActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedula_c;
    private javax.swing.JButton crear_c;
    private javax.swing.JTextField direccion_c;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton limpiar_c;
    private javax.swing.JButton lupa_c;
    private javax.swing.JButton modificar_c;
    private javax.swing.JTextField nombre_c;
    private javax.swing.JTextField tlf_c;
    // End of variables declaration//GEN-END:variables
}
