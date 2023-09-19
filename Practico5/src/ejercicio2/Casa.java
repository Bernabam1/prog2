package ejercicio2;

import java.util.ArrayList;

public abstract class Casa {

	private int capacidad;
	private ArrayList<String> cualidadesNecesarias;
	private ArrayList<Alumno> alumnos;

	public Casa(int capacidad) {
		this.capacidad = capacidad;
		this.cualidadesNecesarias = new ArrayList<>();
		this.alumnos = new ArrayList<>();
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public abstract void addAlumno(Alumno alu);

	public void addCualidad(String cualidad) {
		if (!cualidadesNecesarias.contains(cualidad)) {
			cualidadesNecesarias.add(cualidad);
		}
	}

	public ArrayList<String> getCualidadesNecesarias() {
		return new ArrayList<String>(cualidadesNecesarias);
	}
	
	public boolean tieneCualidades(Alumno alu) {
		return alu.getCualidades().containsAll(this.getCualidadesNecesarias());
	}
	
	public ArrayList<Alumno> getAlumnos() {
		return new ArrayList<Alumno>(alumnos);
	}
}
