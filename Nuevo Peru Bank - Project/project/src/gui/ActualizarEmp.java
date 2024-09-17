package gui;

import javax.swing.JOptionPane;
import db.ConexionOracle;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;

// La logica en las ventanas que empiecen con "Actualizar" son similares
public class ActualizarEmp extends javax.swing.JFrame {
    private String idEmpl;
    public ActualizarEmp(String idEmp) {
        this.idEmpl=idEmp;
        this.setTitle("Nuevo Perú Bank - Actualizar Empleado");
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logo2.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelf = new javax.swing.JTextField();
        btnActTelf = new javax.swing.JButton();
        btnActNom = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnActDirec = new javax.swing.JButton();
        btnActCorreo = new javax.swing.JButton();
        txtDirec = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnLimpiarCli = new javax.swing.JButton();
        btnExitCli = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnActContra = new javax.swing.JButton();
        txtContra = new javax.swing.JPasswordField();
        btnVolver = new javax.swing.JButton();
        txtDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(226, 167, 84));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo.setFont(new java.awt.Font("Stencil", 1, 100)); // NOI18N
        labelLogo.setForeground(new java.awt.Color(109, 30, 30));
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo2.png"))); // NOI18N
        jPanel1.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 150, 150));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 82, 84));
        jLabel1.setText("Administrador");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(109, 30, 30));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        txtNom.setBackground(new java.awt.Color(239, 200, 137));
        txtNom.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        txtNom.setForeground(new java.awt.Color(109, 30, 30));
        txtNom.setToolTipText("");
        txtNom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        jPanel1.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 190, 40));

        jLabel4.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(109, 30, 30));
        jLabel4.setText("Teléfono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        txtTelf.setBackground(new java.awt.Color(239, 200, 137));
        txtTelf.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        txtTelf.setForeground(new java.awt.Color(109, 30, 30));
        txtTelf.setToolTipText("");
        txtTelf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        jPanel1.add(txtTelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 190, 40));

        btnActTelf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/check.png"))); // NOI18N
        btnActTelf.setBorder(null);
        btnActTelf.setContentAreaFilled(false);
        btnActTelf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActTelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActTelfActionPerformed(evt);
            }
        });
        jPanel1.add(btnActTelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, 40));

        btnActNom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/check.png"))); // NOI18N
        btnActNom.setBorder(null);
        btnActNom.setContentAreaFilled(false);
        btnActNom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActNomActionPerformed(evt);
            }
        });
        jPanel1.add(btnActNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, 40));

        jLabel6.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(109, 30, 30));
        jLabel6.setText("Correo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, -1, -1));

        txtCorreo.setBackground(new java.awt.Color(239, 200, 137));
        txtCorreo.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(109, 30, 30));
        txtCorreo.setToolTipText("");
        txtCorreo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 190, 40));

        btnActDirec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/check.png"))); // NOI18N
        btnActDirec.setBorder(null);
        btnActDirec.setContentAreaFilled(false);
        btnActDirec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActDirec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActDirecActionPerformed(evt);
            }
        });
        jPanel1.add(btnActDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 300, -1, 40));

        btnActCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/check.png"))); // NOI18N
        btnActCorreo.setBorder(null);
        btnActCorreo.setContentAreaFilled(false);
        btnActCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(btnActCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, -1, 40));

        txtDirec.setBackground(new java.awt.Color(239, 200, 137));
        txtDirec.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        txtDirec.setForeground(new java.awt.Color(109, 30, 30));
        txtDirec.setToolTipText("");
        txtDirec.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        jPanel1.add(txtDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 190, 40));

        jLabel5.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(109, 30, 30));
        jLabel5.setText("Dirección");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, -1, -1));

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
        jPanel1.add(btnLimpiarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 150, 40));

        btnExitCli.setBackground(new java.awt.Color(25, 88, 87));
        btnExitCli.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        btnExitCli.setForeground(new java.awt.Color(25, 88, 87));
        btnExitCli.setText("Salir");
        btnExitCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(25, 88, 87), 3, true));
        btnExitCli.setContentAreaFilled(false);
        btnExitCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExitCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitCliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitCliMouseExited(evt);
            }
        });
        btnExitCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitCliActionPerformed(evt);
            }
        });
        jPanel1.add(btnExitCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 150, 40));

        jLabel7.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(109, 30, 30));
        jLabel7.setText("Contraseña");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        btnActContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/check.png"))); // NOI18N
        btnActContra.setBorder(null);
        btnActContra.setContentAreaFilled(false);
        btnActContra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActContraActionPerformed(evt);
            }
        });
        jPanel1.add(btnActContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, 40));

        txtContra.setBackground(new java.awt.Color(239, 200, 137));
        txtContra.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        txtContra.setForeground(new java.awt.Color(109, 30, 30));
        txtContra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        jPanel1.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 190, 40));

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

        txtDni.setBackground(new java.awt.Color(226, 167, 84));
        txtDni.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        txtDni.setForeground(new java.awt.Color(25, 88, 87));
        txtDni.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(25, 88, 87)));
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 240, 30));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(109, 30, 30));
        jLabel2.setText("Ingrese el DNI  de la persona y clickee el check  para actualizar los datos respectivos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 750, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCliMouseEntered

    }//GEN-LAST:event_btnLimpiarCliMouseEntered

    private void btnLimpiarCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCliMouseExited

    }//GEN-LAST:event_btnLimpiarCliMouseExited

    private void btnLimpiarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCliActionPerformed
        txtContra.setText("");
        txtNom.setText("");
        txtTelf.setText("");
        txtDirec.setText("");
        txtCorreo.setText("");
    }//GEN-LAST:event_btnLimpiarCliActionPerformed

    private void btnExitCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitCliMouseEntered

    }//GEN-LAST:event_btnExitCliMouseEntered

    private void btnExitCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitCliMouseExited

    }//GEN-LAST:event_btnExitCliMouseExited

    private void btnExitCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitCliActionPerformed
        // boton para salir de la aplicacion
        if (JOptionPane.showConfirmDialog(null, "¿Desea Salir?","Nuevo Perú Bank",
            JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE ) ==JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_btnExitCliActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // boton para volver a la ventana anterior
        this.dispose();
        MenuAdm ini = new MenuAdm(idEmpl);
        ini.setVisible(true);
        ini.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnActNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActNomActionPerformed
        // Para cada campo y boton el procedimiento es el mismo, asi que lo explicaré solo aqui
        
        // primero obtenemos lo que se ingrese en los campos respectivos, el dni es primordial ya que lo usaremos como condicional, lo que se ingrese en el nombre será el valor a actualizar
        String dni=txtDni.getText(); // almacenamos ambos campos
        String nombre=txtNom.getText();
        // validamos que el dni no este vacio, ya que es lo mas importante y cumpla con su formato
        if(dni.isEmpty()){ 
               JOptionPane.showMessageDialog(null, "Introduzca su DNI", "Nuevo Perú Bank - Error", 2); 
        }
        else if (!dni.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(null, "El DNI solo debe contener números", "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Ahora procedemos a validar que el campo que deseamos actualizar, en este caso el nombre, no esté vacio y cumpla su formato
        else if(nombre.isEmpty()){
               JOptionPane.showMessageDialog(null, "Introduzca su nombre", "Nuevo Perú Bank - Error", 2); 
        }
        else if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
              JOptionPane.showMessageDialog(null, "El nombre solo debe contener letras", "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
              return; // Terminar el proceso si no cumple
        }
        else{ // Si se cumplen las condiciones se actualizará SOLO el campo que hayas ingresado, cuando llenes algun campo y clickees el boton de check a su lado, se actualizará solo esa fila
                try(Connection conn=ConexionOracle.getConnection()){
                 String sql="UPDATE  empleado SET nombres=? WHERE dni=?"; // Actualizamos el campo seleccionado usando el dni ingresado primordialmente como condicion
                 PreparedStatement ps=conn.prepareStatement(sql);
                 ps.setString(1,nombre);
                 ps.setString(2, dni);
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Actualización exitosa", "Nuevo Perú Bank",1);
             }  
             catch(SQLException e){
                 JOptionPane.showMessageDialog(null, "No se completó el registro", "Nuevo Perú Bank - Error",JOptionPane.ERROR_MESSAGE);
             }
         }
        // este mismo proceso se repite en todos los campos siguientes:)
    }//GEN-LAST:event_btnActNomActionPerformed

    private void btnActTelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActTelfActionPerformed
        String dni=txtDni.getText();
        String telf=txtTelf.getText();
        if(dni.isEmpty()){
               JOptionPane.showMessageDialog(null, "Introduzca su DNI", "Nuevo Perú Bank - Error", 2); 
        }
        else if (!dni.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(null, "El DNI solo debe contener números", "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(telf.isEmpty()){
               JOptionPane.showMessageDialog(null, "Introduzca su teléfono", "Nuevo Perú Bank - Error", 2); 
        }
        else if (!telf.matches("\\d{9}")) {
            JOptionPane.showMessageDialog(null, "El Teléfono debe contener exactamente 9 números", "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
            return; // Detener la ejecución si el formato del teléfono es incorrecto
        }
        else{
                try(Connection conn=ConexionOracle.getConnection()){
                 String sql="UPDATE  empleado SET telf=? WHERE dni=?";
                 PreparedStatement ps=conn.prepareStatement(sql);
                 ps.setString(1,telf);
                 ps.setString(2, dni);
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Actualización exitosa", "Nuevo Perú Bank",1);
             }  
             catch(SQLException e){
                 JOptionPane.showMessageDialog(null, "No se completó el registro", "Nuevo Perú Bank - Error",JOptionPane.ERROR_MESSAGE);
             }
         }
    }//GEN-LAST:event_btnActTelfActionPerformed

    private void btnActContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActContraActionPerformed
        String dni=txtDni.getText();
        String contraseña=txtContra.getText();
        if(dni.isEmpty()){
               JOptionPane.showMessageDialog(null, "Introduzca su DNI", "Nuevo Perú Bank - Error", 2); 
        }
        else if (!dni.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(null, "El DNI solo debe contener números", "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(contraseña.isEmpty()){
               JOptionPane.showMessageDialog(null, "Introduzca su contraseña", "Nuevo Perú Bank - Error", 2); 
        }
        else if(contraseña.length()<8){
           JOptionPane.showMessageDialog(null, "La contraseña tiene que ser, como mínimo de 8 dígitos","Nuevo Perú Bank - Error",JOptionPane.ERROR_MESSAGE);
       }
        else{
                try(Connection conn=ConexionOracle.getConnection()){
                 String sql="UPDATE  empleado SET contraseña=? WHERE dni=?";
                 PreparedStatement ps=conn.prepareStatement(sql);
                 ps.setString(1,contraseña);
                 ps.setString(2, dni);
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Actualización exitosa", "Nuevo Perú Bank",1);
             }  
             catch(SQLException e){
                 JOptionPane.showMessageDialog(null, "No se completó el registro", "Nuevo Perú Bank - Error",JOptionPane.ERROR_MESSAGE);
             }
         }
    }//GEN-LAST:event_btnActContraActionPerformed

    private void btnActCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActCorreoActionPerformed
        String dni=txtDni.getText();
        String correo=txtCorreo.getText();
        if(dni.isEmpty()){
               JOptionPane.showMessageDialog(null, "Introduzca su DNI", "Nuevo Perú Bank - Error", 2); 
        }
        else if (!dni.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(null, "El DNI solo debe contener números", "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(correo.isEmpty()){
               JOptionPane.showMessageDialog(null, "Introduzca su correo", "Nuevo Perú Bank - Error", 2); 
        }
        else if (!correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un correo electrónico válido", "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
                try(Connection conn=ConexionOracle.getConnection()){
                 String sql="UPDATE  empleado SET correo_e=? WHERE dni=?";
                 PreparedStatement ps=conn.prepareStatement(sql);
                 ps.setString(1,correo);
                 ps.setString(2, dni);
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Actualización exitosa", "Nuevo Perú Bank",1);
             }  
             catch(SQLException e){
                 JOptionPane.showMessageDialog(null, "No se completó el registro", "Nuevo Perú Bank - Error",JOptionPane.ERROR_MESSAGE);
             }
         }
    }//GEN-LAST:event_btnActCorreoActionPerformed

    private void btnActDirecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActDirecActionPerformed
        String dni=txtDni.getText();
        String direccion=txtDirec.getText();
        if(dni.isEmpty()){
               JOptionPane.showMessageDialog(null, "Introduzca su DNI", "Nuevo Perú Bank - Error", 2); 
        }
        else if (!dni.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(null, "El DNI solo debe contener números", "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(direccion.isEmpty()){
               JOptionPane.showMessageDialog(null, "Introduzca su dirección", "Nuevo Perú Bank - Error", 2); 
        }
        else{
                try(Connection conn=ConexionOracle.getConnection()){
                 String sql="UPDATE  empleado SET direccion=? WHERE dni=?";
                 PreparedStatement ps=conn.prepareStatement(sql);
                 ps.setString(1,direccion);
                 ps.setString(2, dni);
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Actualización exitosa", "Nuevo Perú Bank",1);
             }  
             catch(SQLException e){
                 JOptionPane.showMessageDialog(null, "No se completó el registro", "Nuevo Perú Bank - Error",JOptionPane.ERROR_MESSAGE);
             }
         }
    }//GEN-LAST:event_btnActDirecActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActContra;
    private javax.swing.JButton btnActCorreo;
    private javax.swing.JButton btnActDirec;
    private javax.swing.JButton btnActNom;
    private javax.swing.JButton btnActTelf;
    private javax.swing.JButton btnExitCli;
    private javax.swing.JButton btnLimpiarCli;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDirec;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTelf;
    // End of variables declaration//GEN-END:variables
}
