package vistas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MDI extends javax.swing.JFrame {

    public MDI() {
        initComponents();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("h:mm:ss a");
        reloj.setText(formateador.format(LocalDateTime.now()));
        reloj();
        desktopPane.add(user);
        desktopPane.add(compra);
        desktopPane.add(produ);
        desktopPane.add(list);
        desktopPane.add(pay);
        desktopPane.add(vent);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        reloj = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        cargo = new javax.swing.JLabel();
        nombre_jtf = new javax.swing.JTextField();
        cargo_jtf = new javax.swing.JTextField();
        vntas_mes = new javax.swing.JLabel();
        ventas_mes = new javax.swing.JTextField();
        producto = new javax.swing.JLabel();
        mas_vendido = new javax.swing.JTextField();
        total_vendi = new javax.swing.JLabel();
        total_vendido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        usuario = new javax.swing.JMenu();
        abrir_usuario = new javax.swing.JMenuItem();
        ventas = new javax.swing.JMenu();
        abrir_ventas = new javax.swing.JMenuItem();
        abrir_pago = new javax.swing.JMenuItem();
        inventario = new javax.swing.JMenu();
        abrir_producto = new javax.swing.JMenuItem();
        abrir_listado = new javax.swing.JMenuItem();
        comprador = new javax.swing.JMenu();
        abrir_comprador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PÉREZ PRODUCTOS CLEAN");
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setResizable(false);

        reloj.setFont(new java.awt.Font("Gadugi", 1, 60)); // NOI18N
        reloj.setText("HH:MM:SS AA");
        reloj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        desktopPane.add(reloj);
        reloj.setBounds(550, 20, 417, 91);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );

        desktopPane.add(jPanel1);
        jPanel1.setBounds(500, 20, 10, 740);

        nombre.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        nombre.setText("Nombre");
        desktopPane.add(nombre);
        nombre.setBounds(30, 160, 138, 48);

        cargo.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        cargo.setText("Cargo");
        desktopPane.add(cargo);
        cargo.setBounds(30, 380, 99, 48);

        nombre_jtf.setEditable(false);
        nombre_jtf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nombre_jtf.setText("Usuario");
        nombre_jtf.setFocusable(false);
        desktopPane.add(nombre_jtf);
        nombre_jtf.setBounds(30, 230, 410, 35);

        cargo_jtf.setEditable(false);
        cargo_jtf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cargo_jtf.setText("Dueño");
        cargo_jtf.setFocusable(false);
        desktopPane.add(cargo_jtf);
        cargo_jtf.setBounds(30, 460, 400, 35);

        vntas_mes.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        vntas_mes.setText("Ventas en el Mes");
        desktopPane.add(vntas_mes);
        vntas_mes.setBounds(540, 160, 283, 48);

        ventas_mes.setEditable(false);
        ventas_mes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ventas_mes.setText("17");
        ventas_mes.setFocusable(false);
        desktopPane.add(ventas_mes);
        ventas_mes.setBounds(540, 230, 410, 35);

        producto.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        producto.setText("Producto más Vendido");
        desktopPane.add(producto);
        producto.setBounds(540, 350, 384, 48);

        mas_vendido.setEditable(false);
        mas_vendido.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mas_vendido.setText("Antibacterial");
        mas_vendido.setFocusable(false);
        desktopPane.add(mas_vendido);
        mas_vendido.setBounds(540, 420, 400, 35);

        total_vendi.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        total_vendi.setText("Total Vendido");
        desktopPane.add(total_vendi);
        total_vendi.setBounds(550, 540, 237, 48);

        total_vendido.setEditable(false);
        total_vendido.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        total_vendido.setText("5000000 Bs");
        total_vendido.setFocusable(false);
        desktopPane.add(total_vendido);
        total_vendido.setBounds(550, 610, 400, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos-de-limpieza.png"))); // NOI18N
        desktopPane.add(jLabel1);
        jLabel1.setBounds(90, 640, 130, 128);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpieza.png"))); // NOI18N
        desktopPane.add(jLabel2);
        jLabel2.setBounds(270, 630, 128, 128);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos-de-limpieza (1)_1.png"))); // NOI18N
        desktopPane.add(jLabel3);
        jLabel3.setBounds(120, 510, 256, 256);

        jLabel6.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jLabel6.setText("PÉREZ PRODUCTOS");
        desktopPane.add(jLabel6);
        jLabel6.setBounds(70, 40, 345, 50);

        jLabel4.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jLabel4.setText("CLEAN");
        desktopPane.add(jLabel4);
        jLabel4.setBounds(180, 90, 123, 50);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/background-1430103.png"))); // NOI18N
        desktopPane.add(fondo);
        fondo.setBounds(-500, -10, 1590, 930);

        menuBar.setBackground(new java.awt.Color(255, 255, 255));
        menuBar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        menuBar.setForeground(new java.awt.Color(255, 255, 255));
        menuBar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N

        usuario.setMnemonic('f');
        usuario.setText("Usuarios");
        usuario.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N

        abrir_usuario.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        abrir_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario1.png"))); // NOI18N
        abrir_usuario.setMnemonic('o');
        abrir_usuario.setText("Usuario");
        abrir_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_usuarioActionPerformed(evt);
            }
        });
        usuario.add(abrir_usuario);

        menuBar.add(usuario);

        ventas.setMnemonic('e');
        ventas.setText("Ventas");
        ventas.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N

        abrir_ventas.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        abrir_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bolsa-de-la-compra.png"))); // NOI18N
        abrir_ventas.setMnemonic('t');
        abrir_ventas.setText("Venta");
        abrir_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_ventasActionPerformed(evt);
            }
        });
        ventas.add(abrir_ventas);

        abrir_pago.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        abrir_pago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos-de-dinero.png"))); // NOI18N
        abrir_pago.setMnemonic('y');
        abrir_pago.setText("Pago");
        abrir_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_pagoActionPerformed(evt);
            }
        });
        ventas.add(abrir_pago);

        menuBar.add(ventas);

        inventario.setMnemonic('h');
        inventario.setText("Inventario");
        inventario.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N

        abrir_producto.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        abrir_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos-de-higiene.png"))); // NOI18N
        abrir_producto.setMnemonic('c');
        abrir_producto.setText("Producto");
        abrir_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_productoActionPerformed(evt);
            }
        });
        inventario.add(abrir_producto);

        abrir_listado.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        abrir_listado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/prueba.png"))); // NOI18N
        abrir_listado.setMnemonic('a');
        abrir_listado.setText("Listado");
        abrir_listado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_listadoActionPerformed(evt);
            }
        });
        inventario.add(abrir_listado);

        menuBar.add(inventario);

        comprador.setMnemonic('h');
        comprador.setText("Comprador");
        comprador.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N

        abrir_comprador.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        abrir_comprador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        abrir_comprador.setMnemonic('c');
        abrir_comprador.setText("Comprador");
        abrir_comprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_compradorActionPerformed(evt);
            }
        });
        comprador.add(abrir_comprador);

        menuBar.add(comprador);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrir_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_usuarioActionPerformed
        
        user.setVisible(true);
    }//GEN-LAST:event_abrir_usuarioActionPerformed

    private void abrir_compradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_compradorActionPerformed
        
        compra.setVisible(true);
    }//GEN-LAST:event_abrir_compradorActionPerformed

    private void abrir_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_productoActionPerformed
        
        produ.setVisible(true);
    }//GEN-LAST:event_abrir_productoActionPerformed

    private void abrir_listadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_listadoActionPerformed
        
        list.setVisible(true);
    }//GEN-LAST:event_abrir_listadoActionPerformed

    private void abrir_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_pagoActionPerformed
        
        pay.setVisible(true);
    }//GEN-LAST:event_abrir_pagoActionPerformed

    private void abrir_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_ventasActionPerformed
        
        vent.setVisible(true);
    }//GEN-LAST:event_abrir_ventasActionPerformed
    public void reloj() {

        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("h:mm:ss a");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                        reloj.setText(formateador.format(LocalDateTime.now()));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread hilo = new Thread(runnable);
        hilo.start();
    }
    
    private usuario user = new usuario();
    private comprador compra = new comprador();
    private producto produ = new producto();
    private listado list = new listado();
    private pago pay = new pago();
    private venta vent = new venta();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrir_comprador;
    private javax.swing.JMenuItem abrir_listado;
    private javax.swing.JMenuItem abrir_pago;
    private javax.swing.JMenuItem abrir_producto;
    private javax.swing.JMenuItem abrir_usuario;
    private javax.swing.JMenuItem abrir_ventas;
    private javax.swing.JLabel cargo;
    private javax.swing.JTextField cargo_jtf;
    private javax.swing.JMenu comprador;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel fondo;
    private javax.swing.JMenu inventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mas_vendido;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombre_jtf;
    private javax.swing.JLabel producto;
    private javax.swing.JLabel reloj;
    private javax.swing.JLabel total_vendi;
    private javax.swing.JTextField total_vendido;
    private javax.swing.JMenu usuario;
    private javax.swing.JMenu ventas;
    private javax.swing.JTextField ventas_mes;
    private javax.swing.JLabel vntas_mes;
    // End of variables declaration//GEN-END:variables

}
