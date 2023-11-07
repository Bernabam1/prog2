package parcial3;

import java.util.Comparator;

public class ComparatorCategoria implements Comparator<Articulo> {

	@Override
	public int compare(Articulo a1, Articulo a2) {
		return a1.getCategoria().compareTo(a2.getCategoria());
	}

}
