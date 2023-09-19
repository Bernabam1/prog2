package ejercicio1;

public class Serie {

	// Atributos

	/*
	 * Una Serie está formada por un conjunto de temporadas, las series poseen como
	 * atributos (además de los episodios correspondientes) un título, una
	 * descripción, un creador y un género.
	 */

	private Temporada[] temporadas; // Conjunto de temporadas
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;

	// Constructores

	public Serie(int numTemporadas, String titulo, String creador, String descripcion, String genero) {
		this.temporadas = new Temporada[numTemporadas];
		this.titulo = titulo;
		this.creador = creador;
		this.descripcion = descripcion;
		this.genero = genero;
	}

	// Getters y Setters

	public Temporada[] getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(Temporada[] temporadas) {
		this.temporadas = temporadas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	// Métodos
	
	/* Obtener el total de episodios vistos de una serie*/
	
	public int totalEpisodiosVistos() {
		int vistos = 0;
		for (Temporada temporada : temporadas) {
			// La temporada sabe su total de episodios vistos.
			// Aca sumo la cantidad de episodios vistos de cada temporada en una variable y la devuelvo
			vistos = vistos + temporada.totalEpisodiosVistos();
		}
		return vistos;
	}
	
	// Obtener el promedio de las calificaciones dadas para una serie.

	public double promedioCalificacion() {
		double suma = 0.0;
		int cant = 0;
		// Recorro las temporadas y le pido a cada una su calificación, la acumulo y aumento un contador
		for (Temporada temporada : temporadas) {
			suma += temporada.promedioCalificacion();
			cant++;
		}
		return suma / cant; // Devuelvo la suma divida por el contador de temporadas
	}

	//  Determinar si se vio todos los episodios de la serie
	public boolean fueVistaCompleta() {
		// Recorro la temporada, le pregunto si no fue vista completa
		for (Temporada temporada : temporadas) {
			if (!temporada.fueVistaCompleta()) {
				return false; // Si no fue vista completa, entra acá y retorna false
			}
		}
		return true; // Si no entra al if es porque fue vista completa. Retorna true
	}
}
