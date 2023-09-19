package ejercicio5;

import java.time.LocalTime;

public class Peluquero extends Persona {

	private Turno[] turnos;

	public Peluquero(String nombre, String apellido, String id) {
		super(nombre, apellido, id);
		Turno[] turnos = new Turno[3];
		turnos[0] = new Turno(LocalTime.of(10, 00, 00, 00), null, id);
		turnos[1] = new Turno(LocalTime.of(12, 00, 00, 00), null, id);
		turnos[2] = new Turno(LocalTime.of(14, 00, 00, 00), null, id);
		turnos[3] = new Turno(LocalTime.of(16, 00, 00, 00), null, id);
		this.turnos = turnos;
	}

	public Turno[] getTurnos() {
		return turnos;
	}

	public void setTurnos(Turno[] turnos) {
		this.turnos = turnos;
	}

	public void reservarTurno(LocalTime hora, String idCliente) {
		String respuesta = "No hay turnos disponibles";
		for (int i = 0; i < turnos.length; i++) {
			Turno turno = turnos[i];
			if (turno.getHoraInicio().compareTo(hora) == -1 && turno.getHoraFin().compareTo(hora) == 1
					&& turno.getClienteId().equals(null)) {
				turnos[i].setClienteId(idCliente);
				respuesta = "Turno reservado";
			}
		}
		System.out.println(respuesta);
	}

	public LocalTime primerTurnoDisponible() {
		for (Turno turno : turnos) {
			if(turno.getClienteId().equals(null)) {
				return turno.getHoraInicio();
			}
		}
		return null;
	}
	
	/*public void cobrarCorte(String idCliente) {
		if ()
	}*/
}