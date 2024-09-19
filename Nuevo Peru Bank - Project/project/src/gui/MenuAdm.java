package gui;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MenuAdm extends javax.swing.JFrame {
    private String idEmp; // Declaramos una variable general privada para poder usarla después
    public MenuAdm(String idEmp) {
        initComponents();
        this.idEmp=idEmp; // Le asignamos a la variable privada el valor de la variable que vino en el constructor
        this.setTitle("Nuevo Perú Bank - Menú Administrador");
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logo2.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuRegCli = new javax.swing.JMenuItem();
        menuRegEmp = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        menuActCli = new javax.swing.JMenuItem();
        menuActEmp = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuEliCli = new javax.swing.JMenuItem();
        menuEliEmp = new javax.swing.JMenuItem();
        menuEliAcc = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuDepoUno = new javax.swing.JMenuItem();
        menuRetiro = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(226, 167, 84));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo.setFont(new java.awt.Font("Stencil", 1, 100)); // NOI18N
        labelLogo.setForeground(new java.awt.Color(109, 30, 30));
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo2.png"))); // NOI18N
        jPanel1.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 150, 150));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 82, 84));
        jLabel1.setText("Administrador");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/green.png"))); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(13, 82, 84));

        jMenu1.setBackground(new java.awt.Color(13, 82, 84));
        jMenu1.setForeground(new java.awt.Color(24, 183, 177));
        jMenu1.setText("Registrar");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuRegCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuRegCli.setBackground(new java.awt.Color(13, 82, 84));
        menuRegCli.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        menuRegCli.setForeground(new java.awt.Color(24, 183, 177));
        menuRegCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/upload-solid.png"))); // NOI18N
        menuRegCli.setText("Registrar Cliente");
        menuRegCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuRegCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegCliActionPerformed(evt);
            }
        });
        jMenu1.add(menuRegCli);

        menuRegEmp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuRegEmp.setBackground(new java.awt.Color(13, 82, 84));
        menuRegEmp.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        menuRegEmp.setForeground(new java.awt.Color(24, 183, 177));
        menuRegEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cloud-arrow-up-solid.png"))); // NOI18N
        menuRegEmp.setText("Registrar Empleado");
        menuRegEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuRegEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegEmpActionPerformed(evt);
            }
        });
        jMenu1.add(menuRegEmp);
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(13, 82, 84));
        jMenu2.setForeground(new java.awt.Color(24, 183, 177));
        jMenu2.setText("Actualizar");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuActCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuActCli.setBackground(new java.awt.Color(13, 82, 84));
        menuActCli.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        menuActCli.setForeground(new java.awt.Color(24, 183, 177));
        menuActCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/user-pen-solid.png"))); // NOI18N
        menuActCli.setText("Actualizar Clientes");
        menuActCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuActCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActCliActionPerformed(evt);
            }
        });
        jMenu2.add(menuActCli);

        menuActEmp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuActEmp.setBackground(new java.awt.Color(13, 82, 84));
        menuActEmp.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        menuActEmp.setForeground(new java.awt.Color(24, 183, 177));
        menuActEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/file-pen-solid.png"))); // NOI18N
        menuActEmp.setText("Actualizar Empleados");
        menuActEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuActEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActEmpActionPerformed(evt);
            }
        });
        jMenu2.add(menuActEmp);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(13, 82, 84));
        jMenu3.setForeground(new java.awt.Color(24, 183, 177));
        jMenu3.setText("Eliminar");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuEliCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuEliCli.setBackground(new java.awt.Color(13, 82, 84));
        menuEliCli.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        menuEliCli.setForeground(new java.awt.Color(24, 183, 177));
        menuEliCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/user-large-slash-solid.png"))); // NOI18N
        menuEliCli.setText("Eliminar Clientes");
        menuEliCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuEliCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliCliActionPerformed(evt);
            }
        });
        jMenu3.add(menuEliCli);

        menuEliEmp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuEliEmp.setBackground(new java.awt.Color(13, 82, 84));
        menuEliEmp.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        menuEliEmp.setForeground(new java.awt.Color(24, 183, 177));
        menuEliEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/user-xmark-solid.png"))); // NOI18N
        menuEliEmp.setText("Eliminar Empleados");
        menuEliEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuEliEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliEmpActionPerformed(evt);
            }
        });
        jMenu3.add(menuEliEmp);

        menuEliAcc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuEliAcc.setBackground(new java.awt.Color(13, 82, 84));
        menuEliAcc.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        menuEliAcc.setForeground(new java.awt.Color(24, 183, 177));
        menuEliAcc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/money-bill-solid.png"))); // NOI18N
        menuEliAcc.setText("Eliminar Cuenta");
        menuEliAcc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuEliAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliAccActionPerformed(evt);
            }
        });
        jMenu3.add(menuEliAcc);

        jMenuBar1.add(jMenu3);

        jMenu5.setBackground(new java.awt.Color(13, 82, 84));
        jMenu5.setForeground(new java.awt.Color(24, 183, 177));
        jMenu5.setText("Transferencias");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuDepoUno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuDepoUno.setBackground(new java.awt.Color(13, 82, 84));
        menuDepoUno.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        menuDepoUno.setForeground(new java.awt.Color(24, 183, 177));
        menuDepoUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/hand-holding-dollar-solid.png"))); // NOI18N
        menuDepoUno.setText("Depositar a su cuenta");
        menuDepoUno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuDepoUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDepoUnoActionPerformed(evt);
            }
        });
        jMenu5.add(menuDepoUno);

        menuRetiro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuRetiro.setBackground(new java.awt.Color(13, 82, 84));
        menuRetiro.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        menuRetiro.setForeground(new java.awt.Color(24, 183, 177));
        menuRetiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/money-bill-transfer-solid.png"))); // NOI18N
        menuRetiro.setText("Retirar");
        menuRetiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRetiroActionPerformed(evt);
            }
        });
        jMenu5.add(menuRetiro);

        jMenuBar1.add(jMenu5);

        jMenu4.setBackground(new java.awt.Color(13, 82, 84));
        jMenu4.setForeground(new java.awt.Color(24, 183, 177));
        jMenu4.setText("Salir");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuSalir.setBackground(new java.awt.Color(13, 82, 84));
        menuSalir.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        menuSalir.setForeground(new java.awt.Color(24, 183, 177));
        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door-open-solid (1).png"))); // NOI18N
        menuSalir.setText("Cerrar Aplicación");
        menuSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenu4.add(menuSalir);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // Boton para volver a la ventana anterior 
        this.dispose();
        Inicio ini = new Inicio();
        ini.setVisible(true);
        ini.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void menuRegCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegCliActionPerformed
        // Menu para ir a una nueva ventana llevando el id del empleado como constructor
        RegistroCliente rgc=new RegistroCliente(idEmp);
        rgc.setVisible(true);
        rgc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_menuRegCliActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Desea Salir?","Nuevo Perú Bank",
            JOptionPane.YES_NO_OPTION ) ==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuRegEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegEmpActionPerformed
        // Menu para ir a una nueva ventana llevando el id del empleado como constructor
        RegistrarEmp emps= new RegistrarEmp(idEmp);
        emps.setLocationRelativeTo(null);
        emps.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuRegEmpActionPerformed

    private void menuActCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActCliActionPerformed
        // Menu para ir a una nueva ventana llevando el id del empleado como constructor
        ActualizarCli actCl=new ActualizarCli(idEmp);
        actCl.setVisible(true);
        actCl.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_menuActCliActionPerformed

    private void menuActEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActEmpActionPerformed
        // Menu para ir a una nueva ventana llevando el id del empleado como constructor
        ActualizarEmp act=new ActualizarEmp(idEmp);
        act.setVisible(true);
        act.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_menuActEmpActionPerformed

    private void menuEliCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliCliActionPerformed
        // Menu para ir a una nueva ventana llevando el id del empleado como constructor
        EliminarCli eliCl=new EliminarCli(idEmp);
        eliCl.setVisible(true);
        eliCl.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_menuEliCliActionPerformed

    private void menuEliEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliEmpActionPerformed
        // Menu para ir a una nueva ventana llevando el id del empleado como constructor
        EliminarEmp eli=new EliminarEmp(idEmp);
        eli.setVisible(true);
        eli.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_menuEliEmpActionPerformed

    private void menuEliAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliAccActionPerformed
        // Menu para ir a una nueva ventana llevando el id del empleado como constructor
        EliminarCuenta eliCu=new EliminarCuenta(idEmp);
        eliCu.setVisible(true);
        eliCu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_menuEliAccActionPerformed

    private void menuDepoUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDepoUnoActionPerformed
        DepositoUno depo1=new DepositoUno();
        depo1.setVisible(true);
        depo1.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuDepoUnoActionPerformed

    private void menuRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRetiroActionPerformed
        Retiro retiro=new Retiro();
        retiro.setVisible(true);
        retiro.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuRetiroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JMenuItem menuActCli;
    private javax.swing.JMenuItem menuActEmp;
    private javax.swing.JMenuItem menuDepoUno;
    private javax.swing.JMenuItem menuEliAcc;
    private javax.swing.JMenuItem menuEliCli;
    private javax.swing.JMenuItem menuEliEmp;
    private javax.swing.JMenuItem menuRegCli;
    private javax.swing.JMenuItem menuRegEmp;
    private javax.swing.JMenuItem menuRetiro;
    private javax.swing.JMenuItem menuSalir;
    // End of variables declaration//GEN-END:variables
}
