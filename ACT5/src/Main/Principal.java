package Main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import Ventanas.Juego;

public class Principal extends JFrame{
	public Principal() {
	}
	
	// Punto de entrada de nuestra aplicaci�n
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Creamos un objeto de tipo VentanaInicio llamado frame
					Juego frame = new Juego();
					// Aqu� hacemos visible el objeto frame
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
