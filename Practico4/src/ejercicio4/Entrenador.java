package ejercicio4;

import java.time.LocalDate;

public class Entrenador extends Persona {
	private String federacion;

	public Entrenador(String nombre, String apellido, int nPasaporte, LocalDate fechaNac, String estado,
			String federacion) {
		super(nombre, apellido, nPasaporte, fechaNac, estado);
		this.federacion = federacion;
	}

	public String getFederacion() {
		return federacion;
	}

	public void setFederacion(String federacion) {
		this.federacion = federacion;
	}

}
