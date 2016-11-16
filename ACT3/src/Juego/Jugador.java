package Juego;

public class Jugador {
	
	//Propiedades
	
	private String nombre;
	private String apellidos;
	private String apellido1;
	private String apellido2;
	private int edad;
	private int puntos;
	private int id;
	
	//Punto de entrada que se ejeuta al crear un objeto de tipo Jugador
	//Métodos Getters and Setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getApellido1() {
		return apellido1;
	}


	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	public String getApellido2() {
		return apellido2;
	}


	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
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


	public Jugador(){
	
	}
	
	
	//Constructor
	// Punto de entrada que se ejecuta al crear un objeto de tipo jugador
	
	public String toString(){
		
		return this.nombre+" "+this.apellido1+" "+this.apellido2+", "+this.edad+" Años, "+this.id+" Id ";
	}

}
