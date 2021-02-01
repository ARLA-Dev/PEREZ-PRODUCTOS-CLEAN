package vistas;

public class usuario extends javax.swing.JInternalFrame {

    public usuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cedula_u = new javax.swing.JTextField();
        lupa_u = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nombre_u = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tlf_u = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dueno_u = new javax.swing.JRadioButton();
        vendedor_u = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        contra_u = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        combo_u = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        respuesta_u = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        crear_u = new javax.swing.JButton();
        modificar_u = new javax.swing.JButton();
        borrar_u = new javax.swing.JButton();
        limpiar_u = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Usuario");
        setMinimumSize(new java.awt.Dimension(900, 720));
        setPreferredSize(new java.awt.Dimension(900, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel2.setText("Nombre Completo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        cedula_u.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        cedula_u.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(cedula_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 280, -1));

        lupa_u.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_o1.png"))); // NOI18N
        lupa_u.setBorderPainted(false);
        lupa_u.setContentAreaFilled(false);
        lupa_u.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lupa_u.setFocusPainted(false);
        lupa_u.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_o2.png"))); // NOI18N
        lupa_u.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_o2.png"))); // NOI18N
        jPanel1.add(lupa_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel3.setText("Cédula");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        nombre_u.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        nombre_u.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(nombre_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 280, -1));

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel4.setText("Número Telefónico");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        tlf_u.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        tlf_u.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(tlf_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 280, -1));

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel5.setText("Cargo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        buttonGroup1.add(dueno_u);
        dueno_u.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        dueno_u.setText("Dueño");
        dueno_u.setContentAreaFilled(false);
        dueno_u.setFocusPainted(false);
        jPanel1.add(dueno_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        buttonGroup1.add(vendedor_u);
        vendedor_u.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        vendedor_u.setSelected(true);
        vendedor_u.setText("Vendedor");
        vendedor_u.setContentAreaFilled(false);
        vendedor_u.setFocusPainted(false);
        jPanel1.add(vendedor_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel6.setText("Contraseña");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        contra_u.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        contra_u.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contra_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contra_uActionPerformed(evt);
            }
        });
        jPanel1.add(contra_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 280, -1));

        jLabel7.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel7.setText("Pregunta de Seguriadad");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        combo_u.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        combo_u.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Color Favorito?", "¿Signo Zodical?", "¿Cancion Favorita?", "¿Comida Favorita?" }));
        combo_u.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        combo_u.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(combo_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 280, -1));

        jLabel8.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel8.setText("Respuesta de Seguriadad");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));

        respuesta_u.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        respuesta_u.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(respuesta_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 280, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, 660));

        crear_u.setBackground(new java.awt.Color(255, 175, 0));
        crear_u.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        crear_u.setForeground(new java.awt.Color(255, 255, 255));
        crear_u.setText("CREAR");
        crear_u.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        crear_u.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crear_u.setFocusPainted(false);
        crear_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_uActionPerformed(evt);
            }
        });
        jPanel1.add(crear_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 100, -1));

        modificar_u.setBackground(new java.awt.Color(255, 175, 0));
        modificar_u.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        modificar_u.setForeground(new java.awt.Color(255, 255, 255));
        modificar_u.setText("MODIFICAR");
        modificar_u.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        modificar_u.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar_u.setFocusPainted(false);
        modificar_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_uActionPerformed(evt);
            }
        });
        jPanel1.add(modificar_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 100, -1));

        borrar_u.setBackground(new java.awt.Color(255, 175, 0));
        borrar_u.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        borrar_u.setForeground(new java.awt.Color(255, 255, 255));
        borrar_u.setText("BORRAR");
        borrar_u.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        borrar_u.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrar_u.setFocusPainted(false);
        borrar_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar_uActionPerformed(evt);
            }
        });
        jPanel1.add(borrar_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 330, 100, -1));

        limpiar_u.setBackground(new java.awt.Color(255, 175, 0));
        limpiar_u.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        limpiar_u.setForeground(new java.awt.Color(255, 255, 255));
        limpiar_u.setText("LIMPIAR");
        limpiar_u.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        limpiar_u.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiar_u.setFocusPainted(false);
        limpiar_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_uActionPerformed(evt);
            }
        });
        jPanel1.add(limpiar_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 100, -1));

        jLabel9.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jLabel9.setText("PÉREZ PRODUCTOS");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jLabel10.setText("CLEAN");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/discusion.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contra_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contra_uActionPerformed
        
    }//GEN-LAST:event_contra_uActionPerformed

    private void crear_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_uActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crear_uActionPerformed

    private void modificar_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_uActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_uActionPerformed

    private void borrar_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar_uActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_borrar_uActionPerformed

    private void limpiar_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_uActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpiar_uActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar_u;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cedula_u;
    private javax.swing.JComboBox<String> combo_u;
    private javax.swing.JPasswordField contra_u;
    private javax.swing.JButton crear_u;
    private javax.swing.JRadioButton dueno_u;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JButton limpiar_u;
    private javax.swing.JButton lupa_u;
    private javax.swing.JButton modificar_u;
    private javax.swing.JTextField nombre_u;
    private javax.swing.JTextField respuesta_u;
    private javax.swing.JTextField tlf_u;
    private javax.swing.JRadioButton vendedor_u;
    // End of variables declaration//GEN-END:variables
}
