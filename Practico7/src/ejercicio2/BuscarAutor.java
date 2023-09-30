package ejercicio2;

public class BuscarAutor extends Condicion{
	private String autor;
	
	public BuscarAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public boolean cumple(Documento unDocumento) {
		return unDocumento.getAutores().contains(autor);
	}

}
