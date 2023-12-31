package ejercicio5_SolucionDinamica;

public class Bono extends FormaPago {
	private int cantVentas;

	public int getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}

	public double getBono() {
		double bono = 0;
		if (this.getCantVentas() < 50) {
			return 0;
		}
		if (this.getCantVentas() >= 50) {
			bono = 1000;
		}
		if (this.getCantVentas() >= 100) {
			bono = 3000;
		}
		return bono;
	}

	@Override
	protected double calcularSueldo() {
		return this.getSueldoBase() + this.getBono();
	}

}
