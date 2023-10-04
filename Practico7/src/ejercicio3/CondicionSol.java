package ejercicio3;

public class CondicionSol extends Condicion {
	private int cant;

	public CondicionSol(int cant) {
		this.cant = cant;
	}

	public boolean cumple(Planta unaPlanta) {
		return unaPlanta.getReqSol() < cant;
	}
}