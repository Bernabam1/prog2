package ejercicio1;

import java.time.LocalDate;

public abstract class Producto {
	private LocalDate fechaAlquiler; // Esto va acá??
	
	public abstract boolean isDisponible();

	public LocalDate getFechaAlquiler() {
		return fechaAlquiler;
	}

	public void setFechaAlquiler(LocalDate fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}
	
}
