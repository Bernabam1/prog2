package ejercicio1;

public class AutoElectrico extends Auto {
	private String tipoMotor;
	
	public AutoElectrico(String marca, double kms, String patente) {
		super(marca, kms, patente);
		this.tipoMotor = "Electrico";
	}

	public String getTipoMotor() {
		return tipoMotor;
	}
	
}
