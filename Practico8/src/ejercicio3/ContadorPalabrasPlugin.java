package ejercicio3;

public class ContadorPalabrasPlugin implements Plugin {

	public ContadorPalabrasPlugin() {
	}

	@Override
	public void ejecutar(String texto) {
		String[] palabras = texto.split("\\s+"); // El \\s+ es una expresión regular que coincide
													// con uno o más espacios en blanco.
		System.out.println(palabras.length);
	}

}
