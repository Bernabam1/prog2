package parcial3;

public class CondicionTitulo extends Condicion {
	private String substring;

	public CondicionTitulo(String substring) {
		this.substring = substring;
	}

	@Override
	public boolean cumple(Noticia noti) {
		return noti.getTitulo().contains(substring);
	}
}
