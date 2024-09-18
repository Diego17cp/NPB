package gui;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import db.ConexionOracle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Contraseña extends javax.swing.JFrame {
    private String dni; //declaramos el dni para almacenar el que trajimos del constructor
    // Llamamos a las imagenes de ojos para cifrar la contraseña y los almacenamos
    ImageIcon eye = new ImageIcon(getClass().getResource("/resources/eye.png"));
    ImageIcon eyeslash = new ImageIcon(getClass().getResource("/resources/eye-slash.png"));
    private boolean novisible=true; // declaramos la variable que no deberia permitir ver la contraseña 
    public Contraseña(String dni) {
        initComponents();
        this.setTitle("Contraseña - Nuevo Perú Bank");
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logo2.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
        this.dni=dni;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMainContra = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        labelContra = new javax.swing.JLabel();
        pswContra = new javax.swing.JPasswordField();
        btnAcceptContra = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMainContra.setBackground(new java.awt.Color(226, 167, 84));
        panelMainContra.setLayout(null);

        labelLogo.setFont(new java.awt.Font("Stencil", 1, 100)); // NOI18N
        labelLogo.setForeground(new java.awt.Color(109, 30, 30));
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo2.png"))); // NOI18N
        panelMainContra.add(labelLogo);
        labelLogo.setBounds(250, 20, 160, 140);

        labelContra.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        labelContra.setForeground(new java.awt.Color(109, 30, 30));
        labelContra.setText("Digite su contraseña:");
        panelMainContra.add(labelContra);
        labelContra.setBounds(60, 170, 238, 29);

        pswContra.setBackground(new java.awt.Color(239, 200, 137));
        pswContra.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        pswContra.setForeground(new java.awt.Color(109, 30, 30));
        pswContra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        panelMainContra.add(pswContra);
        pswContra.setBounds(320, 170, 240, 40);

        btnAcceptContra.setBackground(new java.awt.Color(13, 82, 84));
        btnAcceptContra.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        btnAcceptContra.setForeground(new java.awt.Color(226, 221, 216));
        btnAcceptContra.setText("Aceptar");
        btnAcceptContra.setBorder(null);
        btnAcceptContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAcceptContraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAcceptContraMouseExited(evt);
            }
        });
        btnAcceptContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptContraActionPerformed(evt);
            }
        });
        panelMainContra.add(btnAcceptContra);
        btnAcceptContra.setBounds(240, 250, 200, 50);

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/eye-slash.png"))); // NOI18N
        btnVer.setBorder(null);
        btnVer.setContentAreaFilled(false);
        btnVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        panelMainContra.add(btnVer);
        btnVer.setBounds(580, 180, 30, 24);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMainContra, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMainContra, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptContraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcceptContraMouseEntered
        btnAcceptContra.setBackground(new Color(24,183,177));
    }//GEN-LAST:event_btnAcceptContraMouseEntered

    private void btnAcceptContraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcceptContraMouseExited
       btnAcceptContra.setBackground(new Color(25,88,87));
    }//GEN-LAST:event_btnAcceptContraMouseExited

    private void btnAcceptContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptContraActionPerformed
       String contraseña=pswContra.getText(); // obtenemos la contraseña que se ingresa
       if(contraseña.isEmpty()){ // Si la contraseña esta vacia mandamos un mensaje de error
           JOptionPane.showMessageDialog(null, "La contraseña no puede estar vacía","Nuevo Perú Bank - Error",JOptionPane.ERROR_MESSAGE);
       }
       else if(contraseña.length()<8){ // Aseguramos que la contraseña no sea menor de 8 digitos
           JOptionPane.showMessageDialog(null, "La contraseña tiene que ser, como mínimo de 8 dígitos","Nuevo Perú Bank - Error",JOptionPane.ERROR_MESSAGE);
       }
       else {
           Object[] options = {"Confirmar", "Cancelar"};
           int confirm = JOptionPane.showOptionDialog(null,  "Confirme la contraseña", "Nuevo Perú Bank", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
           if (confirm == JOptionPane.YES_OPTION) {
               pswContra.setText(""); // Si se confirma la contraseña la limpiamos para mantener seguridad y lo actualizamos en la tabla usando el dni traido del constructor como condicional
             try(Connection conn=ConexionOracle.getConnection()){
                 String sql="UPDATE  cliente SET contraseña=? WHERE dni=?";
                 PreparedStatement ps=conn.prepareStatement(sql);
                 ps.setString(1, contraseña);
                 ps.setString(2, dni);
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Registro exitoso", "Nuevo Perú Bank",1);
                 this.dispose();
             }  
             catch(SQLException e){
                 JOptionPane.showMessageDialog(null, "No se completó el registro", "Nuevo Perú Bank - Error",JOptionPane.ERROR_MESSAGE);
             }
            }
           else {
               JOptionPane.showConfirmDialog(null, "Reintente la Contraseñe","Nuevo Perú Bank", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
               pswContra.setText("");
           }
        }
    }//GEN-LAST:event_btnAcceptContraActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        novisible=!novisible; // Pasamos a lo contrario la variable boolean haciendo que no visible sea falso
        if(novisible){ // si los elementos no son visibles deberia cambiar el icono a un ojo y cifrar la contraseña
            btnVer.setIcon(eye);
            pswContra.setEchoChar('*');
        }
        else { // De lo contario si se vera todo con normalidad
            btnVer.setIcon(eyeslash);
            pswContra.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_btnVerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptContra;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel labelContra;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JPanel panelMainContra;
    private javax.swing.JPasswordField pswContra;
    // End of variables declaration//GEN-END:variables
}
