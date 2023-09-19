package ejercicio5;

import java.time.LocalDate;

public class Producto {
	private LocalDate fechaVencimiento;
	private LocalDate fechaEnvasado;
	private int nLote;
	private String granjaOrigen;

	public Producto(LocalDate fechaVencimiento, LocalDate fechaEnvasado, int nLote, String granjaOrigen) {
		this.fechaVencimiento = fechaVencimiento;
		this.fechaEnvasado = fechaEnvasado;
		this.nLote = nLote;
		this.granjaOrigen = granjaOrigen;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getnLote() {
		return nLote;
	}

	public void setnLote(int nLote) {
		this.nLote = nLote;
	}

	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getGranjaOrigen() {
		return granjaOrigen;
	}

	public void setGranjaOrigen(String granjaOrigen) {
		this.granjaOrigen = granjaOrigen;
	}
	
	public void printDatosCompletos() {
		System.out.println("Fecha de vencimiento = " + this.getFechaVencimiento());
		System.out.println("Fecha de envasado = " + this.getFechaEnvasado());
		System.out.println("Granja de Origen = " + this.getGranjaOrigen());
		System.out.println("Numero de lote = " + this.getnLote());
		System.out.println("-------------------------------------------------");
	}

}
