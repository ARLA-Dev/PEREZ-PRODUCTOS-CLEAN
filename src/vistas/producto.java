package vistas;

public class producto extends javax.swing.JInternalFrame {

    public producto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        codigo_p = new javax.swing.JTextField();
        lupa_p = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nombre_p = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        precio_p = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        crear_p = new javax.swing.JButton();
        limpiar_p = new javax.swing.JButton();
        modificar_p = new javax.swing.JButton();
        borrar_p = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Producto");
        setMinimumSize(new java.awt.Dimension(900, 720));
        setPreferredSize(new java.awt.Dimension(900, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel2.setText("Código");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        codigo_p.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jPanel1.add(codigo_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 290, -1));

        lupa_p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_o1.png"))); // NOI18N
        lupa_p.setBorderPainted(false);
        lupa_p.setContentAreaFilled(false);
        lupa_p.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lupa_p.setFocusPainted(false);
        lupa_p.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_o2.png"))); // NOI18N
        lupa_p.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_o2.png"))); // NOI18N
        jPanel1.add(lupa_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel3.setText("Nombre del Producto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        nombre_p.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jPanel1.add(nombre_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 290, -1));

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel4.setText("Precio del Producto");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        precio_p.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        precio_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_pActionPerformed(evt);
            }
        });
        jPanel1.add(precio_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 290, -1));

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

        crear_p.setBackground(new java.awt.Color(255, 175, 0));
        crear_p.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        crear_p.setForeground(new java.awt.Color(255, 255, 255));
        crear_p.setText("CREAR");
        crear_p.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        crear_p.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crear_p.setFocusPainted(false);
        crear_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_pActionPerformed(evt);
            }
        });
        jPanel1.add(crear_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 100, -1));

        limpiar_p.setBackground(new java.awt.Color(255, 175, 0));
        limpiar_p.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        limpiar_p.setForeground(new java.awt.Color(255, 255, 255));
        limpiar_p.setText("LIMPIAR");
        limpiar_p.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        limpiar_p.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiar_p.setFocusPainted(false);
        limpiar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_pActionPerformed(evt);
            }
        });
        jPanel1.add(limpiar_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 100, -1));

        modificar_p.setBackground(new java.awt.Color(255, 175, 0));
        modificar_p.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        modificar_p.setForeground(new java.awt.Color(255, 255, 255));
        modificar_p.setText("MODIFICAR");
        modificar_p.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        modificar_p.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar_p.setFocusPainted(false);
        modificar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_pActionPerformed(evt);
            }
        });
        jPanel1.add(modificar_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 100, -1));

        borrar_p.setBackground(new java.awt.Color(255, 175, 0));
        borrar_p.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        borrar_p.setForeground(new java.awt.Color(255, 255, 255));
        borrar_p.setText("BORRAR");
        borrar_p.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        borrar_p.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrar_p.setFocusPainted(false);
        borrar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar_pActionPerformed(evt);
            }
        });
        jPanel1.add(borrar_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 330, 100, -1));

        jLabel9.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jLabel9.setText("PÉREZ PRODUCTOS");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jLabel10.setText("CLEAN");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos-de-limpieza_1.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/desinfeccion.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/liquido-de-limpieza.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void precio_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_pActionPerformed

    private void crear_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crear_pActionPerformed

    private void limpiar_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpiar_pActionPerformed

    private void modificar_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_pActionPerformed

    private void borrar_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_borrar_pActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar_p;
    private javax.swing.JTextField codigo_p;
    private javax.swing.JButton crear_p;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton limpiar_p;
    private javax.swing.JButton lupa_p;
    private javax.swing.JButton modificar_p;
    private javax.swing.JTextField nombre_p;
    private javax.swing.JTextField precio_p;
    // End of variables declaration//GEN-END:variables
}
