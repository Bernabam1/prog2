package ejemploFarmacia;

public class CondicionAND implements Condicion {
	Condicion cond1, cond2;
	//CondicionAND compara dos condiciones

	public CondicionAND(Condicion cond1, Condicion cond2) {
		//Cuando se instancia lo hace con dos condiciones
		this.cond1 = cond1;
		this.cond2 = cond2;
	}

	@Override
	public boolean cumple(Medicamento medicamento) {
		return cond1.cumple(medicamento) && cond2.cumple(medicamento);
		// Verifica si se complen las dos condiciones
	}

}
