package parcial1;

public class CondicionTitulo extends Condicion {
	private String titulo;
	
	public CondicionTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public boolean cumple(Noticia unaNoticia) {
		return unaNoticia.getTitulo().contains(titulo);
	}
}
