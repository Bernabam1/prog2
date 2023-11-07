package parcial4;

public class CondicionNot extends Condicion {
	private Condicion cond;

	public CondicionNot(Condicion cond) {
		this.cond = cond;
	}

	public boolean cumple(Articulo art) {
		return !cond.cumple(art);
	}
}
