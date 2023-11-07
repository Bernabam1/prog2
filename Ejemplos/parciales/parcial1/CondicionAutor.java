package parcial1;

public class CondicionAutor extends Condicion {
	private String autor;
	
	public CondicionAutor(String autor) {
		this.autor = autor;
	}
	
	public boolean cumple(Noticia unaNoticia) {
		return unaNoticia.getAutor().equals(autor);
	}
}
