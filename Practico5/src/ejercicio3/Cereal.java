package ejercicio3;

import java.util.ArrayList;

public class Cereal {
	
	private String nombre;
	private ArrayList<String> mineralesRequeridos;
	
	public Cereal(String nombre) {
		this.nombre = nombre;
		this.mineralesRequeridos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addMineralRequerido(String mineral) {
		if (!mineralesRequeridos.contains(mineral)) {
			mineralesRequeridos.add(mineral);
		}
	}

	public ArrayList<String> getMineralesRequeridos() {
		return new ArrayList<String>(mineralesRequeridos);
	}
	
	public String toString() {
		return nombre;
	}
}
