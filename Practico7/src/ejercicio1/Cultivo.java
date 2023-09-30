package ejercicio1;

import java.util.ArrayList;

/*Un cultivo, tiene un nombre y una colección de enfermedades frecuentes que lo pueden
afectar. Asimismo dado un producto químico, los cultivos son capaces de decir si en algún
momento puede serle de utilidad o no, es decir si el agroquímico puede tratar una de sus
enfermedades frecuentes y no se desaconseja su uso en el cultivo*/

public class Cultivo {
	private String nombre;
	private ArrayList<Enfermedad> enfermedades;

	public Cultivo(String nombre) {
		this.nombre = nombre;
		this.enfermedades = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void addEnfermedad(Enfermedad unaEnfermedad) {
		if (!enfermedades.contains(unaEnfermedad)) {
			enfermedades.add(unaEnfermedad);
		}
	}

	public ArrayList<Enfermedad> getEnfermedades() {
		return new ArrayList<>(enfermedades);
	}

	public boolean esUtil(Agroquimico unAgroquimico) {
		if (!unAgroquimico.getCultivosNoCompatibles().contains(this)) {
			for (Enfermedad enfermedad : enfermedades) {
				return unAgroquimico.puedeTratar(enfermedad);
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return nombre;
	}
}
