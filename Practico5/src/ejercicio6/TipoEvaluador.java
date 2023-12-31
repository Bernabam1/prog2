package ejercicio6;

import java.util.ArrayList;

public abstract class TipoEvaluador {
	private ArrayList<String> conocimientos;

	public ArrayList<String> getConocimientos() {
		return new ArrayList<String>(conocimientos);
	}

	public void addConocimiento(String unConocimiento) {
		if (!conocimientos.contains(unConocimiento)) {
			conocimientos.add(unConocimiento);
		}
	}
}
