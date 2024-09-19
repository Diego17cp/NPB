package gui;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.sql.Connection; // Objeto para llamar a la conexion
import java.sql.PreparedStatement;
import java.sql.ResultSet; // Objeto para consultas SELECT
import java.sql.SQLException;
import db.ConexionOracle;
import javax.swing.JOptionPane;

public class Cliente extends javax.swing.JFrame {
    private String idcliente; // Variable privada para almacenar lo que trajimos del constructor
    private String tipoCuenta=""; // asignamos variables privadas al tipo de cuenta, el saldo y el numero para usarlo junto a un botón, esto es meramente estético, tambien puedes declararla en el respectivo bloque para su uso 
    private String numeroCuenta="";
    private Double saldo=0.0;
    private boolean noVisible=true; // declaramos una variable boolean para indicar que los valores anteriormente mencionados no son visibles en su respectivo label
    ImageIcon eye = new ImageIcon(getClass().getResource("/resources/eye.png")); // Traemos los iconos de ojos de nuestro paquete resources
    ImageIcon eyeslash = new ImageIcon(getClass().getResource("/resources/eye-slash.png"));

    public Cliente(String nombreCliente, String idCliente) { // Constructor que usamos anteriormente para traer las variables de la ventana anterior a la nueva
        initComponents();
        this.setTitle("Cuenta - Nuevo Perú Bank");
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logo2.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
        this.idcliente=idCliente; // Asignamos a la variable privada que declaramos anteriormente el valor que trajimos del constructor para usarlo más adelante
        labelSaludo.setText("Hola " + nombreCliente + ", bienvenid@"); // Usamos el valor que trajimos del constructor para usarlo en este label que pertenece a esta clase/ventana
        datosActualizados(); // llamamos al método para que se actualicen en tiempo real los datos.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMainCuenta = new javax.swing.JPanel();
        panelSaludo = new javax.swing.JPanel();
        labelSaludo = new javax.swing.JLabel();
        labelLlama = new javax.swing.JLabel();
        panelLogo = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        panelSaldo = new javax.swing.JPanel();
        labelLogo2 = new javax.swing.JLabel();
        labelSaldo = new javax.swing.JLabel();
        labelTipoCuenta = new javax.swing.JLabel();
        labelNCuenta = new javax.swing.JLabel();
        labelSoles = new javax.swing.JLabel();
        labelCuenta = new javax.swing.JLabel();
        btnNoVer = new javax.swing.JButton();
        panelElec = new javax.swing.JPanel();
        labelQuest = new javax.swing.JLabel();
        btnVerTr = new javax.swing.JButton();
        btnDepos2 = new javax.swing.JButton();
        btnExitCli = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelMainCuenta.setBackground(new java.awt.Color(226, 167, 84));
        labelMainCuenta.setLayout(null);

        panelSaludo.setBackground(new java.awt.Color(226, 167, 84));
        panelSaludo.setLayout(null);

        labelSaludo.setFont(new java.awt.Font("Leelawadee", 1, 30)); // NOI18N
        labelSaludo.setForeground(new java.awt.Color(13, 82, 84));
        panelSaludo.add(labelSaludo);
        labelSaludo.setBounds(30, 50, 580, 52);

        labelLlama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/llama.png"))); // NOI18N
        panelSaludo.add(labelLlama);
        labelLlama.setBounds(580, 0, 140, 170);

        labelMainCuenta.add(panelSaludo);
        panelSaludo.setBounds(160, 0, 720, 160);

        panelLogo.setBackground(new java.awt.Color(226, 167, 84));
        panelLogo.setLayout(null);

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo2.png"))); // NOI18N
        panelLogo.add(labelLogo);
        labelLogo.setBounds(10, 0, 160, 140);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/green.png"))); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        panelLogo.add(btnVolver);
        btnVolver.setBounds(10, 10, 18, 20);

        labelMainCuenta.add(panelLogo);
        panelLogo.setBounds(0, 0, 200, 130);

        panelSaldo.setBackground(new java.awt.Color(13, 82, 84));
        panelSaldo.setLayout(null);

        labelLogo2.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        labelLogo2.setForeground(new java.awt.Color(24, 183, 177));
        labelLogo2.setText("NPB");
        panelSaldo.add(labelLogo2);
        labelLogo2.setBounds(20, 10, 80, 60);

        labelSaldo.setFont(new java.awt.Font("Leelawadee UI", 1, 45)); // NOI18N
        labelSaldo.setForeground(new java.awt.Color(226, 221, 216));
        panelSaldo.add(labelSaldo);
        labelSaldo.setBounds(90, 130, 220, 110);

        labelTipoCuenta.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        labelTipoCuenta.setForeground(new java.awt.Color(226, 221, 216));
        labelTipoCuenta.setText("x");
        panelSaldo.add(labelTipoCuenta);
        labelTipoCuenta.setBounds(120, 70, 140, 32);

        labelNCuenta.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        labelNCuenta.setForeground(new java.awt.Color(226, 221, 216));
        panelSaldo.add(labelNCuenta);
        labelNCuenta.setBounds(10, 250, 280, 40);

        labelSoles.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        labelSoles.setForeground(new java.awt.Color(226, 221, 216));
        labelSoles.setText("S/.");
        panelSaldo.add(labelSoles);
        labelSoles.setBounds(30, 130, 46, 48);

        labelCuenta.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        labelCuenta.setForeground(new java.awt.Color(226, 221, 216));
        labelCuenta.setText("Cuenta");
        panelSaldo.add(labelCuenta);
        labelCuenta.setBounds(30, 70, 75, 32);

        btnNoVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/eye-slash.png"))); // NOI18N
        btnNoVer.setContentAreaFilled(false);
        btnNoVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNoVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoVerActionPerformed(evt);
            }
        });
        panelSaldo.add(btnNoVer);
        btnNoVer.setBounds(220, 10, 60, 40);

        labelMainCuenta.add(panelSaldo);
        panelSaldo.setBounds(40, 180, 330, 320);

        panelElec.setBackground(new java.awt.Color(226, 167, 84));
        panelElec.setLayout(null);

        labelQuest.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        labelQuest.setForeground(new java.awt.Color(13, 82, 84));
        labelQuest.setText("¿Qué deseas hacer hoy?");
        panelElec.add(labelQuest);
        labelQuest.setBounds(40, 0, 450, 52);

        btnVerTr.setBackground(new java.awt.Color(13, 82, 84));
        btnVerTr.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        btnVerTr.setForeground(new java.awt.Color(226, 221, 216));
        btnVerTr.setText("Ver transacciones");
        btnVerTr.setBorder(null);
        btnVerTr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerTr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerTrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerTrMouseExited(evt);
            }
        });
        btnVerTr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTrActionPerformed(evt);
            }
        });
        panelElec.add(btnVerTr);
        btnVerTr.setBounds(100, 150, 270, 50);

        btnDepos2.setBackground(new java.awt.Color(13, 82, 84));
        btnDepos2.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        btnDepos2.setForeground(new java.awt.Color(226, 221, 216));
        btnDepos2.setText("Depositar a otra cuenta");
        btnDepos2.setBorder(null);
        btnDepos2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDepos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDepos2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDepos2MouseExited(evt);
            }
        });
        btnDepos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepos2ActionPerformed(evt);
            }
        });
        panelElec.add(btnDepos2);
        btnDepos2.setBounds(100, 70, 270, 50);

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
        panelElec.add(btnExitCli);
        btnExitCli.setBounds(100, 230, 270, 50);

        labelMainCuenta.add(panelElec);
        panelElec.setBounds(380, 170, 480, 330);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMainCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMainCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void datosActualizados(){ // metodo para mantener siempre los datos actualizados en tiempo real
        try(Connection conn=ConexionOracle.getConnection()){
            String sql="SELECT saldo, numcuenta, tipocuenta FROM cuenta WHERE idcliente=?";
            PreparedStatement ps=conn.prepareStatement(sql); // Mandamos la consulta a la conexion
            ps.setString(1,idcliente); // Asignamos el parametro para la consulta
            ResultSet rs=ps.executeQuery(); // Ejecutamos la consulta
            if(rs.next()){ // Si se realiza con exito obtenemos los valores que pedimos
                saldo=rs.getDouble("saldo");
                numeroCuenta=rs.getString("numcuenta");
                tipoCuenta=rs.getString("tipocuenta");
            }
            // Asignamos a los label respectivos los valores que trajimos, de esta manera estarán actualizados
            labelSaldo.setText(String.format("%.2f",saldo)); // Asignamos un formato para el String del saldo, muestra que debe haber un punto y después del punto dos digitos, representando un Double.
            labelNCuenta.setText(numeroCuenta);
            labelTipoCuenta.setText(tipoCuenta);
        }
        catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnVerTrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTrActionPerformed
        try(Connection conn = ConexionOracle.getConnection()){
            String sql="SELECT idcuenta FROM cuenta WHERE idcliente=? AND numcuenta=?"; // Consultamos el id de la cuenta para llevarlo a la siguiente ventana.
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, idcliente); // Dato que trajimos como constructor
            ps.setString(2, numeroCuenta); // Dato obtenido del metodo 
            ResultSet rs=ps.executeQuery();
            if(rs.next()){ // Si sale todo bien tendremos la nueva ventana de Transacciones
                String idCuenta=rs.getString("idcuenta");
                System.out.println("se llamo correctamente a la id de la cuenta "+ idCuenta);
                Transacciones trans=new Transacciones(idCuenta);
                trans.setVisible(true);
                trans.setLocationRelativeTo(null);
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error en la base de datos: " + ex.getMessage());
        }
        
    }//GEN-LAST:event_btnVerTrActionPerformed

    private void btnNoVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoVerActionPerformed
        noVisible=!noVisible; // Invertimos el valor de noVisible al contrario, o sea false.
        if(noVisible){ // ahora que noVisible es false, tenemos que si los datos si son visibles el boton cambiara al icono de ojo simbolizando que se pueden ver los datos
            labelSaldo.setText(String.format("%.2f",saldo));
            labelNCuenta.setText(numeroCuenta);
            btnNoVer.setIcon(eye);
        }
        else {
            // Cuando es true los datos se verán "cifrados" y el icono cambiará al ojo tachado, simbolizando que no se puede ver
            int parteEntera = (int) Math.floor(saldo); // Obtenemos la parte entera del saldo
            double parteDecimal = saldo - parteEntera;  // Obtenemos la parte decimal del saldo
            String saldoCensurado = "*".repeat(String.valueOf(parteEntera).length()); // Se censura el saldo cambiando la parte entera por asteriscos, el metodo repeat es para que se siga asignando esta censura a los enteros sin importar su longitud
            String decimales = String.format("%.2f", parteDecimal).substring(1);  // La parte decimal sigue visible, lo cual representaría los centavos, formatea lo que resta de la parte decimal con un punto y dos digitos despues. El substring es para que el decimal solo sea .n_decimal y no 0.n_decimal
            String cuentaCensurada = "*".repeat(numeroCuenta.length()); // Censura el numero de cuenta sin importar su tamaño.
            labelSaldo.setText(saldoCensurado + decimales); // Junta la parte entera y la decimal en un solo label
            labelNCuenta.setText(cuentaCensurada);
            btnNoVer.setIcon(eyeslash);
        }
    }//GEN-LAST:event_btnNoVerActionPerformed

    private void btnDepos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepos2ActionPerformed
        try(Connection conn = ConexionOracle.getConnection()){
            String sql="SELECT idcuenta, saldo FROM cuenta WHERE idcliente=? AND numcuenta=?"; // Llamamos datos necesarios para la nueva ventana
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, idcliente);
            ps.setString(2, numeroCuenta);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                String idCuenta=rs.getString("idcuenta");
                Double saldox=rs.getDouble("saldo");
                DepositoDos depo2=new DepositoDos(this, idCuenta, saldox); // pasamos los datos como constructor a la ventana y tambien pasamos esta ventana a la siguiente
                depo2.setVisible(true);
                depo2.setLocationRelativeTo(null);
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error en la base de datos: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnDepos2ActionPerformed

    private void btnDepos2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepos2MouseEntered
        btnDepos2.setBackground(new Color(24,183,177)); // Efecto hover para botones
    }//GEN-LAST:event_btnDepos2MouseEntered

    private void btnVerTrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerTrMouseEntered
       btnVerTr.setBackground(new Color(24,183,177));
    }//GEN-LAST:event_btnVerTrMouseEntered

    private void btnDepos2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepos2MouseExited
        btnDepos2.setBackground(new Color(25,88,87));
    }//GEN-LAST:event_btnDepos2MouseExited

    private void btnVerTrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerTrMouseExited
        btnVerTr.setBackground(new Color(25,88,87));
    }//GEN-LAST:event_btnVerTrMouseExited

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose(); // Boton para volver a una ventana anterior
        Inicio ini = new Inicio();
        ini.setVisible(true);
        ini.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnExitCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitCliMouseEntered

    }//GEN-LAST:event_btnExitCliMouseEntered

    private void btnExitCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitCliMouseExited

    }//GEN-LAST:event_btnExitCliMouseExited

    private void btnExitCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitCliActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Desea Salir?","Nuevo Perú Bank",
            JOptionPane.YES_NO_OPTION ) ==JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_btnExitCliActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepos2;
    private javax.swing.JButton btnExitCli;
    private javax.swing.JButton btnNoVer;
    private javax.swing.JButton btnVerTr;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel labelCuenta;
    private javax.swing.JLabel labelLlama;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelLogo2;
    private javax.swing.JPanel labelMainCuenta;
    private javax.swing.JLabel labelNCuenta;
    private javax.swing.JLabel labelQuest;
    private javax.swing.JLabel labelSaldo;
    private javax.swing.JLabel labelSaludo;
    private javax.swing.JLabel labelSoles;
    private javax.swing.JLabel labelTipoCuenta;
    private javax.swing.JPanel panelElec;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel panelSaldo;
    private javax.swing.JPanel panelSaludo;
    // End of variables declaration//GEN-END:variables
}
