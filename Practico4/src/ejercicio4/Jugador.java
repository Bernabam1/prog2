package ejercicio4;

import java.time.LocalDate;

public class Jugador extends Persona {

	private String posicion;
	private String lateralidad;
	private int goles;

	public Jugador(String nombre, String apellido, int nPasaporte, LocalDate fechaNac, String posicion,
			String lateralidad, int goles, String estado) {
		super(nombre, apellido, nPasaporte, fechaNac, estado);
		this.posicion = posicion;
		this.lateralidad = lateralidad;
		this.goles = goles;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getLateralidad() {
		return lateralidad;
	}

	public void setLateralidad(String lateralidad) {
		this.lateralidad = lateralidad;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

}
