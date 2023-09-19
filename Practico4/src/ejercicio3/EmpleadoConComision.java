package ejercicio3;

public class EmpleadoConComision extends Empleado {

	private final double COMISION = 0.15;
	private int cantidadVentas;

	public EmpleadoConComision(String fullName, int horasExtras, int cantidadVentas) {
		super(fullName, horasExtras);
		this.cantidadVentas = cantidadVentas;
	}

	public double getComision() {
		return COMISION;
	}

	public int getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(int cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}

	public double getSueldo() {
		return(super.getSueldo()+(this.getComision()*this.getCantidadVentas()));
	}
}
