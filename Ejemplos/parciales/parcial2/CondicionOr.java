package parcial2;

public class CondicionOr extends Condicion {
	private Condicion cond1, cond2;
	
	public CondicionOr(Condicion cond1, Condicion cond2) {
		this.cond1 = cond1;
		this.cond2 = cond2;
	}
	
	public boolean cumple(Articulo unArticulo) {
		return cond1.cumple(unArticulo) || cond2.cumple(unArticulo);
	}
}
