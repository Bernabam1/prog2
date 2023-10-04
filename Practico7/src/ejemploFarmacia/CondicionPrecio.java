package ejemploFarmacia;

public class CondicionPrecio implements Condicion {
	private double precioTope;

	public CondicionPrecio(double precioTope) {
		this.precioTope = precioTope;
		// Condicion por precio recibe un precio tope
		// La creo pasandole el valor para el atributo
	}

	@Override
	public boolean cumple(Medicamento unMedicamento) {
		return unMedicamento.getPrecio() <= precioTope;
		// Cumple chequea si el precio del medicamento es menor o igual al precio q
		// recibió por parámetro
	}

}
