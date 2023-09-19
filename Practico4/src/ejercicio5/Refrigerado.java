package ejercicio5;

import java.time.LocalDate;

public class Refrigerado extends Producto {
	private int tempMantenimiento;

	public Refrigerado(LocalDate fechaVencimiento, LocalDate fechaEnvasado, int nLote, String granjaOrigen,
			int tempMantenimiento) {
		super(fechaVencimiento, fechaEnvasado, nLote, granjaOrigen);
		this.tempMantenimiento = tempMantenimiento;
	}

	public int getTempMantenimiento() {
		return tempMantenimiento;
	}

	public void setTempMantenimiento(int tempMantenimiento) {
		this.tempMantenimiento = tempMantenimiento;
	}

}
