package parcial3;

public class NoticiaPrivada extends Noticia {

	// Una noticia ”Privada”, que tiene la particularidad de que nunca se incluye en
	// una copia, cuando se solicita una
	// restricción temática del portal.

	public NoticiaPrivada(String titulo, String contenido, String autor, String categoria) {
		super(titulo, contenido, autor, categoria);
	}

	public Noticia getCopia() {
		return null;
	}

}
