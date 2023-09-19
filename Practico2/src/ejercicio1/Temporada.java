package ejercicio1;

public class Temporada {

	// Atributos

	/*
	 * Una Serie está formada por un conjunto de temporadas, cada una de las cuales
	 * tiene una cantidad de episodios
	 */

	private Episodio[] episodios;
	// tipo_dato[] nombre_del_array;
	// private int cantidadEpisodios;

	// Constructor

	public Temporada(int numEpisodios) {
		this.episodios = new Episodio[numEpisodios]; // Esto me va a reservar N lugares en memoria para el arreglo
	}

	// Getter y setters

	public Episodio[] getEpisodios() {
		return this.episodios;
	}

	public void setEpisodios(Episodio[] episodios) {
		this.episodios = episodios;
	}

	// Metodos

	// Obtener el total episodios vistos de una temporada particular

	public int totalEpisodiosVistos() {
		int vistos = 0;
		for (Episodio episodio : episodios) { // La temporada recorre los espisodios y les pregunta si fueron vistos
			if (episodio.isVisto()) { // Cada episodio puede saber por si mismo si fue visto o no
				vistos++;
			}
		}
		return vistos;
	}

	// Obtener el promedio de las calificaciones dadas para una temporada particular

	public double promedioCalificacion() {
		double suma = 0.0;
		int cant = 0;
		// Recorro los episodios y le pido a cada uno su calificación, la acumulo y aumento un contador
		for (Episodio episodio : episodios) {
			if (episodio.isVisto()) {
				suma += episodio.getCalificacion();
				cant++;
			}
		}
		return suma / cant; // Devuelvo la suma divida por el contador de episodios
	}

	public boolean fueVistaCompleta() {
		return (this.totalEpisodiosVistos() == this.getEpisodios().length);
	}
}
