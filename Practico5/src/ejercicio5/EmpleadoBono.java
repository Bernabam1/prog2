package ejercicio5;

public class EmpleadoBono extends Empleado {
	private int cantVentas;

	public EmpleadoBono(String nombre, String apellido, int dni, double sueldoBase) {
		super(nombre, apellido, dni, sueldoBase);
		this.cantVentas = 0;
	}

	public int getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}

	public double getBono() {
		double bono = 0;
		if (this.getCantVentas() < 50) {
			return 0;
		}
		if (this.getCantVentas() >= 50) {
			bono = 1000;
		}
		if (this.getCantVentas() >= 100) {
			bono = 3000;
		}
		return bono;
	}

	@Override
	public double cobrarSueldo() {
		return this.getSueldoBase() + this.getBono();
	}

}
