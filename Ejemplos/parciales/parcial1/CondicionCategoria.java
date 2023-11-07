package parcial1;

public class CondicionCategoria extends Condicion {
	private String categoria;
	
	public CondicionCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public boolean cumple(Noticia unaNoticia) {
		return unaNoticia.getCategoria().equals(categoria);
	}
}
