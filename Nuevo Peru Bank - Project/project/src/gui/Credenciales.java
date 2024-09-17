package gui;

import db.ConexionOracle;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Credenciales extends javax.swing.JFrame {
    // Llamamos a las imagenes de ojos para cifrar la contraseña y los almacenamos
    ImageIcon eye = new ImageIcon(getClass().getResource("/resources/eye.png"));
    ImageIcon eyeslash = new ImageIcon(getClass().getResource("/resources/eye-slash.png"));
    private boolean novisible=true; // declaramos la variable que no deberia permitir ver la contraseña 
    private String idEmp;
    public Credenciales(String idEmp) {
        initComponents();
        this.setTitle("Nuevo Perú Bank - Credenciales");
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logo2.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
        this.idEmp=idEmp;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblRegis = new javax.swing.JLabel();
        panelForm = new javax.swing.JPanel();
        lblContra = new javax.swing.JLabel();
        txtNewUser = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnVer = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnRegistrarCli = new javax.swing.JButton();
        btnLimpiarCli = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(226, 167, 84));
        jPanel1.setForeground(new java.awt.Color(25, 88, 87));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(226, 167, 84));
        jPanel2.setForeground(new java.awt.Color(25, 88, 87));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegis.setFont(new java.awt.Font("Lucida Sans", 1, 48)); // NOI18N
        lblRegis.setForeground(new java.awt.Color(109, 30, 30));
        lblRegis.setText("Registrarse");
        jPanel2.add(lblRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 300, 80));

        panelForm.setBackground(new java.awt.Color(226, 167, 84));
        panelForm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        panelForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblContra.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        lblContra.setForeground(new java.awt.Color(109, 30, 30));
        lblContra.setText("Contraseña:");
        panelForm.add(lblContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 150, -1));

        txtNewUser.setBackground(new java.awt.Color(226, 167, 84));
        txtNewUser.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        txtNewUser.setForeground(new java.awt.Color(25, 88, 87));
        txtNewUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(109, 30, 30)));
        panelForm.add(txtNewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 260, 40));

        lblUser.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        lblUser.setForeground(new java.awt.Color(109, 30, 30));
        lblUser.setText("Usuario:");
        panelForm.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 150, -1));

        txtPassword.setBackground(new java.awt.Color(226, 167, 84));
        txtPassword.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(25, 88, 87));
        txtPassword.setToolTipText("");
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(109, 30, 30)));
        panelForm.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 260, 40));

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/eye-slash.png"))); // NOI18N
        btnVer.setBorder(null);
        btnVer.setContentAreaFilled(false);
        btnVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        panelForm.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        jPanel1.add(panelForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 390, 280));

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

        btnRegistrarCli.setBackground(new java.awt.Color(25, 88, 87));
        btnRegistrarCli.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        btnRegistrarCli.setForeground(new java.awt.Color(226, 221, 216));
        btnRegistrarCli.setText("Registrar");
        btnRegistrarCli.setBorder(null);
        btnRegistrarCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarCliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarCliMouseExited(evt);
            }
        });
        btnRegistrarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCliActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 180, 40));

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
        jPanel1.add(btnLimpiarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        novisible=!novisible; // Pasamos a lo contrario la variable boolean haciendo que no visible sea falso
        if(novisible){ // si los elementos no son visibles deberia cambiar el icono a un ojo y cifrar la contraseña
            btnVer.setIcon(eye);
            txtPassword.setEchoChar('*');
        }
        else { // De lo contario si se vera todo con normalidad
            btnVer.setIcon(eyeslash);
            txtPassword.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        RegistrarEmp reg = new RegistrarEmp(idEmp);
        reg.setVisible(true);
        reg.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRegistrarCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarCliMouseEntered
        btnRegistrarCli.setBackground(new Color(24,183,177));
    }//GEN-LAST:event_btnRegistrarCliMouseEntered

    private void btnRegistrarCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarCliMouseExited
        btnRegistrarCli.setBackground(new Color(25,88,87));
    }//GEN-LAST:event_btnRegistrarCliMouseExited

    private void btnRegistrarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCliActionPerformed
        String user=txtNewUser.getText();
        String contra=txtPassword.getText();
        // Validamos que los campos no esten vacios
        if(user.isEmpty()|| contra.isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos","Nuevo Perú Bank - Advertencia",JOptionPane.WARNING_MESSAGE);
        } 
        // Validamos que la contraseña no sea menor a 8 digitos
        else if(contra.length()<8){
           JOptionPane.showMessageDialog(null, "La contraseña tiene que ser, como mínimo de 8 dígitos","Nuevo Perú Bank - Error",JOptionPane.ERROR_MESSAGE);
       }
        else {
            Object[] options = {"Confirmar", "Cancelar"};
            int confirm = JOptionPane.showOptionDialog(null,  "Confirme las credenciales", "Nuevo Perú Bank", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (confirm == JOptionPane.YES_OPTION) { // Si se confirman las credenciales las borramos para mantener seguridad y procedemos a mandar a la DB
                txtPassword.setText("");
                txtNewUser.setText("");
                try(Connection conn=ConexionOracle.getConnection()){ // Actualizamos las credenciales que habiamos dejado vacias tomando como condicional el id del empleado que trajimos al crear el empleado
                 String sql="UPDATE  empleado SET usuario=?, contraseña=? WHERE idempleado=?";
                 PreparedStatement ps=conn.prepareStatement(sql);
                 ps.setString(1,user);
                 ps.setString(2, contra);
                 ps.setString(3, idEmp);
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Registro exitoso", "Nuevo Perú Bank",1);
                 System.exit(0); // Cuando confirme las credenciales tambien se cerrara la aplicacion
             }  
             catch(SQLException e){
                 JOptionPane.showMessageDialog(null, "No se completó el registro", "Nuevo Perú Bank - Error",JOptionPane.ERROR_MESSAGE);
             }
            }
            else{
                JOptionPane.showConfirmDialog(null, "Intente otra vez","Nuevo Perú Bank", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                txtPassword.setText("");
                txtNewUser.setText("");
            }
        }
    }//GEN-LAST:event_btnRegistrarCliActionPerformed

    private void btnLimpiarCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCliMouseEntered

    }//GEN-LAST:event_btnLimpiarCliMouseEntered

    private void btnLimpiarCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCliMouseExited

    }//GEN-LAST:event_btnLimpiarCliMouseExited

    private void btnLimpiarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCliActionPerformed
        txtNewUser.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnLimpiarCliActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiarCli;
    private javax.swing.JButton btnRegistrarCli;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblRegis;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel panelForm;
    private javax.swing.JTextField txtNewUser;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
