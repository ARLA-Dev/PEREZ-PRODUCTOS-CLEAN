package vistas;

public class venta extends javax.swing.JInternalFrame {

    public venta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cedula_v = new javax.swing.JTextField();
        nombre_v = new javax.swing.JTextField();
        fecha_v = new javax.swing.JTextField();
        combo1_v = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jComboBox2 = new javax.swing.JComboBox<>();
        combo2_v = new javax.swing.JComboBox<>();
        num_v = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_v = new javax.swing.JTable();
        lupa1_v = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        total_v1 = new javax.swing.JTextField();
        agregar_v = new javax.swing.JButton();
        registrar_v = new javax.swing.JButton();
        limpiar_v = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Venta");
        setToolTipText("");
        setMinimumSize(new java.awt.Dimension(900, 720));
        setPreferredSize(new java.awt.Dimension(900, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel2.setText("Cédula del Comprador");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel3.setText("Nombre del Comprador");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel4.setText("Fecha y Hora");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel5.setText("Producto");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel6.setText("Cantidad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel7.setText("Unidad de Medida");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel9.setText("IVA");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel8.setText("Número de Venta");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, -1, -1));

        cedula_v.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jPanel1.add(cedula_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 270, -1));

        nombre_v.setEditable(false);
        nombre_v.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jPanel1.add(nombre_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 280, -1));

        fecha_v.setEditable(false);
        fecha_v.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jPanel1.add(fecha_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 190, -1));

        combo1_v.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        combo1_v.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Producto1", "Producto2", "Producto3", "Producto4", "Producto5" }));
        combo1_v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1_vActionPerformed(evt);
            }
        });
        jPanel1.add(combo1_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 830, -1));

        jSpinner1.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, -1));

        jComboBox2.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Litros", "Unidades", "Galones", "Cajas" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 220, -1));

        combo2_v.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        combo2_v.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12%", "09%" }));
        jPanel1.add(combo2_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, -1));

        num_v.setEditable(false);
        num_v.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jPanel1.add(num_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, 220, -1));

        lista_v.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        lista_v.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código del Producto", "Nombre del Producto", "Precio", "Cantidad", "Unidad de Medida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lista_v.setEnabled(false);
        lista_v.setGridColor(new java.awt.Color(0, 0, 0));
        lista_v.getTableHeader().setResizingAllowed(false);
        lista_v.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(lista_v);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 840, 250));

        lupa1_v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_o1.png"))); // NOI18N
        lupa1_v.setBorderPainted(false);
        lupa1_v.setContentAreaFilled(false);
        lupa1_v.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lupa1_v.setFocusPainted(false);
        lupa1_v.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_o2.png"))); // NOI18N
        lupa1_v.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa_o2.png"))); // NOI18N
        jPanel1.add(lupa1_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel10.setText("Total a Pagar");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, -1, -1));

        total_v1.setEditable(false);
        total_v1.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jPanel1.add(total_v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 600, 250, -1));

        agregar_v.setBackground(new java.awt.Color(33, 150, 243));
        agregar_v.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        agregar_v.setText("AGREGAR");
        agregar_v.setFocusPainted(false);
        agregar_v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_vActionPerformed(evt);
            }
        });
        jPanel1.add(agregar_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 130, -1));

        registrar_v.setBackground(new java.awt.Color(33, 150, 243));
        registrar_v.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        registrar_v.setText("REGISTRAR");
        registrar_v.setFocusPainted(false);
        registrar_v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_vActionPerformed(evt);
            }
        });
        jPanel1.add(registrar_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 600, -1, -1));

        limpiar_v.setBackground(new java.awt.Color(33, 150, 243));
        limpiar_v.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        limpiar_v.setText("LIMPIAR");
        limpiar_v.setFocusPainted(false);
        limpiar_v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_vActionPerformed(evt);
            }
        });
        jPanel1.add(limpiar_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 560, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo1_vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1_vActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo1_vActionPerformed

    private void agregar_vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_vActionPerformed

    }//GEN-LAST:event_agregar_vActionPerformed

    private void registrar_vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_vActionPerformed

    }//GEN-LAST:event_registrar_vActionPerformed

    private void limpiar_vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_vActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpiar_vActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_v;
    private javax.swing.JTextField cedula_v;
    private javax.swing.JComboBox<String> combo1_v;
    private javax.swing.JComboBox<String> combo2_v;
    private javax.swing.JTextField fecha_v;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton limpiar_v;
    private javax.swing.JTable lista_v;
    private javax.swing.JButton lupa1_v;
    private javax.swing.JTextField nombre_v;
    private javax.swing.JTextField num_v;
    private javax.swing.JButton registrar_v;
    private javax.swing.JTextField total_v1;
    // End of variables declaration//GEN-END:variables
}
