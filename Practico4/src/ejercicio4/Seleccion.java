package ejercicio4;

import java.util.ArrayList;

public class Seleccion {
	private CuerpoTecnico cuerpoTecnico;
	private ArrayList<Jugador> jugadores;

	public Seleccion(CuerpoTecnico cuerpoTecnico, ArrayList<Jugador> jugadores) {
		super();
		this.cuerpoTecnico = cuerpoTecnico;
		this.jugadores = jugadores;
	}

	public CuerpoTecnico getCuerpoTecnico() {
		return cuerpoTecnico;
	}

	public void setCuerpoTecnico(CuerpoTecnico cuerpoTecnico) {
		this.cuerpoTecnico = cuerpoTecnico;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public void getNombresCT() {
		this.cuerpoTecnico.getNombresCT();
	}

	public void getNombresJugadores() {
		for (Jugador jugador : jugadores) {
			System.out.println("Jugador: " + jugador.getNombre() + " " + jugador.getApellido());
		}
	}
}
