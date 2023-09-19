package ejercicio1;

public class AutoDiesel extends Auto {
	private String tipoMotor;

	public AutoDiesel(String marca, double kms, String patente) {
		super(marca, kms, patente);
		this.tipoMotor = "Diesel";
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

}
