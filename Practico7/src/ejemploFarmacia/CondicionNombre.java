package ejemploFarmacia;

public class CondicionNombre implements Condicion {
	private String substring;

	public CondicionNombre(String substring) {
		this.substring = substring;
		// Condicion por nombre recibe un substring
		// La creo pasandole el valor para el atributo
	}

	@Override
	public boolean cumple(Medicamento unMedicamento) {
		return unMedicamento.getNombre().toLowerCase().contains(substring);
		// Cumple chequea en el nombre del medicamento está el substring que
		// recibió por parámetro
	}

}
