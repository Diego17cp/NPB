package gui;
import java.awt.Color;
import javax.swing.table.DefaultTableModel; // Asigna un modelo a la tabla 
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import db.ConexionOracle;
import java.awt.Font; // Objeto para modificar la letra de los elementos 
import java.awt.Image;
import java.util.Date; // Objeto para obtener una fecha
import javax.swing.JOptionPane;
import javax.swing.WindowConstants; // Modificacion de la ventana
import javax.swing.table.JTableHeader; // Objeto para editar los encabezados de la tabla

public class Transacciones extends javax.swing.JFrame {
    private String idcuenta;
    public Transacciones(String idCuenta) { // Constructor para traer el id cuenta
        this.idcuenta=idCuenta;
        initComponents();
        String[] columnas = {"ID Transacción", "Tipo", "Monto", "Fecha"}; // Asignamos nombres a las columnas con un Array
        DefaultTableModel modeloTabla = new DefaultTableModel(null, columnas); // Establecemos el modelo de la tabla con el array q creamos para las columnas
        tablaTransacciones.setModel(modeloTabla); // Se le asigna el modelo a la tabla que tenemos creada
        JTableHeader header = tablaTransacciones.getTableHeader(); // Objeto y metodo para obtener el encabezado de la tabla y poder editarlo
        header.setBackground(new Color(24,183,177));  // Color de fondo del encabezado
        header.setForeground(new Color(13,82,84)); // Color para la fuente del encabezado
        header.setFont(new Font("Lewadee", Font.BOLD, 18)); // Tipo y tamaño de fuente para el encabezado
        tablaTransacciones.setRowHeight(25); // Asignamos una altura a las filas
        this.setTitle("Nuevo Perú Bank - Transacciones");
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logo2.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        obtenerTransacciones();  // Metodo para llamar a las transacciones
    }
    private void obtenerTransacciones(){
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaTransacciones.getModel();
        modeloTabla.setRowCount(0); // Volvemos a llamar al mdelo de tabla y le asignamos un numero de filas de 0, esto para que se vaya autocompletando dependiendo de la cantidad de transacciones
        try (Connection conn = ConexionOracle.getConnection()) {
            String sql = "SELECT idtransaccion, tipo, monto, f_tra FROM transaccion WHERE idcuenta = ?"; // Llamamos a toda la informacion de una transaccion dependiendo de la idcuenta que trajimos desde la ventana anterior
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, idcuenta);
            ResultSet rs = ps.executeQuery();
            modeloTabla.setRowCount(0); 
            while (rs.next()) { // Mientras que la consulta funcione correctamente se le asignarán los valores respectivos a cada fila, se usa un bucle para siempre mostrar todas las transacciones y no solo una
                String idTransaccion = rs.getString("idtransaccion");
                String tipo = rs.getString("tipo");
                Double monto = rs.getDouble("monto");
                Date fecha = rs.getDate("f_tra");

                Object[] fila = { idTransaccion, tipo, monto, fecha };
                modeloTabla.addRow(fila); // Finalmente, mientras se cumpla todo, irá autocompletando y añadiendo filas con toda la informacion que obtenga de la consulta
            }
        }
        catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al cargar las transacciones: " + e.getMessage(),
            "Nuevo Perú Bank - Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTransacciones = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(226, 167, 84));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego17\\Downloads\\logo2.png")); // NOI18N
        jPanel1.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 82, 84));
        jLabel1.setText("Transacciones");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        tablaTransacciones.setBackground(new java.awt.Color(13, 82, 84));
        tablaTransacciones.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        tablaTransacciones.setForeground(new java.awt.Color(24, 183, 177));
        tablaTransacciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaTransacciones.setFocusable(false);
        tablaTransacciones.setGridColor(new java.awt.Color(24, 183, 177));
        jScrollPane1.setViewportView(tablaTransacciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 740, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JTable tablaTransacciones;
    // End of variables declaration//GEN-END:variables
}
