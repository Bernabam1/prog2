package ejercicio2;

public class Main {
	public static void main(String[] args) {

		System.out.println("-----------Slytherin-------------");

		Slytherin sl = new Slytherin(10);
		sl.addCualidad("Rubio");
		sl.addCualidad("Menemista");
		System.out.println(sl.getCualidadesNecesarias());

		Alumno carlos = new Alumno("Carlos");
		Alumno malfoy = new Alumno("Malfoy");

		carlos.addCualidad("Rubio");
		carlos.addCualidad("Menemista");
		carlos.addFamiliar(malfoy);

		System.out.println("Lista familiares de Carlos " + carlos.getFamiliares());

		sl.addAlumno(malfoy); // no entra
		System.out.println("Lista alumnos Slytherin " + sl.getAlumnos());

		sl.addAlumno(carlos); // por queeeeeee

		System.out.println("Lista alumnos Slytherin " + sl.getAlumnos());

		System.out.println("-----------Gryffindor-------------");

		Gryffindor gr = new Gryffindor(10);

		gr.addCualidad("Principal");
		gr.addCualidad("Pobre");
		System.out.println(gr.getCualidadesNecesarias());

		Alumno harry = new Alumno("Harry");

		harry.addCualidad("Principal");
		harry.addCualidad("Pobre");

		System.out.println(gr.puedeIngresar(harry));

		gr.addAlumno(harry);
		gr.addAlumno(malfoy);

		System.out.println("-----------Hufflepuff-------------");

		Hufflepuff hp = new Hufflepuff(10);

		hp.addCualidad("Leal");
		hp.addCualidad("Ignoto");
		System.out.println(hp.getCualidadesNecesarias());

		Alumno x = new Alumno("X");

		x.addCualidad("Leal");
		x.addCualidad("Ignoto");

		hp.addAlumno(x);
		hp.addAlumno(carlos);

		System.out.println("-----------Ravenclaw-------------");

		Ravenclaw rc = new Ravenclaw(10);

		rc.addCualidad("Inteligente");
		rc.addCualidad("Ignoto");
		System.out.println(rc.getCualidadesNecesarias());

		Alumno y = new Alumno("Y");

		y.addCualidad("Inteligente");
		y.addCualidad("Ignoto");

		rc.addAlumno(y);
		rc.addAlumno(harry);
		
		// Como chequeo que no lo pueda aceptar otra casa??
		// Por que no me funciona el arraylist de alumnos en Slytherin???
	}
}
