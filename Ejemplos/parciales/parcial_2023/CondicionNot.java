package parcial_2023;

public class CondicionNot extends Condicion {

	private Condicion cond;

	public CondicionNot(Condicion cond) {
		this.cond = cond;
	}

	@Override
	public boolean cumple(Pieza3D pieza) {
		return cond.cumple(pieza) && cond.cumple(pieza);
	}

}
