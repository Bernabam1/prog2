package ejercicio3;

public class Main {
	public static void main (String[] args) {
		
		Empleado e1 = new Empleado("Carlos Gomez", 0);
		Empleado e2 = new Empleado("Miguel Sanchez", 2);
		
		EmpleadoConComision e3 = new EmpleadoConComision("Walter White", 3, 10);
		
		System.out.println(e1.getSueldo());
		System.out.println(e2.getSueldo());
		System.out.println(e3.getSueldo());
	}
}
