package parcial2;

public class CondicionCategoria extends Condicion {
	private String categoria;

	public CondicionCategoria(String categoria) {
		this.categoria = categoria;
	}

	public boolean cumple(Articulo unArticulo) {
		return unArticulo.getCategorias().contains(categoria);
	}
}
