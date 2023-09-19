package ejercicio2;

public class Gryffindor extends Casa {
	
	public Gryffindor(int capacidad) {
		super(capacidad);
	}
	
	public boolean puedeIngresar(Alumno alu) {
		return (!getAlumnos().contains(alu) && alu.getCualidades().containsAll(getCualidadesNecesarias()));
	}
	
	@Override
	public void addAlumno(Alumno alu) {
		if(!getAlumnos().contains(alu) && alu.getCualidades().containsAll(getCualidadesNecesarias())) {
			getAlumnos().add(alu);
			alu.setEnUnaCasa(true);
			System.out.println("El alumno " + alu.getNombre() + " ingresó a Gryffindor");
		} else {
			System.out.println("El alumno " + alu.getNombre() + " no puede entrar a Gryffindor");
		}
	}
}
