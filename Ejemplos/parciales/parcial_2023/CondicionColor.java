package parcial_2023;

public class CondicionColor extends Condicion {

	private String color;
	
	public CondicionColor(String color) {
		this.color = color;
	}

	@Override
	public boolean cumple(Pieza3D pieza) {
		return pieza.getColores().contains(color);
	}

}
