package ejercicio5;

import java.time.LocalTime;

public class Turno {

	private LocalTime horaInicio;
	private LocalTime horaFin;
	private String clienteId;
	private String peluqueroId;
	private boolean reservado;
	
	
	public Turno(LocalTime horaInicio, String clienteId, String peluqueroId) {
		this.horaInicio = horaInicio;
		this.horaFin = horaInicio.plusHours(2);
		this.clienteId = clienteId;
		this.peluqueroId = peluqueroId;
		this.reservado = false;
	}


	public LocalTime getHoraInicio() {
		return horaInicio;
	}


	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}


	public LocalTime getHoraFin() {
		return horaFin;
	}


	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = horaFin;
	}


	public String getClienteId() {
		return clienteId;
	}


	public void setClienteId(String clienteId) {
		this.clienteId = clienteId;
	}


	public String getPeluqueroId() {
		return peluqueroId;
	}


	public void setPeluqueroId(String peluqueroId) {
		this.peluqueroId = peluqueroId;
	}


	public boolean isReservado() {
		return reservado;
	}


	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}
	
	
	
}
