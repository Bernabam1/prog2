package ejercicio2;

public class BuscarCantPalabras extends Condicion{
	private final static int cantidadPalabras = 20;
	
	public BuscarCantPalabras() {
	}

	@Override
	public boolean cumple(Documento unDocumento) {
		String[] palabras = unDocumento.getContenido().split("\\s+"); // El \\s+ es una expresión regular que coincide con uno o más espacios en blanco.
		
		return palabras.length>cantidadPalabras;
	}

}
