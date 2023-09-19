
public class PuntoGeometrico {

	// Atributos

	private double x;
	private double y;

	// Constructores

	public PuntoGeometrico() {
		this.x = 0;
		this.y = 0;
	}

	public PuntoGeometrico(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Métodos

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void desplazarPG(double cantidadX, double cantidadY) {
		x = this.getX() + cantidadX;
		y = this.getY() + cantidadY;
	}

	public double distanciaEuc(PuntoGeometrico otroPunto) {
		double distanciaCuadrado = Math.pow(this.getX() - otroPunto.getX(), 2) + Math.pow(this.getY() - otroPunto.getY(), 2);
		return Math.sqrt(distanciaCuadrado);
	}

	public static void main(String[] args) {
		PuntoGeometrico a = new PuntoGeometrico(0,0);
		PuntoGeometrico b = new PuntoGeometrico(6,3);

		System.out.println(a.distanciaEuc(b));
	}
}
