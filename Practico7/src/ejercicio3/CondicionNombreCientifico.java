package ejercicio3;

public class CondicionNombreCientifico extends Condicion {
	private String substring;

	public CondicionNombreCientifico(String substring) {
		this.substring = substring;
	}

	public boolean cumple(Planta unaPlanta) {
		return unaPlanta.getNombreCientifico().toLowerCase().contains(substring);
	}
}
