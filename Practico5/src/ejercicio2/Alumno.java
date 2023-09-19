package ejercicio2;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private ArrayList<String> cualidades;
	private ArrayList<Alumno> familiares;
	private boolean enUnaCasa;

	public Alumno(String nombre) {
		this.nombre = nombre;
		this.cualidades = new ArrayList<>();
		this.familiares = new ArrayList<>();
		this.enUnaCasa = false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEnUnaCasa() {
		return enUnaCasa;
	}

	public void setEnUnaCasa(boolean enUnaCasa) {
		this.enUnaCasa = enUnaCasa;
	}

	public void addCualidad(String cualidad) {
		if (!cualidades.contains(cualidad)) {
			cualidades.add(cualidad);
		}
	}

	public void addFamiliar(Alumno fam) {
		if (!familiares.contains(fam)) {
			familiares.add(fam);
		}
	}

	// Acá le digo como lo imprime el toString cuando lee al objeto en memoria
	public String toString() {
		return nombre;
	}

	public ArrayList<String> getCualidades() {
		return new ArrayList<String>(cualidades);
	}

	public ArrayList<Alumno> getFamiliares() {
		return new ArrayList<Alumno>(familiares);
	}

}
