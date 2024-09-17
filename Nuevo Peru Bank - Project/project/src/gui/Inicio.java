package gui;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Inicio extends javax.swing.JFrame {
    public Inicio() {
        initComponents();
        this.setTitle("Nuevo Perú Bank");
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logo2.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        panelLogo = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        labelSlo = new javax.swing.JLabel();
        panelElec = new javax.swing.JPanel();
        labelEleccion1 = new javax.swing.JLabel();
        btnElec1 = new javax.swing.JButton();
        btnElec2 = new javax.swing.JButton();
        labelLlama = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(226, 167, 84));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(20, 13, 32));
        jSeparator1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 540, 10));

        panelLogo.setBackground(new java.awt.Color(226, 167, 84));
        panelLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo.setFont(new java.awt.Font("Stencil", 1, 100)); // NOI18N
        labelLogo.setForeground(new java.awt.Color(109, 30, 30));
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo2.png"))); // NOI18N
        panelLogo.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 5, 161, 150));

        labelSlo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        labelSlo.setForeground(new java.awt.Color(109, 30, 30));
        labelSlo.setText("Creciendo juntos, impulsando el futuro de cada peruano");
        panelLogo.add(labelSlo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 147, 503, -1));

        jPanel1.add(panelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelElec.setBackground(new java.awt.Color(226, 167, 84));
        panelElec.setForeground(new java.awt.Color(70, 149, 149));
        panelElec.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelEleccion1.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        labelEleccion1.setForeground(new java.awt.Color(109, 30, 30));
        labelEleccion1.setText("Bienvenido al NPB, elija su método de Ingreso:");
        panelElec.add(labelEleccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 22, -1, -1));

        btnElec1.setBackground(new java.awt.Color(25, 88, 87));
        btnElec1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        btnElec1.setForeground(new java.awt.Color(226, 221, 216));
        btnElec1.setText("Ingresar como Administrador");
        btnElec1.setBorder(null);
        btnElec1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElec1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnElec1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnElec1MouseExited(evt);
            }
        });
        btnElec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElec1ActionPerformed(evt);
            }
        });
        panelElec.add(btnElec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 199, 256, 66));

        btnElec2.setBackground(new java.awt.Color(25, 88, 87));
        btnElec2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        btnElec2.setForeground(new java.awt.Color(226, 221, 216));
        btnElec2.setText("Ingresar como Cliente");
        btnElec2.setBorder(null);
        btnElec2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElec2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnElec2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnElec2MouseExited(evt);
            }
        });
        btnElec2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElec2ActionPerformed(evt);
            }
        });
        panelElec.add(btnElec2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 86, 254, 60));

        labelLlama.setForeground(new java.awt.Color(51, 51, 0));
        labelLlama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/llama2.png"))); // NOI18N
        panelElec.add(labelLlama, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 68, 224, 223));

        jPanel1.add(panelElec, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Default_Create_a_vibrant_pixel_art_image_for_a_Peruvian_bank_f_2.jpg"))); // NOI18N
        jPanel2.add(labelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -260, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 320, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnElec1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElec1MouseEntered
        btnElec1.setBackground(new Color(24,183,177));
    }//GEN-LAST:event_btnElec1MouseEntered

    private void btnElec1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElec1MouseExited
        btnElec1.setBackground(new Color(25,88,87));
    }//GEN-LAST:event_btnElec1MouseExited

    private void btnElec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElec1ActionPerformed
        LoginEmp login1 = new LoginEmp(); // Llamamos a la ventana de Login para los Empleados
        login1.setVisible(true); // Método para hacer visible una ventana
        login1.setLocationRelativeTo(null); // Método para colocar la ventana en el centro de la pantalla
        this.dispose(); // Cerramos la ventana actiual al abrir la nueva.
    }//GEN-LAST:event_btnElec1ActionPerformed

    private void btnElec2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElec2MouseEntered
        btnElec2.setBackground(new Color(24,183,177)); // Cuando el cursor está encima del botón sin hacer click hace un efecto hover cambiando de color
    }//GEN-LAST:event_btnElec2MouseEntered

    private void btnElec2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElec2MouseExited
        btnElec2.setBackground(new Color(25,88,87)); // Cuando el cursor vuelve a estar fuera del botón, el botón vuelve a su color original, se debe aplicar este método porque si no lo haces, el método "Entered" dejaría el color que asigna al tener el cursor en Hover
    }//GEN-LAST:event_btnElec2MouseExited

    private void btnElec2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElec2ActionPerformed
        LoginCli login2 = new LoginCli(); // Llamamos a la ventana de Login para Clientes
        login2.setVisible(true);
        login2.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnElec2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElec1;
    private javax.swing.JButton btnElec2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelEleccion1;
    private javax.swing.JLabel labelImg;
    private javax.swing.JLabel labelLlama;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelSlo;
    private javax.swing.JPanel panelElec;
    private javax.swing.JPanel panelLogo;
    // End of variables declaration//GEN-END:variables
}
