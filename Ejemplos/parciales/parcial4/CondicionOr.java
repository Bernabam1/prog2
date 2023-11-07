package parcial4;

public class CondicionOr extends Condicion {
	private Condicion cond1, cond2;
	
	public CondicionOr(Condicion cond1, Condicion cond2) {
		this.cond1 = cond1;
		this.cond2 = cond2;
	}
	
	public boolean cumple(Articulo art) {
		return cond1.cumple(art) || cond2.cumple(art);
	}
}
