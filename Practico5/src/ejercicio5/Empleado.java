package ejercicio5;

public abstract class Empleado {
	private String nombre;
	private String apellido;
	private int dni;
	private double sueldoBase;

	public Empleado(String nombre, String apellido, int dni, double sueldoBase) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sueldoBase = sueldoBase;
	}

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

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public abstract double cobrarSueldo();
}
