package ejercicio1;

public class Pelicula extends Producto {
	private String info;
	private int cantCopias;
	private boolean disponible;

	public Pelicula(String info, int cantCopias) {
		this.info = info;
		this.cantCopias = cantCopias;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getCantCopias() {
		return cantCopias;
	}

	public void setCantCopias(int cantCopias) {
		this.cantCopias = cantCopias;
	}

	public boolean isDisponible() {
		return this.getCantCopias() > 0;
	}

	public boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	public String toString() {
		return info;
	}
}
