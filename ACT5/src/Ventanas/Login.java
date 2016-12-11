package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.Jugador;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Login extends JFrame {

	private JPanel contentPane;
	private Jugador jug;
	private JLabel tablero;

	//Creacion de la ventana
	public Login(Jugador j) {
		
		// referencia a nuevo jugador creado que cogerá los datos introducidos si son correctos
		this.jug=j;
		
		//Título de la ventana
		setTitle("Inicio");
		
		//Propiedades nueva ventana que se lanzará al pulsar botón "A Jugar" si todos los datos son correctos del registro del nuevo jugador
		// Segunda ventana, es Ventana Juego
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//JLabel IMAGEN DEL TABLERO
		tablero = new JLabel();
		tablero.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon tituloImagen = new ImageIcon(getClass().getResource("/img/mathdice.jpg"));
		
		//Labeljugador que variará según el jugador introducido.
		JLabel labeljugador = new JLabel(" Hola " +jug.getNombre()+", bienvenido al juego!!");
		labeljugador.setBounds(234, 11, 229, 25);
		contentPane.add(labeljugador);
		tablero.setIcon(tituloImagen);
		tablero.setBounds(72, 81, 340, 158);
		contentPane.add(tablero);
		
	
	}
}
