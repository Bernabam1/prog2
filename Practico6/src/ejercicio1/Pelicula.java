package ejercicio1;

import java.time.LocalDate;

public class Pelicula {
	private String info;
	private int cantCopias;
	private LocalDate fechaLimite;
	private boolean disponible;

	public Pelicula(String info, int cantCopias, LocalDate fechaLimite) {
		this.info = info;
		this.cantCopias = cantCopias;
		this.fechaLimite = fechaLimite;
		this.disponible = true;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getCantCopias() {
		return cantCopias;
	}

	public void setCantCopias(int cantCopias) {
		this.cantCopias = cantCopias;
	}

	public boolean isDisponible() {
		return this.getCantCopias() > 0;
	}
	
	public boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public LocalDate getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(LocalDate fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

}
