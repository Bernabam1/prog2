package ejercicio2;

import java.util.ArrayList;

public class CentroComputos {
	private ArrayList<Computadora> computadorasDisponibles;

	public CentroComputos() {
		this.computadorasDisponibles = new ArrayList<>();
	}

	public void addComputadora(Computadora unaComputadura) {
		if (!computadorasDisponibles.contains(unaComputadura)) {
			computadorasDisponibles.add(unaComputadura);
		}
	}

	public ArrayList<Computadora> getComputadoras() {
		return new ArrayList<Computadora>(computadorasDisponibles);
	}
}
