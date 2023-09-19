package ejercicio1;

public class Encuesta {
	private String[] preguntas;
	private String nombreEncuestador;
	private int idEncuestado;
	private boolean respondida;
	
	public Encuesta (String[] preguntas, String nombreEncuestador, int idEncuestado, boolean respondida) {
		this.preguntas = preguntas;
		this.nombreEncuestador = nombreEncuestador;
		this.idEncuestado = idEncuestado;
		this.respondida = respondida;
	}
	
	public String[] getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(String[] preguntas) {
		this.preguntas = preguntas;
	}
	
	public String getNombreEncuestador() {
		return this.nombreEncuestador;
	}
	
	public void setNombreEncuestador(String nombreEncuestador) {
		this.nombreEncuestador = nombreEncuestador;
	}

	public int getIdEncuestado() {
		return idEncuestado;
	}

	public void setIdEncuestado(int idEncuestado) {
		this.idEncuestado = idEncuestado;
	}

	public boolean isRespondida() {
		return respondida;
	}

	public void setRespondida(boolean respondida) {
		this.respondida = respondida;
	}
	
	
}
