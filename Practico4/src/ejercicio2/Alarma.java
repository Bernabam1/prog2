package ejercicio2;

public class Alarma {

	private Timbre timbre;
	private Luz luz;

	public Alarma() {
		this.timbre = new Timbre();
		this.luz = new Luz();
	}

	public Timbre getTimbre() {
		return timbre;
	}

	public void setTimbre(Timbre timbre) {
		this.timbre = timbre;
	}

	public Luz getLuz() {
		return luz;
	}

	public void setLuz(Luz luz) {
		this.luz = luz;
	}
}
