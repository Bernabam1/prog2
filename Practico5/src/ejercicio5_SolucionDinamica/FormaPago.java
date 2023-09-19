package ejercicio5_SolucionDinamica;

public abstract class FormaPago {

	private double sueldoBase;

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	protected abstract double calcularSueldo();

}
