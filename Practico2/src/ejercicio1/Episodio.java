package ejercicio1;

public class Episodio {

	// Atributos

	/*
	 * Cada episodio posee un título, una descripción, un flag indicando si ya se
	 * vio el episodio y una calificación dada (con valores de 1 a 5). Si no se vio
	 * un episodio particular, la calificación dada será un valor negativo.
	 */

	private String titulo;
	private boolean visto;
	private String descripcion;
	private double calificacion;

	// Constructores

	public Episodio(String titulo, String descripcion) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.visto = false; // Por defecto no se vió
		this.calificacion = -1.0; // e inicia con un -1 en la calificación
	}

	// Getters y Setters

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isVisto() {
		return this.visto;
	}

	public void setVisto(boolean visto) {
		this.visto = visto;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getCalificacion() {
		return this.calificacion;
	}

	/*
	 * Ingresar la calificación de un episodio. Si el valor ingresado como
	 * calificación no es correcto imprimir un mensaje por pantalla y no cambiar el
	 * valor anterior.
	 */
	
	public void setCalificacion(double calificacion) {
		if (calificacion >= 1.0 && calificacion <= 5.0) {
			this.calificacion = calificacion;
		} else {
			System.out.println("Debe ingresar una calificación entre 1 y 5");
		}
	}

}
