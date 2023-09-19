package ejercicio2;

public class Reunion {
	private String ubicacion;
	private String tema;
	private int minutos;
	private Persona[] participantes;
	
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public Persona[] getParticipantes() {
		return participantes;
	}
	public void setParticipantes(Persona[] participantes) {
		this.participantes = participantes;
	}
	
}

