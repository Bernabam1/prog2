package ejercicio3;

public class CondicionClasificacion extends Condicion {
	private String substring;

	public CondicionClasificacion(String substring) {
		this.substring = substring;
	}

	public boolean cumple(Planta unaPlanta) {
		return unaPlanta.getClasificacion().equalsIgnoreCase(substring);
	}
}