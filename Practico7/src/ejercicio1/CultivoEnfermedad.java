package ejercicio1;

public class CultivoEnfermedad extends Condicion {
	private Enfermedad unaEnfermedad;
	private Cultivo unCultivo;
	
	public CultivoEnfermedad(Enfermedad unaEnfermedad, Cultivo unCultivo) {
		this.unaEnfermedad = unaEnfermedad;
		this.unCultivo = unCultivo;
	}

	@Override
	public boolean cumple(Agroquimico unAgroquimico) {
		return unAgroquimico.puedeTratar(unaEnfermedad) && !unAgroquimico.getCultivosNoCompatibles().contains(unCultivo);
	}
}
