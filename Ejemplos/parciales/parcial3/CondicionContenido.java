package parcial3;

public class CondicionContenido extends Condicion {
	private String substring;

	public CondicionContenido(String substring) {
		this.substring = substring;
	}

	@Override
	public boolean cumple(Noticia noti) {
		return noti.getContenido().contains(substring);
	}
}
