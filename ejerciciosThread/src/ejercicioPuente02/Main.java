package ejercicioPuente02;

public class Main {

	public static void main(String[] args) {
		Puente puente = new Puente();
		Coche coche1 = new Coche(1, puente);
		Coche coche2 = new Coche(2, puente);
		Coche coche3 = new Coche(3, puente);
		Coche coche4 = new Coche(4, puente);
		Coche coche5 = new Coche(5, puente);
		Coche coche6 = new Coche(6, puente);
		Coche coche7 = new Coche(7, puente);
		
		coche1.start();
		coche2.start();
		coche3.start();
		coche4.start();
		coche5.start();
		coche6.start();
		coche7.start();
	}
}