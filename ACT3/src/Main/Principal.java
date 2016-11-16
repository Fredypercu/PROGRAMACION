package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.Jugador;


// Definimos Clase Pincipal

public class Principal extends JFrame {
	
//Variables
	
	private JPanel contentPane;

	
	//La entrada a nuestro programa
	//Es el método main
	
	public static void main(String[] args) {
		
		
		
		//Generaremos un nuevo jugador
		
		Jugador player1=new Jugador ();
		player1.setNombre("Alfredo");
		player1.setApellido1("Castellano");
		player1.setApellido2("Albarracín");
		player1.setEdad(29);
		player1.setId (1);
		
		//Sacamos por pantalla datos jugador generdado
		
		System.out.println(player1.toString());
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Constructor
	
	public Principal() {
		
		//Título de la ventana
		setTitle("MathDice");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
