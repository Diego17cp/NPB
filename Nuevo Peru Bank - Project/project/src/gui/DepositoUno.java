package gui;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import db.ConexionOracle;
import java.sql.Timestamp;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class DepositoUno extends javax.swing.JFrame {
    public DepositoUno() {
        initComponents();
        this.setTitle("Depositar a mi cuenta - Nuevo Perú Bank");
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logo2.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // Metodo para manejar la ventana actual
    }
    private String generarIDTr(){ // Metodo para generar una id a la transaccion que se realizará 
        String prefijo = "TR";
        String nums = "0123456789";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(prefijo); 
        while (sb.length() < 8) {
            int index = rnd.nextInt(nums.length()); 
            sb.append(nums.charAt(index));
        }
        return sb.toString();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtMonto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNCuenta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMain.setBackground(new java.awt.Color(226, 167, 84));
        panelMain.setLayout(null);

        labelLogo.setFont(new java.awt.Font("Stencil", 1, 100)); // NOI18N
        labelLogo.setForeground(new java.awt.Color(109, 30, 30));
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo2.png"))); // NOI18N
        panelMain.add(labelLogo);
        labelLogo.setBounds(180, 10, 150, 140);

        jPanel1.setBackground(new java.awt.Color(226, 167, 84));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(13, 82, 84));
        jLabel1.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 82, 84));
        jLabel1.setText("El monto mínimo es de 0.1 soles");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 280, 410, 40);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(120, 260, 310, 50);

        txtMonto.setBackground(new java.awt.Color(226, 167, 84));
        txtMonto.setFont(new java.awt.Font("Stencil", 0, 82)); // NOI18N
        txtMonto.setForeground(new java.awt.Color(13, 82, 84));
        txtMonto.setBorder(null);
        jPanel1.add(txtMonto);
        txtMonto.setBounds(110, 130, 350, 130);

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(13, 82, 84));
        jLabel2.setText("S/.");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 120, 70, 60);

        jLabel3.setBackground(new java.awt.Color(13, 82, 84));
        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(13, 82, 84));
        jLabel3.setText("Ingrese el monto a depositar:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 20, 340, 40);

        panelMain.add(jPanel1);
        jPanel1.setBounds(30, 230, 490, 340);

        btnConfirmar.setBackground(new java.awt.Color(13, 82, 84));
        btnConfirmar.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(226, 221, 216));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setBorder(null);
        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseExited(evt);
            }
        });
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        panelMain.add(btnConfirmar);
        btnConfirmar.setBounds(50, 590, 200, 50);

        btnCancel.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(109, 30, 30));
        btnCancel.setText("Cancelar");
        btnCancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 30, 30), 4, true));
        btnCancel.setContentAreaFilled(false);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        panelMain.add(btnCancel);
        btnCancel.setBounds(290, 590, 200, 50);

        jLabel4.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(13, 82, 84));
        jLabel4.setText("Nro. Cuenta del Usuario:");
        panelMain.add(jLabel4);
        jLabel4.setBounds(90, 160, 230, 30);

        txtNCuenta.setBackground(new java.awt.Color(226, 167, 84));
        txtNCuenta.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        txtNCuenta.setForeground(new java.awt.Color(13, 82, 84));
        txtNCuenta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(13, 82, 84)));
        panelMain.add(txtNCuenta);
        txtNCuenta.setBounds(160, 190, 230, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseEntered
        btnConfirmar.setBackground(new Color(24,183,177));
    }//GEN-LAST:event_btnConfirmarMouseEntered

    private void btnConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseExited
        btnConfirmar.setBackground(new Color(25,88,87));
    }//GEN-LAST:event_btnConfirmarMouseExited

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        String montox=txtMonto.getText(); // Almacenamos en una variable el monto que se ingresa 
        Double monto=Double.parseDouble(txtMonto.getText()); // Convertimos lo ingresado en el txt a Double para poder operar con el valor
        Double nSaldo; // Declaramos una variable que servirá para actualizar el saldo de la cuenta a nuevo saldo
        String idTr=generarIDTr(); // Almacenamos en una variable la id de transaccion que hemos generado
        String nCuenta=txtNCuenta.getText(); // Almacenamos en una variable el numero de cuenta a la que se le hará el deposito, lo usaremos para identificarla
        Timestamp f_tra = new Timestamp(System.currentTimeMillis()); // Objeto que almacena la fecha y hora de la fecha en que se realiza la transaccion
        if(montox.isEmpty() && monto<0.1){ // Validar que el txt no este vacio (esto dara un error por la conversion anterior ya que no puede ser null, si ingresa un monto no deberia tener problemas)
            JOptionPane.showMessageDialog(null, "Por favor ingrese un monto","Nuevo Perú Bank - Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(!montox.isEmpty() && monto<0.1){ // Si el monto no esta vacio pero es menor a 0.1 saldra una advertencia, ya que es menos del minimo permitido
            JOptionPane.showMessageDialog(null, "El monto mínimo es de S/. 0.1","Nuevo Perú Bank - Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(!montox.isEmpty() && monto>30000.00){ // Verificar que el monto no supere el limite
            JOptionPane.showMessageDialog(null, "El monto máximo es de S/. 30000.0","Nuevo Perú Bank - Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{ // SI no se cumplen todas las condiciones anteriores mostramos un mensaje de confirmacion para evitar pagos indeseados
            Object[] options = {"Confirmar", "Cancelar"};
            int confirm = JOptionPane.showOptionDialog(null,  "Confirmar deposito", "Nuevo Perú Bank", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (confirm == JOptionPane.YES_OPTION) {
                // Si se confirma la transaccion traeremos el saldo de la cuenta mediante su numero de cuenta previamente ingresado
                try(Connection conn = ConexionOracle.getConnection()){              
                    String sql="SELECT idcuenta, saldo FROM cuenta WHERE numcuenta=?";
                    PreparedStatement ps=conn.prepareStatement(sql);
                    ps.setString(1, nCuenta);
                    ResultSet rs=ps.executeQuery();
                    if(rs.next()){ // SI la consuilta sale bien asignamos lo que trajimos en la consulta                        
                        String idCuenta=rs.getString("idcuenta");
                        Double saldox=rs.getDouble("saldo");
                        System.out.println("se llamo correctamente a la id de la cuenta "+ idCuenta+ " "+ saldox);
                        nSaldo=saldox+monto; // Con el saldo que llamamos de la DB hacemos la sumatoria para el nuevo saldo despues de ejecutar el deposito                         
                        // Ahora actualizamos la cuenta con el nuevo saldo que acabamos de efectuar
                        String sqlUp="UPDATE cuenta SET saldo = ? WHERE idcuenta=?";
                        PreparedStatement psUp=conn.prepareStatement(sqlUp);
                        psUp.setDouble(1, nSaldo);
                        psUp.setString(2, idCuenta);
                        psUp.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Deposito realizado con éxito", "Nuevo Perú Bank",1);
                        // A su vez hacemos la respectiva insercion en la tabla de transaccion con el tipo de transaccion que se realizo y traemos las variables que asignamos previamente
                        String sqlTrans="INSERT INTO transaccion (idtransaccion, f_tra, monto, tipo, idcuenta) VALUES (?, ?, ?, ?, ?)";
                        PreparedStatement psTr=conn.prepareStatement(sqlTrans);
                        psTr.setString(1, idTr);
                        psTr.setTimestamp(2, f_tra);
                        psTr.setDouble(3,monto);
                        psTr.setString(4, "DEPOSITO");
                        psTr.setString(5, idCuenta);
                        psTr.executeUpdate();
                        txtMonto.setText("");
                    }
                }
                catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Error en la base de datos: " + ex.getMessage());
                }   
            }
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtMonto.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNCuenta;
    // End of variables declaration//GEN-END:variables
}
