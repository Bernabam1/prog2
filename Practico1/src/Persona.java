
public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	private String fechaNacimiento;
	private int dni;
	private char sexo;
	private double peso;
	private double altura;

	// Constructores

	public Persona(int nuevoDni) {
		this.dni = nuevoDni;
		this.fechaNacimiento = "1/1/2000";
		this.sexo = 'F';
		this.nombre = "N";
		this.apellido = "N";
		this.peso = 1;
		this.altura = 1;

	}

	public Persona(int nuevoDni, String nuevoNombre, String nuevoApellido) {
		this.dni = nuevoDni;
		this.nombre = nuevoNombre;
		this.apellido = nuevoApellido;
	}

	public Persona(int nuevoDni, String nuevoNombre, String nuevoApellido, String nuevaFechaNac) {
		this.dni = nuevoDni;
		this.nombre = nuevoNombre;
		this.apellido = nuevoApellido;
		this.fechaNacimiento = nuevaFechaNac;
	}

	// Getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getDni() {
		return dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Métodos

	public double getIMC() {
		return this.getPeso() / (this.getAltura() * this.getAltura());
	}

	public boolean estaEnForma() {
		return this.getIMC() >= 18.5 && this.getIMC() <= 25;
	}

	public boolean esCumple() {
		return this.getFechaNacimiento() == "1/1/2000";
	}

	public boolean esMayor() {
		return this.getEdad() >= 18;
	}

	public boolean puedeVotar() {
		return this.getEdad() >= 16;
	}

	public boolean esCoherente() {
		return this.getEdad() == 23 && this.getFechaNacimiento() == "1/1/2000";
	}

	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Edad: " + edad);
		System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
		System.out.println("DNI: " + dni);
		System.out.println("Sexo: " + sexo);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
	}

	public static void main(String[] args) {

		/*
		 * Persona a= new Persona(10); Persona b = new Persona(5,"Juan","Rodriguez");
		 * Persona c = new Persona(5,"Rodriguez"); Persona d = new Persona("juan",12);
		 * System.out.println(a.getDatosCompletos());
		 * System.out.println(b.getDatosCompletos());
		 */

		Persona a = new Persona(35033429);

		a.setAltura(1.70);
		a.setPeso(100);

		System.out.println(a.getIMC());
		System.out.println(a.estaEnForma());

		a.setEdad(22);
		System.out.println(a.puedeVotar());
		System.out.println(a.esCoherente());
		System.out.println(a.esMayor());

		a.mostrarDatos();
	}

}
