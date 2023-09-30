package ejercicio1;

import java.util.ArrayList;

/*Un producto químico tiene asociado un nombre,
un conjunto cultivos donde se desaconseja su uso (por ejemplo girasol, lino, maíz), y un
conjunto de estados patológicos que pueden observarse sobre los cultivos, y que es capaz de
tratar (por ejemplo hojas amarillas, caída prematura de frutos, hojas mordidas, entre otros)*/

public class Agroquimico {
	private String nombre;
	private ArrayList<Cultivo> cultivosNoCompatibles;
	private ArrayList<String> estadosPatologicos;

	public Agroquimico(String nombre) {
		this.nombre = nombre;
		this.cultivosNoCompatibles = new ArrayList<>();
		this.estadosPatologicos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void addCultivoNoCompatible(Cultivo unCultivo) {
		if (!cultivosNoCompatibles.contains(unCultivo)) {
			cultivosNoCompatibles.add(unCultivo);
		}
	}

	public ArrayList<Cultivo> getCultivosNoCompatibles() {
		return new ArrayList<>(cultivosNoCompatibles);
	}

	public ArrayList<String> getEstadosPatologicos() {
		return new ArrayList<>(estadosPatologicos);
	}

	public void addEstadoPatologico(String unEstado) {
		estadosPatologicos.add(unEstado);
	}

	public boolean puedeTratar(Enfermedad unaEnfermedad) {
		return this.getEstadosPatologicos().containsAll(unaEnfermedad.getEstadosPatologicos());
	}
	
	@Override
	public String toString() {
		return nombre;
	}
}
