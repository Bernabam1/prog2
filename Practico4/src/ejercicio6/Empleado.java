package ejercicio6;

public class Empleado extends Persona {
	private int numLegado;
	private double sueldo;
	
	public Empleado (String nombre, String apellido, int edad, int numLegado, double sueldo) {
		super(nombre, apellido, edad);
		this.numLegado = numLegado;
		this.sueldo = sueldo;
	}

	public int getNumLegado() {
		return numLegado;
	}

	public void setNumLegado(int numLegado) {
		this.numLegado = numLegado;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public void printDatosCompletos() {
		super.printDatosCompletos();
		System.out.println(this.getNumLegado()+"\n"+this.getSueldo());
	}
}
