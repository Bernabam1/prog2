package ejercicio1;

public class CondicionTratamiento implements Condicion {
	private Enfermedad unaEnfermedad;
	
	public CondicionTratamiento(Enfermedad unaEnfermedad) {
		this.unaEnfermedad = unaEnfermedad;
	}

	@Override
	public boolean cumple(Agroquimico unAgroquimico) {
		return unAgroquimico.puedeTratar(unaEnfermedad);
	}
}
