package ejercicio6;

import java.util.ArrayList;

public class Jerarquico extends Empleado {
	private ArrayList<Empleado> empleados;

	public Jerarquico(String nombre, String apellido, int edad, int numLegado, double sueldo,
			ArrayList<Empleado> empleados) {
		super(nombre, apellido, edad, numLegado, sueldo);
		this.empleados = empleados;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public void agregarEmpleados(Empleado empleado) {
		empleados.add(empleado);
	}
	
	@Override
	public void printDatosCompletos() {
		super.printDatosCompletos();
		System.out.println("---Empleados---");
		for (Empleado empleado : empleados) {
			empleado.printDatosCompletos();
			System.out.println("---------------");
		}
	}
}
