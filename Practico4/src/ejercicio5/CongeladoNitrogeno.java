package ejercicio5;

import java.time.LocalDate;

public class CongeladoNitrogeno extends Refrigerado {
	private String metodoCongelacion;
	private double exposicon;

	public CongeladoNitrogeno(LocalDate fechaVencimiento, LocalDate fechaEnvasado, int nLote, String granjaOrigen,
			int tempMantenimiento, String metodoCongelacion, double exposicon) {
		super(fechaVencimiento, fechaEnvasado, nLote, granjaOrigen, tempMantenimiento);
		this.metodoCongelacion = metodoCongelacion;
		this.exposicon = exposicon;
	}

	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}

	public void setMetodoCongelacion(String metodoCongelacion) {
		this.metodoCongelacion = metodoCongelacion;
	}

	public double getExposicon() {
		return exposicon;
	}

	public void setExposicon(double exposicon) {
		this.exposicon = exposicon;
	}
	
	@Override
	public void printDatosCompletos() {
		super.printDatosCompletos();
		System.out.println("Método de congelación = " + this.getMetodoCongelacion());
		System.out.println("Tiempo de exposición (seg) = " + this.getExposicon());
	}
}
