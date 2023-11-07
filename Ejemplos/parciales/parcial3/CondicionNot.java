package parcial3;

public class CondicionNot extends Condicion {
	private Condicion cond;

	public CondicionNot(Condicion cond) {
		this.cond = cond;
	}

	@Override
	public boolean cumple(Noticia noti) {
		return !cond.cumple(noti);
	}
}
