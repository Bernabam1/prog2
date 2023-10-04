package ejercicio3;

public class ContadorOcurrenciasPlugin implements Plugin {
	private int contador;
	private String ocurrencia;

	public ContadorOcurrenciasPlugin(String ocurrencia) {
		this.ocurrencia = ocurrencia;
		this.contador = 0;
	}

	public String getOcurrencia() {
		return ocurrencia;
	}

	public void setOcurrencia(String ocurrencia) {
		this.ocurrencia = ocurrencia;
	}

	@Override
	public void ejecutar(String texto) {
		String[] palabras = texto.split("\\s+");
		for (String palabra : palabras) {
			if (palabra.equalsIgnoreCase(ocurrencia)) {
				contador++;
			}
		}
		System.out.println(contador);
	}
}
