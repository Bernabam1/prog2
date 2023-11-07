package parcial2;

public class CondicionPrecioMenor extends Condicion {
	private int precioMax;

	public CondicionPrecioMenor(int precioMax) {
		this.precioMax = precioMax;
	}

	public boolean cumple(Articulo unArticulo) {
		return unArticulo.getPrecio() < precioMax;
	}
}
