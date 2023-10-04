package ejemploFarmacia;

public class CondicionNOT implements Condicion {
	private Condicion cond1;

	public CondicionNOT(Condicion cond1) {
		this.cond1 = cond1;
	}

	@Override
	public boolean cumple(Medicamento medicamento) {
		return !cond1.cumple(medicamento);
		// Verifica si no se cumple la condicion
	}
}
