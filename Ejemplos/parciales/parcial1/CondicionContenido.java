package parcial1;

public class CondicionContenido extends Condicion {
	private String substring;
	
	public CondicionContenido(String substring) {
		this.substring = substring;
	}
	
	public boolean cumple(Noticia unaNoticia) {
		return unaNoticia.getContenido().contains(substring);
	}
}
