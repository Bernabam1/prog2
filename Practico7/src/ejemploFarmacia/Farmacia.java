package ejemploFarmacia;

import java.util.ArrayList;

public class Farmacia {
	private ArrayList<Medicamento> medicamentos;

	public Farmacia() {
		this.medicamentos = new ArrayList<>();
		// Constructor para farmacia vacio, donde se crea con espacio para una lista de
		// medicamentos
	}

	public Farmacia(ArrayList<Medicamento> medicamentos) {
		this.medicamentos = new ArrayList<>(medicamentos);
		// Constructor para crear la farmacia con una lista que viene por parámetro con
		// medicamentos precargados
	}

	public ArrayList<Medicamento> getMedicamentos() {
		return new ArrayList<>(medicamentos);
		// Met que devuelve una copia del arreglo medicamentos
	}

	public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
		this.medicamentos.addAll(medicamentos);
		// Met que recibe un arraylist de medicamentos y los agrega al stock
	}

	public void addMedicamento(Medicamento unMedicamento) {
		this.medicamentos.add(unMedicamento);
		// Met para agregar un medicamento a la lista de stock
	}

	public ArrayList<Medicamento> buscar(Condicion unaCondicion) {
		// Metodo para buscar directamente por condicion
		ArrayList<Medicamento> aux = new ArrayList<>();
		// Guardo espacio para un arraylist que voy a usar de retorno
		for (Medicamento medicamento : medicamentos) {
			// Recorro la lista stock
			if (unaCondicion.cumple(medicamento)) {
				// La condicion chequea el metodo cumple en el presente medicamento
				medicamentos.add(medicamento);
				// Si la cumple, agrega el medicamento a stock
			}
		}
		return aux;
		// Retorno
	}

}
