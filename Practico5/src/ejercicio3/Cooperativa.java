package ejercicio3;

import java.util.ArrayList;

public class Cooperativa {

	private ArrayList<Lote> lotesDisponibles;
	private ArrayList<Cereal> cerealesDisponibles;
	private ArrayList<String> mineralesPrimarios;

	public Cooperativa() {
		this.lotesDisponibles = new ArrayList<>();
		this.cerealesDisponibles = new ArrayList<>();
		this.mineralesPrimarios = new ArrayList<>();
	}

	public void addCerealDisponible(Cereal cereal) {
		if (!cerealesDisponibles.contains(cereal)) {
			cerealesDisponibles.add(cereal);
		}
	}

	public ArrayList<Cereal> getCerealDisponible() {
		return new ArrayList<Cereal>(cerealesDisponibles);
	}

	public void addLoteDisponible(Lote lote) {
		if (!lotesDisponibles.contains(lote)) {
			lotesDisponibles.add(lote);
		}
	}

	public ArrayList<Lote> getLotesDisponibles() {
		return new ArrayList<Lote>(lotesDisponibles);
	}

	public void addMineralPrimarios(String mineral) {
		if (!mineralesPrimarios.contains(mineral)) {
			mineralesPrimarios.add(mineral);
		}
	}

	public ArrayList<String> getMineralesPrimarios() {
		return new ArrayList<String>(mineralesPrimarios);
	}

	public void enQueLote(Cereal cereal) {
		ArrayList<Lote> lotesCompatibles = new ArrayList<>();
		for (Lote lote : lotesDisponibles) {
			if (lote.puedePlantarse(cereal)) {
				lotesCompatibles.add(lote);
			}
		}
		if (lotesCompatibles.isEmpty()) {
			System.out.println("No hay lotes compatibles");
		} else {
			System.out.println("El cereal " + cereal + " se puede plantar en " + lotesCompatibles);
		}
	}

	public void queCereal(Lote lote) {
		ArrayList<Cereal> cerealesCompatibles = new ArrayList<>();
		for (Cereal cereal : cerealesDisponibles) {
			if (lote.puedePlantarse(cereal)) {
				cerealesCompatibles.add(cereal);
			}
		}
		if (cerealesCompatibles.isEmpty()) {
			System.out.println("No hay cereales compatibles");
		} else {
			System.out.println("En el " + lote + " se puede plantar " + cerealesCompatibles);
		} // Por que no se agregan los cereales?
	}

	public void getLotesEspeciales() {
		ArrayList<Lote> lotesEspeciales = new ArrayList<>();
		for (Lote lote : lotesDisponibles) {
			if (lote.getMinerales().containsAll(this.getMineralesPrimarios())) {
				lotesEspeciales.add(lote);
			}
		}

		if (lotesEspeciales.isEmpty()) {
			System.out.println("No hay lotes especiales");
		} else {
			System.out.println("Lotes especiales: " + lotesEspeciales);
		} // Tampoco se agregan los lotes
	}
}
