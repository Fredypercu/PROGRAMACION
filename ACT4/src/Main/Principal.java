package Main;

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

import Juego.Jugador;


// Definimos Clase Pincipal

public class Principal extends JFrame {
	
//Variables
	
	private JPanel contentPane;
		
	private JTextField textNombre;
	private JTextField textApellido1;
	private JTextField textApellido2;
	private JTextField textEdad;
	private JTextField cajaMSN;

	
	//La entrada a nuestro programa
	//Es el método main
	
	public static void main(String[] args) {
		
		//Generaremos un nuevo jugador
		
		//Jugador player1=new Jugador ();
		//player1.setNombre("");
		//player1.setApellido1("");
		//player1.setApellido2("");
		//player1.setEdad(999);
		//player1.setId (0;
		
		//Sacamos por pantalla datos jugador generdado
		
		//System.out.println(player1.toString());
		
		
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

	//Constructor, punto entrada a la ventana
	
	public Principal() {
		
		//Título de la ventana
		setTitle("MathDice");
		
		
		//Propiedades de ventana
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 500, 370);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				
				//texto1
				JLabel lblDTJ = new JLabel("DATOS DEL JUGADOR");
				lblDTJ.setFont(new Font("Times New Roman", Font.BOLD, 20));
				lblDTJ.setBounds(103, 11, 242, 25);
				contentPane.add(lblDTJ);
				
				//texto2
				JLabel lblNombre = new JLabel("Nombre");
				lblNombre.setFont(new Font("Times New Roman", Font.BOLD, 14));
				lblNombre.setBounds(10, 49, 60, 14);
				contentPane.add(lblNombre);
				
				//caja de texto 1
				textNombre = new JTextField();
				textNombre.setBounds(139, 47, 264, 20);
				contentPane.add(textNombre);
				textNombre.setColumns(10);
				
				//texto3
				JLabel lblApellido1 = new JLabel("Primer Apellido");
				lblApellido1.setFont(new Font("Times New Roman", Font.BOLD, 14));
				lblApellido1.setBounds(10, 80, 101, 14);
				contentPane.add(lblApellido1);
				
				//caja de texto 2
				textApellido1 = new JTextField();
				textApellido1.setColumns(10);
				textApellido1.setBounds(139, 78, 264, 20);
				contentPane.add(textApellido1);
				
				//texto3
				JLabel lblApellido2 = new JLabel("Segundo Apellido");
				lblApellido2.setFont(new Font("Times New Roman", Font.BOLD, 14));
				lblApellido2.setBounds(10, 112, 119, 14);
				contentPane.add(lblApellido2);
				
				//caja de texto 2
				textApellido2 = new JTextField();
				textApellido2.setColumns(10);
				textApellido2.setBounds(139, 110, 264, 20);
				contentPane.add(textApellido2);
				
				//texto4
				JLabel lblEdad = new JLabel("Edad");
				lblEdad.setFont(new Font("Times New Roman", Font.BOLD, 14));
				lblEdad.setBounds(10, 143, 46, 14);
				contentPane.add(lblEdad);
				
				//caja de texto 3
				textEdad = new JTextField();
				textEdad.setColumns(10);
				textEdad.setBounds(139, 141, 75, 20);
				contentPane.add(textEdad);
				
				//Boton que recoge los datos introducidos
				JButton btnAJUGAR = new JButton("A JUGAR");
				btnAJUGAR.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						//Método para asegurar que todos los labels están rellenados
						//Si faalta alfún campo, devolverá texto de ´´por vaor......//
						if(textNombre.getText().equals("") || textApellido1.getText().equals("") || textApellido2.getText().equals("") || textEdad.getText().equals("")){
							cajaMSN.setText("Por favor, rellene todos los campos para iniciar partida ");
							
						//Si están rellenados correctamente, devolverá msg de Jugador creado correctamente
						}else{
							Jugador j = new Jugador(textNombre.getText(), textApellido1.getText(), textApellido2.getText(), Integer.valueOf(textEdad.getText()));
							cajaMSN.setText(" Nuevo Jugador: "+j.getNombre()+" "+j.getApellido1()+" "+j.getApellido2()+","+" " +j.getEdad()+ " años"+", creado correctamente!!");
						}
						
					}	
				});
				btnAJUGAR.setBounds(10, 189, 464, 25);
				contentPane.add(btnAJUGAR);
				
				//caja de texto 4, muestra mensaje de error o de jugador creado correctamente
				cajaMSN = new JTextField();
				cajaMSN.setBounds(10, 225, 464, 55);
				contentPane.add(cajaMSN);
				cajaMSN.setColumns(10);
				
				
				
			

	}

}
