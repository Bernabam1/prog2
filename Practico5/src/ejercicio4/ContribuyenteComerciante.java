package ejercicio4;

public class ContribuyenteComerciante extends Contribuyente {
	private double facturacionVentas;

	public ContribuyenteComerciante(String nombre, int id, double impuestoFijo, double facturacionVentas) {
		super(nombre, id, impuestoFijo);
		this.facturacionVentas = facturacionVentas;
	}

	public double getFacturacionVentas() {
		return facturacionVentas;
	}

	public void setFacturacionVentas(double facturacionVentas) {
		this.facturacionVentas = facturacionVentas;
	}

	@Override
	public double getImpuesto() {
		return (this.getImpuestoFijo() / 2) + ((this.getFacturacionVentas() * 3.5) / 100);
	}

}
