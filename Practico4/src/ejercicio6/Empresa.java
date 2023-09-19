package ejercicio6;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Persona> asociados;

	public Empresa(ArrayList<Persona> asociados) {
		this.asociados = asociados;
	}

	public ArrayList<Persona> getAsociados() {
		return asociados;
	}

	public void setAsociados(ArrayList<Persona> asociados) {
		this.asociados = asociados;
	}

	public void agregarAsociado(Persona persona) {
		asociados.add(persona);
	}

	public void printAsociados() {
		for (Persona asociado : asociados) {
			asociado.printDatosCompletos();
			System.out.println("---------------");
		}
	}

}
