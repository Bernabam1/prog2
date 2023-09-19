package ejercicio1;

public abstract class Auto extends Producto {

	private String marca;
	private double kms;
	private String patente;
	private boolean disponible;

	public Auto(String marca, double kms, String patente) {
		this.marca = marca;
		this.kms = kms;
		this.patente = patente;

		this.disponible = true;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getKms() {
		return kms;
	}

	public void setKms(double kms) {
		this.kms = kms;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	public String toString() {
		return marca;
	}

}
