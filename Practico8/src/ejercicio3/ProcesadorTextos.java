package ejercicio3;

public class ProcesadorTextos {
	private String texto;

	public ProcesadorTextos(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void ejecutarPlugin(Plugin plugin) {
		plugin.ejecutar(texto);
	}

}
