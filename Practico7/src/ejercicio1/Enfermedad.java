package ejercicio1;

import java.util.ArrayList;

/*Una enfermedad tiene un nombre
asociado y un conjunto de estados patológicos que deben ser tratados. Por ejemplo:
Cochinilla (estados patológicos: deshidratación, hojas amarillas). Aclaración: los estado
patológicos de una enfermedad se corresponden con los estados patológicos que los
productos son capaces de tratar.
*/

public class Enfermedad {
	private String nombre;
	private ArrayList<String> estadosPatologicos;

	public Enfermedad(String nombre) {
		this.nombre = nombre;
		this.estadosPatologicos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getEstadosPatologicos() {
		return new ArrayList<>(estadosPatologicos);
	}

	public void addEstadoPatologico(String unEstado) {
		estadosPatologicos.add(unEstado);
	}
	
	@Override
	public String toString() {
		return nombre + " - Patologías: "+ this.getEstadosPatologicos();
	}
}
