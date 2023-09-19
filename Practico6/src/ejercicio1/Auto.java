package ejercicio1;

import java.time.LocalDate;

public class Auto {
	private String marca;
	private double kms;
	private String patente;
	private boolean disponible;
	private String tipoAuto;
	private LocalDate fechaLimite;

	public Auto(String marca, double kms, String patente, String tipoAuto, LocalDate fechaLimite) {
		this.marca = marca;
		this.kms = kms;
		this.patente = patente;
		this.tipoAuto = tipoAuto;
		this.fechaLimite = fechaLimite;
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

	public String getTipoAuto() {
		return tipoAuto;
	}

	public void setTipoAuto(String tipoAuto) {
		this.tipoAuto = tipoAuto;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public LocalDate getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(LocalDate fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

}
