package ejercicio2;

public class Computadora {
	private int velocidad;
	private boolean disponible;

	public Computadora(int velocidad) {
		this.velocidad = velocidad;
		this.disponible = true;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

}
