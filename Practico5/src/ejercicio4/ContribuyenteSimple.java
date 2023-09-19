package ejercicio4;

public class ContribuyenteSimple extends Contribuyente {

	public ContribuyenteSimple(String nombre, int id, double impuestoFijo) {
		super(nombre, id, impuestoFijo);
	}

	@Override
	public double getImpuesto() {
		return this.getImpuestoFijo();
	}

}
