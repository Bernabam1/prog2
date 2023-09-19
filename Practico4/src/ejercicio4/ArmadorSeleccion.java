package ejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArmadorSeleccion {
	public static void main(String[] args) {

		ArrayList<Persona> personas = new ArrayList<>();
		LocalDate fechaNac1 = LocalDate.of(1980, 1, 1); // Como implemento mejor esto??

		Jugador j1 = new Jugador("Martín", "Palermo", 1, fechaNac1, "Delantero", "Zurdo", 300, "Viajando");
		Jugador j2 = new Jugador("Román", "Riquelme", 2, fechaNac1, "Enganche", "Derecho", 100, "En concentración");
		Jugador j3 = new Jugador("Oscar", "Córdoba", 3, fechaNac1, "Arquero", "Derecho", 0, "En país de origen");
		Jugador j4 = new Jugador("Chicho", "Serna", 4, fechaNac1, "Mediocampista", "Derecho", 10, "En país de origen");

		personas.add(j1);
		personas.add(j2);
		personas.add(j3);
		personas.add(j4);

		Masajista m1 = new Masajista("Jorge", "Masajista1", 5, fechaNac1, "En país de origen", "Traumatólogo", 10);
		Masajista m2 = new Masajista("Carlos", "Masajista2", 6, fechaNac1, "En país de origen", "Psicólogo", 11);
		Masajista m3 = new Masajista("Miguel", "Masajista3", 7, fechaNac1, "En país de origen", "Mecánico", 12);

		personas.add(m1);
		personas.add(m2);
		personas.add(m3);

		Entrenador e1 = new Entrenador("Carlos", "Bianchi", 8, fechaNac1, "En país de origen", "Argentina");
		Entrenador e2 = new Entrenador("Coco", "Basile", 9, fechaNac1, "En país de origen", "Argentina");

		personas.add(e1);
		personas.add(e2);

		ArrayList<Jugador> jugadores = new ArrayList<>();
		ArrayList<Masajista> masajistas = new ArrayList<>();
		ArrayList<Entrenador> entrenadores = new ArrayList<>();

		for (Persona persona : personas) {
			if (persona instanceof Jugador && persona.isDisponibleParaEventoSolidario()) {
				jugadores.add((Jugador)persona);
			} else if (persona instanceof Masajista && persona.isDisponibleParaEventoSolidario()) {
				masajistas.add((Masajista)persona);
			} else if (persona instanceof Entrenador && persona.isDisponibleParaEventoSolidario()) {
				entrenadores.add((Entrenador)persona);
			}
		}
		
		CuerpoTecnico ct = new CuerpoTecnico(entrenadores, masajistas);
		Seleccion s1 = new Seleccion(ct, jugadores);
		
		s1.getNombresJugadores();
		s1.getNombresCT();
	}
}
