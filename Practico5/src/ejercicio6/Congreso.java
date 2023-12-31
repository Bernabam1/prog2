package ejercicio6;

import java.util.ArrayList;

public class Congreso {
	private ArrayList<Evaluador> evaluadores;
	private ArrayList<Trabajo> trabajos;

	public Congreso() {
		this.evaluadores = new ArrayList<>();
		this.trabajos = new ArrayList<>();
	}

	public ArrayList<Evaluador> getEvaluadores() {
		return new ArrayList<Evaluador>(evaluadores);
	}

	public void addEvaluador(Evaluador unEvaluador) {
		if (!evaluadores.contains(unEvaluador)) {
			evaluadores.add(unEvaluador);
		}
	}

	public ArrayList<Trabajo> getTrabajos() {
		return new ArrayList<Trabajo>(trabajos);
	}

	public void addEvaluador(Trabajo unTrabajo) {
		if (!trabajos.contains(unTrabajo)) {
			trabajos.add(unTrabajo);
		}
	}
}
