package parcial4;

public class CondicionTitulo extends Condicion {
	private String palabra;
	
	public CondicionTitulo(String palabra) {
		this.palabra = palabra;
	}
	
	public boolean cumple(Articulo art) {
		return art.getTitulo().contains(palabra);
	}
}
