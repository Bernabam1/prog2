package ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		Enfermedad e1 = new Enfermedad("Enfermedad 1");
		Enfermedad e2 = new Enfermedad("Enfermedad 2");
		Enfermedad e3 = new Enfermedad("Enfermedad 2");
		
		e1.addEstadoPatologico("hojas amarillas");
		e1.addEstadoPatologico("deshidratacion");
		
		e2.addEstadoPatologico("hojas amarillas");
		e2.addEstadoPatologico("deshidratacion");
		e2.addEstadoPatologico("marchitacion");
		
		e3.addEstadoPatologico("deshidratacion");
		
		Cultivo c1 = new Cultivo("Cultivo 1");
		Cultivo c2 = new Cultivo("Cultivo 2");
		Cultivo c3 = new Cultivo("Cultivo 3");
		
		c1.addEnfermedad(e1);
		c2.addEnfermedad(e2);
		c3.addEnfermedad(e3);
		
		Agroquimico a1 = new Agroquimico("Agroquimico 1");
		Agroquimico a2 = new Agroquimico("Agroquimico 2");
		Agroquimico a3 = new Agroquimico("Agroquimico 3");
		
		a1.addCultivoNoCompatible(c1);
		a2.addCultivoNoCompatible(c3);
		
		a1.addEstadoPatologico("hojas amarillas");
		a1.addEstadoPatologico("deshidratacion");
		
		a2.addEstadoPatologico("hojas amarillas");
		a2.addEstadoPatologico("deshidratacion");
		a2.addEstadoPatologico("marchitacion");
		
		a3.addEstadoPatologico("marchitacion");
		
		Empresa emp = new Empresa();
		
		emp.addAgroquimico(a1);
		emp.addAgroquimico(a2);
		emp.addAgroquimico(a3);
		
		CondicionTratamiento ct = new CondicionTratamiento(e1);
		
		System.out.println(emp.buscar(ct));
		
	}

}
