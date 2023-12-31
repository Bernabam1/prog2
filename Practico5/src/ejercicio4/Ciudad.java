package ejercicio4;

import java.util.ArrayList;

public class Ciudad {
	private String nombre;
	private ArrayList<Contribuyente> contribuyentes;

	public Ciudad(String nombre) {
		this.nombre = nombre;
		this.contribuyentes = new ArrayList<>();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setContribuyentes(ArrayList<Contribuyente> contribuyentes) {
		this.contribuyentes = contribuyentes;
	}

	public void addContribuyente(Contribuyente unContribuyente) {
		if (!contribuyentes.contains(unContribuyente)) {
			contribuyentes.add(unContribuyente);
		}
	}

	public ArrayList<Contribuyente> getContribuyentes() {
		return new ArrayList<Contribuyente>(contribuyentes);
	}

	public double getTotalRecaudado() {
		double suma = 0;
		for (Contribuyente contribuyente : contribuyentes) {
			suma += contribuyente.getImpuesto();
		}
		return suma;
	}

}
