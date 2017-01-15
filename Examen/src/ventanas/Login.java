package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import juego.Jugador;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Window.Type;

public class Login extends JFrame {

	//Atributos
	
	private JPanel contentPane;
	
	private ImageIcon[] dados3=new ImageIcon[3];
	private ImageIcon[] dados6=new ImageIcon[6];
	private ImageIcon[] dados12=new ImageIcon[12];
	
	private JLabel dado1,dado2,dado3;
	private JLabel dado4,dado5;
	private JLabel dado6;
	
	private Jugador jug;
	
	//Atributos P05

	private JTextField sumDados;
	private JButton botonMenos;
	private Boolean alternando = false; 
	
	//Variables recoger la operacion que se esta realizando
	//una sera 0 porque es el resultado final y se inicializa en 0
	//otra sera el controladorOperacion que tiene 3 valores posibles: 2 que es el estado inicial; 1 para sumar y 0 para restar.
	private int resultadoFinal = 0;
	private int controladorOperacion =2;
	private JLabel resultadoenTexto;
	private JButton botonRelanzar;
	
	//referencia a ventana Login para ser usada en el boton "relanzar"
	private Login ref;

	//Creacion de la ventana
	public Login(Jugador j) {
		setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		setForeground(new Color(0, 0, 255));
		setType(Type.UTILITY);
		this.jug=j;
		
		//T�tulo Ventana
		setTitle("JUGADA MATHDICE");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(325, 325, 650, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Label1 - Que contiene una concatenacion de String formado por la cadena ".." 
		//+ la propiedad nombre del jugador (que le estamos pasando por parametros)
		JLabel label1 = new JLabel(" Hola " +jug.getNombre()+", bienvenido al juego!!");
		label1.setBounds(394, 11, 233, 14);
		contentPane.add(label1);
		
	
		//Cargamos las imagenes en los arrays
		//Inicializacion / condicion / paso
		//inicializacion de la variable que se va a utilizar dentro del for ( util para acceder a diferentes posiciones del for a medida que avanza el incremento)
		for(int i=0;i<dados3.length;i++){
			//getClass para coger el tipo de la clase que hay que meter por parametros
			//getResource para obtener lo que se encuentra en la ruta que le pasamos por parametros en forma de String
			dados3[i]=new ImageIcon(getClass().getResource("img/dado"+String.valueOf(i+1)+"_3.png"));
		}
		for(int i=0;i<dados6.length;i++){
			dados6[i]=new ImageIcon(getClass().getResource("img/dado"+String.valueOf(i+1)+"_6.png"));
		}
		for(int i=0;i<dados12.length;i++){
			dados12[i]=new ImageIcon(getClass().getResource("img/dado"+String.valueOf(i+1)+".png"));
		}
		
		//Creamos los numeros aleatorios
		//Int esta entre parentesis porque se esta casteando, como el metodo floor devuelve un double, lo forzamos a que su salida sea un integer
		
		//dados3							//Se llama a la clase Math, metodo random y se multiplica por (numMax - numMin +1) + numMin
		int valordado1 = (int) Math.floor(Math.random()*(2-0+1)+0);
		int valordado2 = (int) Math.floor(Math.random()*(2-0+1)+0);
		
		
		//dados6
		int valordado3 = (int) Math.floor(Math.random()*(5-0+1)+0);
		int valordado4 = (int) Math.floor(Math.random()*(5-0+1)+0);
		int valordado5 = (int) Math.floor(Math.random()*(5-0+1)+0);
		
		//dodecaedro
		int valordado6 = (int) Math.floor(Math.random()*(11-0+1)+0);
		
		
		//Creamos JLabel en la ventana
		
		dado1 = new JLabel();
		//SetIcon llama a la posicion valordado1 del array dados3 y cuando lo llama lo transforma en icono
		dado1.setIcon(dados3[valordado1]);
		dado1.setBounds(20, 11, 146, 129);
		contentPane.add(dado1);
		
		
		dado1.addMouseListener(
				
				//Esta es la Clase que tiene el metodo para que se ejecute la accion del raton
				new MouseAdapter() { 
					MouseAdapter referencia=this;
					//Esta es el metodo para que se ejecute la accion del raton
					//Void porque no va a devolver nada
					public void mouseClicked(MouseEvent arg0) {
						//Comprobacion de que alternando esta en false, en este caso se ejecutar� el codigo de dentro y se cambiara 
						//a true para que no podamos pinchar otra vez el mismo tipo de boton (dados)
						if (alternando==false){
							dado1.setEnabled(false);
							String aux=sumDados.getText(); //<- Se coge el texto que exista para actualizar sin perder los datos ya introducidos
							String aux2=aux + String.valueOf(valordado1+1); //+1 porque el contador empieza ya con valor 0
							sumDados.setText(aux2);
							dado1.removeMouseListener(referencia);
							alternando=true;
							
							//Para primera eleccion pulsada
							if(resultadoFinal == 0) {
								resultadoFinal = valordado1+1;
							//Para las demas elecciones
							}else{
								if(controladorOperacion == 1){//==1 suma
									resultadoFinal = resultadoFinal + (valordado1+1);
								}else if (controladorOperacion == 0){//==0 resta
									resultadoFinal = resultadoFinal - (valordado1+1);
								}
							}
						}
						
					}
				}
			);
		
		dado2 = new JLabel();
		dado2.setIcon(dados3[valordado2]);
		dado2.setBounds(209, 9, 146, 131);
		contentPane.add(dado2);
		
		dado2.addMouseListener(
				//Esta es la Clase que tiene el metodo para que se ejecute la accion del raton
				new MouseAdapter() {
					MouseAdapter referencia=this;
					//Esta es el metodo para que se ejecute la accion del raton
					//Void porque no va a devolver nada
					public void mouseClicked(MouseEvent arg0) {
						if (alternando==false){
							dado2.setEnabled(false);
							String aux=sumDados.getText(); //<- Se coge el texto que exista para actualizar sin perder los datos ya introducidos
							String aux2=aux + String.valueOf(valordado2+1);
							sumDados.setText(aux2);
							dado2.removeMouseListener(referencia);
							alternando=true;
							if(resultadoFinal == 0) {
								resultadoFinal = valordado2+1;
							}else{
								if(controladorOperacion == 1){
									resultadoFinal = resultadoFinal + (valordado2+1);
								}else if (controladorOperacion == 0){
									resultadoFinal = resultadoFinal - (valordado2+1);
								}
							}
						}
					}
				}
			);
		
		dado3 = new JLabel();
		dado3.setIcon(dados6[valordado3]);
		dado3.setBounds(20, 152, 146, 129);
		contentPane.add(dado3);
		
		dado3.addMouseListener(
				//Esta es la Clase que tiene el metodo para que se ejecute la accion del raton
				new MouseAdapter() { 
					MouseAdapter referencia=this;
					//Esta es el metodo para que se ejecute la accion del raton
					//Void porque no va a devolver nada
					public void mouseClicked(MouseEvent arg0) {
						if (alternando==false){
							dado3.setEnabled(false);
							String aux=sumDados.getText(); //<- Se coge el texto que exista para actualizar sin perder los datos ya introducidos
							String aux2=aux + String.valueOf(valordado3+1);
							sumDados.setText(aux2);
							dado3.removeMouseListener(referencia);
							alternando=true;
							if(resultadoFinal == 0) {
								resultadoFinal = valordado3+1;
							}else{
								if(controladorOperacion == 1){
									resultadoFinal = resultadoFinal + (valordado3+1);
								}else if (controladorOperacion == 0){
									resultadoFinal = resultadoFinal - (valordado3+1);
								}
							}
						}
					}
				}
			);
		
		dado4 = new JLabel();
		dado4.setIcon(dados6[valordado4]);
		dado4.setBounds(209, 152, 146, 129);
		contentPane.add(dado4);
		
		dado4.addMouseListener(
				//Esta es la Clase que tiene el metodo para que se ejecute la accion del raton
				new MouseAdapter() { 
					MouseAdapter referencia=this;
					//Esta es el metodo para que se ejecute la accion del raton
					//Void porque no va a devolver nada
					public void mouseClicked(MouseEvent arg0) {
						if (alternando==false){
							dado4.setEnabled(false);
							String aux=sumDados.getText(); //<- Se coge el texto que exista para actualizar sin perder los datos ya introducidos
							String aux2=aux + String.valueOf(valordado4+1);
							sumDados.setText(aux2);
							dado4.removeMouseListener(referencia);
							alternando=true;
							if(resultadoFinal == 0) {
								resultadoFinal = valordado4+1;
							}else{
								if(controladorOperacion == 1){
									resultadoFinal = resultadoFinal + (valordado4+1);
								}else if (controladorOperacion == 0){
									resultadoFinal = resultadoFinal - (valordado4+1);
								}
							}
						}
					}
				}
			);
		
		dado5 = new JLabel();
		dado5.setIcon(dados6[valordado5]);
		dado5.setBounds(394, 152, 146, 129);
		contentPane.add(dado5);
		
		dado5.addMouseListener(
				//Esta es la Clase que tiene el metodo para que se ejecute la accion del raton
				new MouseAdapter() { 
					MouseAdapter referencia=this;
					//Esta es el metodo para que se ejecute la accion del raton
					//Void porque no va a devolver nada
					public void mouseClicked(MouseEvent arg0) {
						if (alternando==false){
						dado5.setEnabled(false);
						String aux=sumDados.getText(); //<- Se coge el texto que exista para actualizar sin perder los datos ya introducidos
						String aux2=aux + String.valueOf(valordado5+1);
						sumDados.setText(aux2);
						dado5.removeMouseListener(referencia);
						alternando=true;
						if(resultadoFinal == 0) {
							resultadoFinal = valordado5+1;
						}else{
							if(controladorOperacion == 1){
								resultadoFinal = resultadoFinal + (valordado5+1);
							}else if (controladorOperacion == 0){
								resultadoFinal = resultadoFinal - (valordado5+1);
							}
						}
						}
					}
				}
			);
		
		dado6 = new JLabel();
		dado6.setIcon(dados12[valordado6]);
		dado6.setBounds(10, 288, 191, 153);
		contentPane.add(dado6);
		
		//Caja que muestra el valor de los dados cuando clickas
		sumDados = new JTextField();
		sumDados.setEditable(false);
		sumDados.setBounds(237, 385, 130, 48);
		contentPane.add(sumDados);
		sumDados.setColumns(10);

		//Boton de suma
		JButton botonMas = new JButton("+");
		botonMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Comprobacion de que alternando esta en true, en este caso se ejecutar� el codigo de dentro y se cambiara 
				//a false para que no podamos pinchar otra vez el mismo tipo de boton (suma o resta)
				if (alternando==true){
					String aux=sumDados.getText(); // Recoge los datos para ir a�adiendo, sin perder el anterior (actualizador)
					String aux2=aux + "+";
					sumDados.setText(aux2);
					alternando=false;
					controladorOperacion = 1; //para que sume en posteriores operaciones
				}
			}
		});
		botonMas.setBounds(209, 339, 89, 23);
		contentPane.add(botonMas);
		
		
		//Boton de resta
		botonMenos = new JButton("-");
		botonMenos.setBounds(306, 339, 89, 23);
		contentPane.add(botonMenos);
		
		
		botonMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (alternando==true){
						String aux=sumDados.getText(); // Recoge los datos para ir a�adiendo, sin perder el anterior (actualizador)
						String aux2=aux + "-";
						sumDados.setText(aux2);
						alternando=false;
						controladorOperacion = 0; //para que reste en posteriores operaciones
				}
			}
		});
		
		//label que muestra el resultado
				JLabel labelResultado = new JLabel();
				labelResultado.setForeground(Color.BLUE);
				labelResultado.setHorizontalAlignment(SwingConstants.CENTER);
				labelResultado.setBounds(63, 444, 68, 48);
				contentPane.add(labelResultado);
		
		//Boton "MATHDICE"
		JButton botonMathdice = new JButton("MATHDICE ");
		botonMathdice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
										//length 3 para obligar a hacer una operacion (numero +/- numero)
				if(sumDados.getText().length()>=3){
					labelResultado.setText(String.valueOf(resultadoFinal));
					//comprobomaos que el resultado acumulado sea igual al dodecaedro
					if(valordado6+1==resultadoFinal){
						resultadoenTexto.setText("HAS GANADO !");
						botonRelanzar.setEnabled(true);
						// ! = indica negacion de lo siguiente que se escribe. (si esto no es verdad, haz esto)
					}else if(!(valordado6+1==resultadoFinal)){ 
						resultadoenTexto.setText("VUELVE A INTENTARLO !");
						botonRelanzar.setEnabled(true);
					}
				}
			}
		});
		botonMathdice.setBounds(175, 444, 252, 48);
		contentPane.add(botonMathdice);


		//Jlabel que muestra si has ganado o no
		resultadoenTexto = new JLabel();
		resultadoenTexto.setForeground(Color.RED);
		resultadoenTexto.setFont(new Font("Times New Roman", Font.BOLD, 15));
		resultadoenTexto.setBounds(394, 385, 230, 48);
		contentPane.add(resultadoenTexto);
		
		//ref=this para referenciar la ventana actual
		ref=this;
		
		//boton para relanzar los dados
		botonRelanzar = new JButton(" Play Again !");
		botonRelanzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				//creamos una nueva ventana, la hacemos visible
				Login l2 = new Login(j);
				l2.setVisible(true);
				
				//Aqui Cierra la ventana actual
				ref.dispose();
			}
		});
		botonRelanzar.setEnabled(false);
		botonRelanzar.setBounds(455, 457, 169, 23);
		contentPane.add(botonRelanzar);
		
		
		
	
	}
}