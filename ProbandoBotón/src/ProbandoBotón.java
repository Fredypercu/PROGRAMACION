import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ProbandoBotón extends JFrame {

	private JPanel contentPane;
	private JTextField caja;
	private JButton Boton2;
	private JTextField caja2;

	/**
	 * Punto de Entrada a nuestra app.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProbandoBotón frame = new ProbandoBotón();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Configuración de la Ventana.
	 */
	public ProbandoBotón() {
		//Marco y Contenido
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Boton
		JButton Boton = new JButton("APRETAME");
		//LISTENER + EVENTO
		//------------
		Boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Acción a Desarrollar
				System.out.println("Mensaje cuando aprieto");
				caja.setText("Mensaje cuando aprieto");
			}
		});
		
		//--------------
		Boton.setBounds(10, 11, 137, 23);
		contentPane.add(Boton);
		
		//Mi caja de Texto
		caja = new JTextField();
		caja.setBounds(10, 70, 414, 20);
		contentPane.add(caja);
		caja.setColumns(10);
		
		//Segundo Boton
		Boton2 = new JButton("COMEME!!");
		//LISTENER + EVENTO
		//------------
		Boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja2.setText(caja.getText());
			}
		});
		//------------
		Boton2.setBounds(10, 126, 137, 23);
		contentPane.add(Boton2);
		
		
		//Segunda caja de Texto
		caja2 = new JTextField();
		caja2.setColumns(10);
		caja2.setBounds(10, 186, 414, 20);
		contentPane.add(caja2);
	}
}
