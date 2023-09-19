package ejercicio4;

import java.util.ArrayList;

public class CuerpoTecnico {
	private ArrayList<Entrenador> entrenadores;
	private ArrayList<Masajista> masajistas;
	
	public CuerpoTecnico(ArrayList<Entrenador> entrenadores, ArrayList<Masajista> masajistas) {
		this.entrenadores = entrenadores;
		this.masajistas = masajistas;
	}

	public ArrayList<Entrenador> getEntrenadores() {
		return entrenadores;
	}

	public void setEntrenadores(ArrayList<Entrenador> entrenadores) {
		this.entrenadores = entrenadores;
	}

	public ArrayList<Masajista> getMasajistas() {
		return masajistas;
	}

	public void setMasajistas(ArrayList<Masajista> masajistas) {
		this.masajistas = masajistas;
	}
	
	public void getNombresCT() {
		for(Entrenador entrenador : entrenadores) {
			System.out.println("Entrenador: "+entrenador.getNombre()+" "+entrenador.getApellido());
		}
		for(Masajista masajista : masajistas) {
			System.out.println("Masajista: "+masajista.getNombre()+" "+masajista.getApellido());
		}
	}
}
