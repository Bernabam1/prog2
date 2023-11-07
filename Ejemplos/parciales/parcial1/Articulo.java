package parcial1;

import java.util.ArrayList;

public abstract class Articulo {
	
	public abstract String getCategoria();
	
	public abstract ArrayList<String> getPalabrasClave();
	
	public abstract ArrayList<Articulo> buscar(Condicion cond);
}
