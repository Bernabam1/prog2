package ejercicio3;

import java.util.ArrayList;

public class Lote {

	private String nomLote;
	private int hectareas;
	private ArrayList<String> minerales;

	public Lote(String nomLote, int hectareas) {
		this.nomLote = nomLote;
		this.hectareas = hectareas;
		this.minerales = new ArrayList<>();
	}

	public String getNomLote() {
		return nomLote;
	}

	public void setNomLote(String nomLote) {
		this.nomLote = nomLote;
	}

	public int getHectareas() {
		return hectareas;
	}

	public void setHectareas(int hectareas) {
		this.hectareas = hectareas;
	}

	public void addMinerales(String mineral) {
		if (!minerales.contains(mineral)) {
			minerales.add(mineral);
		}
	}

	public ArrayList<String> getMinerales() {
		return new ArrayList<String>(minerales);
	}

	// Saber si un cereal puede plantarse en el lote
	public boolean puedePlantarse(Cereal cereal) {
		if (cereal.getNombre().toLowerCase().equals("pastura") && this.getHectareas() > 50) {
			return this.getMinerales().containsAll(cereal.getMineralesRequeridos());
		} else if (!cereal.getNombre().toLowerCase().equals("pastura")) {
			return this.getMinerales().containsAll(cereal.getMineralesRequeridos());
		} else {
			return false;
		}
	}

	public String toString() {
		return nomLote;
	}

}
