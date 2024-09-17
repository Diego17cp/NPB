package main;
//@author Diego17

import gui.Inicio;

public class Entregable {
    // El controlador Main para que el proyecto corra con este único método y llevar orden.
    public static void main(String[] args) {
        Inicio ini = new Inicio(); // Llamamos a la ventana de Inicio
        ini.setVisible(true); // Método para hacer visible una ventana
        ini.setLocationRelativeTo(null); // Método para colocar la ventana en el centro de la pantalla
    }
    
}
