package gui;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import db.ConexionOracle;
import java.sql.ResultSet;
import java.sql.Timestamp; // Objeto para obtener la fecha y hora 
import java.util.Random; // Clase para generar numeros aleatoriamente
import javax.swing.WindowConstants; // Usamos para manejar la ventana 

public class DepositoDos extends javax.swing.JFrame {
    // Declaramos variables generales para la ventana
    private String idcuenta;
    private Double saldoInicial;
    private Cliente cliente;
    public DepositoDos(Cliente cliente, String idCuenta, Double saldox) { // Datos que trajimos de la ventana anterior
        this.setTitle("Depositar a otro Usuario - Nuevo Perú Bank");
        initComponents();
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logo2.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
        // Inicializamos las variables dandoles los valores del constructor
        this.saldoInicial=saldox;
        this.idcuenta=idCuenta;
        this.cliente=cliente;
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // Cuando se clickea la X o Cerrar en la Ventana solo se cierra la ventana actual y no todo el sistema, siempre y cuando haya mas de una ventana abierta
    }
    private String generarIDTr(){ // Método para generar un id para las transacciones el cual debe ser de 8 digitos y armas todo en una string 
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

        jPanel1 = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtMonto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNCuenta = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(226, 167, 84));
        jPanel1.setLayout(null);

        labelLogo.setFont(new java.awt.Font("Stencil", 1, 100)); // NOI18N
        labelLogo.setForeground(new java.awt.Color(109, 30, 30));
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo2.png"))); // NOI18N
        jPanel1.add(labelLogo);
        labelLogo.setBounds(190, 10, 150, 140);

