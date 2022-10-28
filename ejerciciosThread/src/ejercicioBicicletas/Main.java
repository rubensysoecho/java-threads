package ejercicioBicicletas;

public class Main {

	public static void main(String[] args) {
		
		Almacen almacen = new Almacen();
		Operario operario1 = new Operario(1, true, almacen);
		Operario operario2 = new Operario(2, true, almacen);
		Operario operario3 = new Operario(3, false, almacen);
		Operario operario4 = new Operario(4, false, almacen);
		Montador montador1 = new Montador(1, almacen);
		Montador montador2 = new Montador(2, almacen);
		
		operario1.start();
		operario2.start();
		operario3.start();
		operario4.start();
		montador1.start();
		montador2.start();
	}
}
