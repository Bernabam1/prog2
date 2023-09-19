package ejercicio5_SolucionDinamica;

public class ComisionPorVenta extends FormaPago {
	private double montoVentas;
	private double porcentajePorVenta;

	public ComisionPorVenta() {
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

	protected double calcularSueldo() {
		return this.getSueldoBase() + (this.getSueldoBase() * (this.getPorcentajePorVenta() / 100));
	}

}
