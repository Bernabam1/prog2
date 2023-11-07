package parcial_2023;

public class CondicionMayorTiempo extends Condicion {

	private int tiempo;
	
	public CondicionMayorTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public boolean cumple(Pieza3D pieza) {
		return pieza.getTiempoImpresion() > tiempo;
	}

}
