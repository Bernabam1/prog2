package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		
		// Creo los lotes
		Lote l1 = new Lote("Lote 1", 60);
		Lote l2 = new Lote("Lote 2", 20);
		Lote l3 = new Lote("Lote 3", 40);
		Lote l4 = new Lote("Lote 4", 100);
		
		// Creo la cooperativa
		Cooperativa coop = new Cooperativa();
		
		// Le asigno los lotes disponibles
		coop.addLoteDisponible(l1);
		coop.addLoteDisponible(l2);
		coop.addLoteDisponible(l3);
		coop.addLoteDisponible(l4);
		
		// Creo cereales de cada tipo
		Cereal c1 = new Cereal("Cosecha gruesa");
		Cereal c2 = new Cereal("Cosecha fina");
		Cereal c3 = new Cereal("Pastura");
		
		coop.addCerealDisponible(c1);
		coop.addCerealDisponible(c2);
		coop.addCerealDisponible(c3);
		
		// Le paso minerales que requiere cada uno
		c1.addMineralRequerido("C1");
		c2.addMineralRequerido("C2");
		c3.addMineralRequerido("C3");
	
		// Chequeo
		System.out.println("C1 requiere: "+c1.getMineralesRequeridos());
		
		l1.addMinerales("C1");
		l1.addMinerales("C3");
		l1.addMinerales("C2");
		
		l2.addMinerales("C2");
		l2.addMinerales("C3");
		
		l3.addMinerales("C1");
		l3.addMinerales("C3");
		l4.addMinerales("C1");
		
		//Chequeo
		System.out.println("L1 tiene: "+l1.getMinerales());
		
		System.out.println("Puede plantarse? "+l4.puedePlantarse(c1));
		
		// En que lote puede plantarse un cereal
		coop.enQueLote(c1);
		// Que cereal puede plantarse en un lote
		coop.queCereal(l3); // Por alguna razon devuelve un array vacío ???????????
		
		// Agrego minerales primarios que busca la cooperativa
		coop.addMineralPrimarios("C1");
		coop.addMineralPrimarios("C2");
		
		coop.getLotesEspeciales(); // Esto tambien devuelve vacío ???????????
	}

}
