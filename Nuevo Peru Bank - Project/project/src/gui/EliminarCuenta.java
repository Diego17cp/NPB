package gui;

import db.ConexionOracle;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

// Todos los archivos que contengan la palabra "Eliminar" tienen una logica similar o igual
public class EliminarCuenta extends javax.swing.JFrame {
    private String idEmpl;
    public EliminarCuenta(String idEmp) {
        this.setTitle("Nuevo Perú Bank - Eliminar Cuenta");
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logo2.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
        this.idEmpl=idEmp;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNCu = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnLimpiarCli = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(226, 167, 84));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo.setFont(new java.awt.Font("Stencil", 1, 100)); // NOI18N
        labelLogo.setForeground(new java.awt.Color(109, 30, 30));
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo2.png"))); // NOI18N
        jPanel1.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, 150));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 82, 84));
        jLabel1.setText("Administrador");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(109, 30, 30));
        jLabel2.setText("Digite el Nro de la Cuenta a eliminar.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, 30));

        txtNCu.setBackground(new java.awt.Color(226, 167, 84));
        txtNCu.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        txtNCu.setForeground(new java.awt.Color(109, 30, 30));
        txtNCu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(109, 30, 30)));
        jPanel1.add(txtNCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 380, 50));

        btnEliminar.setBackground(new java.awt.Color(25, 88, 87));
        btnEliminar.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(226, 221, 216));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 160, 40));

        btnLimpiarCli.setBackground(new java.awt.Color(25, 88, 87));
        btnLimpiarCli.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        btnLimpiarCli.setForeground(new java.awt.Color(25, 88, 87));
        btnLimpiarCli.setText("Cancelar");
        btnLimpiarCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(25, 88, 87), 3, true));
        btnLimpiarCli.setContentAreaFilled(false);
        btnLimpiarCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarCliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarCliMouseExited(evt);
            }
        });
        btnLimpiarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCliActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 150, 40));

        btnExit.setBackground(new java.awt.Color(25, 88, 87));
        btnExit.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(25, 88, 87));
        btnExit.setText("Salir");
        btnExit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(25, 88, 87), 3, true));
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 150, 40));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new Color(24,183,177));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new Color(25,88,87));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String numcu=txtNCu.getText(); // Almacenamos el numero de cuenta ingresado para usarlo como condicion
        try (Connection conn = ConexionOracle.getConnection()){
            String sql="DELETE FROM cuenta WHERE numcuenta = ?"; // ejecutamos la sentencia de borrado
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, numcu); // Ingresamos el numero de cuenta a la sentencia con su respectivo index
            int filas=ps.executeUpdate();
            if (filas > 0) { // Si en la ejecucion se eliminaron filas todo salio bien, si no, es porque el numero de cuenta no esta vinculado a ninguna cuenta
                JOptionPane.showMessageDialog(null, "Cuenta eliminado correctamente.", "Nuevo Perú Bank", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró una Cuenta con ese número de cuenta.", "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar la cuenta: " + e.getMessage(), "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCliMouseEntered

    }//GEN-LAST:event_btnLimpiarCliMouseEntered

    private void btnLimpiarCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCliMouseExited

    }//GEN-LAST:event_btnLimpiarCliMouseExited

    private void btnLimpiarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCliActionPerformed
        txtNCu.setText("");
    }//GEN-LAST:event_btnLimpiarCliActionPerformed

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered

    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited

    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Desea Salir?","Nuevo Perú Bank",
            JOptionPane.YES_NO_OPTION ) ==JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        MenuAdm ini = new MenuAdm(idEmpl);
        ini.setVisible(true);
        ini.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLimpiarCli;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JTextField txtNCu;
    // End of variables declaration//GEN-END:variables
}
