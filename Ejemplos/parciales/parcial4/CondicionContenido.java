package parcial4;

public class CondicionContenido extends Condicion {
	private String substring;
	
	public CondicionContenido(String substring) {
		this.substring = substring;
	}
	
	public boolean cumple(Articulo art) {
		return art.getContenido().contains(substring);
	}
}
