package ejercicio5;

import java.time.LocalDate;

public class CongeladoAire extends Refrigerado {
	private double porcNitrogeno;
	private double porcOxigeno;
	private double porcCO2;
	private double porcVapor;

	public CongeladoAire(LocalDate fechaVencimiento, LocalDate fechaEnvasado, int nLote, String granjaOrigen,
			int tempMantenimiento, double porcNitrogeno, double porcOxigeno, double porcCO2, double porcVapor) {
		super(fechaVencimiento, fechaEnvasado, nLote, granjaOrigen, tempMantenimiento);
		this.porcNitrogeno = porcNitrogeno;
		this.porcOxigeno = porcOxigeno;
		this.porcCO2 = porcCO2;
		this.porcVapor = porcVapor;
	}

	public double getPorcNitrogeno() {
		return porcNitrogeno;
	}

	public void setPorcNitrogeno(double porcNitrogeno) {
		this.porcNitrogeno = porcNitrogeno;
	}

	public double getPorcOxigeno() {
		return porcOxigeno;
	}

	public void setPorcOxigeno(double porcOxigeno) {
		this.porcOxigeno = porcOxigeno;
	}

	public double getPorcCO2() {
		return porcCO2;
	}

	public void setPorcCO2(double porcCO2) {
		this.porcCO2 = porcCO2;
	}

	public double getPorcVapor() {
		return porcVapor;
	}

	public void setPorcVapor(double porcVapor) {
		this.porcVapor = porcVapor;
	}
	
	@Override
	public void printDatosCompletos() {
		super.printDatosCompletos();
		System.out.println("Porcentaje de Nitrógeno = " + this.getPorcNitrogeno());
		System.out.println("Porcentaje de O2 = " + this.getPorcOxigeno());
		System.out.println("Porcentaje de CO2 = " + this.getPorcCO2());
		System.out.println("Porcentaje de Vapor " + this.getPorcVapor());
	}
}
