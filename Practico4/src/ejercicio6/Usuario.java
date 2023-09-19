package ejercicio6;

public class Usuario extends Persona {
	private String nUsuario;
	private String password;

	public Usuario(String nombre, String apellido, int edad, String nUsuario, String password) {
		super(nombre, apellido, edad);
		this.nUsuario = nUsuario;
		this.password = password;
	}

	public String getnUsuario() {
		return nUsuario;
	}

	public void setnUsuario(String nUsuario) {
		this.nUsuario = nUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public void printDatosCompletos() {
		super.printDatosCompletos();
		System.out.println(this.getnUsuario()+"\n"+this.getPassword());
	}
}
