package ejercicio2;

public class BuscarSubstring extends Condicion{
	private String substring;
	
	public BuscarSubstring(String substring) {
		this.substring = substring;
	}

	@Override
	public boolean cumple(Documento unDocumento) {
		return unDocumento.getTitulo().toLowerCase().contains(substring);
	}

}
