package ejemploFarmacia;

public class Medicamento {
	private String nombre;
	private String laboratorio;
	private double precio;

	public Medicamento(String nombre, String laboratorio, double precio) {
		this.nombre = nombre;
		this.laboratorio = laboratorio;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return nombre + " de " + laboratorio + " ($" + precio + ")";
		// Sobreescribe el toString de medicamento para que sea legible cuando lo
		// imprima
	}
}
