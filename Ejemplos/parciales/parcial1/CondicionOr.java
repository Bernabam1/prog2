package parcial1;

public class CondicionOr extends Condicion {
	private Condicion cond1, cond2;
	
	public CondicionOr(Condicion cond1, Condicion cond2) {
		this.cond1 = cond1;
		this.cond2 = cond2;
	}
	
	public boolean cumple(Noticia unaNoticia) {
		return cond1.cumple(unaNoticia) || cond2.cumple(unaNoticia);
	}
}
