package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionOracle {
    public static Connection getConnection() throws SQLException { // metodo para llamar a la conexion realizada
        String url = "jdbc:oracle:thin:@192.168.101.2:1521:XE"; // Cambia el URL de acuerdo a la conexion que crees
        String user = "C##Diegox17";// Usuario con la que creaste la conexion
        String password = "root";// Contraseña de dicho usuario

        try {
            Class.forName("oracle.jdbc.OracleDriver"); // Cargar el driver
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error al conectar");
        }
        return DriverManager.getConnection(url, user, password);
    }
}
