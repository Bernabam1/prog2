package parcial2;

public class CondicionPesoMayor extends Condicion {
	private int pesoMax;

	public CondicionPesoMayor(int pesoMax) {
		this.pesoMax = pesoMax;
	}

	public boolean cumple(Articulo unArticulo) {
		return unArticulo.getPeso() > pesoMax;
	}
}
