package ejercicio2;

public class Slytherin extends Casa {

	public Slytherin(int capacidad) {
		super(capacidad);
	}

	public boolean tieneFamiliares(Alumno alu) {
		for (Alumno familiar : getAlumnos()) {
			if (alu.getFamiliares().contains(familiar)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void addAlumno(Alumno alu) {

		if (this.getAlumnos().isEmpty()) {
			getAlumnos().add(alu);
			alu.setEnUnaCasa(true);
			System.out.println("El alumno " + alu.getNombre() + " es el primer alumno de Slytherin");

		} else if (!this.getAlumnos().contains(alu) && tieneCualidades(alu) && tieneFamiliares(alu)
				&& !alu.isEnUnaCasa()) {
			getAlumnos().add(alu);
			alu.setEnUnaCasa(true);
			System.out.println("El alumno " + alu.getNombre() + " entró a Slytherin");

		} else {
			System.out.println("El alumno " + alu.getNombre() + " no puede entrar a Slytherin");

		}
	}

}
