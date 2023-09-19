package ejercicio2;

public class Ravenclaw extends Casa {
	
	public Ravenclaw(int capacidad) {
		super(capacidad);
	}
	
	@Override
	public void addAlumno(Alumno alu) {
		if(!getAlumnos().contains(alu) && alu.getCualidades().containsAll(getCualidadesNecesarias())) {
			getAlumnos().add(alu);
			alu.setEnUnaCasa(true);
			System.out.println("El alumno " + alu.getNombre() + " ingresó a Ravenclaw");
		} else {
			System.out.println("El alumno " + alu.getNombre() + " no puede entrar a Ravenclaw");
		}
		
		
	}
}
