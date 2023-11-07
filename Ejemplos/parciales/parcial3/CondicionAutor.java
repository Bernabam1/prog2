package parcial3;

public class CondicionAutor extends Condicion {
	private String nombre;

	public CondicionAutor(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean cumple(Noticia noti) {
		return noti.getAutor().equals(nombre);
	}
}
