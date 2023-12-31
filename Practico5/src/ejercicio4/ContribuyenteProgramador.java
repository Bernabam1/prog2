package ejercicio4;

public class ContribuyenteProgramador extends Contribuyente {
	private double facturacionSoftware;

	public ContribuyenteProgramador(String nombre, int id, double impuestoFijo, double facturacionSoftware) {
		super(nombre, id, impuestoFijo);
		this.facturacionSoftware = facturacionSoftware;
	}

	public double getFacturacionSoftware() {
		return facturacionSoftware;
	}

	public void setFacturacionSoftware(double facturacionSoftware) {
		this.facturacionSoftware = facturacionSoftware;
	}

	@Override
	public double getImpuesto() {
		return (this.getImpuestoFijo() / 5) + ((this.getFacturacionSoftware() * 2) / 100);
	}

}
