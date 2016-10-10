import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProbandoBotones extends JFrame {

	private JPanel contentPane;
	private JTextField caja;
	private JTextField caja2;
	private JButton boton;
	private JButton boton2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProbandoBotones frame = new ProbandoBotones();
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

	public ProbandoBotones() {
		setTitle("Probando Botones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		caja = new JTextField();
		caja.setBounds(31, 129, 110, 20);
		contentPane.add(caja);
		caja.setColumns(10);
		
		caja2 = new JTextField();
		caja2.setBounds(280, 129, 125, 20);
		contentPane.add(caja2);
		caja2.setColumns(10);
		
		boton = new JButton("->");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja2.setText(caja.getText());
			}
		});
		boton.setBounds(162, 90, 89, 23);
		contentPane.add(boton);
		
		boton2 = new JButton("<-");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja2.getText());
			}
		});
		boton2.setBounds(162, 167, 89, 23);
		contentPane.add(boton2);
	}
}

