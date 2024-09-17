
package gui;
//@author Diego17

import java.awt.Color; // Objeto para asignar un color, usado en el efecto hover
import java.awt.Image; // Objeto para asignar imagenes
import javax.swing.ImageIcon; // Objeto para llamar imagenes
import javax.swing.JOptionPane;
import java.sql.SQLException; // Manejo de errores con la conexion
import db.ConexionOracle; // Conexion creada en la clase Conexion
import java.sql.Connection; // Llamamos a la conexion
import java.sql.PreparedStatement; // Consultas SQL con parametros
import java.sql.ResultSet; // Objeto para acceder a datos mediante consultas como SELECT

public class LoginCli extends javax.swing.JFrame {
    int attempt = 0; // Asignamos una variable de intentos para cuando el dni o contraseña sean erróneos
    public LoginCli() {
        initComponents();
        this.setTitle("Nuevo Perú Bank - Acceder como Usuario"); // Título para la ventana
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logo2.png"));
        Image logo = icon.getImage();
        setIconImage(logo); // Métodos para ícono de la ventana
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBienvenidaCli2 = new javax.swing.JPanel();
        labelLogin1_2Cli = new javax.swing.JLabel();
        panelBienvenidaCli = new javax.swing.JPanel();
        labelLogin1Cli = new javax.swing.JLabel();
        panelCenterCli = new javax.swing.JPanel();
        labelInicioSes1Cli = new javax.swing.JLabel();
        panelDatosCli = new javax.swing.JPanel();
        labelDNICli = new javax.swing.JLabel();
        txtDNICli = new javax.swing.JTextField();
        labelContraCli = new javax.swing.JLabel();
        pswdContraCli = new javax.swing.JPasswordField();
        panelButtonsCli = new javax.swing.JPanel();
        btnLoginCli = new javax.swing.JButton();
        btnCancelCli = new javax.swing.JButton();
        btnExitCli = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBienvenidaCli2.setBackground(new java.awt.Color(13, 82, 84));

        labelLogin1_2Cli.setBackground(new java.awt.Color(13, 82, 84));
        labelLogin1_2Cli.setFont(new java.awt.Font("Stencil", 1, 100)); // NOI18N
        labelLogin1_2Cli.setForeground(new java.awt.Color(24, 183, 177));
        labelLogin1_2Cli.setText("npb");

        javax.swing.GroupLayout panelBienvenidaCli2Layout = new javax.swing.GroupLayout(panelBienvenidaCli2);
        panelBienvenidaCli2.setLayout(panelBienvenidaCli2Layout);
        panelBienvenidaCli2Layout.setHorizontalGroup(
            panelBienvenidaCli2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBienvenidaCli2Layout.createSequentialGroup()
                .addContainerGap(386, Short.MAX_VALUE)
                .addComponent(labelLogin1_2Cli, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(358, 358, 358))
        );
        panelBienvenidaCli2Layout.setVerticalGroup(
            panelBienvenidaCli2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBienvenidaCli2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(labelLogin1_2Cli)
                .addContainerGap())
        );

        panelBienvenidaCli.setBackground(new java.awt.Color(13, 82, 84));

        labelLogin1Cli.setBackground(new java.awt.Color(13, 82, 84));
        labelLogin1Cli.setFont(new java.awt.Font("Stencil", 1, 100)); // NOI18N
        labelLogin1Cli.setForeground(new java.awt.Color(24, 183, 177));
        labelLogin1Cli.setText("Bienvenido");