        jPanel2.setBackground(new java.awt.Color(226, 167, 84));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(13, 82, 84));
        jLabel1.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 82, 84));
        jLabel1.setText("El monto mínimo es de 0.1 soles");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(70, 280, 410, 40);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(120, 260, 310, 10);

        txtMonto.setBackground(new java.awt.Color(226, 167, 84));
        txtMonto.setFont(new java.awt.Font("Stencil", 0, 82)); // NOI18N
        txtMonto.setForeground(new java.awt.Color(13, 82, 84));
        txtMonto.setBorder(null);
        jPanel2.add(txtMonto);
        txtMonto.setBounds(110, 130, 350, 130);

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(13, 82, 84));
        jLabel2.setText("S/.");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 120, 70, 60);

        jLabel3.setBackground(new java.awt.Color(13, 82, 84));
        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(13, 82, 84));
        jLabel3.setText("Ingrese el monto a depositar:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(80, 20, 340, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 260, 490, 340);

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
        jPanel1.add(btnConfirmar);
        btnConfirmar.setBounds(50, 620, 200, 50);

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
        jPanel1.add(btnCancel);
        btnCancel.setBounds(300, 620, 200, 50);

        jLabel4.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(13, 82, 84));
        jLabel4.setText("Nro. Cuenta del Usuario:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 160, 230, 30);

        txtNCuenta.setBackground(new java.awt.Color(226, 167, 84));
        txtNCuenta.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        txtNCuenta.setForeground(new java.awt.Color(13, 82, 84));
        txtNCuenta.setBorder(null);
        jPanel1.add(txtNCuenta);
        txtNCuenta.setBounds(150, 190, 230, 40);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(150, 230, 230, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
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
        String montox=txtMonto.getText();
        Double monto=Double.parseDouble(txtMonto.getText()); // Obtenemos lo que se ingresa en el txt de monto y lo convertimos en double
        Double nSaldo; // Declaramos una variable de nuevo saldo para el saldo actualizado
        String nCuenta=txtNCuenta.getText(); // Obtenemos el numero de cuenta ingresado en el txt
        String idTr=generarIDTr(); // Generamos una ID de transferencia para la transferencia que realiza EL QUE PAGA
        String idTrAb=generarIDTr(); // y generamos una ID de transferencia para el que RECIBE EL DINERO
        Timestamp f_tra = new Timestamp(System.currentTimeMillis()); // Obtenemos el tiempo actual del sistema en el que corra el programa para la fecha en que se realiza y recibe la transaccion
        if(montox.isEmpty()){ // Si el txt de monto esta vacio lanza una advertencia
            JOptionPane.showMessageDialog(null, "Por favor ingrese un monto","Nuevo Perú Bank - Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(!montox.isEmpty() && monto<0.1){ // Si el txt no esta vacio pero es menor que 0.1 lanza una advertencia
            JOptionPane.showMessageDialog(null, "El monto mínimo es de S/. 0.1","Nuevo Perú Bank - Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(!montox.isEmpty() && monto>30000.00){ // Se establece un limite de 30 000 como monto
            JOptionPane.showMessageDialog(null, "El monto máximo es de S/. 30000.0","Nuevo Perú Bank - Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(!montox.isEmpty()&&monto>saldoInicial){ // Si el monto excede el saldo que trajimos de la ventana anterior no se puede realizar la transferencia
            JOptionPane.showMessageDialog(null, "Saldo insuficiente","Nuevo Perú Bank - Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
            Object[] options = {"Confirmar", "Cancelar"}; // Array de opciones para responder
            int confirm = JOptionPane.showOptionDialog(null,  "Confirmar deposito", "Nuevo Perú Bank", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (confirm == JOptionPane.YES_OPTION) { // Si se selecciona confirmar debe restar el monto al saldo 
               txtMonto.setText("");
               nSaldo=saldoInicial-monto; // Hacemos la operacion en el nuevo saldo 
               try(Connection conn=ConexionOracle.getConnection()){
                   String sql="UPDATE cuenta SET saldo = ? WHERE idcuenta=?"; // Actualizamos el saldo en la tabla cuenta
                   PreparedStatement ps=conn.prepareStatement(sql);
                   ps.setDouble(1, nSaldo); // Pasamos el nuevo saldo a la tabla
                   ps.setString(2, idcuenta); // id de la cuenta que trajimos del constructor
                   ps.executeUpdate();
                   cliente.datosActualizados(); // llamamos al metodo de la ventana anterior para que los datos se actualicen en tiempo real
                   
                   // A la vez que hacemos la actualizacion del saldo en la cuenta, tambien insertaremos datos para la transaccion realizada
                   String sqlTrans="INSERT INTO transaccion (idtransaccion, f_tra, monto, tipo, idcuenta) VALUES (?, ?, ?, ?, ?)";
                   PreparedStatement psTr=conn.prepareStatement(sqlTrans);
                   psTr.setString(1, idTr);
                   psTr.setTimestamp(2, f_tra);
                   psTr.setDouble(3,-monto); // se pone en negativo porque fue un decremento en el saldo
                   psTr.setString(4, "TRANSFERENCIA");
                   psTr.setString(5, idcuenta);
                   psTr.executeUpdate();
               }
               catch(SQLException e){
                 JOptionPane.showMessageDialog(null, "No se completó el registro", "Nuevo Perú Bank - Error",JOptionPane.ERROR_MESSAGE);
                }
               try(Connection conn=ConexionOracle.getConnection()){ // Ahor a hacemos otro bloque para hacer la persona que recibe el dinero
                   String sqlDestino="UPDATE cuenta SET saldo = saldo + ? WHERE numcuenta=?"; // Sentencia de actualizacion donde usamos como condicion el numero de cuenta ingresado en el txt
                   PreparedStatement ps=conn.prepareStatement(sqlDestino);
                   ps.setDouble(1, monto); // En el primer "?" hacemos una sumatoria del saldo actual de esa cuenta externa con el monto que se ingreso
                   ps.setString(2, nCuenta);
                   ps.executeUpdate();
                   cliente.datosActualizados(); // Actualizamos los datos en tiempo real
                   JOptionPane.showMessageDialog(null, "Deposito realizado con éxito", "Nuevo Perú Bank",1);
                   // obtener el id del cliente que recibe el dinero mediante su numero de cuenta ingresado
                   String sqlNCue="SELECT idcuenta FROM cuenta WHERE numcuenta = ?";
                   PreparedStatement psSel=conn.prepareStatement(sqlNCue);
                   psSel.setString(1,nCuenta);
                   ResultSet rs=psSel.executeQuery();
                   if(rs.next()){ // Si se ejecuta bien almacenamos el id de la cuenta receptora
                       String idCuentaReceptor=rs.getString("idcuenta");
                       // Transaccion al recibir el dinero 
                       String sqlTrans="INSERT INTO transaccion (idtransaccion, f_tra, monto, tipo, idcuenta) VALUES (?, ?, ?, ?, ?)";
                       PreparedStatement psTr=conn.prepareStatement(sqlTrans);
                       psTr.setString(1, idTrAb); // Un id diferente para esta transaccion
                       psTr.setTimestamp(2, f_tra); 
                       psTr.setDouble(3,monto);
                       psTr.setString(4, "ABONO");
                       psTr.setString(5, idCuentaReceptor); // Damos valor a esta clave foranea con la variable que obtuvimos en el SELECT
                       psTr.executeUpdate();
                   }
               }
               catch(SQLException e){
                 JOptionPane.showMessageDialog(this, "Error al actualizar el saldo del destinatario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNCuenta;
    // End of variables declaration//GEN-END:variables
}
