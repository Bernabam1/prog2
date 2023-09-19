package ejercicio5_SolucionDinamica;

public class Empleado {
	private String nombre;

	private String apellido;
	private int dni;
	private FormaPago fp;

	public Empleado(String nombre, String apellido, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
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

	public void setFp(FormaPago fp) {
		this.fp = fp;
	}

	public double cobrarSueldo() {
		return fp.calcularSueldo();
	}

}
