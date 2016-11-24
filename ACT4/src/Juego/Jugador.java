package Juego;

public class Jugador {
	
	//Propiedades
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int edad;
	private int puntos;
	private int id;
	
	//Punto de entrada que se ejeuta al crear un objeto de tipo Jugador
	
	public Jugador(String nom, String ape1, String ape2, Integer eda){
		
		nombre=nom;
		apellido1=ape1;
		apellido2=ape2;
		edad=eda;
		puntos=0;
	
	}
	//Métodos Getters and Setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nom) {
		this.nombre = nom;
	}

	public String getApellido1() {
		return apellido1;
	}


	public void setApellido1(String ape1) {
		this.apellido1 = ape1;
	}


	public String getApellido2() {
		return apellido2;
	}


	public void setApellido2(String ape2) {
		this.apellido2 = ape2;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int eda) {
		this.edad = eda;
	}


	public int getPuntos() {
		return puntos;
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	//Métodos para comprobar si una cadena es un número
	//Devuelve true si es un numero
	
	public boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
	
	//Método para comprobar si una cadena es un conjunto de espacios

	public boolean sonEspacios(String cad)
	{
	for(int i =0; i<cad.length(); i++)
	if(cad.charAt(i) != ' ')
	return false;
	
	return true;
	}
}

