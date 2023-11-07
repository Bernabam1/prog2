package parcial3;

public class CondicionCategoria extends Condicion {
	private String categoria;

	public CondicionCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public boolean cumple(Noticia noti) {
		return noti.getCategoria().equals(categoria);
	}
}
