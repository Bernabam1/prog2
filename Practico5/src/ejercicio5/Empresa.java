package ejercicio5;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Empleado> empleados;

	public Empresa() {
		this.empleados = new ArrayList<>();
	}

	public void addEmpleado(Empleado unEmpleado) {
		if (!empleados.contains(unEmpleado)) {
			empleados.add(unEmpleado);
		}
	}

	public ArrayList<Empleado> getEmpleados() {
		return new ArrayList<Empleado>(empleados);
	}
	
	public double gastoEnSueldos() {
		double sueldos = 0;
		for(Empleado empleado : empleados) {
			sueldos += empleado.cobrarSueldo();
		}
		return sueldos;
	}
}
