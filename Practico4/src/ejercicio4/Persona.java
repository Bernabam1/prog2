package ejercicio4;

import java.time.LocalDate;

public class Persona {
	private String nombre;
	private String apellido;
	private int nPasaporte;
	private LocalDate fechaNac;
	private String estado;

	public Persona(String nombre, String apellido, int nPasaporte, LocalDate fechaNac, String estado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nPasaporte = nPasaporte;
		this.fechaNac = fechaNac;
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getnPasaporte() {
		return nPasaporte;
	}

	public void setnPasaporte(int nPasaporte) {
		this.nPasaporte = nPasaporte;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public boolean isDisponibleParaEventoSolidario() {
        return this.getEstado().equals("En país de origen") && !this.getEstado().equals("En concentración");
    }
}