        javax.swing.GroupLayout panelBienvenidaCliLayout = new javax.swing.GroupLayout(panelBienvenidaCli);
        panelBienvenidaCli.setLayout(panelBienvenidaCliLayout);
        panelBienvenidaCliLayout.setHorizontalGroup(
            panelBienvenidaCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBienvenidaCliLayout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addComponent(labelLogin1Cli, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
        panelBienvenidaCliLayout.setVerticalGroup(
            panelBienvenidaCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBienvenidaCliLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(labelLogin1Cli)
                .addContainerGap())
        );

        panelCenterCli.setBackground(new java.awt.Color(226, 167, 84));

        labelInicioSes1Cli.setFont(new java.awt.Font("Leelawadee", 1, 48)); // NOI18N
        labelInicioSes1Cli.setForeground(new java.awt.Color(109, 30, 30));
        labelInicioSes1Cli.setText("Iniciar Sesión");

        panelDatosCli.setBackground(new java.awt.Color(226, 167, 84));
        panelDatosCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 5, true));

        labelDNICli.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        labelDNICli.setForeground(new java.awt.Color(109, 30, 30));
        labelDNICli.setText("DNI:");

        txtDNICli.setBackground(new java.awt.Color(239, 200, 137));
        txtDNICli.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        txtDNICli.setForeground(new java.awt.Color(109, 30, 30));
        txtDNICli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        txtDNICli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNICliActionPerformed(evt);
            }
        });

        labelContraCli.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        labelContraCli.setForeground(new java.awt.Color(109, 30, 30));
        labelContraCli.setText("Contraseña:");

        pswdContraCli.setBackground(new java.awt.Color(239, 200, 137));
        pswdContraCli.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        pswdContraCli.setForeground(new java.awt.Color(109, 30, 30));
        pswdContraCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 3, true));
        pswdContraCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswdContraCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosCliLayout = new javax.swing.GroupLayout(panelDatosCli);
        panelDatosCli.setLayout(panelDatosCliLayout);
        panelDatosCliLayout.setHorizontalGroup(
            panelDatosCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosCliLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelDatosCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelContraCli)
                    .addComponent(labelDNICli, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDNICli, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                    .addComponent(pswdContraCli))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        panelDatosCliLayout.setVerticalGroup(
            panelDatosCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosCliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDNICli, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDNICli, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelContraCli, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswdContraCli, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panelButtonsCli.setBackground(new java.awt.Color(226, 167, 84));

        btnLoginCli.setBackground(new java.awt.Color(25, 88, 87));
        btnLoginCli.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        btnLoginCli.setForeground(new java.awt.Color(226, 221, 216));
        btnLoginCli.setText("Acceder");
        btnLoginCli.setBorder(null);
        btnLoginCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoginCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginCliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginCliMouseExited(evt);
            }
        });
        btnLoginCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginCliActionPerformed(evt);
            }
        });

        btnCancelCli.setBackground(new java.awt.Color(25, 88, 87));
        btnCancelCli.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        btnCancelCli.setForeground(new java.awt.Color(25, 88, 87));
        btnCancelCli.setText("Cancelar");
        btnCancelCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(25, 88, 87), 3, true));
        btnCancelCli.setContentAreaFilled(false);
        btnCancelCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelCliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelCliMouseExited(evt);
            }
        });
        btnCancelCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelCliActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout panelButtonsCliLayout = new javax.swing.GroupLayout(panelButtonsCli);
        panelButtonsCli.setLayout(panelButtonsCliLayout);
        panelButtonsCliLayout.setHorizontalGroup(
            panelButtonsCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsCliLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnLoginCli, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnCancelCli, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnExitCli, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        panelButtonsCliLayout.setVerticalGroup(
            panelButtonsCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsCliLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelButtonsCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoginCli, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelCli, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExitCli, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCenterCliLayout = new javax.swing.GroupLayout(panelCenterCli);
        panelCenterCli.setLayout(panelCenterCliLayout);
        panelCenterCliLayout.setHorizontalGroup(
            panelCenterCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCenterCliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCenterCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCenterCliLayout.createSequentialGroup()
                        .addComponent(panelDatosCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCenterCliLayout.createSequentialGroup()
                        .addComponent(labelInicioSes1Cli, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(310, 310, 310))))
            .addGroup(panelCenterCliLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(panelButtonsCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );
        panelCenterCliLayout.setVerticalGroup(
            panelCenterCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCenterCliLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(labelInicioSes1Cli, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatosCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelButtonsCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBienvenidaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelCenterCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelBienvenidaCli2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBienvenidaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(panelCenterCli, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(panelBienvenidaCli2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDNICliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNICliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNICliActionPerformed

    private void btnLoginCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginCliActionPerformed
        String dni=txtDNICli.getText(); // Almacenamos en una variable lo que se escriba en el TextField Dni
        String contra=pswdContraCli.getText(); // Almacenamos en una variable lo que se escriba en el TextField Password
        if (!(dni.isEmpty()||contra.isEmpty()))  { // Si los txt no están vacíos lanza el bloque donde ejecutamos las sentencias SQL
            try(Connection conn = ConexionOracle.getConnection()){ // Intentamos llamar a la conexión, con este argumento la conexión se abre y se cierra automáticamente
                // Llamamos al id del cliente y su nombre mediante lo que se haya ingresado en los txt.
                String sql="SELECT idcliente, nombres from cliente WHERE dni=? AND contraseña=?"; // Almacenamos la consulta en una variable tipo String, los signos de interrogación son valores desconocidos para la consulta que se almacenan posteriormente.
                PreparedStatement ps=conn.prepareStatement(sql); // Llamamos a un objeto Prepare Statement para preparar la sentencia ("sql", pero también se podría poner la consulta de forma directa) la cual se ejecuta en la conexion (conn)
                ps.setString(1,dni); // A la consulta le pasámos los valores, el 1 es el orden en el que se almacena, en este caso en la columna "dni" y la variable es el valor que mandarás.
                ps.setString(2,contra);
                ResultSet rs=ps.executeQuery(); // Método executeQuery que se usa cuando usamos consultas como Select, Join, etc.
                if(rs.next()){ // Si la consulta es exitosa debe hacer lo siguiente:
                    String nombreCliente=rs.getString("nombres");  // almacenamos en una variable lo que obtuvimos de la consulta, en este caso el valor del campo nombres.
                    String idCliente=rs.getString("idcliente");
                    Cliente cli = new Cliente(nombreCliente, idCliente); // mandamos como constructor las variables que declaramos con los valores que obtuvimos recientemente a la nueva ventana.
                    cli.setVisible(true);
                    cli.setLocationRelativeTo(null);
                    this.dispose();
                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso", "Nuevo Perú Bank - Iniciar Sesion Usuario",1); // Mensaje que  indica que todo salió correctamente.
                }
                else{ // Si la consulta no fue exitosa limpiamos los txt y sumamos un intento por haber fallado en escribir las credenciales.
                    txtDNICli.setText("");
                    pswdContraCli.setText("");
                    JOptionPane.showMessageDialog(null, "DNI o Contraseña incorrectos. Tiene 3 intentos", "Nuevo Perú Bank - Incorrecto", 2);
                    attempt += 1;
                    if (attempt ==3){ // Si llegamos a 3 intentos mandamos un mensaje diciendo que se acabaron los intentos y el programa se cierra.
                        JOptionPane.showMessageDialog(null, "Número máximo de intentos alcanzado. Cerrando aplicación.","Nuevo Perú Bank",2);
                        System.exit(0);
                    }
                }
            }
            catch(SQLException ex){ // Si tenemos algun problema con la conexión obtenemos el error con el metodo getMessage de ex (de la excepcion)  
                JOptionPane.showMessageDialog(null, "Error en la base de datos: " + ex.getMessage());
            }
        }
        else{ // Si los txt sí están vacíos mandamos un mensaje de advertencia pidiendo que se llenen.
            JOptionPane.showMessageDialog(null, "Por favor, ingrese DNI y contraseña.","Nuevo Perú Bank - Advertencia",0);
        }
        
    }//GEN-LAST:event_btnLoginCliActionPerformed

    private void pswdContraCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswdContraCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswdContraCliActionPerformed

    private void btnExitCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitCliActionPerformed
        // Mandamos un mensaje de tipo Si o No el cual si la respuesta es Si cerrará el programa
       if (JOptionPane.showConfirmDialog(null, "¿Desea Salir?","Nuevo Perú Bank",
               JOptionPane.YES_NO_OPTION ) ==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitCliActionPerformed

    private void btnCancelCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelCliActionPerformed
        // Limpiamos los textos al clickar el botón
        txtDNICli.setText("");
       pswdContraCli.setText(""); 
    }//GEN-LAST:event_btnCancelCliActionPerformed

    private void btnLoginCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginCliMouseEntered
        btnLoginCli.setBackground(new Color(24,183,177)); // Efecto hover para el boton
    }//GEN-LAST:event_btnLoginCliMouseEntered

    private void btnCancelCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelCliMouseEntered
        
    }//GEN-LAST:event_btnCancelCliMouseEntered

    private void btnExitCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitCliMouseEntered
        
    }//GEN-LAST:event_btnExitCliMouseEntered

    private void btnLoginCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginCliMouseExited
        btnLoginCli.setBackground(new Color(25,88,87));
    }//GEN-LAST:event_btnLoginCliMouseExited

    private void btnCancelCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelCliMouseExited
        
    }//GEN-LAST:event_btnCancelCliMouseExited

    private void btnExitCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitCliMouseExited
        
    }//GEN-LAST:event_btnExitCliMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelCli;
    private javax.swing.JButton btnExitCli;
    private javax.swing.JButton btnLoginCli;
    private javax.swing.JLabel labelContraCli;
    private javax.swing.JLabel labelDNICli;
    private javax.swing.JLabel labelInicioSes1Cli;
    private javax.swing.JLabel labelLogin1Cli;
    private javax.swing.JLabel labelLogin1_2Cli;
    private javax.swing.JPanel panelBienvenidaCli;
    private javax.swing.JPanel panelBienvenidaCli2;
    private javax.swing.JPanel panelButtonsCli;
    private javax.swing.JPanel panelCenterCli;
    private javax.swing.JPanel panelDatosCli;
    private javax.swing.JPasswordField pswdContraCli;
    private javax.swing.JTextField txtDNICli;
    // End of variables declaration//GEN-END:variables
}
