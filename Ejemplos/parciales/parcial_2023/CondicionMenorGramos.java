package parcial_2023;

public class CondicionMenorGramos extends Condicion {

	private int grPLA;
	
	public CondicionMenorGramos(int grPLA) {
		this.grPLA = grPLA;
	}

	@Override
	public boolean cumple(Pieza3D pieza) {
		return pieza.getCantPLA() < grPLA;
	}

}
