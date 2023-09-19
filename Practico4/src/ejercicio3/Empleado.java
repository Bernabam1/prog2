package ejercicio3;

public class Empleado extends Persona {
	
	private final double EXTRAPORHORA = 10;
	private double sueldo;
	private int horasExtras;

	public Empleado(String fullName, int horasExtras) {
		super(fullName);
		this.sueldo = 100;
		this.horasExtras = horasExtras;
	}

	public double getSueldo() {
		return sueldo + this.getHorasExtras()*EXTRAPORHORA;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}
	
}
