package ejercicio2;

public class BuscarPalabraClave extends Condicion{
	private String palabraClave;
	
	public BuscarPalabraClave(String palabraClave) {
		this.palabraClave = palabraClave;
	}

	@Override
	public boolean cumple(Documento unDocumento) {
		return unDocumento.getPalabrasClave().contains(palabraClave);
	}

}
