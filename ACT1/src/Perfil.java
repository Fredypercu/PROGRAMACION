import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Perfil extends JFrame {

	private JPanel contentPane;
	private JTextField caja;
	private JTextField fildNombre;
	private JTextField fildApellidos;
	private JTextField fildEdad;
	private JLabel lblEmail;
	private JTextField fildEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Perfil frame = new Perfil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Perfil() {
		setTitle("Perfil");
		//Las Variables
		String nombre="Alfredo";
		String apellidos="Castellano Albarracín";
		String edad="29";
		String email="fredypercu@gmail.com";
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(5, 5, 166, 20);
		contentPane.add(lblNombre);
		
		fildNombre = new JTextField();
		fildNombre.setEditable(true);
		fildNombre.setBounds(5, 36, 365, 20);
		contentPane.add(fildNombre);
		fildNombre.setColumns(10);
		fildNombre.setText(nombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(5, 67, 365, 20);
		contentPane.add(lblApellidos);
		
		fildApellidos= new JTextField();
		fildApellidos.setEditable(true);
		fildApellidos.setBounds(5, 98, 365, 20);
		contentPane.add(fildApellidos);
		fildApellidos.setColumns(10);
		fildApellidos.setText(apellidos);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(5, 129, 365, 20);
		contentPane.add(lblEdad);
		
		fildEdad = new JTextField();
		fildEdad.setEditable(true);
		fildEdad.setBounds(5, 160, 365, 20);
		contentPane.add(fildEdad);
		fildEdad.setColumns(10);
		fildEdad.setText(edad);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(5, 191, 46, 14);
		contentPane.add(lblEmail);
		
		fildEmail= new JTextField();
		fildEmail.setEditable(true);
		fildEmail.setBounds(5, 216, 365, 20);
		contentPane.add(fildEmail);
		fildEmail.setColumns(10);
		fildEmail.setText(email);
	}
}
