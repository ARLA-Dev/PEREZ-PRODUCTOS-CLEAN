package vistas;

public class pago extends javax.swing.JInternalFrame {

    public pago() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        num_ventap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lupa1_p = new javax.swing.JButton();
        deuda_p = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        monto_p = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fecha_p = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        combo_p = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        codigo_p = new javax.swing.JTextField();
        lupa2_p = new javax.swing.JButton();
        registrar_p = new javax.swing.JButton();
        limpiar_p = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Pago");
        setMinimumSize(new java.awt.Dimension(900, 720));
        setPreferredSize(new java.awt.Dimension(900, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel6.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jLabel6.setText("PÉREZ PRODUCTOS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jLabel7.setText("CLEAN");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel2.setText("Número de Venta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        num_ventap.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jPanel1.add(num_ventap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 310, -1));

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel3.setText("Deuda");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        lupa1_p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_o1.png"))); // NOI18N
        lupa1_p.setBorderPainted(false);
        lupa1_p.setContentAreaFilled(false);
        lupa1_p.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lupa1_p.setFocusPainted(false);
        lupa1_p.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_o2.png"))); // NOI18N
        lupa1_p.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_o2.png"))); // NOI18N
        jPanel1.add(lupa1_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        deuda_p.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jPanel1.add(deuda_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 310, -1));

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel4.setText("Monto");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        monto_p.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jPanel1.add(monto_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 310, -1));

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel5.setText("Fecha y Hora");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        fecha_p.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jPanel1.add(fecha_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 310, -1));

        jLabel8.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel8.setText("Tipo de Pago");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        combo_p.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        combo_p.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Transferencia" }));
        jPanel1.add(combo_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 300, -1));

        jLabel9.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel9.setText("Código de Pago");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        codigo_p.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jPanel1.add(codigo_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 300, -1));

        lupa2_p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_o1.png"))); // NOI18N
        lupa2_p.setBorderPainted(false);
        lupa2_p.setContentAreaFilled(false);
        lupa2_p.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lupa2_p.setFocusPainted(false);
        lupa2_p.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_o2.png"))); // NOI18N
        lupa2_p.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_o2.png"))); // NOI18N
        jPanel1.add(lupa2_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, -1, -1));

        registrar_p.setBackground(new java.awt.Color(33, 150, 243));
        registrar_p.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        registrar_p.setText("REGISTRAR");
        registrar_p.setFocusPainted(false);
        registrar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_pActionPerformed(evt);
            }
        });
        jPanel1.add(registrar_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 320, -1));

        limpiar_p.setBackground(new java.awt.Color(33, 150, 243));
        limpiar_p.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        limpiar_p.setText("LIMPIAR");
        limpiar_p.setFocusPainted(false);
        limpiar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_pActionPerformed(evt);
            }
        });
        jPanel1.add(limpiar_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 320, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pago-en-linea.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrar_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_pActionPerformed

    }//GEN-LAST:event_registrar_pActionPerformed

    private void limpiar_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_pActionPerformed

    }//GEN-LAST:event_limpiar_pActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo_p;
    private javax.swing.JComboBox<String> combo_p;
    private javax.swing.JTextField deuda_p;
    private javax.swing.JTextField fecha_p;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JButton limpiar_p;
    private javax.swing.JButton lupa1_p;
    private javax.swing.JButton lupa2_p;
    private javax.swing.JTextField monto_p;
    private javax.swing.JTextField num_ventap;
    private javax.swing.JButton registrar_p;
    // End of variables declaration//GEN-END:variables
}
