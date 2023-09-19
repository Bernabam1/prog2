package ejercicio4;

public class EstablecimientoDeportivo {

	private Turno[] turnos;
	private Cancha[] canchas;
	private Usuario[] usuarios;

	public EstablecimientoDeportivo(Turno[] turnos, Usuario[] usuarios) {
		this.turnos = turnos;
		Cancha[] canchas = new Cancha[6]; // Reservo espacio en memoria para el arreglo
		canchas[0] = new Cancha("Futbol", 400);// Creo las canchas a partir de la clase con su constructor (tipo,
												// precio)
		canchas[1] = new Cancha("Futbol", 400);// 2 de futbol precio 400
		canchas[2] = new Cancha("Padel", 100);// 4 de padel precio 100
		canchas[3] = new Cancha("Padel", 100);
		canchas[4] = new Cancha("Padel", 100);
		canchas[5] = new Cancha("Padel", 100);
		this.canchas = canchas;// se las asigno al atributo
		this.usuarios = usuarios;
	}

	public Turno[] getTurnos() {
		return turnos;
	}

	public void setTurnos(Turno[] turnos) {
		this.turnos = turnos;
	}

	public Cancha[] getCanchas() {
		return canchas;
	}

	public void setCanchas(Cancha[] canchas) {
		this.canchas = canchas;
	}

	public Usuario[] getUsuarios() {
		return usuarios;
	}

	public void setSocios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}

	public void reservarTurno(String tipoDeCancha, String nombreUsuario) {

	}

}
