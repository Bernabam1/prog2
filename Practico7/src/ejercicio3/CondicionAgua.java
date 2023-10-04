package ejercicio3;

public class CondicionAgua extends Condicion {
	private int cant;

	public CondicionAgua(int cant) {
		this.cant = cant;
	}

	public boolean cumple(Planta unaPlanta) {
		return unaPlanta.getReqAgua() < cant;
	}
}