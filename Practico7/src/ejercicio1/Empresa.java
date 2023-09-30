package ejercicio1;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Agroquimico> agroquimicos;
	
	public Empresa() {
		this.agroquimicos = new ArrayList<>();
	}
	
	public Empresa(ArrayList<Agroquimico> agroquimicos) {
		this.agroquimicos = new ArrayList<>(agroquimicos);
		// Constructor para crear la empresa con una lista que viene por parámetro con
		// agroquimicos precargados
	}

	public ArrayList<Agroquimico> getAgroquimicos() {
		return new ArrayList<>(agroquimicos);
		// Met que devuelve una copia del arreglo agroquimicos
	}

	public void addAgroquimico(ArrayList<Agroquimico> agroquimicos) {
		this.agroquimicos.addAll(agroquimicos);
		// Met que recibe un arraylist de agroquimicos y los agrega al stock
	}

	public void addAgroquimico(Agroquimico unAgroquimico) {
		this.agroquimicos.add(unAgroquimico);
		// Met para agregar un agroquimico a la lista de stock
	}
	
	public ArrayList<Agroquimico> buscar(Condicion unaCondicion) {
		// Metodo para buscar directamente por condicion
		ArrayList<Agroquimico> aux = new ArrayList<>();
		// Guardo espacio para un arraylist que voy a usar de retorno
		for (Agroquimico agroquimico : agroquimicos) {
			// Recorro la lista agroquimicos
			if (unaCondicion.cumple(agroquimico)) {
				// La condicion chequea el metodo cumple en el agroquimico que esta siendo iterado
				aux.add(agroquimico);
				// Si la cumple, agrega el agroquimico a aux
			}
		}
		return aux;
		// Retorno
	}

}
