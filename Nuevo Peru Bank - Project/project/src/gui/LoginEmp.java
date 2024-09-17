package gui;
// @author Diego17

import java.awt.Color;
import java.awt.Image; //  Objeto para asignar una imagen al icono de la aplicacion
import javax.swing.ImageIcon; // Objeto para traer imagenes 
import javax.swing.JOptionPane;
import java.sql.SQLException;
import db.ConexionOracle; // Clase donde tenemos hecha la conexion
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginEmp extends javax.swing.JFrame {
    int attempt = 0; // Inicializamos una variable de intentos para manejar los intentos fallidos de iniciar sesión
    public LoginEmp() {
        initComponents();
        this.setTitle("Nuevo Perú Bank - Acceder como Administrador");
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logo2.png"));
        Image logo = icon.getImage();
        setIconImage(logo); 
    }
    // El usuario es: Admin17 y la contraseña es: 123456
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMainLogin1 = new javax.swing.JPanel();
        panelBienvenida = new javax.swing.JPanel();
        labelLogin1 = new javax.swing.JLabel();
        panelCenter = new javax.swing.JPanel();
        labelInicioSes1 = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        labelUsuarioAdmin1 = new javax.swing.JLabel();
        txtUserAdmin = new javax.swing.JTextField();
        labelContraAdmin = new javax.swing.JLabel();
        pswdContraAdmin = new javax.swing.JPasswordField();
        panelButtons = new javax.swing.JPanel();
        btnLoginAdmin = new javax.swing.JButton();
        btnCancelAdmin = new javax.swing.JButton();
        btnExitAdmin = new javax.swing.JButton();
        panelBienvenida2 = new javax.swing.JPanel();
        labelLogin1_2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBienvenida.setBackground(new java.awt.Color(13, 82, 84));

        labelLogin1.setBackground(new java.awt.Color(13, 82, 84));
        labelLogin1.setFont(new java.awt.Font("Stencil", 1, 100)); // NOI18N
        labelLogin1.setForeground(new java.awt.Color(24, 183, 177));
        labelLogin1.setText("Bienvenido");

        javax.swing.GroupLayout panelBienvenidaLayout = new javax.swing.GroupLayout(panelBienvenida);
        panelBienvenida.setLayout(panelBienvenidaLayout);
        panelBienvenidaLayout.setHorizontalGroup(
            panelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBienvenidaLayout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addComponent(labelLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
        panelBienvenidaLayout.setVerticalGroup(
            panelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBienvenidaLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(labelLogin1)
                .addContainerGap())
        );

        panelCenter.setBackground(new java.awt.Color(226, 167, 84));

        labelInicioSes1.setFont(new java.awt.Font("Leelawadee", 1, 48)); // NOI18N
        labelInicioSes1.setForeground(new java.awt.Color(109, 30, 30));
        labelInicioSes1.setText("Iniciar Sesión");

        panelDatos.setBackground(new java.awt.Color(226, 167, 84));
        panelDatos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 5, true));

        labelUsuarioAdmin1.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        labelUsuarioAdmin1.setForeground(new java.awt.Color(109, 30, 30));
        labelUsuarioAdmin1.setText("Usuario:");

        txtUserAdmin.setBackground(new java.awt.Color(239, 200, 137));
        txtUserAdmin.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        txtUserAdmin.setForeground(new java.awt.Color(109, 30, 30));
        txtUserAdmin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        txtUserAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserAdminActionPerformed(evt);
            }
        });

        labelContraAdmin.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        labelContraAdmin.setForeground(new java.awt.Color(109, 30, 30));
        labelContraAdmin.setText("Contraseña:");

        pswdContraAdmin.setBackground(new java.awt.Color(239, 200, 137));
        pswdContraAdmin.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        pswdContraAdmin.setForeground(new java.awt.Color(109, 30, 30));
        pswdContraAdmin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        pswdContraAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswdContraAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pswdContraAdmin)
                    .addComponent(labelContraAdmin)
                    .addComponent(labelUsuarioAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUsuarioAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelContraAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswdContraAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panelButtons.setBackground(new java.awt.Color(226, 167, 84));

        btnLoginAdmin.setBackground(new java.awt.Color(25, 88, 87));
        btnLoginAdmin.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        btnLoginAdmin.setForeground(new java.awt.Color(226, 221, 216));
        btnLoginAdmin.setText("Acceder");
        btnLoginAdmin.setBorder(null);
        btnLoginAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoginAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginAdminMouseExited(evt);
            }
        });
        btnLoginAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginAdminActionPerformed(evt);
            }
        });

        btnCancelAdmin.setBackground(new java.awt.Color(25, 88, 87));
        btnCancelAdmin.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        btnCancelAdmin.setForeground(new java.awt.Color(25, 88, 87));
        btnCancelAdmin.setText("Cancelar");
        btnCancelAdmin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(25, 88, 87), 3, true));
        btnCancelAdmin.setContentAreaFilled(false);
        btnCancelAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelAdminMouseExited(evt);
            }
        });
        btnCancelAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelAdminActionPerformed(evt);
            }
        });

        btnExitAdmin.setBackground(new java.awt.Color(25, 88, 87));
        btnExitAdmin.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        btnExitAdmin.setForeground(new java.awt.Color(25, 88, 87));
        btnExitAdmin.setText("Salir");
        btnExitAdmin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(25, 88, 87), 3, true));
        btnExitAdmin.setContentAreaFilled(false);
        btnExitAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExitAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitAdminMouseExited(evt);
            }
        });
        btnExitAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonsLayout = new javax.swing.GroupLayout(panelButtons);
        panelButtons.setLayout(panelButtonsLayout);
        panelButtonsLayout.setHorizontalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btnLoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnCancelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(btnExitAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        panelButtonsLayout.setVerticalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExitAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCenterLayout = new javax.swing.GroupLayout(panelCenter);
        panelCenter.setLayout(panelCenterLayout);
        panelCenterLayout.setHorizontalGroup(
            panelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCenterLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(panelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCenterLayout.createSequentialGroup()
                        .addComponent(labelInicioSes1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(310, 310, 310))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCenterLayout.createSequentialGroup()
                        .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCenterLayout.createSequentialGroup()
                        .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236))))
        );
        panelCenterLayout.setVerticalGroup(
            panelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCenterLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(labelInicioSes1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBienvenida2.setBackground(new java.awt.Color(13, 82, 84));

        labelLogin1_2.setBackground(new java.awt.Color(13, 82, 84));
        labelLogin1_2.setFont(new java.awt.Font("Stencil", 1, 100)); // NOI18N
        labelLogin1_2.setForeground(new java.awt.Color(24, 183, 177));
        labelLogin1_2.setText("npb");

        javax.swing.GroupLayout panelBienvenida2Layout = new javax.swing.GroupLayout(panelBienvenida2);
        panelBienvenida2.setLayout(panelBienvenida2Layout);
        panelBienvenida2Layout.setHorizontalGroup(
            panelBienvenida2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBienvenida2Layout.createSequentialGroup()
                .addContainerGap(380, Short.MAX_VALUE)
                .addComponent(labelLogin1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(358, 358, 358))
        );
        panelBienvenida2Layout.setVerticalGroup(
            panelBienvenida2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBienvenida2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(labelLogin1_2)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelMainLogin1Layout = new javax.swing.GroupLayout(panelMainLogin1);
        panelMainLogin1.setLayout(panelMainLogin1Layout);
        panelMainLogin1Layout.setHorizontalGroup(
            panelMainLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelBienvenida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMainLogin1Layout.setVerticalGroup(
            panelMainLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLogin1Layout.createSequentialGroup()
                .addComponent(panelBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(panelMainLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMainLogin1Layout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(panelBienvenida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMainLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMainLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserAdminActionPerformed

    private void btnLoginAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAdminActionPerformed
        String user=txtUserAdmin.getText(); // Obtentemos lo que se ingrese en el txt y se almacena en una variable
        String contra=pswdContraAdmin.getText(); // Obtenemos lo que se ingresa en el txt de Contraseña y lo almacenamos
         if (!(user.isEmpty()||contra.isEmpty())) { // Manejamos que los txt NO estén vacios
            try(Connection conn = ConexionOracle.getConnection()){
                String sql="SELECT idempleado from empleado WHERE usuario=? AND contraseña=?"; // llamamos al id del empleado para verificar que las credenciasles ingresadas sean correctas
                PreparedStatement ps=conn.prepareStatement(sql);
                ps.setString(1,user);
                ps.setString(2,contra);
                ResultSet rs=ps.executeQuery(); // Ejecutamos la consulta
                if(rs.next()){
                    String idEmp=rs.getString("idempleado");
                    MenuAdm menu = new MenuAdm(idEmp); // Si la informacion ingresada es veridica abre la ventana de menu de empleados con el id del empleado que entró como constructor
                    menu.setVisible(true);
                    menu.setLocationRelativeTo(null);
                    this.dispose();
                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso", "Nuevo Perú Bank - Iniciar Sesion Usuario",1);
                }
                else{
                    // Si la informacion que ingresó el usuario no coincide con la que se encuentra en la DB los campos se limipiarán y se sumará un intento
                    txtUserAdmin.setText("");
                    pswdContraAdmin.setText(""); 
                    JOptionPane.showMessageDialog(null, "DNI o Contraseña incorrectos. Tiene "+attempt +" intentos", "Nuevo Perú Bank - Incorrecto", 2);
                    attempt += 1;
                    if (attempt ==3){ // Si los intentos llegan a 3, el programa se cierra automaticamente
                        JOptionPane.showMessageDialog(null, "Número máximo de intentos alcanzado. Cerrando aplicación.","Nuevo Perú Bank",2);
                        System.exit(0);
                    }
                }
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error en la base de datos: " + ex.getMessage());
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Por favor, ingrese DNI y contraseña.","Nuevo Perú Bank - Advertencia",0);
        }
    }//GEN-LAST:event_btnLoginAdminActionPerformed

    private void pswdContraAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswdContraAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswdContraAdminActionPerformed

    private void btnExitAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitAdminActionPerformed
        // Boton para confirmar si se desea salir, si la respuesta es si, el programa se cerrará
        if (JOptionPane.showConfirmDialog(null, "¿Desea Salir?","Nuevo Perú Bank",
               JOptionPane.YES_NO_OPTION ) ==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitAdminActionPerformed

    private void btnCancelAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelAdminActionPerformed
       txtUserAdmin.setText("");
       pswdContraAdmin.setText("");
    }//GEN-LAST:event_btnCancelAdminActionPerformed

    private void btnLoginAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginAdminMouseEntered
        btnLoginAdmin.setBackground(new Color(24,183,177));
    }//GEN-LAST:event_btnLoginAdminMouseEntered

    private void btnLoginAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginAdminMouseExited
        btnLoginAdmin.setBackground(new Color(25,88,87));
    }//GEN-LAST:event_btnLoginAdminMouseExited

    private void btnCancelAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelAdminMouseEntered
        
    }//GEN-LAST:event_btnCancelAdminMouseEntered

    private void btnCancelAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelAdminMouseExited
       
    }//GEN-LAST:event_btnCancelAdminMouseExited

    private void btnExitAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitAdminMouseEntered
       
    }//GEN-LAST:event_btnExitAdminMouseEntered

    private void btnExitAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitAdminMouseExited
        
    }//GEN-LAST:event_btnExitAdminMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelAdmin;
    private javax.swing.JButton btnExitAdmin;
    private javax.swing.JButton btnLoginAdmin;
    private javax.swing.JLabel labelContraAdmin;
    private javax.swing.JLabel labelInicioSes1;
    private javax.swing.JLabel labelLogin1;
    private javax.swing.JLabel labelLogin1_2;
    private javax.swing.JLabel labelUsuarioAdmin1;
    private javax.swing.JPanel panelBienvenida;
    private javax.swing.JPanel panelBienvenida2;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelMainLogin1;
    private javax.swing.JPasswordField pswdContraAdmin;
    private javax.swing.JTextField txtUserAdmin;
    // End of variables declaration//GEN-END:variables
}
