package ejercicio5;

import java.time.LocalDate;

public class CongeladoAgua extends Refrigerado {
	private double salinidad;

	public CongeladoAgua(LocalDate fechaVencimiento, LocalDate fechaEnvasado, int nLote, String granjaOrigen,
			int tempMantenimiento, double salinidad) {
		super(fechaVencimiento, fechaEnvasado, nLote, granjaOrigen, tempMantenimiento);
		this.salinidad = salinidad;
	}

	public double getSalinidad() {
		return salinidad;
	}

	public void setSalinidad(double salinidad) {
		this.salinidad = salinidad;
	}
	
	@Override
	public void printDatosCompletos() {
		super.printDatosCompletos();
		System.out.println("Salinidad (grs x lt) = " + this.getSalinidad());
	}
}
