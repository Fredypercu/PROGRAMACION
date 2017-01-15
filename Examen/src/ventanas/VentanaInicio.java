package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import juego.Jugador;
import java.awt.Color;

public class VentanaInicio extends JFrame {

	private JPanel contentPane;

	private JTextField textNombre;
	private JTextField textApellido1;
	private JTextField textApellido2;
	private JTextField textEdad;
	private JTextField cajaMSN;
	
	private VentanaInicio ref;

	//Crea un objeto de tipo VentanaInicio
	public VentanaInicio() {

		//Título Ventana
		setTitle("Login");
		// Propiedades de ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// texto1
		JLabel lblDTJ = new JLabel("DATOS DEL JUGADOR");
		lblDTJ.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblDTJ.setBounds(10, 11, 242, 25);
		contentPane.add(lblDTJ);

		// texto2
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNombre.setBounds(10, 50, 63, 14);
		contentPane.add(lblNombre);

		// texto3
		JLabel lblApellido1 = new JLabel("Pimer Apellido");
		lblApellido1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblApellido1.setBounds(10, 80, 101, 14);
		contentPane.add(lblApellido1);
		
		JLabel lblApellido2 = new JLabel("Segundo Apellido");
		lblApellido2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblApellido2.setBounds(10, 104, 119, 14);
		contentPane.add(lblApellido2);

		// texto4
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font ("Times New Roman", Font.BOLD, 14));
		lblEdad.setBounds(10, 129, 46, 14);
		contentPane.add(lblEdad);


		// caja Nombre
		textNombre = new JTextField();
		textNombre.setBounds(130, 47, 286, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);

		// caja Apellidos
		textApellido1 = new JTextField();
		textApellido1.setColumns(10);
		textApellido1.setBounds(130, 78, 286, 20);
		contentPane.add(textApellido1);
		
		//caja de texto 2
		textApellido2 = new JTextField();
		textApellido2.setColumns(10);
		textApellido2.setBounds(130, 102, 286, 20);
		contentPane.add(textApellido2);
		

		// caja Edad
		textEdad = new JTextField();
		textEdad.setColumns(10);
		textEdad.setBounds(130, 126, 46, 20);
		contentPane.add(textEdad);

		// caja MSN (Mensaje Nuevo Jugador)
		cajaMSN = new JTextField();
		cajaMSN.setBounds(10, 188, 414, 62);
		contentPane.add(cajaMSN);
		cajaMSN.setColumns(10);

		//Asignamos la referencia de esta ventana
		ref=this;
		
		// Boton
		JButton btnAJUGAR = new JButton("A JUGAR");
		btnAJUGAR.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAJUGAR.setForeground(Color.RED);
		btnAJUGAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				try{				
					if (textNombre.getText().equals("") || textApellido1.getText().equals("") || textApellido2.getText().equals("") || textEdad.getText().equals("")) {
						cajaMSN.setText("Rellene todos los campos parea poder empezar el juego");
					} else {
						Jugador j = new Jugador(textNombre.getText(), textApellido1.getText(), textApellido2.getText(), Integer.valueOf(textEdad.getText()));
						cajaMSN.setText("Player " + j.getNombre() + " " + j.getApellido1() + " "+j.getApellido2()+","+" " +j.getEdad()+ " años"+", creado correctamente!!");
						//Aqui creamos un objeto de tipo login(una ventana de login) pero no se va a ejecutar todavia
						Login l =new Login(j);
						//Con esta linea hacemos que la ventana se muestre.
						l.setVisible(true); 
						
						//Cierra la ventana
						ref.dispose();
					}				
				} catch(Exception e) {
					cajaMSN.setText("Has introducido un valor de edad invalido");
				}
			}
		});
		btnAJUGAR.setBounds(10, 154, 383, 23);
		contentPane.add(btnAJUGAR);
	}

}
