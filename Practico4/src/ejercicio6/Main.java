package ejercicio6;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		Empresa empresa = new Empresa(new ArrayList<>());
		
		// ArrayList<Persona> listaDeAsociados = new ArrayList<>(); 
		// Como accedo si instancio la empresa con una lista por parametro?
				
		Usuario u1 = new Usuario("Nombre1", "Apellido1", 30, "Usuario1", "Contraseña1");
		Usuario u2 = new Usuario("Nombre2", "Apellido2", 40, "Usuario2", "Contraseña2");
		Usuario u3 = new Usuario("Nombre3", "Apellido3", 50, "Usuario3", "Contraseña3");
		Usuario u4 = new Usuario("Nombre4", "Apellido4", 60, "Usuario4", "Contraseña4");

		empresa.agregarAsociado(u1);
		empresa.agregarAsociado(u2);
		empresa.agregarAsociado(u3);
		empresa.agregarAsociado(u4);
		
		ArrayList<Empleado> empleados = new ArrayList<>();
		
		Empleado e1 = new Empleado("Empleado1", "Emp", 20, 500, 50000);
		Empleado e2 = new Empleado("Empleado2", "Emp", 20, 500, 50000);
		Empleado e3 = new Empleado("Empleado3", "Emp", 20, 500, 50000);
		
		empleados.add(e1);
		empleados.add(e2);
		empleados.add(e3);

		empresa.agregarAsociado(e1);
		empresa.agregarAsociado(e2);
		empresa.agregarAsociado(e3);

		Jerarquico j1 = new Jerarquico("Jerarquico1", "Jer", 25, 100, 100000, empleados);
		Jerarquico j2 = new Jerarquico("Jerarquico2", "Jer", 25, 100, 100000, empleados);
		Jerarquico j3 = new Jerarquico("Jerarquico3", "Jer", 25, 100, 100000, empleados);
		
		empresa.agregarAsociado(j1);
		empresa.agregarAsociado(j2);
		empresa.agregarAsociado(j3);
		
		//j1.printDatosCompletos();
		empresa.printAsociados();
		
		/*
		 * Consultar tema static
		 */

	}
}
