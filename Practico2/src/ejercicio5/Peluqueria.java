package ejercicio5;

import java.time.LocalTime;

public class Peluqueria {

	private double descuento;

	private Peluquero[] peluqueros;

	public Peluqueria() {
		Peluquero[] peluqueros = new Peluquero[3]; // Reserva espacio en memoria para la variable
		peluqueros[0] = new Peluquero("Mortimer", "Tijeras", "1");// le voy diciendo lo que va a tener
		peluqueros[1] = new Peluquero("Enrique", "Desmechado", "2");
		peluqueros[2] = new Peluquero("Ricardo", "Tintura", "3");
		peluqueros[3] = new Peluquero("Jorge", "Pasamelacuatro", "4");
		this.peluqueros = peluqueros; // Los asigno
		this.descuento = 0.9;
	}

	public Peluquero[] getPeluqueros() {
		return peluqueros;
	}

	public void setPeluquero(Peluquero[] peluqueros) {
		this.peluqueros = peluqueros;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public void registrarTurno(LocalTime horaInicio, String idCliente, String idPeluquero) {
		for (Peluquero peluquero : peluqueros) {
			if (peluquero.getId().equals(idPeluquero)) {
				peluquero.reservarTurno(horaInicio, idCliente);
			}
		}
	}

	public void primerTurnoDisponible() {
		LocalTime primerTurno = null;
		for (Peluquero peluquero : peluqueros) {
			LocalTime aux = peluquero.primerTurnoDisponible();
			if (aux != null && aux.compareTo(primerTurno) == -1) {
				primerTurno = aux;
			}
		}
		if (primerTurno != null) {
			System.out.println("El primer turno es a las" + primerTurno.toString());
		} else {
			System.out.println("No hay turnos disponibles");
		}
	}

	public void primerTurnoDisponible(String idPeluquero) {
		LocalTime primerTurno = null;
		for (Peluquero peluquero : peluqueros) {
			if (peluquero.getId().equals(idPeluquero)) {
				LocalTime aux = peluquero.primerTurnoDisponible();
				if (aux != null && aux.compareTo(primerTurno) == -1) {
					primerTurno = aux;
				}
			}
		}
		if (primerTurno != null) {
			System.out.println("El primer turno es a las" + primerTurno.toString());
		} else {
			System.out.println("No hay turnos disponibles");
		}
	}

}
