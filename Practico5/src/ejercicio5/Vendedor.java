package ejercicio5;

public class Vendedor extends Empleado {
	private double montoVentas;
	private double porcentajePorVenta;

	public Vendedor(String nombre, String apellido, int dni, double sueldoBase) {
		super(nombre, apellido, dni, sueldoBase);
		this.montoVentas = 0;
		this.porcentajePorVenta = 0;
	}

	public double getMontoVentas() {
		return montoVentas;
	}

	public void setMontoVentas(double montoVentas) {
		this.montoVentas = montoVentas;
	}

	public double getPorcentajePorVenta() {
		return porcentajePorVenta;
	}

	public void setPorcentajePorVenta(double porcentajePorVenta) {
		this.porcentajePorVenta = porcentajePorVenta;
	}

	@Override
	public double cobrarSueldo() {
		return this.getSueldoBase()+(this.getSueldoBase()*(this.getPorcentajePorVenta()/100));
	}

}
