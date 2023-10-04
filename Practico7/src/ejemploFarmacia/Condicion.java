package ejemploFarmacia;

public interface Condicion {
	public abstract boolean cumple(Medicamento unMedicamento);
	// La clase abstracta condicion obliga a redefinir el metodo cumple a todas las
	// clases hijas

	// Recibe un objeto de tipo medicamento como parametro
}
