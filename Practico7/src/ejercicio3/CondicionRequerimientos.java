package ejercicio3;

public class CondicionRequerimientos extends Condicion {
	private Condicion cond1;
	private Condicion cond2;

	public CondicionRequerimientos(Condicion cond1, Condicion cond2) {
		this.cond1 = cond1;
		this.cond2 = cond2;
	}

	public boolean cumple(Planta unaPlanta) {
		return cond1.cumple(unaPlanta) && cond2.cumple(unaPlanta);
	}
}