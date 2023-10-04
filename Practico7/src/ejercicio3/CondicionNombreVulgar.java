package ejercicio3;

public class CondicionNombreVulgar extends Condicion {
	private String substring;

	public CondicionNombreVulgar(String substring) {
		this.substring = substring;
	}

	public boolean cumple(Planta unaPlanta) {
		for (String nombreVulgar : unaPlanta.getNombresVulgares()) {
			if (nombreVulgar.toLowerCase().contains(substring)) {
				return true;
			}
		}
		return false;
	}
}
