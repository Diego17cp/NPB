package gui;
// @author Diego17
import db.ConexionOracle;
import java.awt.Color;
import java.awt.Image;
import java.awt.print.PrinterException; // Usado para manejar errores al intentar imprimir 
import java.util.logging.Level; // Se usa para identificar el nivel del error que se podria presentar 
import java.util.logging.Logger; // Usado para generar un mensaje por si algo falla en la impresion
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat; // Formateador de fechas del JDateChooser
import java.util.Calendar; // Objeto para traer una fecha especifica con sus elementos
import java.util.Date; // Objeto para traer una fecha
import java.sql.SQLException;
import java.util.Locale; // Objeto para asignar a la fecha un formato de una region particular
import java.util.Random; // Objeto para generar numeros de forma aleatoria
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegistroCliente extends javax.swing.JFrame {
    private String idEmpl; // Asignamos el id del empleado traido del constructor
    public RegistroCliente(String idEmp) {
        initComponents();
        this.setTitle("Nuevo Perú Bank - Registrar Cliente");
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logo2.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
        this.idEmpl=idEmp;
    }
    private String generarIDCli(){ // Metodo para generar id para el cliente que se va a crear mas adelante
        String prefijo = "CL";
        String nums = "0123456789";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(prefijo); 
        while (sb.length() < 8) {
            int index = rnd.nextInt(nums.length()); 
            sb.append(nums.charAt(index));
        }
        return sb.toString();
    }
    private String generarIDCu(){ // Metodo para generar id para la cuenta que se va a crear mas adelante
        String prefijo = "CU";
        String nums = "0123456789";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(prefijo); 
        while (sb.length() < 8) {
            int index = rnd.nextInt(nums.length()); 
            sb.append(nums.charAt(index));
        }
        return sb.toString();
    }
    private String numCu(){ // Metodo para generar un numero de cuenta que se va a crear mas adelante
        String nums = "0123456789";
        Random rnd = new Random();
        StringBuilder nc = new StringBuilder(); 
        while (nc.length() < 15) {
            int index = rnd.nextInt(nums.length()); 
            nc.append(nums.charAt(index));
        }
        return nc.toString();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMainEmp = new javax.swing.JPanel();
        panelTitleEmp = new javax.swing.JPanel();
        txtTitleEmp = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        panelRegistroTitleEmp = new javax.swing.JPanel();
        txtRegistroTitleEmp = new javax.swing.JLabel();
        panelRegistroEmp = new javax.swing.JPanel();
        labelTipoCuenta = new javax.swing.JLabel();
        labelNomCli = new javax.swing.JLabel();
        labelApeCli = new javax.swing.JLabel();
        labelFNacCli = new javax.swing.JLabel();
        labelDNICli = new javax.swing.JLabel();
        labelDirecCli = new javax.swing.JLabel();
        labelTelfCli = new javax.swing.JLabel();
        labelCorreoCli = new javax.swing.JLabel();
        txtNomCli = new javax.swing.JTextField();
        txtApeCli = new javax.swing.JTextField();
        dateFNacCli = new com.toedter.calendar.JDateChooser();
        txtDNICli = new javax.swing.JTextField();
        txtDirecCli = new javax.swing.JTextField();
        txtTelfCli = new javax.swing.JTextField();
        txtCorreoCli = new javax.swing.JTextField();
        btnRegistrarCli = new javax.swing.JButton();
        btnExitCli = new javax.swing.JButton();
        btnLimpiarCli = new javax.swing.JButton();
        btnPrintCli = new javax.swing.JButton();
        combTipoCuenta = new javax.swing.JComboBox<>();
        panelBoleta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaBoleta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMainEmp.setBackground(new java.awt.Color(226, 167, 84));
        panelMainEmp.setLayout(null);

        panelTitleEmp.setBackground(new java.awt.Color(13, 82, 84));
        panelTitleEmp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitleEmp.setBackground(new java.awt.Color(13, 82, 84));
        txtTitleEmp.setFont(new java.awt.Font("Stencil", 1, 80)); // NOI18N
        txtTitleEmp.setForeground(new java.awt.Color(24, 183, 177));
        txtTitleEmp.setText("administrador");
        panelTitleEmp.add(txtTitleEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 17, 703, -1));

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

        panelMainEmp.add(panelTitleEmp);
        panelTitleEmp.setBounds(0, 0, 1150, 98);

        panelRegistroTitleEmp.setBackground(new java.awt.Color(13, 82, 84));
        panelRegistroTitleEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelRegistroTitleEmp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRegistroTitleEmp.setBackground(new java.awt.Color(13, 82, 84));
        txtRegistroTitleEmp.setFont(new java.awt.Font("Stencil", 1, 60)); // NOI18N
        txtRegistroTitleEmp.setForeground(new java.awt.Color(24, 183, 177));
        txtRegistroTitleEmp.setText("registrar cliente");
        panelRegistroTitleEmp.add(txtRegistroTitleEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 26, 686, -1));

        panelMainEmp.add(panelRegistroTitleEmp);
        panelRegistroTitleEmp.setBounds(0, 90, 740, 94);

        panelRegistroEmp.setBackground(new java.awt.Color(226, 167, 84));
        panelRegistroEmp.setLayout(null);

        labelTipoCuenta.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        labelTipoCuenta.setForeground(new java.awt.Color(109, 30, 30));
        labelTipoCuenta.setText("Tipo de Cuenta:");
        panelRegistroEmp.add(labelTipoCuenta);
        labelTipoCuenta.setBounds(40, 10, 200, 23);

        labelNomCli.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        labelNomCli.setForeground(new java.awt.Color(109, 30, 30));
        labelNomCli.setText("Nombres:");
        panelRegistroEmp.add(labelNomCli);
        labelNomCli.setBounds(40, 200, 160, 23);

        labelApeCli.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        labelApeCli.setForeground(new java.awt.Color(109, 30, 30));
        labelApeCli.setText("Apellidos:");
        panelRegistroEmp.add(labelApeCli);
        labelApeCli.setBounds(40, 290, 170, 23);

        labelFNacCli.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        labelFNacCli.setForeground(new java.awt.Color(109, 30, 30));
        labelFNacCli.setText("Fecha de Nacimiento:");
        panelRegistroEmp.add(labelFNacCli);
        labelFNacCli.setBounds(370, 10, 230, 23);

        labelDNICli.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        labelDNICli.setForeground(new java.awt.Color(109, 30, 30));
        labelDNICli.setText("DNI:");
        panelRegistroEmp.add(labelDNICli);
        labelDNICli.setBounds(40, 100, 80, 23);

        labelDirecCli.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        labelDirecCli.setForeground(new java.awt.Color(109, 30, 30));
        labelDirecCli.setText("Dirección:");
        panelRegistroEmp.add(labelDirecCli);
        labelDirecCli.setBounds(370, 100, 200, 23);

        labelTelfCli.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        labelTelfCli.setForeground(new java.awt.Color(109, 30, 30));
        labelTelfCli.setText("Teléfono:");
        panelRegistroEmp.add(labelTelfCli);
        labelTelfCli.setBounds(370, 200, 160, 23);

        labelCorreoCli.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        labelCorreoCli.setForeground(new java.awt.Color(109, 30, 30));
        labelCorreoCli.setText("Correo Electrónico:");
        panelRegistroEmp.add(labelCorreoCli);
        labelCorreoCli.setBounds(370, 290, 250, 23);

        txtNomCli.setBackground(new java.awt.Color(239, 200, 137));
        txtNomCli.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        txtNomCli.setForeground(new java.awt.Color(109, 30, 30));
        txtNomCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        txtNomCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomCliActionPerformed(evt);
            }
        });
        panelRegistroEmp.add(txtNomCli);
        txtNomCli.setBounds(60, 230, 253, 35);

        txtApeCli.setBackground(new java.awt.Color(239, 200, 137));
        txtApeCli.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        txtApeCli.setForeground(new java.awt.Color(109, 30, 30));
        txtApeCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        txtApeCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApeCliActionPerformed(evt);
            }
        });
        panelRegistroEmp.add(txtApeCli);
        txtApeCli.setBounds(60, 330, 253, 35);

        dateFNacCli.setBackground(new java.awt.Color(239, 200, 137));
        dateFNacCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        dateFNacCli.setForeground(new java.awt.Color(109, 30, 30));
        panelRegistroEmp.add(dateFNacCli);
        dateFNacCli.setBounds(390, 40, 243, 35);

        txtDNICli.setBackground(new java.awt.Color(239, 200, 137));
        txtDNICli.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        txtDNICli.setForeground(new java.awt.Color(109, 30, 30));
        txtDNICli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        txtDNICli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNICliActionPerformed(evt);
            }
        });
        panelRegistroEmp.add(txtDNICli);
        txtDNICli.setBounds(60, 130, 253, 35);

        txtDirecCli.setBackground(new java.awt.Color(239, 200, 137));
        txtDirecCli.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        txtDirecCli.setForeground(new java.awt.Color(109, 30, 30));
        txtDirecCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        txtDirecCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirecCliActionPerformed(evt);
            }
        });
        panelRegistroEmp.add(txtDirecCli);
        txtDirecCli.setBounds(390, 130, 253, 35);

        txtTelfCli.setBackground(new java.awt.Color(239, 200, 137));
        txtTelfCli.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        txtTelfCli.setForeground(new java.awt.Color(109, 30, 30));
        txtTelfCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        txtTelfCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelfCliActionPerformed(evt);
            }
        });
        panelRegistroEmp.add(txtTelfCli);
        txtTelfCli.setBounds(390, 230, 253, 35);

        txtCorreoCli.setBackground(new java.awt.Color(239, 200, 137));
        txtCorreoCli.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        txtCorreoCli.setForeground(new java.awt.Color(109, 30, 30));
        txtCorreoCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        txtCorreoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoCliActionPerformed(evt);
            }
        });
        panelRegistroEmp.add(txtCorreoCli);
        txtCorreoCli.setBounds(390, 330, 253, 35);

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
        panelRegistroEmp.add(btnRegistrarCli);
        btnRegistrarCli.setBounds(17, 398, 145, 49);

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
        panelRegistroEmp.add(btnExitCli);
        btnExitCli.setBounds(405, 398, 129, 49);

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
        panelRegistroEmp.add(btnLimpiarCli);
        btnLimpiarCli.setBounds(214, 398, 136, 49);

        btnPrintCli.setBackground(new java.awt.Color(25, 88, 87));
        btnPrintCli.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        btnPrintCli.setForeground(new java.awt.Color(25, 88, 87));
        btnPrintCli.setText("Imprimir");
        btnPrintCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(25, 88, 87), 3, true));
        btnPrintCli.setContentAreaFilled(false);
        btnPrintCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrintCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrintCliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrintCliMouseExited(evt);
            }
        });
        btnPrintCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintCliActionPerformed(evt);
            }
        });
        panelRegistroEmp.add(btnPrintCli);
        btnPrintCli.setBounds(584, 398, 129, 49);

        combTipoCuenta.setBackground(new java.awt.Color(239, 200, 137));
        combTipoCuenta.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        combTipoCuenta.setForeground(new java.awt.Color(109, 30, 30));
        combTipoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Debito", "Credito" }));
        combTipoCuenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        panelRegistroEmp.add(combTipoCuenta);
        combTipoCuenta.setBounds(60, 40, 253, 39);

        panelMainEmp.add(panelRegistroEmp);
        panelRegistroEmp.setBounds(10, 210, 730, 460);

        panelBoleta.setBackground(new java.awt.Color(226, 167, 84));

        txtareaBoleta.setBackground(new java.awt.Color(239, 200, 137));
        txtareaBoleta.setColumns(20);
        txtareaBoleta.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtareaBoleta.setForeground(new java.awt.Color(13, 82, 84));
        txtareaBoleta.setRows(5);
        jScrollPane1.setViewportView(txtareaBoleta);

        javax.swing.GroupLayout panelBoletaLayout = new javax.swing.GroupLayout(panelBoleta);
        panelBoleta.setLayout(panelBoletaLayout);
        panelBoletaLayout.setHorizontalGroup(
            panelBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelBoletaLayout.setVerticalGroup(
            panelBoletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelMainEmp.add(panelBoleta);
        panelBoleta.setBounds(750, 120, 380, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMainEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 1144, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMainEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintCliActionPerformed
        try {
            txtareaBoleta.print(); // Metodo para mandar a una impresora e imprimir el contenido, tambien se descarga en PDF
        } catch (PrinterException ex) {
            Logger.getLogger(RegistroCliente.class.getName()).log(Level.SEVERE, null, ex); // Si algo sale mal muestra el mensaje de error y su nivel
        }
    }//GEN-LAST:event_btnPrintCliActionPerformed

    private void txtCorreoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoCliActionPerformed

    private void txtTelfCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelfCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelfCliActionPerformed

    private void txtDirecCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirecCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirecCliActionPerformed

    private void txtDNICliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNICliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNICliActionPerformed

    private void txtApeCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApeCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApeCliActionPerformed

    private void txtNomCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomCliActionPerformed

    private void btnExitCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitCliActionPerformed

        if (JOptionPane.showConfirmDialog(null, "¿Desea Salir?","Nuevo Perú Bank",
               JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE ) ==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitCliActionPerformed

    private void btnLimpiarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCliActionPerformed

        txtNomCli.setText("");
        txtApeCli.setText("");
        txtDNICli.setText("");
        txtTelfCli.setText("");
        txtDirecCli.setText("");
        txtCorreoCli.setText("");
       dateFNacCli.setDate(null);
       txtareaBoleta.setText("");
    }//GEN-LAST:event_btnLimpiarCliActionPerformed

    private void btnRegistrarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCliActionPerformed
       String tipoCuenta=(String)(combTipoCuenta.getSelectedItem()); // Almacenamos el valor de el item que se selecciona del ComboBox
       String nombres=(txtNomCli.getText());
       String apellidos=(txtApeCli.getText());
       Date f_nac=dateFNacCli.getDate(); // Obtenemos la fecha del Date Chooser
       Calendar fNac=Calendar.getInstance(); // Creamos un objeto Calendar para obtener la fecha actual
       fNac.setTime(f_nac); // Cambiamos el valor de fecha al objeto Calendar al valor de la fecha de nacimiento seleccionada
       Calendar fechaActual = Calendar.getInstance(); // Obtenemos un nuevo objeto con la fecha actual
       int diferencia = fechaActual.get(Calendar.YEAR) - fNac.get(Calendar.YEAR); // Variable para calcular la fecha actual y la de nacimiento y verificar si el cliente es mayor de edad.
       String dni=(txtDNICli.getText().trim());
       String direccion=(txtDirecCli.getText());
       String telf=txtTelfCli.getText();
       String correo_e=(txtCorreoCli.getText());
       String numCu=numCu();
       if(nombres.isEmpty()|| apellidos.isEmpty() ||dni.isEmpty()||direccion.isEmpty()||correo_e.isEmpty()||f_nac==null){ // Verificamos que no hayan campos vacíos, puede suceder un error por la conversion anterior con los Date y Calendar, solo ingrese una fecha y todo funcionará bien
           JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos","Nuevo Perú Bank - Advertencia",JOptionPane.WARNING_MESSAGE);
       }
       else if (!nombres.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) { // Metodo regex que verifica que los nombres solo contengan letras
           JOptionPane.showMessageDialog(null, "El nombre solo debe contener letras", "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
           return; // Terminar el proceso si no cumple
       }
       else if (!apellidos.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) { // Metodo regex que verifica que los nombres solo contengan letras
           JOptionPane.showMessageDialog(null, "Los Apellidos solo debe contener letras", "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
           return; // Terminar el proceso si no cumple
       }
       else if (!dni.matches("\\d{8}")) { // Metodo regex para verificar que el DNI solo contenga numeros y tenga una longitud de 8, ni mas ni menos
           JOptionPane.showMessageDialog(null, "El DNI solo debe contener números", "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
           return;
       }
       else if(diferencia<18){ // Si la diferencia que calculamos anteriormente es menor a 18 no podrá crearse la cuenta
           JOptionPane.showMessageDialog(null, "El cliente debe ser mayor de 18 años", "Nuevo Perú Bank - Advertencia", JOptionPane.WARNING_MESSAGE);
           return;
       }
       else if (!correo_e.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) { // Metodo regex para verificar que se ingrese un correo con formato específico, lo primero entre corchetes representa el inicio de la linea, puede contener letras, numeros o simbolos; despues debe haber obligatoriamente un "@" y al final de la cadena debe tener lo mismo que al principio, todo eso se debe cumplir una vez.
           JOptionPane.showMessageDialog(null, "Por favor, ingrese un correo electrónico válido", "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
           return;
       }
       else if (telf==null||telf.trim().isEmpty()){ // Validamos que si el telefono está vacio o es nulo
           // Mensaje de confirmacion para saber si se cuenta con un telefono o no, ya que no es obligatorio
           int telfconf = JOptionPane.showConfirmDialog(null,  "¿Cuenta con algún teléfono?", "Nuevo Perú Bank", JOptionPane.YES_NO_OPTION);
           if (telfconf == JOptionPane.YES_OPTION) { // Si se marca que sí se cuenta con un telefono se termina la ejecucion y manda a ingresar un numero
             JOptionPane.showMessageDialog(null, "Por favor, Ingrese su Telefono","Nuevo Perú Bank - Advertencia",JOptionPane.WARNING_MESSAGE);
             return;
           }
           else { // Si se selecciona que no se tiene un numero, el campo se manda como null y deberia mandar la boleta pero no funciona:(
               telf=null;
               JOptionPane.showMessageDialog(null, "Su método de comunicación será a través de correo","Nuevo Perú Bank",JOptionPane.INFORMATION_MESSAGE);
           }
       }
       else if (!telf.matches("\\d{9}") && telf!=null) { // En caso de que sí se mande un telefono como campo debe cumplir un formato de solo numeros con una longitud de 9
               JOptionPane.showMessageDialog(null, "El Teléfono debe contener exactamente 9 números", "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
               return; // Detener la ejecución si el formato del teléfono es incorrecto
          }
       else { // Si todas las condiciones se cumplen debe se creará la boleta con normalidad
           txtareaBoleta.setText(""); // Empezamos formateando el textArea a vacio para que se pueda trabajar en el
           SimpleDateFormat formato = new SimpleDateFormat("d/M/yyyy", new Locale("es", "ES")); // Formateamos la fecha que se obtuvo a una local que sería DD-MM-YYYY
           String fechaNac = (f_nac != null) ? formato.format(f_nac) : "Fecha incorrecta"; // Operador terniario para mostrar que la fecha no es valida siempre y cuando sea null, por la conversion anterior este bloque no se podrá ejecutar
           txtareaBoleta.append("\t\n\t\tNuevo Perú Bank S.A\n"  // Usamos el metodo append para poder ingresar texto en la boleta (\t es una tabulacion y \n es un salto de linea)
                   + "\t\t      Chiclayo\n" 
                   + "  -----------------------------------------------"
                   + "\n  Tipo de Cuenta:\t" + "   "+tipoCuenta+"\n"
                   + "\n  Nombres del Cliente:\t" + "   "+nombres+"\n"
                   + "\n  Apellidos del Cliente:" + "   "+apellidos+"\n"
                   + "\n  Fecha de Nacimiento:\t" + "   "+fechaNac+"\n"
                   + "\n  DNI del Cliente:\t" + "   "+dni +"\n"
                   + "\n  Dirección del Cliente:"+ "   "+direccion +"\n"
                   + "\n  Teléfono:\t\t" + ((telf !=null) ? "   "+telf : "No proporcionado") +"\n" // Operador terniario para saber si telefono no se convirtio en null, si el telefono esta vacio deberia arrojar el mensaje pero no logro hallar una solucion
                   + "\n  Correo:\t\t" + "   "+correo_e+"\n"
                   + "\n  Num. Cuenta: "
                   + "\n  "+numCu+"\n"
                   + "  -----------------------------------------------\n"
                   + "\n   Recuerde que para ingresar a su cuenta deberá\n"
                   + "      poner su Nro. de Dni y su Contraseña que\n"
                   + " \t\tcreará a continuación:\n"
                   + "\n  -----------------------------------------------\n"
                   + "\n\t    Gracias por su preferencia\n"
                   + "\t\t    Vuelva pronto\n"
                   + "\tVisite: https://github.com/Diego17cp \n"); // Follow y estrella al repo;)
           // confirmamos que los datos ingresados sean correctos
           int confirm = JOptionPane.showConfirmDialog(null, "¿Confirma los datos ingresados?","Nuevo Perú Bank", JOptionPane.YES_NO_OPTION);
           if (confirm == JOptionPane.YES_OPTION){ // Si se elige la opcion de SI se ejecuta todo el proceso sql
               String estado="Activa"; // Definimos una variable que se insertara en la tabla cuenta
               Double saldo=00.0; // Definimos una variable de saldo para la cuenta que debe empezar sin fondos
               Date fAc=new Date(); // Obtenemos la fecha actual para registrarla como fecha de creacion
               // Guardamos en variables las id y numero de cuenta que generamos anteriormente
               String idCuenta=generarIDCu(); 
               
               String idCliente=generarIDCli();
               try(Connection conn = ConexionOracle.getConnection()){ // Intentamos conectarnos a la DB, usamos la conexion como argumento ya que de esta forma se abre y cierra la conexion de forma automatica
                   String sql="INSERT INTO cliente (idcliente, nombres, apellidos, f_nac, dni, direccion, telf, correo_e, idempleado, contraseña) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; // Creamos una variable con la sentencia sql a realizar, aunque tambien podriamos poner la sentencia como String de forma directa en el argumento a continuacion
                   PreparedStatement ps=conn.prepareStatement(sql);
                   ps.setString(1,idCliente); // Usamos una enumaracion de los index en los que estan colocados los campos a llenar
                   ps.setString(2, nombres);
                   ps.setString(3, apellidos);
                   ps.setDate(4,new java.sql.Date(f_nac.getTime())); // Obtenemos una fecha valida para la db con Oracle
                   ps.setString(5, dni);
                   ps.setString(6, direccion);
                   if(!telf.isEmpty()||telf!=null){ // Si el telefono no estuvo vacio o null lo guardamos en la tabla
                       ps.setString(7, telf);
                   }
                   else{ // Si no deberiamos mandar el numero como null
                       ps.setNull(7, java.sql.Types.VARCHAR);
                   }
                   ps.setString(8, correo_e);
                   ps.setString(9, idEmpl); // Ingresamos la clave foranea con el id con el cual nos logeamos
                   ps.setString(10, " "); // Mandamos la contraseña con un espacio vacio, ya que la actualizaremos posteriormente y no puede ser null
                   ps.executeUpdate(); // Ejecutamos la sentencia de insercion
                   System.out.println("Registro a Cliente exitoso");
               }
               catch(SQLException e){
                   JOptionPane.showMessageDialog(null, "Error al registrar el cliente: " + e.getMessage(), "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
               }
               // A su vez hacemos otro bloque para insertar en la cuenta, se deben crear al mismo tiempo porque cuando se registra un cliente a la vez abre una cuenta.
               try(Connection conn = ConexionOracle.getConnection()){
                   String sqlCuenta="INSERT INTO cuenta (idcuenta, tipocuenta, numcuenta, saldo, f_aper, estado, idcliente) VALUES (?, ?, ?, ?, ?, ?, ?)";
                   PreparedStatement psCuenta=conn.prepareStatement(sqlCuenta);
                   psCuenta.setString(1, idCuenta);
                   psCuenta.setString(2,tipoCuenta );
                   psCuenta.setString(3, numCu);
                   psCuenta.setDouble(4, saldo);
                   psCuenta.setDate(5,new java.sql.Date(fAc.getTime()));
                   psCuenta.setString(6, estado);
                   psCuenta.setString(7, idCliente);
                   psCuenta.executeUpdate();
                   System.out.println("Registro a Cuenta exitoso");
               }
               catch(SQLException e){
                   JOptionPane.showMessageDialog(null, "Error al registrar la cuenta: " + e.getMessage(), "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
               }
               // Si el dni no fue null o no estuvo vacio abrimos una nueva ventana para registrar la contraseña del cliente y llevaremos el dni como constructor para usarlo como condicion en la consulta
               if (dni!=null && !dni.isEmpty()){
                   Contraseña contraseña=new Contraseña(dni);
                    contraseña.setVisible(true);
                    contraseña.setLocationRelativeTo(null);
               }
           }
           else {
               txtareaBoleta.setText(""); 
               JOptionPane.showMessageDialog(null, "Asegúrese de colocar los datos correctos " , "Nuevo Perú Bank", 2);
           }
       }
    }//GEN-LAST:event_btnRegistrarCliActionPerformed

    private void btnRegistrarCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarCliMouseExited
        btnRegistrarCli.setBackground(new Color(25,88,87));
    }//GEN-LAST:event_btnRegistrarCliMouseExited

    private void btnLimpiarCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCliMouseExited
       
    }//GEN-LAST:event_btnLimpiarCliMouseExited

    private void btnExitCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitCliMouseExited
        
    }//GEN-LAST:event_btnExitCliMouseExited

    private void btnPrintCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintCliMouseExited
       
    }//GEN-LAST:event_btnPrintCliMouseExited

    private void btnRegistrarCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarCliMouseEntered
        btnRegistrarCli.setBackground(new Color(24,183,177));
    }//GEN-LAST:event_btnRegistrarCliMouseEntered

    private void btnLimpiarCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarCliMouseEntered
       
    }//GEN-LAST:event_btnLimpiarCliMouseEntered

    private void btnExitCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitCliMouseEntered
        
    }//GEN-LAST:event_btnExitCliMouseEntered

    private void btnPrintCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintCliMouseEntered
       
    }//GEN-LAST:event_btnPrintCliMouseEntered

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        MenuAdm Empleado = new MenuAdm(idEmpl);
        Empleado .setVisible(true);
        Empleado.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExitCli;
    private javax.swing.JButton btnLimpiarCli;
    private javax.swing.JButton btnPrintCli;
    private javax.swing.JButton btnRegistrarCli;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> combTipoCuenta;
    private com.toedter.calendar.JDateChooser dateFNacCli;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelApeCli;
    private javax.swing.JLabel labelCorreoCli;
    private javax.swing.JLabel labelDNICli;
    private javax.swing.JLabel labelDirecCli;
    private javax.swing.JLabel labelFNacCli;
    private javax.swing.JLabel labelNomCli;
    private javax.swing.JLabel labelTelfCli;
    private javax.swing.JLabel labelTipoCuenta;
    private javax.swing.JPanel panelBoleta;
    private javax.swing.JPanel panelMainEmp;
    private javax.swing.JPanel panelRegistroEmp;
    private javax.swing.JPanel panelRegistroTitleEmp;
    private javax.swing.JPanel panelTitleEmp;
    private javax.swing.JTextField txtApeCli;
    private javax.swing.JTextField txtCorreoCli;
    private javax.swing.JTextField txtDNICli;
    private javax.swing.JTextField txtDirecCli;
    private javax.swing.JTextField txtNomCli;
    private javax.swing.JLabel txtRegistroTitleEmp;
    private javax.swing.JTextField txtTelfCli;
    private javax.swing.JLabel txtTitleEmp;
    private javax.swing.JTextArea txtareaBoleta;
    // End of variables declaration//GEN-END:variables
}
