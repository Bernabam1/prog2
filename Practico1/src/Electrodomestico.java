
public class Electrodomestico {

	// Atributos

	private String nombre;
	private double precioBase;
	private String color;
	private int consumo;
	private double peso;

	// Constructores

	public Electrodomestico() {
		this.color = "Gris Plata";
		this.consumo = 10;
		this.precioBase = 100;
		this.peso = 2;
	}

	public Electrodomestico(String nombre, double precioBase, String color, int consumo, double peso) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}

	// Métodos

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean esBajoConsumo() {
		return this.getConsumo() < 45;
	}

	public double calcularBalance() {
		double balance = this.getPrecioBase() / this.getPeso();
		return balance;
	}

	public boolean esAltaGama() {
		return calcularBalance() > 3;
	}

	// Main

	public static void main(String[] args) {

		Electrodomestico e = new Electrodomestico();

		System.out.println(e.calcularBalance());
		System.out.println(e.esAltaGama());
		e.setConsumo(100);
		System.out.println(e.esBajoConsumo());

	}
}
