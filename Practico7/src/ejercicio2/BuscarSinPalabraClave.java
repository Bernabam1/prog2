package ejercicio2;

public class BuscarSinPalabraClave extends Condicion{
		
	public BuscarSinPalabraClave() {
	}

	@Override
	public boolean cumple(Documento unDocumento) {
		return unDocumento.getPalabrasClave().isEmpty();
	}

}
