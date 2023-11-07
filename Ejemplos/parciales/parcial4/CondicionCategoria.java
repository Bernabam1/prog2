package parcial4;

public class CondicionCategoria extends Condicion {
	private String categoria;
	
	public CondicionCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public boolean cumple(Articulo art) {
		return art.getCategoria().equals(categoria);
	}
}
