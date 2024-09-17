package gui;
import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import db.ConexionOracle;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Random;
import java.sql.SQLException;
import javax.swing.ImageIcon;

// La logica usada aqui es similar a la usada en el archivo "RegistrarCliente.java"
public class RegistrarEmp extends javax.swing.JFrame {
    private String idEmpl;
    public RegistrarEmp(String idEmp) {
        this.idEmpl=idEmp;
        this.setTitle("Nuevo Perú Bank - Registrar Empleado");
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logo2.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelTitleEmp = new javax.swing.JPanel();
        txtTitleEmp = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        panelForm = new javax.swing.JPanel();
        labelDNI = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        labelNom = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        labelApeCli = new javax.swing.JLabel();
        txtApes = new javax.swing.JTextField();
        labelFNacCli = new javax.swing.JLabel();
        dateFNac = new com.toedter.calendar.JDateChooser();
        labelDirecCli = new javax.swing.JLabel();
        labelTelfCli = new javax.swing.JLabel();
        labelCorreoCli = new javax.swing.JLabel();
        txtTelf = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDirec = new javax.swing.JTextField();
        btnRegistrarCli = new javax.swing.JButton();
        btnExitAdmin = new javax.swing.JButton();
        btnLimpiarCli = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(226, 167, 84));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTitleEmp.setBackground(new java.awt.Color(13, 82, 84));
        panelTitleEmp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitleEmp.setBackground(new java.awt.Color(13, 82, 84));
        txtTitleEmp.setFont(new java.awt.Font("Stencil", 1, 80)); // NOI18N
        txtTitleEmp.setForeground(new java.awt.Color(24, 183, 177));
        txtTitleEmp.setText("administrador");
        panelTitleEmp.add(txtTitleEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 703, -1));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/orange.png"))); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        panelTitleEmp.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(panelTitleEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 110));

        panelForm.setBackground(new java.awt.Color(226, 167, 84));
        panelForm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 2, true));
        panelForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelDNI.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        labelDNI.setForeground(new java.awt.Color(109, 30, 30));
        labelDNI.setText("DNI:");
        panelForm.add(labelDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtDNI.setBackground(new java.awt.Color(239, 200, 137));
        txtDNI.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(109, 30, 30));
        txtDNI.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });
        panelForm.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 220, -1));

        labelNom.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        labelNom.setForeground(new java.awt.Color(109, 30, 30));
        labelNom.setText("Nombres:");
        panelForm.add(labelNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtNom.setBackground(new java.awt.Color(239, 200, 137));
        txtNom.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        txtNom.setForeground(new java.awt.Color(109, 30, 30));
        txtNom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });
        panelForm.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 220, -1));

        labelApeCli.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        labelApeCli.setForeground(new java.awt.Color(109, 30, 30));
        labelApeCli.setText("Apellidos:");
        panelForm.add(labelApeCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txtApes.setBackground(new java.awt.Color(239, 200, 137));
        txtApes.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        txtApes.setForeground(new java.awt.Color(109, 30, 30));
        txtApes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        txtApes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApesActionPerformed(evt);
            }
        });
        panelForm.add(txtApes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 220, -1));

        labelFNacCli.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        labelFNacCli.setForeground(new java.awt.Color(109, 30, 30));
        labelFNacCli.setText("Fecha de Nacimiento:");
        panelForm.add(labelFNacCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 190, -1));

        dateFNac.setBackground(new java.awt.Color(239, 200, 137));
        dateFNac.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        dateFNac.setForeground(new java.awt.Color(109, 30, 30));
        panelForm.add(dateFNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 220, 40));

        labelDirecCli.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        labelDirecCli.setForeground(new java.awt.Color(109, 30, 30));
        labelDirecCli.setText("Dirección:");
        panelForm.add(labelDirecCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        labelTelfCli.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        labelTelfCli.setForeground(new java.awt.Color(109, 30, 30));
        labelTelfCli.setText("Teléfono:");
        panelForm.add(labelTelfCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        labelCorreoCli.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        labelCorreoCli.setForeground(new java.awt.Color(109, 30, 30));
        labelCorreoCli.setText("Correo Electrónico:");
        panelForm.add(labelCorreoCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        txtTelf.setBackground(new java.awt.Color(239, 200, 137));
        txtTelf.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        txtTelf.setForeground(new java.awt.Color(109, 30, 30));
        txtTelf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        txtTelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelfActionPerformed(evt);
            }
        });
        panelForm.add(txtTelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 220, -1));

        txtCorreo.setBackground(new java.awt.Color(239, 200, 137));
        txtCorreo.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(109, 30, 30));
        txtCorreo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        panelForm.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 220, -1));

        txtDirec.setBackground(new java.awt.Color(239, 200, 137));
        txtDirec.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        txtDirec.setForeground(new java.awt.Color(109, 30, 30));
        txtDirec.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        txtDirec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirecActionPerformed(evt);
            }
        });
        panelForm.add(txtDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 220, -1));

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
        panelForm.add(btnRegistrarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 250, 50));

        jPanel1.add(panelForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 600, 380));

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
        jPanel1.add(btnExitAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 530, 150, 40));

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
        jPanel1.add(btnLimpiarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private String generarIDEmp(){ // Metodo para generar un id para el empleado
        String prefijo = "EM";
        String nums = "0123456789";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(prefijo); 
        while (sb.length() < 8) {
            int index = rnd.nextInt(nums.length()); 
            sb.append(nums.charAt(index));
        }
        return sb.toString();
    }
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        MenuAdm Empleado = new MenuAdm(idEmpl);
        Empleado .setVisible(true);
        Empleado.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void txtApesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApesActionPerformed

    private void txtTelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelfActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtDirecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirecActionPerformed

    private void btnRegistrarCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarCliMouseEntered
        btnRegistrarCli.setBackground(new Color(24,183,177));
    }//GEN-LAST:event_btnRegistrarCliMouseEntered

    private void btnRegistrarCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarCliMouseExited
        btnRegistrarCli.setBackground(new Color(25,88,87));
    }//GEN-LAST:event_btnRegistrarCliMouseExited

    private void btnRegistrarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCliActionPerformed
        String nombre=(txtNom.getText());
        String apellidos=(txtApes.getText());
        // Validacion para saber si el empleado es mayor de edad
        Date f_nac=dateFNac.getDate();
        Calendar fNac=Calendar.getInstance();
        fNac.setTime(f_nac);
        Calendar fechaActual = Calendar.getInstance();
        int diferencia = fechaActual.get(Calendar.YEAR) - fNac.get(Calendar.YEAR);
        String dni=(txtDNI.getText().trim());
        String direccion=(txtDirec.getText());
        String telf=(txtTelf.getText());
        String correo_e=(txtCorreo.getText());
        // Validaciones de que no haya nada vacio y cumplan sus formatos
        if(nombre.isEmpty()|| apellidos.isEmpty() ||dni.isEmpty()||direccion.isEmpty()||correo_e.isEmpty()||telf.isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos","Nuevo Perú Bank - Advertencia",JOptionPane.WARNING_MESSAGE);
        }
        else if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            JOptionPane.showMessageDialog(null, "El nombre solo debe contener letras", "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
            return; // Terminar el proceso si no cumple
        }
        else if (!apellidos.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            JOptionPane.showMessageDialog(null, "Los Apellidos solo debe contener letras", "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
            return; // Terminar el proceso si no cumple
        }
        else if (!dni.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(null, "El DNI solo debe contener números", "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(diferencia<18){
            JOptionPane.showMessageDialog(null, "El Empleado debe ser mayor de 18 años", "Nuevo Perú Bank - Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (!telf.matches("\\d{9}")) { // Para esta logica el numero si es obligatorio en un empleado, se debe tener mas de un medio de comunicacion
            JOptionPane.showMessageDialog(null, "El Teléfono debe contener exactamente 9 números", "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
            return; // Detener la ejecución si el formato del teléfono es incorrecto
        }
        else if (!correo_e.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un correo electrónico válido", "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else {
            int confirm =JOptionPane.showConfirmDialog(null, "¿Confirmar datos ingresados?","Nuevo Perú Bank", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION){
                String idEmp=generarIDEmp(); // Almacenamos en una variable la id generada
                try(Connection conn = ConexionOracle.getConnection()){ 
                    // Hacemos la insercion de datos a la tabla empleado
                    String sql="INSERT INTO empleado (idempleado, nombres, apellidos, f_nac, dni, direccion, telf, correo_e, usuario, contraseña) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement ps=conn.prepareStatement(sql);
                    ps.setString(1,idEmp);
                    ps.setString(2, nombre);
                    ps.setString(3, apellidos);
                    ps.setDate(4,new java.sql.Date(f_nac.getTime()));
                    ps.setString(5, dni);
                    ps.setString(6, direccion);
                    ps.setString(7, telf);
                    ps.setString(8, correo_e);
                    // Mandamos vacios los campos usuario y contraseña para actualizarlos en la siguiente ventana
                    ps.setString(9, " ");
                    ps.setString(10, " ");
                    ps.executeUpdate();
                    System.out.println("Registro a Empleado exitoso");
                }
                catch(SQLException e){
                    JOptionPane.showMessageDialog(null, "Error al registrar el empleado: " + e.getMessage(), "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
                }
                // Validamos que el dni se haya introducido y lo mandamos como constructor a la siguiente ventana
                if (dni!=null && !dni.isEmpty()){
                    Credenciales cred=new Credenciales(idEmp);
                    cred.setVisible(true);
                    cred.setLocationRelativeTo(null);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Asegúrese de colocar los datos correctos " , "Nuevo Perú Bank", 2);
            }
        }
    }//GEN-LAST:event_btnRegistrarCliActionPerformed

    private void btnExitAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitAdminMouseEntered

    }//GEN-LAST:event_btnExitAdminMouseEntered

    private void btnExitAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitAdminMouseExited

    }//GEN-LAST:event_btnExitAdminMouseExited

    private void btnExitAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitAdminActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Desea Salir?","Nuevo Perú Bank",
            JOptionPane.YES_NO_OPTION ) ==JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_btnExitAdminActionPerformed

    private void btnLimpiarCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCliMouseEntered

    }//GEN-LAST:event_btnLimpiarCliMouseEntered

    private void btnLimpiarCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCliMouseExited

    }//GEN-LAST:event_btnLimpiarCliMouseExited

    private void btnLimpiarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCliActionPerformed

        txtNom.setText("");
        txtApes.setText("");
        txtDNI.setText("");
        txtTelf.setText("");
        txtDirec.setText("");
        txtCorreo.setText("");
        dateFNac.setDate(null);
    }//GEN-LAST:event_btnLimpiarCliActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExitAdmin;
    private javax.swing.JButton btnLimpiarCli;
    private javax.swing.JButton btnRegistrarCli;
    private javax.swing.JButton btnVolver;
    private com.toedter.calendar.JDateChooser dateFNac;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelApeCli;
    private javax.swing.JLabel labelCorreoCli;
    private javax.swing.JLabel labelDNI;
    private javax.swing.JLabel labelDirecCli;
    private javax.swing.JLabel labelFNacCli;
    private javax.swing.JLabel labelNom;
    private javax.swing.JLabel labelTelfCli;
    private javax.swing.JPanel panelForm;
    private javax.swing.JPanel panelTitleEmp;
    private javax.swing.JTextField txtApes;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDirec;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTelf;
    private javax.swing.JLabel txtTitleEmp;
    // End of variables declaration//GEN-END:variables
}
