package ejercicio3;

public class ReemplazoTextoPlugin implements Plugin {
	private String palabraParaReemplazar;
	private String palabraReemplazo;

	public ReemplazoTextoPlugin(String palabraParaReemplazar, String palabraReemplazo) {
		this.palabraParaReemplazar = palabraParaReemplazar;
		this.palabraReemplazo = palabraReemplazo;
	}

	@Override
	public void ejecutar(String texto) {
		String[] palabras = texto.split("\\s+");
		for (String palabra : palabras) {
			if (palabra.equalsIgnoreCase(palabraParaReemplazar)) {
				palabra = palabraReemplazo;
				// como imprimo
			}
		}
	}

}
