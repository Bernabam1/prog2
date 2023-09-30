package ejercicio2;

public class BuscarTitulo extends Condicion{
	private String titulo;
	
	public BuscarTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public boolean cumple(Documento unDocumento) {
		return unDocumento.getTitulo().equalsIgnoreCase(titulo);
	}

}
