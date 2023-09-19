package ejercicio4;

import java.time.LocalDate;

public class Masajista extends Persona {
	private String titulo;
	private int aniosXp;
	
	public Masajista(String nombre, String apellido, int nPasaporte, LocalDate fechaNac, String estado, String titulo,
			int aniosXp) {
		super(nombre, apellido, nPasaporte, fechaNac, estado);
		this.titulo = titulo;
		this.aniosXp = aniosXp;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAniosXp() {
		return aniosXp;
	}

	public void setAniosXp(int aniosXp) {
		this.aniosXp = aniosXp;
	}
	
	
}
