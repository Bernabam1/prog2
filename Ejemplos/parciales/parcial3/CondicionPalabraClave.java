package parcial3;

public class CondicionPalabraClave extends Condicion {
	private String palabra;

	public CondicionPalabraClave(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public boolean cumple(Noticia noti) {
		return noti.getPalabrasClave().contains(palabra);
	}
}
