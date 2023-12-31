package ejercicio4;

public abstract class Contribuyente {
	private String nombre;
	private int id;
	private double impuestoFijo;
	
	public Contribuyente(String nombre, int id, double impuestoFijo) {
		this.nombre = nombre;
		this.id = id;
		this.impuestoFijo = impuestoFijo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getImpuestoFijo() {
		return impuestoFijo;
	}

	public void setImpuestoFijo(double impuestoFijo) {
		this.impuestoFijo = impuestoFijo;
	}
	
	public abstract double getImpuesto();
	
}
