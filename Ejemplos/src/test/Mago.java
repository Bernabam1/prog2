package test;


public class Mago {
    private String nombreMagico;
    protected double poderMagico;

    public Mago(String nombreMagico, double poderMagico) {
        this.nombreMagico = nombreMagico;
        this.poderMagico = poderMagico;
    }
    
    public double getPoderMagico() {
		return poderMagico;
	}
    
    public String getNombre(){
        return nombreMagico;
    }
}

