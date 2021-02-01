package vistas;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        ini_sesion.setVisible(true);
        olvido_contra.setVisible(false);
        nuevo_o.setVisible(false);
        confirmar_o.setVisible(false);
        nueva_contra.setVisible(false);
        confir_contra.setVisible(false);
        guardar_o.setVisible(false);
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        olvido_contra = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cedula_o = new javax.swing.JTextField();
        lupa_o = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        pregunta_seguridad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        respuesta_seguridad = new javax.swing.JTextField();
        verificar_o = new javax.swing.JButton();
        nuevo_o = new javax.swing.JLabel();
        nueva_contra = new javax.swing.JPasswordField();
        confirmar_o = new javax.swing.JLabel();
        confir_contra = new javax.swing.JPasswordField();
        guardar_o = new javax.swing.JButton();
        volver_o = new javax.swing.JButton();
        fondo_olvido = new javax.swing.JLabel();
        ini_sesion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        contra = new javax.swing.JPasswordField();
        ingresar = new javax.swing.JButton();
        olvido_b = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PÉREZ PRODUCTOS CLEAN");
        setMaximumSize(new java.awt.Dimension(400, 600));
        setMinimumSize(new java.awt.Dimension(400, 600));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 600));
        jPanel1.setLayout(new java.awt.CardLayout());

        olvido_contra.setMaximumSize(new java.awt.Dimension(460, 600));
        olvido_contra.setMinimumSize(new java.awt.Dimension(460, 600));
        olvido_contra.setPreferredSize(new java.awt.Dimension(460, 600));
        olvido_contra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Gadugi", 3, 24)); // NOI18N
        jLabel5.setText("Cédula");
        olvido_contra.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 90, -1));

        cedula_o.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        cedula_o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        olvido_contra.add(cedula_o, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 180, -1));

        lupa_o.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_o1.png"))); // NOI18N
        lupa_o.setBorderPainted(false);
        lupa_o.setContentAreaFilled(false);
        lupa_o.setFocusPainted(false);
        lupa_o.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_o2.png"))); // NOI18N
        lupa_o.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_o2.png"))); // NOI18N
        olvido_contra.add(lupa_o, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 50, -1));

        jLabel8.setFont(new java.awt.Font("Gadugi", 3, 24)); // NOI18N
        jLabel8.setText("Pregunta de Seguridad");
        olvido_contra.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 280, -1));

        pregunta_seguridad.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        pregunta_seguridad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        olvido_contra.add(pregunta_seguridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 270, -1));

        jLabel9.setFont(new java.awt.Font("Gadugi", 3, 24)); // NOI18N
        jLabel9.setText("Respuesta");
        olvido_contra.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 140, -1));

        respuesta_seguridad.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        respuesta_seguridad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        olvido_contra.add(respuesta_seguridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 270, -1));

        verificar_o.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verificar_o.png"))); // NOI18N
        verificar_o.setBorderPainted(false);
        verificar_o.setContentAreaFilled(false);
        verificar_o.setFocusPainted(false);
        verificar_o.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verificar_o2.png"))); // NOI18N
        verificar_o.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verificar_o2.png"))); // NOI18N
        verificar_o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificar_oActionPerformed(evt);
            }
        });
        olvido_contra.add(verificar_o, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 40, 40));

        nuevo_o.setFont(new java.awt.Font("Gadugi", 3, 24)); // NOI18N
        nuevo_o.setText("Nueva Contraseña");
        olvido_contra.add(nuevo_o, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 230, -1));

        nueva_contra.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        nueva_contra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        olvido_contra.add(nueva_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 260, 30));

        confirmar_o.setFont(new java.awt.Font("Gadugi", 3, 24)); // NOI18N
        confirmar_o.setText("Confirmar Contraseña");
        olvido_contra.add(confirmar_o, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 270, -1));

        confir_contra.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        confir_contra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        olvido_contra.add(confir_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 260, 30));

        guardar_o.setBackground(new java.awt.Color(255, 175, 0));
        guardar_o.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        guardar_o.setText("GUARDAR");
        guardar_o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        guardar_o.setFocusPainted(false);
        guardar_o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_oActionPerformed(evt);
            }
        });
        olvido_contra.add(guardar_o, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 100, -1));

        volver_o.setBackground(new java.awt.Color(255, 175, 0));
        volver_o.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        volver_o.setText("VOLVER");
        volver_o.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volver_o.setFocusPainted(false);
        volver_o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver_oActionPerformed(evt);
            }
        });
        olvido_contra.add(volver_o, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 100, -1));

        fondo_olvido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.png"))); // NOI18N
        olvido_contra.add(fondo_olvido, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -20, 480, 640));

        jPanel1.add(olvido_contra, "card2");

        ini_sesion.setPreferredSize(new java.awt.Dimension(400, 600));
        ini_sesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Gadugi", 3, 24)); // NOI18N
        jLabel2.setText("Contraseña");
        ini_sesion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 140, -1));

        cedula.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        cedula.setToolTipText("");
        cedula.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cedula.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ini_sesion.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 260, -1));

        contra.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        contra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ini_sesion.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 170, 30));

        ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciar_sesion1.png"))); // NOI18N
        ingresar.setBorderPainted(false);
        ingresar.setContentAreaFilled(false);
        ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresar.setFocusPainted(false);
        ingresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciar_sesion 2.png"))); // NOI18N
        ingresar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciar_sesion 2.png"))); // NOI18N
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        ini_sesion.add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 50, 50));

        olvido_b.setBackground(new java.awt.Color(33, 150, 243));
        olvido_b.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        olvido_b.setText("¿OLVIDÓ SU CONTRASEÑA?");
        olvido_b.setFocusPainted(false);
        olvido_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olvido_bActionPerformed(evt);
            }
        });
        ini_sesion.add(olvido_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 360, -1));

        jLabel3.setFont(new java.awt.Font("Gadugi", 3, 24)); // NOI18N
        jLabel3.setText("Cédula");
        ini_sesion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        ini_sesion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jLabel4.setText("CLEAN");
        ini_sesion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jLabel6.setText("PÉREZ PRODUCTOS");
        ini_sesion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        ini_sesion.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, 0, 670, 600));

        jPanel1.add(ini_sesion, "card3");

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void olvido_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olvido_bActionPerformed
        
        ini_sesion.setVisible(false);
        olvido_contra.setVisible(true);
    }//GEN-LAST:event_olvido_bActionPerformed

    private void verificar_oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificar_oActionPerformed
       
        nuevo_o.setVisible(true);
        confirmar_o.setVisible(true);
        nueva_contra.setVisible(true);
        confir_contra.setVisible(true);
        guardar_o.setVisible(true);
    }//GEN-LAST:event_verificar_oActionPerformed

    private void guardar_oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_oActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardar_oActionPerformed

    private void volver_oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver_oActionPerformed
        
        ini_sesion.setVisible(true);
        olvido_contra.setVisible(false);
        nuevo_o.setVisible(false);
        confirmar_o.setVisible(false);
        nueva_contra.setVisible(false);
        confir_contra.setVisible(false);
        guardar_o.setVisible(false);
        
    }//GEN-LAST:event_volver_oActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        
        MDI MDI = new MDI();
        MDI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ingresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField cedula_o;
    private javax.swing.JPasswordField confir_contra;
    private javax.swing.JLabel confirmar_o;
    private javax.swing.JPasswordField contra;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo_olvido;
    private javax.swing.JButton guardar_o;
    private javax.swing.JButton ingresar;
    private javax.swing.JPanel ini_sesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lupa_o;
    private javax.swing.JPasswordField nueva_contra;
    private javax.swing.JLabel nuevo_o;
    private javax.swing.JButton olvido_b;
    private javax.swing.JPanel olvido_contra;
    private javax.swing.JTextField pregunta_seguridad;
    private javax.swing.JTextField respuesta_seguridad;
    private javax.swing.JButton verificar_o;
    private javax.swing.JButton volver_o;
    // End of variables declaration//GEN-END:variables
}
