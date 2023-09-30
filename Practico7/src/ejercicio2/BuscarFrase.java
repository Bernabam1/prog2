package ejercicio2;

public class BuscarFrase extends Condicion{
	private String frase;
	
	public BuscarFrase(String frase) {
		this.frase = frase;
	}

	@Override
	public boolean cumple(Documento unDocumento) {
		return unDocumento.getContenido().toLowerCase().contains(frase);
	}

}
