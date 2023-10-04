package ejemploFarmacia;

public class CondicionLaboratorio implements Condicion {
	private String nombreLab;

	public CondicionLaboratorio(String nombreLab) {
		this.nombreLab = nombreLab;
		// Condicion por nombre recibe un nombre de laboratorio
		// La creo pasandole el valor para el atributo
	}

	@Override
	public boolean cumple(Medicamento unMedicamento) {
		return unMedicamento.getLaboratorio().toLowerCase().equals(nombreLab);
		// Cumple chequea en el nombre del laboratorio del medicamento es igual al que
		// recibió por parámetro
	}

}
