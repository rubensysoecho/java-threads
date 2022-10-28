package ejercicioAntropofagos;

public class Main {

	public static void main(String[] args) {
		
		Olla olla = new Olla(5);
		Salvaje salvaje1 = new Salvaje(1, olla);
		Salvaje salvaje2 = new Salvaje(2, olla);
		Cocinero cocinero = new Cocinero(1, olla);
		
		salvaje1.start();
		salvaje2.start();
		cocinero.start();
	}
}
