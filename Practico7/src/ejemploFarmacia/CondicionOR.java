package ejemploFarmacia;

public class CondicionOR extends Condicion {
	Condicion cond1, cond2;
	// CondicionAND compara dos condiciones

	public CondicionOR(Condicion cond1, Condicion cond2) {
		// Cuando se instancia lo hace con dos condiciones
		this.cond1 = cond1;
		this.cond2 = cond2;
	}

	@Override
	public boolean cumple(Medicamento medicamento) {
		return cond1.cumple(medicamento) || cond2.cumple(medicamento);
		// Verifica si se cumple al menos una de las dos condiciones
	}

}
