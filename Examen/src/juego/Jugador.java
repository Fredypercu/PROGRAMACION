package juego; 

public class Jugador {
	//Atributos (o propiedades)
		private String nombre;
		private String apellido1;
		private String apellido2;
		private int edad;
		private int puntos;

		//Constructor 
		//Punto de entrada que se ejeuta al crear un objeto de tipo Jugador
		public Jugador(String nom, String ape1, String ape2, int eda) {
			
			if (eda<=0) {
				throw new IllegalArgumentException("Has introducido una edad invalida");
				
				
			}
			
			
			//Dentro del constructor, SE RELLENAN los atributos POR PRIMERA VEZ.
			this.nombre=nom;
			this.apellido1=ape1;
			this.apellido2=ape2;
			this.edad=eda;
			this.puntos=0;		
		
		}
		
			
		
		//M�todos getter
		
		//Obtiene el VALOR de una propiedad
		public String getNombre(){
			return nombre;
		}
		public String getApellido1(){
			return apellido1;
		}	
		
		public String getApellido2(){
			return apellido2;
			
		}
		public int getEdad(){
			return edad;
		}
		public int getPuntos(){
			return puntos;
		}
		
		//M�todos setter
		
		//Modifica el VALOR de una propiedad
		public void setNombre(String nom){
			nombre=nom;
		}
		public void setApellido1(String ape1){
			apellido1=ape1;
		}
		
		public void setApellido2(String ape2){
			apellido2=ape2;
		}
		
		public void setEdad(int eda) {
			if (eda<=0) {
				throw new IllegalArgumentException("Has introducido una edad invalida");
			}
			this.edad = eda;
		}
		
		public void setPuntos (int pun){
			puntos=pun;
		}
		
}